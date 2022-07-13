lexer grammar SymbolLexer;

WS: [ \n\r\t] -> skip;
SEMICOLON:		';';
/*BLOCK_START: 	':\n';*/
QUESTION_MARK:	'?';
R_BRACE:		'{';
L_BRACE:		'}';
R_PAREN:		'(';
L_PAREN:		')';
fragment DIGIT:	[0-9];
SEPERATOR:		'_';
LOOP:		    'O';
FUNC:			'F';
CONSOLE:		'C';

VAR:			TYPENAME SEPERATOR LIT_UINT;
TYPENAME:		TYPE_INT | TYPE_UINT | TYPE_FLOAT | TYPE_STRING | TYPE_CHAR | TYPE_ARRAY;
TYPE_ARRAY:		(TYPE_INT | TYPE_UINT | TYPE_FLOAT | TYPE_STRING | TYPE_CHAR)'[]'+;
TYPE_INT:		'i'LIT_UINT;
TYPE_UINT:		'u'LIT_UINT;
TYPE_FLOAT:		'f32' | 'f64';
TYPE_STRING:	's';
TYPE_CHAR:		'c';

FUNC_ARG_LIST:	(VAR (',' VAR)*);

fragment LITERAL:		LIT_UINT | LIT_FLOAT | LIT_STRING | LIT_CHAR | LIT_ARRAY | LIT_RANGE;
fragment CHAR:			[A-Za-z_ -*/]|'\\n'|'\\t';
LIT_UINT:		DIGIT+;
LIT_FLOAT:		LIT_UINT([.] LIT_UINT)?;
LIT_STRING:		'"' (CHAR)* '"';
LIT_CHAR:		'\'' (CHAR) '\'';
LIT_ARRAY:		'[' ( LITERAL (',' ' '* LITERAL)* )? ']';
LIT_RANGE:		LIT_UINT '...' LIT_UINT;


OP_PLUS:		'+';
OP_MINUS:		'-';
OP_MULT:		'*';
OP_DIV:			'/';
OP_ASSIGN:		'=';
OP_EXP:			'^';
OP_LSHFT:		'<<';
OP_RSHFT:		'>>';
OP_INC:			'++';
OP_DEC:			'--';
OP_MOD:			'%';

OP_EQ:			'==';
OP_NEQ:			'!=';
OP_LT:			'<';
OP_GT:			'>';
OP_LTEQ:		'<=';
OP_GTEQ:		'>=';
OP_AND:			'&';
OP_OR:			'|';
OP_XOR:			'><';
OP_NOT:			'~';

OP_INDEX:		'@';
OP_CAST:		'->';

OP_RET:			'=>';
OP_BREAK:		'>|';
OP_CONTINUE:	'->>';
OP_PANIC:		'!';

OP_MEMBER_ACC:	'.';
OP_LENGTH:		'#';