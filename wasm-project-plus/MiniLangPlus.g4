grammar MiniLangPlus;

prog: stmt* EOF ;

stmt
    : 'print' expr ';'                  # PrintStmt
    | ID '=' expr ';'                   # AssignStmt
    | 'if' '(' expr ')' stmt ('else' stmt)?  # IfStmt
    | 'while' '(' expr ')' stmt         # WhileStmt
    | 'func' ID '(' paramList? ')' block # FuncDecl
    | 'return' expr ';'                 # ReturnStmt
    | block                             # BlockStmt
    ;

block: '{' stmt* '}' ;
paramList: ID (',' ID)* ;

expr
    : expr op=('*'|'/') expr            # MulDiv
    | expr op=('+'|'-') expr            # AddSub
    | expr op=('<' | '>' | '==' | '!=') expr # Compare
    | '(' expr ')'                      # Parens
    | ID '(' argList? ')'               # FuncCall
    | ID                                # Var
    | INT                               # Int
    | BOOL                              # Bool
    ;

argList: expr (',' expr)* ;

BOOL: 'true' | 'false' ;
ID  : [a-zA-Z_][a-zA-Z_0-9]* ;
INT : [0-9]+ ;
WS  : [ \t\r\n]+ -> skip ;
