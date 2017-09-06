grammar Expr;

operation   : assignment  
            | expr 
            ;
             
expr: function_call                                   # OP_FUNC 
    | expr EXP<assoc=right> expr                      # OP_EXP
    | expr op=(MUL|DIV) expr                          # OP_MULDIV
    | expr (MOD) expr                                 # OP_MOD
    | expr op=(ADD|SUB) expr                          # OP_ADDSUB
    | expr op=(EQ|GT|GTE|LT|LTE) expr                 # OP_COMPARE
    | ABS expr ABS                                    # ABS
    | PAR_OPEN expr PAR_CLOSE PAR_OPEN expr PAR_CLOSE # IMP_MUL
    | (number NAME | NAME number)                     # IMP_MUL_2
    | PAR_OPEN expr PAR_CLOSE                         # PARENS
    | NAME                                            # OP_GETVAR
    | number                                          # OP_NUMBER
    ; 

assignment   : NAME EQ expr ;
function_call: NAME PAR_OPEN (expr (ARG_SEP expr)*)? PAR_CLOSE 
             | NAME expr;
number       : SUB? INT ('.' INT)? (('E') power=INT)?;

ARG_SEP     : ',' ;
NAME        : [a-zA-Z]+ ;
PAR_OPEN    : '(' ;
PAR_CLOSE   : ')' ;

// NUM
ADD: '+' ;
SUB: '-' ;
DIV: '/' ;
MUL: '*' ;
MOD: '%' ;
EXP: '^' ;
ABS: '|' ;

// BOOL
GTE: '>=';
LTE: '<=';
EQ : '=' ;
GT : '>' ;
LT : '<' ;

WS: ' ' -> skip ;

INT: [0-9]+ ;