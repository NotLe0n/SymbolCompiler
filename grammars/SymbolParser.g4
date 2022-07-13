parser grammar SymbolParser;

options { tokenVocab = '../src/SymbolCompiler/Lexer/SymbolLexer'; }

program:		 decl* EOF;

/* Declarations */
decl:		    varAssignment | stmt | funcDecl;
block:			R_BRACE decl* L_BRACE;
varAssignment:	VAR (OP_INDEX expr)? OP_ASSIGN stmt;
stmt:			retStmt | exprStmt | ifStmt | loopStmt | printStmt | readStmt | block;

/* Functions */
funcDecl:		FUNC SEPERATOR LIT_UINT R_PAREN FUNC_ARG_LIST* L_PAREN OP_RET TYPENAME block;
retStmt:		OP_RET expr;

/* Conditional Statements */
ifStmt:			expr QUESTION_MARK block (elseifStmt | elseStmt)*;
elseStmt:		OP_NOT QUESTION_MARK block;
elseifStmt:     OP_NOT QUESTION_MARK OP_AND expr QUESTION_MARK block;

/* Loop Statements */
loopStmt:		LOOP R_PAREN (expr | (VAR OP_CONTINUE (VAR|LIT_RANGE))) L_PAREN block;

/* Console IO */
printStmt:		CONSOLE OP_LT expr SEMICOLON;
readStmt:		CONSOLE OP_GT expr SEMICOLON;

exprStmt:		expr SEMICOLON;
/* Expressions */
expr:			booleanExpr;
booleanExpr:	equalityExpr ((OP_AND | OP_OR | OP_XOR) equalityExpr)*;
equalityExpr:	compExpr ((OP_EQ | OP_NEQ) compExpr)*;
compExpr:		bitwiseExpr ((OP_LT | OP_GT | OP_LTEQ | OP_GTEQ) bitwiseExpr)*;
bitwiseExpr:	termExpr ((OP_LSHFT | OP_RSHFT) termExpr)*;
termExpr:		factorExpr ((OP_PLUS | OP_MINUS) factorExpr)*;
factorExpr:		indexing ((OP_MULT | OP_DIV | OP_EXP | OP_MOD) indexing)*;
indexing:		unaryExpr (OP_INDEX unaryExpr)*;
unaryExpr:		(OP_NOT | OP_MINUS | OP_LENGTH) unaryExpr | unaryExpr (OP_INC | OP_DEC) | castExpr;
castExpr: 		callExpr (OP_CAST TYPENAME)*;
callExpr:		primaryExpr | (FUNC SEPERATOR LIT_UINT R_PAREN primaryExpr* L_PAREN);
primaryExpr:	LIT_UINT | LIT_FLOAT | LIT_STRING | LIT_CHAR | LIT_ARRAY | LIT_RANGE | grouping | VAR;
grouping:		R_PAREN expr L_PAREN;
