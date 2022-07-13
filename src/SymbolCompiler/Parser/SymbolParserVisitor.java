// Generated from C:/Users/mrshe/source/repos/SymbolCompiler/grammars\SymbolParser.g4 by ANTLR 4.10.1
package SymbolCompiler.Parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SymbolParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SymbolParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SymbolParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SymbolParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SymbolParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(SymbolParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SymbolParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SymbolParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SymbolParser#varAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAssignment(SymbolParser.VarAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SymbolParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(SymbolParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SymbolParser#funcDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDecl(SymbolParser.FuncDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SymbolParser#retStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetStmt(SymbolParser.RetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SymbolParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(SymbolParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SymbolParser#elseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStmt(SymbolParser.ElseStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SymbolParser#elseifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseifStmt(SymbolParser.ElseifStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SymbolParser#loopStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStmt(SymbolParser.LoopStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SymbolParser#printStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStmt(SymbolParser.PrintStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SymbolParser#readStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStmt(SymbolParser.ReadStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SymbolParser#exprStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStmt(SymbolParser.ExprStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SymbolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SymbolParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SymbolParser#booleanExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpr(SymbolParser.BooleanExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SymbolParser#equalityExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(SymbolParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SymbolParser#compExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompExpr(SymbolParser.CompExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SymbolParser#bitwiseExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseExpr(SymbolParser.BitwiseExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SymbolParser#termExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermExpr(SymbolParser.TermExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SymbolParser#factorExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorExpr(SymbolParser.FactorExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SymbolParser#indexing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexing(SymbolParser.IndexingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SymbolParser#unaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(SymbolParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SymbolParser#castExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpr(SymbolParser.CastExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SymbolParser#callExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExpr(SymbolParser.CallExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SymbolParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpr(SymbolParser.PrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SymbolParser#grouping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrouping(SymbolParser.GroupingContext ctx);
}