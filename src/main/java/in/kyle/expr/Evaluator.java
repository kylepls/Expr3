package in.kyle.expr;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import in.kyle.expr.generated.ExprBaseVisitor;
import in.kyle.expr.generated.ExprParser;

public class Evaluator extends ExprBaseVisitor<Double> {
    
    private final Map<String, Double> variables = new HashMap<>();
    private final Map<String, Method> functions = new HashMap<>();
    
    void registerVariable(String name, double value) {
        variables.put(name, value);
    }
    
    double getVariableValue(String name) {
        return variables.get(name);
    }
    
    private Double visitExpr(ExprParser.ExprContext context) {
        Double accept = context.accept(this);
        if (accept == null) {
            throw new RuntimeException("No implementation for: " + context.getText());
        } else {
            return accept;
        }
    }
    
    @Override
    public Double visitOP_EXP(ExprParser.OP_EXPContext ctx) {
        return Math.pow(visitExpr(ctx.expr(0)), visitExpr(ctx.expr(1)));
    }
    
    @Override
    public Double visitOP_MULDIV(ExprParser.OP_MULDIVContext ctx) {
        double a = visitExpr(ctx.expr(0));
        double b = visitExpr(ctx.expr(1));
        if (ctx.op.getType() == ExprParser.MUL) {
            return a * b;
        } else {
            return a / b;
        }
    }
    
    @Override
    public Double visitOP_MOD(ExprParser.OP_MODContext ctx) {
        double a = visitExpr(ctx.expr(0));
        double b = visitExpr(ctx.expr(1));
        return a % b;
    }
    
    @Override
    public Double visitOP_ADDSUB(ExprParser.OP_ADDSUBContext ctx) {
        ExprParser.ExprContext context = ctx.expr().get(0);
        double a = visitExpr(context);
        double b = visitExpr(ctx.expr().get(1));
        if (ctx.op.getType() == ExprParser.ADD) {
            return a + b;
        } else {
            return a - b;
        }
    }
    
    
    @Override
    public Double visitAssignment(ExprParser.AssignmentContext ctx) {
        String name = ctx.NAME().getText();
        double value = visitExpr(ctx.expr());
        variables.put(name, value);
        return value;
    }
    
    @Override
    public Double visitOP_GETVAR(ExprParser.OP_GETVARContext ctx) {
        String name = ctx.NAME().getText();
        if (variables.containsKey(name)) {
            return variables.get(name);
        } else {
            throw new RuntimeException("No such variable " + name);
        }
    }
    
    @Override
    public Double visitOP_COMPARE(ExprParser.OP_COMPAREContext ctx) {
        double a = visitExpr(ctx.expr(0));
        double b = visitExpr(ctx.expr(1));
    
        int type = ctx.op.getType();
        if (type == ExprParser.EQ) {
            return toBinary(a == b);
        } else if (type == ExprParser.GTE) {
            return toBinary(a >= b);
        } else if (type == ExprParser.LTE) {
            return toBinary(a <= b);
        } else if (type == ExprParser.GT) {
            return toBinary(a > b);
        } else if (type == ExprParser.LT) {
            return toBinary(a < b);
        } else {
            throw new RuntimeException("Unknown type " + type);
        }
    }
    
    private double toBinary(boolean bool) {
        return bool ? 1 : 0;
    }
    
    @Override
    public Double visitABS(ExprParser.ABSContext ctx) {
        return Math.abs(visitExpr(ctx.expr()));
    }
    
    @Override
    public Double visitIMP_MUL(ExprParser.IMP_MULContext ctx) {
        return visitExpr(ctx.expr(0)) * visitExpr(ctx.expr(1));
    }
    
    @Override
    public Double visitIMP_MUL_2(ExprParser.IMP_MUL_2Context ctx) {
        System.out.println("Vis");
        return visit(ctx.number()) * visit(ctx.NAME());
    }
    
    @Override
    public Double visitOP_NUMBER(ExprParser.OP_NUMBERContext ctx) {
        return Double.parseDouble(ctx.getText());
    }
    
    public void registerFunction(String name, Method method) {
        if (method.getReturnType().equals(Double.TYPE) ||
            method.getReturnType().equals(Integer.TYPE) ||
            method.getReturnType().equals(Long.TYPE)) {
            for (Parameter parameter : method.getParameters()) {
                if (!parameter.getType().equals(Double.TYPE)) {
                    throw new IllegalArgumentException("All method parameters must be doubles");
                }
            }
            method.setAccessible(true);
            functions.put(name, method);
        } else {
            throw new IllegalArgumentException("Method must return a number");
        }
    }
    
    @Override
    public Double visitPARENS(ExprParser.PARENSContext ctx) {
        return visitExpr(ctx.expr());
    }
    
    @Override
    public Double visitFunction_call(ExprParser.Function_callContext ctx) {
        String name = ctx.NAME().getText();
        if (functions.containsKey(name)) {
            Method method = functions.get(name);
            Object[] objects = parseArgs(ctx.expr());
            try {
                System.out.println("C: " + objects.length);
                return ((Number) method.invoke(null, objects)).doubleValue();
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException("Error running " + name, e);
            }
        } else {
            throw new RuntimeException("Could not find function " + name);
        }
    }
    
    private Object[] parseArgs(List<ExprParser.ExprContext> expr) {
        return expr.stream().map(this::visit).toArray();
    }
}
