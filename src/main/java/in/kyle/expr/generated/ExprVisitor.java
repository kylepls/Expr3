// Generated from C:/Users/Projects-Java-Link/Expr3/src/main/antlr\Expr.g4 by ANTLR 4.7
package in.kyle.expr.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExprParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(ExprParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ABS}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitABS(ExprParser.ABSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PARENS}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPARENS(ExprParser.PARENSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IMP_MUL_2}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIMP_MUL_2(ExprParser.IMP_MUL_2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code OP_MOD}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOP_MOD(ExprParser.OP_MODContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OP_GETVAR}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOP_GETVAR(ExprParser.OP_GETVARContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OP_ADDSUB}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOP_ADDSUB(ExprParser.OP_ADDSUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OP_COMPARE}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOP_COMPARE(ExprParser.OP_COMPAREContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OP_FUNC}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOP_FUNC(ExprParser.OP_FUNCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OP_MULDIV}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOP_MULDIV(ExprParser.OP_MULDIVContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OP_EXP}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOP_EXP(ExprParser.OP_EXPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IMP_MUL}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIMP_MUL(ExprParser.IMP_MULContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OP_NUMBER}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOP_NUMBER(ExprParser.OP_NUMBERContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(ExprParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(ExprParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(ExprParser.NumberContext ctx);
}