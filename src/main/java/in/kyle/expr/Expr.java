package in.kyle.expr;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.lang.reflect.Method;

import in.kyle.expr.functions.BasicFunctions;
import in.kyle.expr.generated.ExprLexer;
import in.kyle.expr.generated.ExprParser;
import in.kyle.expr.util.MethodHelper;

public class Expr {
    
    private final Evaluator evaluator = new Evaluator();
    
    {
        Class<Double> d = Double.TYPE;
        functionMath("ceil", d);
        functionMath("sqrt", d);
        functionMath("floor", d);
        functionMath("log", d);
        functionMath("max", d, d);
        functionMath("min", d, d);
        functionMath("cos", d);
        functionMath("sin", d);
        functionMath("tan", d);
        functionMath("cosh", d);
        functionMath("sinh", d);
        functionMath("tanh", d);
        functionMath("exp", d);
        functionMath("hypot", d, d);
        functionMath("random");
        functionMath("round", d);
        functionMath("toRadians", "rad", d);
        functionMath("toDegrees", "deg", d);
        
        registerFunction(MethodHelper.getMethod(BasicFunctions.class, "ln", d));
        
        registerVariable("e", Math.E);
        registerVariable("pi", Math.PI);
    }
    
    public void registerFunction(Method method) {
        registerFunction(method, method.getName());
    }
    
    public void registerFunction(Method method, String name) {
        evaluator.registerFunction(name, method);
    }
    
    private void functionMath(String name, Class<?>... args) {
        functionMath(name, name, args);
    }
    
    private void functionMath(String name, String alias, Class<?>... args) {
        registerFunction(MethodHelper.getMethod(Math.class, name, args), alias);
    }
    
    public void registerVariable(String name, double value) {
        evaluator.registerVariable(name, value);
    }
    
    public double eval(String string) {
        ANTLRInputStream in = new ANTLRInputStream(string);
        ExprLexer lexer = new ExprLexer(in);
        CommonTokenStream cts = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(cts);
        ExprParser.OperationContext expr = parser.operation();
        return evaluator.visit(expr);
    }
}
