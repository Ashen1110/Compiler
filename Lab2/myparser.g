grammar myparser;

options {
   language = Java;
   backtrack=true;
}

@header {
    import java.util.Set;
	import java.util.HashSet;
}

@members {
    boolean TRACEON = true;
}

program:
	VOID MAIN '(' ')' '{' statements '}'
        {if (TRACEON) System.out.println("VOID MAIN () {declarations statements}");}
    | INT MAIN '(' ')' '{' statements '}'
    	{if (TRACEON) System.out.println("INT MAIN () {declarations statements}");}
    ;


type: FLOAT { if (TRACEON) System.out.println("type: FLOAT"); }
	| INT {if (TRACEON) System.out.println("type: INT"); }
	| DOUBLE {if (TRACEON) System.out.println("type: DOUBLE");}
	| CHAR {if (TRACEON) System.out.println("type: CHAR");}
	| SHORT {if (TRACEON) System.out.println("type: SHORT");}
	| LONG {if (TRACEON) System.out.println("type: LONG");}
	| SIGNED {if (TRACEON) System.out.println("type: SIGNED");}
	| UNSIGNED {if (TRACEON) System.out.println("type: UNSIGNED");}
	| BOOLEAN {if (TRACEON) System.out.println("type: BOOLEAN");}
	| STRING {if (TRACEON) System.out.println("type: STRING");}
	| VOID {if (TRACEON) System.out.println("type: VOID");}
	;
	
storage_class_specifier: 
	EXTERN {if (TRACEON) System.out.println("storage: EXTERN");}
	| STATIC {if (TRACEON) System.out.println("storage: STATIC");}
	| AUTO {if (TRACEON) System.out.println("storage: AUTO");}
	| REGISTER {if (TRACEON) System.out.println("storage: REGISTER");}
	;
	

statements:statement statements
	| ;

//expression

argument_expression_list:   
	assignment_expression (',' assignment_expression)*
	;

arith_expression: 
	multExpr( '+' multExpr | '-' multExpr)*
	;

multExpr: 
	signExpr( '*' signExpr | '/' signExpr | '%' signExpr)*;

signExpr: 
    '('type')' signExpr
    | unary_expression
    ;

expression
	: assignment_expression (',' assignment_expression)*
	;

assignment_expression
	: lvalue (options{backtrack=true;}: assignment_expression)
	| conditional_expression
		{if (TRACEON) System.out.println("assignment_expression: conditions");}
	;

lvalue
	:	unary_expression assignment_operator
	;

unary_expression:	
	postfix_expression
	| '++' unary_expression
	| '--' unary_expression
	| unary_operator signExpr
	| SIZEOF unary_expression
	| SIZEOF '(' type ')'
	;		  

postfix_expression:
	primaryExpr('['arith_expression']'
	| '(' ')'
	| '(' argument_expression_list ')'
	| '.'Identifier
	| '->' Identifier
	| '++'
	| '--'
	)*;
	
unary_operator
	: '&'
	| '*'
	| '+'
	| '-'
	| '~'
	| '!'
	;
	

primaryExpr: 
	Integer_constant
   	| Floating_point_constant
	| Identifier
	| '(' expression ')';

assignment_operator
	: '='
	| '*='
	| '/='
	| '%='
	| '+='
	| '-='
	| '<<='
	| '>>='
	| '&='
	| '^='
	| '|='
	;

conditional_expression
	: logical_or_expression ('?' expression ':' conditional_expression)?
	;
	
logical_or_expression
	: logical_and_expression ('||' logical_and_expression)*
	;

logical_and_expression
	: inclusive_or_expression ('&&' inclusive_or_expression)*
	;

inclusive_or_expression
	: exclusive_or_expression ('|' exclusive_or_expression)*
	;

exclusive_or_expression
	: and_expression ('^' and_expression)*
	;

and_expression
	: equality_expression ('&' equality_expression)*
	;
equality_expression
	: relational_expression (('=='|'!=') relational_expression)*
	;

relational_expression
	: shift_expression (('<'|'>'|'<='|'>=') shift_expression)*
	;

shift_expression
	: arith_expression (('<<'|'>>') arith_expression)*
	;


