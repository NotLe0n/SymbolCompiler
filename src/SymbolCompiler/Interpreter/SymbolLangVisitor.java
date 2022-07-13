package SymbolCompiler.Interpreter;
import SymbolCompiler.Parser.SymbolParser;
import SymbolCompiler.Parser.SymbolParserBaseVisitor;

public class SymbolLangVisitor extends SymbolParserBaseVisitor<Object> {
	@Override
	public Object visitPrimaryExpr(SymbolParser.PrimaryExprContext ctx) {
		return super.visitPrimaryExpr(ctx);
	}
}
