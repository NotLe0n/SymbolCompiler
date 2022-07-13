package SymbolCompiler;

import SymbolCompiler.Parser.SymbolParser;
import SymbolCompiler.Lexer.SymbolLexer;
import SymbolCompiler.Interpreter.SymbolLangVisitor;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		System.out.println("Hello world!");
		ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(args[0]));
		TokenSource lexer = new SymbolLexer(input);
		TokenStream tokenStream = new BufferedTokenStream(lexer);

		SymbolParser parser = new SymbolParser(tokenStream);
		ParseTree tree = parser.program();

		SymbolLangVisitor visitor = new SymbolLangVisitor();
		visitor.visit(tree);

		//parser.addParseListener(new symbolLangListener());
		//parser.program();
	}
}