//statement
statement: 
	type Identifier ';'
    	{ if (TRACEON) System.out.println("declarations: type Identifier : declarations"); }
	| type* Identifier '=' arith_expression ';'
		{if (TRACEON) System.out.println("statement: assignment");} 
	| expression_statement
	| if_then_statement
	| switch_statement
	| labeled_statement
	| iteration_statement
	| jump_statement
	| printf_statement
	| scanf_statement
	;

expression_statement: 
	';'
	| expression ';'
	;

if_then_statement: 
	IF '('expression')' selection_statement
	;

selection_statement:
	then_statement (else_statement)?
	;

else_statement:
	ELSE iteration_then_statement
		{if (TRACEON) System.out.println("statement: if_then_else_statements");}
	| ELSE if_then_statement
		{if (TRACEON) System.out.println("statement: if_then_else_statements");}
	|
	;
	
then_statement:
	statement
		{if (TRACEON) System.out.println("statement: if_then_statements");} 
	| '{'statements'}'
		{if (TRACEON) System.out.println("statement: if_then_statements");} 
	;

switch_statement:
	SWITCH '(' expression ')' iteration_then_statement
		{if (TRACEON) System.out.println("statement: switch");}
	;
	
labeled_statement: 
	Identifier ':' statement
	| CASE conditional_expression ':' statement
		{if (TRACEON) System.out.println("labeled: case");}
	| DEFAULT ':' statement
		{if (TRACEON) System.out.println("labeled: default");}
	;

iteration_statement: 
	WHILE '(' expression ')' iteration_then_statement
		{if (TRACEON) System.out.println("iteration_statement: while");}
	| DO iteration_then_statement WHILE '(' expression ')' ';'
		{if (TRACEON) System.out.println("iteration_statement: do_while");}
	| FOR '(' expression_statement expression_statement expression? ')' iteration_then_statement
		{if (TRACEON) System.out.println("iteration_statement: for");}
	;

iteration_then_statement:
	statement
	| '{'statements'}'
	;

jump_statement: 
	';'
	| CONTINUE ';' 
		{if (TRACEON) System.out.println("jump_statement: continue");}
	| BREAK ';' 
		{if (TRACEON) System.out.println("jump_statement: break");}
	| RETURN ';' 
		{if (TRACEON) System.out.println("jump_statement: return;");}
	| RETURN expression ';'
		{if (TRACEON) System.out.println("jump_statement: return expression;");}
	;


printf_statement:
	PRINTF '('printf_parameters')'';'
	;	
printf_parameters:
	STRINGS printf_func*
		{if (TRACEON) System.out.println("PRINTF: strings");}
	|
	;
printf_func:
	','primaryExpr
		{if (TRACEON) System.out.println("PRINTF: parameters");}
	;
	
scanf_statement:
	SCANF'('scanf_parameters')'';'
	;
	
scanf_parameters:
	STRINGS scanf_func*
		{if (TRACEON) System.out.println("SCANF: strings");}
	|
	;

scanf_func:
	',''&'* expression
		{if (TRACEON) System.out.println("SCANF: parameters");}
	;

/* description of the tokens */

//type
INT: 'int';
CHAR: 'char';
VOID: 'void';
FLOAT: 'float';
DOUBLE: 'double';
SIGNED: 'signed';
UNSIGNED: 'unsigned';
BOOLEAN: 'bool';
STRING: 'string';
LONG: 'long';
SHORT: 'short';

//storage
AUTO: 'auto';
STATIC: 'static';
EXTERN: 'extern';
REGISTER: 'register';

//keywords
MAIN: 'main';
SIZEOF: 'sizeof';
IF: 'if';
ELSE: 'else';
SWITCH: 'switch';
CASE: 'case';
DEFAULT: 'default';
WHILE: 'while';
DO: 'do';
FOR: 'for';
CONTINUE: 'continue';
BREAK: 'break';
RETURN: 'return';
PRINTF: 'printf';
SCANF: 'scanf';

Identifier:('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

Integer_constant:'0'..'9'+;
Floating_point_constant:'0'..'9'+ '.' '0'..'9'+;

STRINGS: '"' (options{greedy = false;}: .)* '"';

WS:( ' ' | '\t' | '\r' | '\n' ) {$channel=HIDDEN;};

COMMENT:'/*' .* '*/' {$channel=HIDDEN;};

LINE_COMMAND 
    : '#' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;
