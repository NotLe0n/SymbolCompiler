// Generated from C:/Users/mrshe/source/repos/SymbolCompiler/grammars\SymbolParser.g4 by ANTLR 4.10.1
package SymbolCompiler.Parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SymbolParser}.
 */
public interface SymbolParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SymbolParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SymbolParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SymbolParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SymbolParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SymbolParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(SymbolParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SymbolParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(SymbolParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SymbolParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SymbolParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SymbolParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SymbolParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SymbolParser#varAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVarAssignment(SymbolParser.VarAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SymbolParser#varAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVarAssignment(SymbolParser.VarAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SymbolParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(SymbolParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SymbolParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(SymbolParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SymbolParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void enterFuncDecl(SymbolParser.FuncDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SymbolParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void exitFuncDecl(SymbolParser.FuncDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SymbolParser#retStmt}.
	 * @param ctx the parse tree
	 */
	void enterRetStmt(SymbolParser.RetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SymbolParser#retStmt}.
	 * @param ctx the parse tree
	 */
	void exitRetStmt(SymbolParser.RetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SymbolParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(SymbolParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SymbolParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(SymbolParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SymbolParser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void enterElseStmt(SymbolParser.ElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SymbolParser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void exitElseStmt(SymbolParser.ElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SymbolParser#elseifStmt}.
	 * @param ctx the parse tree
	 */
	void enterElseifStmt(SymbolParser.ElseifStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SymbolParser#elseifStmt}.
	 * @param ctx the parse tree
	 */
	void exitElseifStmt(SymbolParser.ElseifStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SymbolParser#loopStmt}.
	 * @param ctx the parse tree
	 */
	void enterLoopStmt(SymbolParser.LoopStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SymbolParser#loopStmt}.
	 * @param ctx the parse tree
	 */
	void exitLoopStmt(SymbolParser.LoopStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SymbolParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(SymbolParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SymbolParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(SymbolParser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SymbolParser#readStmt}.
	 * @param ctx the parse tree
	 */
	void enterReadStmt(SymbolParser.ReadStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SymbolParser#readStmt}.
	 * @param ctx the parse tree
	 */
	void exitReadStmt(SymbolParser.ReadStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SymbolParser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void enterExprStmt(SymbolParser.ExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SymbolParser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void exitExprStmt(SymbolParser.ExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SymbolParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SymbolParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SymbolParser#booleanExpr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpr(SymbolParser.BooleanExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SymbolParser#booleanExpr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpr(SymbolParser.BooleanExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SymbolParser#equalityExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(SymbolParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SymbolParser#equalityExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(SymbolParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SymbolParser#compExpr}.
	 * @param ctx the parse tree
	 */
	void enterCompExpr(SymbolParser.CompExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SymbolParser#compExpr}.
	 * @param ctx the parse tree
	 */
	void exitCompExpr(SymbolParser.CompExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SymbolParser#bitwiseExpr}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseExpr(SymbolParser.BitwiseExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SymbolParser#bitwiseExpr}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseExpr(SymbolParser.BitwiseExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SymbolParser#termExpr}.
	 * @param ctx the parse tree
	 */
	void enterTermExpr(SymbolParser.TermExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SymbolParser#termExpr}.
	 * @param ctx the parse tree
	 */
	void exitTermExpr(SymbolParser.TermExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SymbolParser#factorExpr}.
	 * @param ctx the parse tree
	 */
	void enterFactorExpr(SymbolParser.FactorExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SymbolParser#factorExpr}.
	 * @param ctx the parse tree
	 */
	void exitFactorExpr(SymbolParser.FactorExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SymbolParser#indexing}.
	 * @param ctx the parse tree
	 */
	void enterIndexing(SymbolParser.IndexingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SymbolParser#indexing}.
	 * @param ctx the parse tree
	 */
	void exitIndexing(SymbolParser.IndexingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SymbolParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(SymbolParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SymbolParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(SymbolParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SymbolParser#castExpr}.
	 * @param ctx the parse tree
	 */
	void enterCastExpr(SymbolParser.CastExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SymbolParser#castExpr}.
	 * @param ctx the parse tree
	 */
	void exitCastExpr(SymbolParser.CastExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SymbolParser#callExpr}.
	 * @param ctx the parse tree
	 */
	void enterCallExpr(SymbolParser.CallExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SymbolParser#callExpr}.
	 * @param ctx the parse tree
	 */
	void exitCallExpr(SymbolParser.CallExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SymbolParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpr(SymbolParser.PrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SymbolParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpr(SymbolParser.PrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SymbolParser#grouping}.
	 * @param ctx the parse tree
	 */
	void enterGrouping(SymbolParser.GroupingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SymbolParser#grouping}.
	 * @param ctx the parse tree
	 */
	void exitGrouping(SymbolParser.GroupingContext ctx);
}