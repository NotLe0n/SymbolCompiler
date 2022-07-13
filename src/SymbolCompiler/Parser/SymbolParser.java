// Generated from C:/Users/mrshe/source/repos/SymbolCompiler/grammars\SymbolParser.g4 by ANTLR 4.10.1
package SymbolCompiler.Parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SymbolParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, SEMICOLON=2, QUESTION_MARK=3, R_BRACE=4, L_BRACE=5, R_PAREN=6, L_PAREN=7, 
		SEPERATOR=8, LOOP=9, FUNC=10, CONSOLE=11, VAR=12, TYPENAME=13, TYPE_ARRAY=14, 
		TYPE_INT=15, TYPE_UINT=16, TYPE_FLOAT=17, TYPE_STRING=18, TYPE_CHAR=19, 
		FUNC_ARG_LIST=20, LIT_UINT=21, LIT_FLOAT=22, LIT_STRING=23, LIT_CHAR=24, 
		LIT_ARRAY=25, LIT_RANGE=26, OP_PLUS=27, OP_MINUS=28, OP_MULT=29, OP_DIV=30, 
		OP_ASSIGN=31, OP_EXP=32, OP_LSHFT=33, OP_RSHFT=34, OP_INC=35, OP_DEC=36, 
		OP_MOD=37, OP_EQ=38, OP_NEQ=39, OP_LT=40, OP_GT=41, OP_LTEQ=42, OP_GTEQ=43, 
		OP_AND=44, OP_OR=45, OP_XOR=46, OP_NOT=47, OP_INDEX=48, OP_CAST=49, OP_RET=50, 
		OP_BREAK=51, OP_CONTINUE=52, OP_PANIC=53, OP_MEMBER_ACC=54, OP_LENGTH=55;
	public static final int
		RULE_program = 0, RULE_decl = 1, RULE_block = 2, RULE_varAssignment = 3, 
		RULE_stmt = 4, RULE_funcDecl = 5, RULE_retStmt = 6, RULE_ifStmt = 7, RULE_elseStmt = 8, 
		RULE_elseifStmt = 9, RULE_loopStmt = 10, RULE_printStmt = 11, RULE_readStmt = 12, 
		RULE_exprStmt = 13, RULE_expr = 14, RULE_booleanExpr = 15, RULE_equalityExpr = 16, 
		RULE_compExpr = 17, RULE_bitwiseExpr = 18, RULE_termExpr = 19, RULE_factorExpr = 20, 
		RULE_indexing = 21, RULE_unaryExpr = 22, RULE_castExpr = 23, RULE_callExpr = 24, 
		RULE_primaryExpr = 25, RULE_grouping = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "decl", "block", "varAssignment", "stmt", "funcDecl", "retStmt", 
			"ifStmt", "elseStmt", "elseifStmt", "loopStmt", "printStmt", "readStmt", 
			"exprStmt", "expr", "booleanExpr", "equalityExpr", "compExpr", "bitwiseExpr", 
			"termExpr", "factorExpr", "indexing", "unaryExpr", "castExpr", "callExpr", 
			"primaryExpr", "grouping"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "';'", "'?'", "'{'", "'}'", "'('", "')'", "'_'", "'O'", "'F'", 
			"'C'", null, null, null, null, null, null, "'s'", "'c'", null, null, 
			null, null, null, null, null, "'+'", "'-'", "'*'", "'/'", "'='", "'^'", 
			"'<<'", "'>>'", "'++'", "'--'", "'%'", "'=='", "'!='", "'<'", "'>'", 
			"'<='", "'>='", "'&'", "'|'", "'><'", "'~'", "'@'", "'->'", "'=>'", "'>|'", 
			"'->>'", "'!'", "'.'", "'#'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "SEMICOLON", "QUESTION_MARK", "R_BRACE", "L_BRACE", "R_PAREN", 
			"L_PAREN", "SEPERATOR", "LOOP", "FUNC", "CONSOLE", "VAR", "TYPENAME", 
			"TYPE_ARRAY", "TYPE_INT", "TYPE_UINT", "TYPE_FLOAT", "TYPE_STRING", "TYPE_CHAR", 
			"FUNC_ARG_LIST", "LIT_UINT", "LIT_FLOAT", "LIT_STRING", "LIT_CHAR", "LIT_ARRAY", 
			"LIT_RANGE", "OP_PLUS", "OP_MINUS", "OP_MULT", "OP_DIV", "OP_ASSIGN", 
			"OP_EXP", "OP_LSHFT", "OP_RSHFT", "OP_INC", "OP_DEC", "OP_MOD", "OP_EQ", 
			"OP_NEQ", "OP_LT", "OP_GT", "OP_LTEQ", "OP_GTEQ", "OP_AND", "OP_OR", 
			"OP_XOR", "OP_NOT", "OP_INDEX", "OP_CAST", "OP_RET", "OP_BREAK", "OP_CONTINUE", 
			"OP_PANIC", "OP_MEMBER_ACC", "OP_LENGTH"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SymbolParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SymbolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SymbolParser.EOF, 0); }
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymbolParserVisitor ) return ((SymbolParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << R_BRACE) | (1L << R_PAREN) | (1L << LOOP) | (1L << FUNC) | (1L << CONSOLE) | (1L << VAR) | (1L << LIT_UINT) | (1L << LIT_FLOAT) | (1L << LIT_STRING) | (1L << LIT_CHAR) | (1L << LIT_ARRAY) | (1L << LIT_RANGE) | (1L << OP_MINUS) | (1L << OP_NOT) | (1L << OP_RET) | (1L << OP_LENGTH))) != 0)) {
				{
				{
				setState(54);
				decl();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclContext extends ParserRuleContext {
		public VarAssignmentContext varAssignment() {
			return getRuleContext(VarAssignmentContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public FuncDeclContext funcDecl() {
			return getRuleContext(FuncDeclContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymbolParserVisitor ) return ((SymbolParserVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				varAssignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				funcDecl();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode R_BRACE() { return getToken(SymbolParser.R_BRACE, 0); }
		public TerminalNode L_BRACE() { return getToken(SymbolParser.L_BRACE, 0); }
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymbolParserVisitor ) return ((SymbolParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(R_BRACE);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << R_BRACE) | (1L << R_PAREN) | (1L << LOOP) | (1L << FUNC) | (1L << CONSOLE) | (1L << VAR) | (1L << LIT_UINT) | (1L << LIT_FLOAT) | (1L << LIT_STRING) | (1L << LIT_CHAR) | (1L << LIT_ARRAY) | (1L << LIT_RANGE) | (1L << OP_MINUS) | (1L << OP_NOT) | (1L << OP_RET) | (1L << OP_LENGTH))) != 0)) {
				{
				{
				setState(68);
				decl();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			match(L_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarAssignmentContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(SymbolParser.VAR, 0); }
		public TerminalNode OP_ASSIGN() { return getToken(SymbolParser.OP_ASSIGN, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode OP_INDEX() { return getToken(SymbolParser.OP_INDEX, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).enterVarAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).exitVarAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymbolParserVisitor ) return ((SymbolParserVisitor<? extends T>)visitor).visitVarAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarAssignmentContext varAssignment() throws RecognitionException {
		VarAssignmentContext _localctx = new VarAssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(VAR);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_INDEX) {
				{
				setState(77);
				match(OP_INDEX);
				setState(78);
				expr();
				}
			}

			setState(81);
			match(OP_ASSIGN);
			setState(82);
			stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public RetStmtContext retStmt() {
			return getRuleContext(RetStmtContext.class,0);
		}
		public ExprStmtContext exprStmt() {
			return getRuleContext(ExprStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public LoopStmtContext loopStmt() {
			return getRuleContext(LoopStmtContext.class,0);
		}
		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class,0);
		}
		public ReadStmtContext readStmt() {
			return getRuleContext(ReadStmtContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymbolParserVisitor ) return ((SymbolParserVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stmt);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				retStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				exprStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				ifStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(87);
				loopStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(88);
				printStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(89);
				readStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(90);
				block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncDeclContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(SymbolParser.FUNC, 0); }
		public TerminalNode SEPERATOR() { return getToken(SymbolParser.SEPERATOR, 0); }
		public TerminalNode LIT_UINT() { return getToken(SymbolParser.LIT_UINT, 0); }
		public TerminalNode R_PAREN() { return getToken(SymbolParser.R_PAREN, 0); }
		public TerminalNode L_PAREN() { return getToken(SymbolParser.L_PAREN, 0); }
		public TerminalNode OP_RET() { return getToken(SymbolParser.OP_RET, 0); }
		public TerminalNode TYPENAME() { return getToken(SymbolParser.TYPENAME, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> FUNC_ARG_LIST() { return getTokens(SymbolParser.FUNC_ARG_LIST); }
		public TerminalNode FUNC_ARG_LIST(int i) {
			return getToken(SymbolParser.FUNC_ARG_LIST, i);
		}
		public FuncDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).enterFuncDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).exitFuncDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymbolParserVisitor ) return ((SymbolParserVisitor<? extends T>)visitor).visitFuncDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDeclContext funcDecl() throws RecognitionException {
		FuncDeclContext _localctx = new FuncDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funcDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(FUNC);
			setState(94);
			match(SEPERATOR);
			setState(95);
			match(LIT_UINT);
			setState(96);
			match(R_PAREN);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNC_ARG_LIST) {
				{
				{
				setState(97);
				match(FUNC_ARG_LIST);
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			match(L_PAREN);
			setState(104);
			match(OP_RET);
			setState(105);
			match(TYPENAME);
			setState(106);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RetStmtContext extends ParserRuleContext {
		public TerminalNode OP_RET() { return getToken(SymbolParser.OP_RET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).enterRetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).exitRetStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymbolParserVisitor ) return ((SymbolParserVisitor<? extends T>)visitor).visitRetStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetStmtContext retStmt() throws RecognitionException {
		RetStmtContext _localctx = new RetStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_retStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(OP_RET);
			setState(109);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode QUESTION_MARK() { return getToken(SymbolParser.QUESTION_MARK, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ElseifStmtContext> elseifStmt() {
			return getRuleContexts(ElseifStmtContext.class);
		}
		public ElseifStmtContext elseifStmt(int i) {
			return getRuleContext(ElseifStmtContext.class,i);
		}
		public List<ElseStmtContext> elseStmt() {
			return getRuleContexts(ElseStmtContext.class);
		}
		public ElseStmtContext elseStmt(int i) {
			return getRuleContext(ElseStmtContext.class,i);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymbolParserVisitor ) return ((SymbolParserVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifStmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			expr();
			setState(112);
			match(QUESTION_MARK);
			setState(113);
			block();
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(116);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(114);
						elseifStmt();
						}
						break;
					case 2:
						{
						setState(115);
						elseStmt();
						}
						break;
					}
					} 
				}
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseStmtContext extends ParserRuleContext {
		public TerminalNode OP_NOT() { return getToken(SymbolParser.OP_NOT, 0); }
		public TerminalNode QUESTION_MARK() { return getToken(SymbolParser.QUESTION_MARK, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).enterElseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).exitElseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymbolParserVisitor ) return ((SymbolParserVisitor<? extends T>)visitor).visitElseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStmtContext elseStmt() throws RecognitionException {
		ElseStmtContext _localctx = new ElseStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_elseStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(OP_NOT);
			setState(122);
			match(QUESTION_MARK);
			setState(123);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseifStmtContext extends ParserRuleContext {
		public TerminalNode OP_NOT() { return getToken(SymbolParser.OP_NOT, 0); }
		public List<TerminalNode> QUESTION_MARK() { return getTokens(SymbolParser.QUESTION_MARK); }
		public TerminalNode QUESTION_MARK(int i) {
			return getToken(SymbolParser.QUESTION_MARK, i);
		}
		public TerminalNode OP_AND() { return getToken(SymbolParser.OP_AND, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseifStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).enterElseifStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).exitElseifStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymbolParserVisitor ) return ((SymbolParserVisitor<? extends T>)visitor).visitElseifStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifStmtContext elseifStmt() throws RecognitionException {
		ElseifStmtContext _localctx = new ElseifStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_elseifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(OP_NOT);
			setState(126);
			match(QUESTION_MARK);
			setState(127);
			match(OP_AND);
			setState(128);
			expr();
			setState(129);
			match(QUESTION_MARK);
			setState(130);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopStmtContext extends ParserRuleContext {
		public TerminalNode LOOP() { return getToken(SymbolParser.LOOP, 0); }
		public TerminalNode R_PAREN() { return getToken(SymbolParser.R_PAREN, 0); }
		public TerminalNode L_PAREN() { return getToken(SymbolParser.L_PAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> VAR() { return getTokens(SymbolParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(SymbolParser.VAR, i);
		}
		public TerminalNode OP_CONTINUE() { return getToken(SymbolParser.OP_CONTINUE, 0); }
		public TerminalNode LIT_RANGE() { return getToken(SymbolParser.LIT_RANGE, 0); }
		public LoopStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).enterLoopStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).exitLoopStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymbolParserVisitor ) return ((SymbolParserVisitor<? extends T>)visitor).visitLoopStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStmtContext loopStmt() throws RecognitionException {
		LoopStmtContext _localctx = new LoopStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_loopStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(LOOP);
			setState(133);
			match(R_PAREN);
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(134);
				expr();
				}
				break;
			case 2:
				{
				{
				setState(135);
				match(VAR);
				setState(136);
				match(OP_CONTINUE);
				setState(137);
				_la = _input.LA(1);
				if ( !(_la==VAR || _la==LIT_RANGE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			}
			setState(140);
			match(L_PAREN);
			setState(141);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintStmtContext extends ParserRuleContext {
		public TerminalNode CONSOLE() { return getToken(SymbolParser.CONSOLE, 0); }
		public TerminalNode OP_LT() { return getToken(SymbolParser.OP_LT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SymbolParser.SEMICOLON, 0); }
		public PrintStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).enterPrintStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).exitPrintStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymbolParserVisitor ) return ((SymbolParserVisitor<? extends T>)visitor).visitPrintStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_printStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(CONSOLE);
			setState(144);
			match(OP_LT);
			setState(145);
			expr();
			setState(146);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadStmtContext extends ParserRuleContext {
		public TerminalNode CONSOLE() { return getToken(SymbolParser.CONSOLE, 0); }
		public TerminalNode OP_GT() { return getToken(SymbolParser.OP_GT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SymbolParser.SEMICOLON, 0); }
		public ReadStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).enterReadStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).exitReadStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymbolParserVisitor ) return ((SymbolParserVisitor<? extends T>)visitor).visitReadStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadStmtContext readStmt() throws RecognitionException {
		ReadStmtContext _localctx = new ReadStmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_readStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(CONSOLE);
			setState(149);
			match(OP_GT);
			setState(150);
			expr();
			setState(151);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SymbolParser.SEMICOLON, 0); }
		public ExprStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).enterExprStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).exitExprStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymbolParserVisitor ) return ((SymbolParserVisitor<? extends T>)visitor).visitExprStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprStmtContext exprStmt() throws RecognitionException {
		ExprStmtContext _localctx = new ExprStmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_exprStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			expr();
			setState(154);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public BooleanExprContext booleanExpr() {
			return getRuleContext(BooleanExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymbolParserVisitor ) return ((SymbolParserVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			booleanExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanExprContext extends ParserRuleContext {
		public List<EqualityExprContext> equalityExpr() {
			return getRuleContexts(EqualityExprContext.class);
		}
		public EqualityExprContext equalityExpr(int i) {
			return getRuleContext(EqualityExprContext.class,i);
		}
		public List<TerminalNode> OP_AND() { return getTokens(SymbolParser.OP_AND); }
		public TerminalNode OP_AND(int i) {
			return getToken(SymbolParser.OP_AND, i);
		}
		public List<TerminalNode> OP_OR() { return getTokens(SymbolParser.OP_OR); }
		public TerminalNode OP_OR(int i) {
			return getToken(SymbolParser.OP_OR, i);
		}
		public List<TerminalNode> OP_XOR() { return getTokens(SymbolParser.OP_XOR); }
		public TerminalNode OP_XOR(int i) {
			return getToken(SymbolParser.OP_XOR, i);
		}
		public BooleanExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).enterBooleanExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).exitBooleanExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymbolParserVisitor ) return ((SymbolParserVisitor<? extends T>)visitor).visitBooleanExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExprContext booleanExpr() throws RecognitionException {
		BooleanExprContext _localctx = new BooleanExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_booleanExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			equalityExpr();
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_AND) | (1L << OP_OR) | (1L << OP_XOR))) != 0)) {
				{
				{
				setState(159);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_AND) | (1L << OP_OR) | (1L << OP_XOR))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(160);
				equalityExpr();
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualityExprContext extends ParserRuleContext {
		public List<CompExprContext> compExpr() {
			return getRuleContexts(CompExprContext.class);
		}
		public CompExprContext compExpr(int i) {
			return getRuleContext(CompExprContext.class,i);
		}
		public List<TerminalNode> OP_EQ() { return getTokens(SymbolParser.OP_EQ); }
		public TerminalNode OP_EQ(int i) {
			return getToken(SymbolParser.OP_EQ, i);
		}
		public List<TerminalNode> OP_NEQ() { return getTokens(SymbolParser.OP_NEQ); }
		public TerminalNode OP_NEQ(int i) {
			return getToken(SymbolParser.OP_NEQ, i);
		}
		public EqualityExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).enterEqualityExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).exitEqualityExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymbolParserVisitor ) return ((SymbolParserVisitor<? extends T>)visitor).visitEqualityExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExprContext equalityExpr() throws RecognitionException {
		EqualityExprContext _localctx = new EqualityExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_equalityExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			compExpr();
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_EQ || _la==OP_NEQ) {
				{
				{
				setState(167);
				_la = _input.LA(1);
				if ( !(_la==OP_EQ || _la==OP_NEQ) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(168);
				compExpr();
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompExprContext extends ParserRuleContext {
		public List<BitwiseExprContext> bitwiseExpr() {
			return getRuleContexts(BitwiseExprContext.class);
		}
		public BitwiseExprContext bitwiseExpr(int i) {
			return getRuleContext(BitwiseExprContext.class,i);
		}
		public List<TerminalNode> OP_LT() { return getTokens(SymbolParser.OP_LT); }
		public TerminalNode OP_LT(int i) {
			return getToken(SymbolParser.OP_LT, i);
		}
		public List<TerminalNode> OP_GT() { return getTokens(SymbolParser.OP_GT); }
		public TerminalNode OP_GT(int i) {
			return getToken(SymbolParser.OP_GT, i);
		}
		public List<TerminalNode> OP_LTEQ() { return getTokens(SymbolParser.OP_LTEQ); }
		public TerminalNode OP_LTEQ(int i) {
			return getToken(SymbolParser.OP_LTEQ, i);
		}
		public List<TerminalNode> OP_GTEQ() { return getTokens(SymbolParser.OP_GTEQ); }
		public TerminalNode OP_GTEQ(int i) {
			return getToken(SymbolParser.OP_GTEQ, i);
		}
		public CompExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).enterCompExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).exitCompExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymbolParserVisitor ) return ((SymbolParserVisitor<? extends T>)visitor).visitCompExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompExprContext compExpr() throws RecognitionException {
		CompExprContext _localctx = new CompExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_compExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			bitwiseExpr();
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_LT) | (1L << OP_GT) | (1L << OP_LTEQ) | (1L << OP_GTEQ))) != 0)) {
				{
				{
				setState(175);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_LT) | (1L << OP_GT) | (1L << OP_LTEQ) | (1L << OP_GTEQ))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(176);
				bitwiseExpr();
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitwiseExprContext extends ParserRuleContext {
		public List<TermExprContext> termExpr() {
			return getRuleContexts(TermExprContext.class);
		}
		public TermExprContext termExpr(int i) {
			return getRuleContext(TermExprContext.class,i);
		}
		public List<TerminalNode> OP_LSHFT() { return getTokens(SymbolParser.OP_LSHFT); }
		public TerminalNode OP_LSHFT(int i) {
			return getToken(SymbolParser.OP_LSHFT, i);
		}
		public List<TerminalNode> OP_RSHFT() { return getTokens(SymbolParser.OP_RSHFT); }
		public TerminalNode OP_RSHFT(int i) {
			return getToken(SymbolParser.OP_RSHFT, i);
		}
		public BitwiseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwiseExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).enterBitwiseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).exitBitwiseExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymbolParserVisitor ) return ((SymbolParserVisitor<? extends T>)visitor).visitBitwiseExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitwiseExprContext bitwiseExpr() throws RecognitionException {
		BitwiseExprContext _localctx = new BitwiseExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_bitwiseExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			termExpr();
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_LSHFT || _la==OP_RSHFT) {
				{
				{
				setState(183);
				_la = _input.LA(1);
				if ( !(_la==OP_LSHFT || _la==OP_RSHFT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(184);
				termExpr();
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermExprContext extends ParserRuleContext {
		public List<FactorExprContext> factorExpr() {
			return getRuleContexts(FactorExprContext.class);
		}
		public FactorExprContext factorExpr(int i) {
			return getRuleContext(FactorExprContext.class,i);
		}
		public List<TerminalNode> OP_PLUS() { return getTokens(SymbolParser.OP_PLUS); }
		public TerminalNode OP_PLUS(int i) {
			return getToken(SymbolParser.OP_PLUS, i);
		}
		public List<TerminalNode> OP_MINUS() { return getTokens(SymbolParser.OP_MINUS); }
		public TerminalNode OP_MINUS(int i) {
			return getToken(SymbolParser.OP_MINUS, i);
		}
		public TermExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).enterTermExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).exitTermExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymbolParserVisitor ) return ((SymbolParserVisitor<? extends T>)visitor).visitTermExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermExprContext termExpr() throws RecognitionException {
		TermExprContext _localctx = new TermExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_termExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			factorExpr();
			setState(195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(191);
					_la = _input.LA(1);
					if ( !(_la==OP_PLUS || _la==OP_MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(192);
					factorExpr();
					}
					} 
				}
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorExprContext extends ParserRuleContext {
		public List<IndexingContext> indexing() {
			return getRuleContexts(IndexingContext.class);
		}
		public IndexingContext indexing(int i) {
			return getRuleContext(IndexingContext.class,i);
		}
		public List<TerminalNode> OP_MULT() { return getTokens(SymbolParser.OP_MULT); }
		public TerminalNode OP_MULT(int i) {
			return getToken(SymbolParser.OP_MULT, i);
		}
		public List<TerminalNode> OP_DIV() { return getTokens(SymbolParser.OP_DIV); }
		public TerminalNode OP_DIV(int i) {
			return getToken(SymbolParser.OP_DIV, i);
		}
		public List<TerminalNode> OP_EXP() { return getTokens(SymbolParser.OP_EXP); }
		public TerminalNode OP_EXP(int i) {
			return getToken(SymbolParser.OP_EXP, i);
		}
		public List<TerminalNode> OP_MOD() { return getTokens(SymbolParser.OP_MOD); }
		public TerminalNode OP_MOD(int i) {
			return getToken(SymbolParser.OP_MOD, i);
		}
		public FactorExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).enterFactorExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).exitFactorExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymbolParserVisitor ) return ((SymbolParserVisitor<? extends T>)visitor).visitFactorExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorExprContext factorExpr() throws RecognitionException {
		FactorExprContext _localctx = new FactorExprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_factorExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			indexing();
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_MULT) | (1L << OP_DIV) | (1L << OP_EXP) | (1L << OP_MOD))) != 0)) {
				{
				{
				setState(199);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_MULT) | (1L << OP_DIV) | (1L << OP_EXP) | (1L << OP_MOD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(200);
				indexing();
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexingContext extends ParserRuleContext {
		public List<UnaryExprContext> unaryExpr() {
			return getRuleContexts(UnaryExprContext.class);
		}
		public UnaryExprContext unaryExpr(int i) {
			return getRuleContext(UnaryExprContext.class,i);
		}
		public List<TerminalNode> OP_INDEX() { return getTokens(SymbolParser.OP_INDEX); }
		public TerminalNode OP_INDEX(int i) {
			return getToken(SymbolParser.OP_INDEX, i);
		}
		public IndexingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).enterIndexing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).exitIndexing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymbolParserVisitor ) return ((SymbolParserVisitor<? extends T>)visitor).visitIndexing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexingContext indexing() throws RecognitionException {
		IndexingContext _localctx = new IndexingContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_indexing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			unaryExpr(0);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_INDEX) {
				{
				{
				setState(207);
				match(OP_INDEX);
				setState(208);
				unaryExpr(0);
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExprContext extends ParserRuleContext {
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public TerminalNode OP_NOT() { return getToken(SymbolParser.OP_NOT, 0); }
		public TerminalNode OP_MINUS() { return getToken(SymbolParser.OP_MINUS, 0); }
		public TerminalNode OP_LENGTH() { return getToken(SymbolParser.OP_LENGTH, 0); }
		public CastExprContext castExpr() {
			return getRuleContext(CastExprContext.class,0);
		}
		public TerminalNode OP_INC() { return getToken(SymbolParser.OP_INC, 0); }
		public TerminalNode OP_DEC() { return getToken(SymbolParser.OP_DEC, 0); }
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).exitUnaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymbolParserVisitor ) return ((SymbolParserVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		return unaryExpr(0);
	}

	private UnaryExprContext unaryExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, _parentState);
		UnaryExprContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_unaryExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_MINUS:
			case OP_NOT:
			case OP_LENGTH:
				{
				setState(215);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_MINUS) | (1L << OP_NOT) | (1L << OP_LENGTH))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(216);
				unaryExpr(3);
				}
				break;
			case R_PAREN:
			case FUNC:
			case VAR:
			case LIT_UINT:
			case LIT_FLOAT:
			case LIT_STRING:
			case LIT_CHAR:
			case LIT_ARRAY:
			case LIT_RANGE:
				{
				setState(217);
				castExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(224);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new UnaryExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_unaryExpr);
					setState(220);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(221);
					_la = _input.LA(1);
					if ( !(_la==OP_INC || _la==OP_DEC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CastExprContext extends ParserRuleContext {
		public CallExprContext callExpr() {
			return getRuleContext(CallExprContext.class,0);
		}
		public List<TerminalNode> OP_CAST() { return getTokens(SymbolParser.OP_CAST); }
		public TerminalNode OP_CAST(int i) {
			return getToken(SymbolParser.OP_CAST, i);
		}
		public List<TerminalNode> TYPENAME() { return getTokens(SymbolParser.TYPENAME); }
		public TerminalNode TYPENAME(int i) {
			return getToken(SymbolParser.TYPENAME, i);
		}
		public CastExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).enterCastExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).exitCastExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymbolParserVisitor ) return ((SymbolParserVisitor<? extends T>)visitor).visitCastExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExprContext castExpr() throws RecognitionException {
		CastExprContext _localctx = new CastExprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_castExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			callExpr();
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(228);
					match(OP_CAST);
					setState(229);
					match(TYPENAME);
					}
					} 
				}
				setState(234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallExprContext extends ParserRuleContext {
		public List<PrimaryExprContext> primaryExpr() {
			return getRuleContexts(PrimaryExprContext.class);
		}
		public PrimaryExprContext primaryExpr(int i) {
			return getRuleContext(PrimaryExprContext.class,i);
		}
		public TerminalNode FUNC() { return getToken(SymbolParser.FUNC, 0); }
		public TerminalNode SEPERATOR() { return getToken(SymbolParser.SEPERATOR, 0); }
		public TerminalNode LIT_UINT() { return getToken(SymbolParser.LIT_UINT, 0); }
		public TerminalNode R_PAREN() { return getToken(SymbolParser.R_PAREN, 0); }
		public TerminalNode L_PAREN() { return getToken(SymbolParser.L_PAREN, 0); }
		public CallExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).enterCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).exitCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymbolParserVisitor ) return ((SymbolParserVisitor<? extends T>)visitor).visitCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallExprContext callExpr() throws RecognitionException {
		CallExprContext _localctx = new CallExprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_callExpr);
		int _la;
		try {
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case R_PAREN:
			case VAR:
			case LIT_UINT:
			case LIT_FLOAT:
			case LIT_STRING:
			case LIT_CHAR:
			case LIT_ARRAY:
			case LIT_RANGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				primaryExpr();
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(236);
				match(FUNC);
				setState(237);
				match(SEPERATOR);
				setState(238);
				match(LIT_UINT);
				setState(239);
				match(R_PAREN);
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << R_PAREN) | (1L << VAR) | (1L << LIT_UINT) | (1L << LIT_FLOAT) | (1L << LIT_STRING) | (1L << LIT_CHAR) | (1L << LIT_ARRAY) | (1L << LIT_RANGE))) != 0)) {
					{
					{
					setState(240);
					primaryExpr();
					}
					}
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(246);
				match(L_PAREN);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExprContext extends ParserRuleContext {
		public TerminalNode LIT_UINT() { return getToken(SymbolParser.LIT_UINT, 0); }
		public TerminalNode LIT_FLOAT() { return getToken(SymbolParser.LIT_FLOAT, 0); }
		public TerminalNode LIT_STRING() { return getToken(SymbolParser.LIT_STRING, 0); }
		public TerminalNode LIT_CHAR() { return getToken(SymbolParser.LIT_CHAR, 0); }
		public TerminalNode LIT_ARRAY() { return getToken(SymbolParser.LIT_ARRAY, 0); }
		public TerminalNode LIT_RANGE() { return getToken(SymbolParser.LIT_RANGE, 0); }
		public GroupingContext grouping() {
			return getRuleContext(GroupingContext.class,0);
		}
		public TerminalNode VAR() { return getToken(SymbolParser.VAR, 0); }
		public PrimaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).enterPrimaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).exitPrimaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymbolParserVisitor ) return ((SymbolParserVisitor<? extends T>)visitor).visitPrimaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_primaryExpr);
		try {
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIT_UINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				match(LIT_UINT);
				}
				break;
			case LIT_FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(LIT_FLOAT);
				}
				break;
			case LIT_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				match(LIT_STRING);
				}
				break;
			case LIT_CHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(252);
				match(LIT_CHAR);
				}
				break;
			case LIT_ARRAY:
				enterOuterAlt(_localctx, 5);
				{
				setState(253);
				match(LIT_ARRAY);
				}
				break;
			case LIT_RANGE:
				enterOuterAlt(_localctx, 6);
				{
				setState(254);
				match(LIT_RANGE);
				}
				break;
			case R_PAREN:
				enterOuterAlt(_localctx, 7);
				{
				setState(255);
				grouping();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 8);
				{
				setState(256);
				match(VAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingContext extends ParserRuleContext {
		public TerminalNode R_PAREN() { return getToken(SymbolParser.R_PAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(SymbolParser.L_PAREN, 0); }
		public GroupingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grouping; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).enterGrouping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SymbolParserListener ) ((SymbolParserListener)listener).exitGrouping(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SymbolParserVisitor ) return ((SymbolParserVisitor<? extends T>)visitor).visitGrouping(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingContext grouping() throws RecognitionException {
		GroupingContext _localctx = new GroupingContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_grouping);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(R_PAREN);
			setState(260);
			expr();
			setState(261);
			match(L_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 22:
			return unaryExpr_sempred((UnaryExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean unaryExpr_sempred(UnaryExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00017\u0108\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0005\u0000"+
		"8\b\u0000\n\u0000\f\u0000;\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001B\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0005\u0002F\b\u0002\n\u0002\f\u0002I\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003P\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\\\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005c\b\u0005"+
		"\n\u0005\f\u0005f\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007u\b\u0007\n\u0007\f\u0007"+
		"x\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u008b\b\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0005\u000f\u00a2\b\u000f\n\u000f\f\u000f\u00a5\t\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00aa\b\u0010\n\u0010\f\u0010"+
		"\u00ad\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00b2\b"+
		"\u0011\n\u0011\f\u0011\u00b5\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u00ba\b\u0012\n\u0012\f\u0012\u00bd\t\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0005\u0013\u00c2\b\u0013\n\u0013\f\u0013\u00c5\t\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u00ca\b\u0014\n\u0014"+
		"\f\u0014\u00cd\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015"+
		"\u00d2\b\u0015\n\u0015\f\u0015\u00d5\t\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u00db\b\u0016\u0001\u0016\u0001\u0016\u0005"+
		"\u0016\u00df\b\u0016\n\u0016\f\u0016\u00e2\t\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0005\u0017\u00e7\b\u0017\n\u0017\f\u0017\u00ea\t\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005"+
		"\u0018\u00f2\b\u0018\n\u0018\f\u0018\u00f5\t\u0018\u0001\u0018\u0003\u0018"+
		"\u00f8\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0102\b\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0000\u0001,\u001b\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.024\u0000\t\u0002\u0000\f\f\u001a\u001a\u0001\u0000,.\u0001"+
		"\u0000&\'\u0001\u0000(+\u0001\u0000!\"\u0001\u0000\u001b\u001c\u0003\u0000"+
		"\u001d\u001e  %%\u0003\u0000\u001c\u001c//77\u0001\u0000#$\u010e\u0000"+
		"9\u0001\u0000\u0000\u0000\u0002A\u0001\u0000\u0000\u0000\u0004C\u0001"+
		"\u0000\u0000\u0000\u0006L\u0001\u0000\u0000\u0000\b[\u0001\u0000\u0000"+
		"\u0000\n]\u0001\u0000\u0000\u0000\fl\u0001\u0000\u0000\u0000\u000eo\u0001"+
		"\u0000\u0000\u0000\u0010y\u0001\u0000\u0000\u0000\u0012}\u0001\u0000\u0000"+
		"\u0000\u0014\u0084\u0001\u0000\u0000\u0000\u0016\u008f\u0001\u0000\u0000"+
		"\u0000\u0018\u0094\u0001\u0000\u0000\u0000\u001a\u0099\u0001\u0000\u0000"+
		"\u0000\u001c\u009c\u0001\u0000\u0000\u0000\u001e\u009e\u0001\u0000\u0000"+
		"\u0000 \u00a6\u0001\u0000\u0000\u0000\"\u00ae\u0001\u0000\u0000\u0000"+
		"$\u00b6\u0001\u0000\u0000\u0000&\u00be\u0001\u0000\u0000\u0000(\u00c6"+
		"\u0001\u0000\u0000\u0000*\u00ce\u0001\u0000\u0000\u0000,\u00da\u0001\u0000"+
		"\u0000\u0000.\u00e3\u0001\u0000\u0000\u00000\u00f7\u0001\u0000\u0000\u0000"+
		"2\u0101\u0001\u0000\u0000\u00004\u0103\u0001\u0000\u0000\u000068\u0003"+
		"\u0002\u0001\u000076\u0001\u0000\u0000\u00008;\u0001\u0000\u0000\u0000"+
		"97\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:<\u0001\u0000\u0000"+
		"\u0000;9\u0001\u0000\u0000\u0000<=\u0005\u0000\u0000\u0001=\u0001\u0001"+
		"\u0000\u0000\u0000>B\u0003\u0006\u0003\u0000?B\u0003\b\u0004\u0000@B\u0003"+
		"\n\u0005\u0000A>\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000A@\u0001"+
		"\u0000\u0000\u0000B\u0003\u0001\u0000\u0000\u0000CG\u0005\u0004\u0000"+
		"\u0000DF\u0003\u0002\u0001\u0000ED\u0001\u0000\u0000\u0000FI\u0001\u0000"+
		"\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HJ\u0001"+
		"\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000JK\u0005\u0005\u0000\u0000"+
		"K\u0005\u0001\u0000\u0000\u0000LO\u0005\f\u0000\u0000MN\u00050\u0000\u0000"+
		"NP\u0003\u001c\u000e\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000"+
		"\u0000PQ\u0001\u0000\u0000\u0000QR\u0005\u001f\u0000\u0000RS\u0003\b\u0004"+
		"\u0000S\u0007\u0001\u0000\u0000\u0000T\\\u0003\f\u0006\u0000U\\\u0003"+
		"\u001a\r\u0000V\\\u0003\u000e\u0007\u0000W\\\u0003\u0014\n\u0000X\\\u0003"+
		"\u0016\u000b\u0000Y\\\u0003\u0018\f\u0000Z\\\u0003\u0004\u0002\u0000["+
		"T\u0001\u0000\u0000\u0000[U\u0001\u0000\u0000\u0000[V\u0001\u0000\u0000"+
		"\u0000[W\u0001\u0000\u0000\u0000[X\u0001\u0000\u0000\u0000[Y\u0001\u0000"+
		"\u0000\u0000[Z\u0001\u0000\u0000\u0000\\\t\u0001\u0000\u0000\u0000]^\u0005"+
		"\n\u0000\u0000^_\u0005\b\u0000\u0000_`\u0005\u0015\u0000\u0000`d\u0005"+
		"\u0006\u0000\u0000ac\u0005\u0014\u0000\u0000ba\u0001\u0000\u0000\u0000"+
		"cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000"+
		"\u0000eg\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000gh\u0005\u0007"+
		"\u0000\u0000hi\u00052\u0000\u0000ij\u0005\r\u0000\u0000jk\u0003\u0004"+
		"\u0002\u0000k\u000b\u0001\u0000\u0000\u0000lm\u00052\u0000\u0000mn\u0003"+
		"\u001c\u000e\u0000n\r\u0001\u0000\u0000\u0000op\u0003\u001c\u000e\u0000"+
		"pq\u0005\u0003\u0000\u0000qv\u0003\u0004\u0002\u0000ru\u0003\u0012\t\u0000"+
		"su\u0003\u0010\b\u0000tr\u0001\u0000\u0000\u0000ts\u0001\u0000\u0000\u0000"+
		"ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000"+
		"\u0000w\u000f\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000yz\u0005"+
		"/\u0000\u0000z{\u0005\u0003\u0000\u0000{|\u0003\u0004\u0002\u0000|\u0011"+
		"\u0001\u0000\u0000\u0000}~\u0005/\u0000\u0000~\u007f\u0005\u0003\u0000"+
		"\u0000\u007f\u0080\u0005,\u0000\u0000\u0080\u0081\u0003\u001c\u000e\u0000"+
		"\u0081\u0082\u0005\u0003\u0000\u0000\u0082\u0083\u0003\u0004\u0002\u0000"+
		"\u0083\u0013\u0001\u0000\u0000\u0000\u0084\u0085\u0005\t\u0000\u0000\u0085"+
		"\u008a\u0005\u0006\u0000\u0000\u0086\u008b\u0003\u001c\u000e\u0000\u0087"+
		"\u0088\u0005\f\u0000\u0000\u0088\u0089\u00054\u0000\u0000\u0089\u008b"+
		"\u0007\u0000\u0000\u0000\u008a\u0086\u0001\u0000\u0000\u0000\u008a\u0087"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0005\u0007\u0000\u0000\u008d\u008e\u0003\u0004\u0002\u0000\u008e\u0015"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0005\u000b\u0000\u0000\u0090\u0091"+
		"\u0005(\u0000\u0000\u0091\u0092\u0003\u001c\u000e\u0000\u0092\u0093\u0005"+
		"\u0002\u0000\u0000\u0093\u0017\u0001\u0000\u0000\u0000\u0094\u0095\u0005"+
		"\u000b\u0000\u0000\u0095\u0096\u0005)\u0000\u0000\u0096\u0097\u0003\u001c"+
		"\u000e\u0000\u0097\u0098\u0005\u0002\u0000\u0000\u0098\u0019\u0001\u0000"+
		"\u0000\u0000\u0099\u009a\u0003\u001c\u000e\u0000\u009a\u009b\u0005\u0002"+
		"\u0000\u0000\u009b\u001b\u0001\u0000\u0000\u0000\u009c\u009d\u0003\u001e"+
		"\u000f\u0000\u009d\u001d\u0001\u0000\u0000\u0000\u009e\u00a3\u0003 \u0010"+
		"\u0000\u009f\u00a0\u0007\u0001\u0000\u0000\u00a0\u00a2\u0003 \u0010\u0000"+
		"\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a4\u001f\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a6\u00ab\u0003\"\u0011\u0000\u00a7\u00a8\u0007\u0002\u0000\u0000\u00a8"+
		"\u00aa\u0003\"\u0011\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa\u00ad"+
		"\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac"+
		"\u0001\u0000\u0000\u0000\u00ac!\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001"+
		"\u0000\u0000\u0000\u00ae\u00b3\u0003$\u0012\u0000\u00af\u00b0\u0007\u0003"+
		"\u0000\u0000\u00b0\u00b2\u0003$\u0012\u0000\u00b1\u00af\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4#\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u00bb\u0003&\u0013\u0000\u00b7"+
		"\u00b8\u0007\u0004\u0000\u0000\u00b8\u00ba\u0003&\u0013\u0000\u00b9\u00b7"+
		"\u0001\u0000\u0000\u0000\u00ba\u00bd\u0001\u0000\u0000\u0000\u00bb\u00b9"+
		"\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc%\u0001"+
		"\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00be\u00c3\u0003"+
		"(\u0014\u0000\u00bf\u00c0\u0007\u0005\u0000\u0000\u00c0\u00c2\u0003(\u0014"+
		"\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c4\'\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c6\u00cb\u0003*\u0015\u0000\u00c7\u00c8\u0007\u0006\u0000\u0000\u00c8"+
		"\u00ca\u0003*\u0015\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cb\u00cc"+
		"\u0001\u0000\u0000\u0000\u00cc)\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001"+
		"\u0000\u0000\u0000\u00ce\u00d3\u0003,\u0016\u0000\u00cf\u00d0\u00050\u0000"+
		"\u0000\u00d0\u00d2\u0003,\u0016\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d5\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4+\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d7\u0006\u0016\uffff\uffff\u0000"+
		"\u00d7\u00d8\u0007\u0007\u0000\u0000\u00d8\u00db\u0003,\u0016\u0003\u00d9"+
		"\u00db\u0003.\u0017\u0000\u00da\u00d6\u0001\u0000\u0000\u0000\u00da\u00d9"+
		"\u0001\u0000\u0000\u0000\u00db\u00e0\u0001\u0000\u0000\u0000\u00dc\u00dd"+
		"\n\u0002\u0000\u0000\u00dd\u00df\u0007\b\u0000\u0000\u00de\u00dc\u0001"+
		"\u0000\u0000\u0000\u00df\u00e2\u0001\u0000\u0000\u0000\u00e0\u00de\u0001"+
		"\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1-\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e3\u00e8\u00030\u0018"+
		"\u0000\u00e4\u00e5\u00051\u0000\u0000\u00e5\u00e7\u0005\r\u0000\u0000"+
		"\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e7\u00ea\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000"+
		"\u00e9/\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00eb"+
		"\u00f8\u00032\u0019\u0000\u00ec\u00ed\u0005\n\u0000\u0000\u00ed\u00ee"+
		"\u0005\b\u0000\u0000\u00ee\u00ef\u0005\u0015\u0000\u0000\u00ef\u00f3\u0005"+
		"\u0006\u0000\u0000\u00f0\u00f2\u00032\u0019\u0000\u00f1\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f5\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f6\u00f8\u0005\u0007"+
		"\u0000\u0000\u00f7\u00eb\u0001\u0000\u0000\u0000\u00f7\u00ec\u0001\u0000"+
		"\u0000\u0000\u00f81\u0001\u0000\u0000\u0000\u00f9\u0102\u0005\u0015\u0000"+
		"\u0000\u00fa\u0102\u0005\u0016\u0000\u0000\u00fb\u0102\u0005\u0017\u0000"+
		"\u0000\u00fc\u0102\u0005\u0018\u0000\u0000\u00fd\u0102\u0005\u0019\u0000"+
		"\u0000\u00fe\u0102\u0005\u001a\u0000\u0000\u00ff\u0102\u00034\u001a\u0000"+
		"\u0100\u0102\u0005\f\u0000\u0000\u0101\u00f9\u0001\u0000\u0000\u0000\u0101"+
		"\u00fa\u0001\u0000\u0000\u0000\u0101\u00fb\u0001\u0000\u0000\u0000\u0101"+
		"\u00fc\u0001\u0000\u0000\u0000\u0101\u00fd\u0001\u0000\u0000\u0000\u0101"+
		"\u00fe\u0001\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0101"+
		"\u0100\u0001\u0000\u0000\u0000\u01023\u0001\u0000\u0000\u0000\u0103\u0104"+
		"\u0005\u0006\u0000\u0000\u0104\u0105\u0003\u001c\u000e\u0000\u0105\u0106"+
		"\u0005\u0007\u0000\u0000\u01065\u0001\u0000\u0000\u0000\u00169AGO[dtv"+
		"\u008a\u00a3\u00ab\u00b3\u00bb\u00c3\u00cb\u00d3\u00da\u00e0\u00e8\u00f3"+
		"\u00f7\u0101";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}