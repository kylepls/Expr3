[![](https://jitpack.io/v/kylepls/Expr3.svg)](https://jitpack.io/#kylepls/Expr3)
[![Coverage Status](https://coveralls.io/repos/github/kylepls/Expr3/badge.svg?branch=master)](https://coveralls.io/github/kylepls/Expr3?branch=master)
[![Build Status](https://travis-ci.org/kylepls/Expr3.svg?branch=master)](https://travis-ci.org/kylepls/Expr3)

## Expr3

Based on [Expr](https://github.com/darius/expr)

##### Examples:

Evaluate simple math expressions.

    Addition & Subtraction:
    1+1 = 1
    
    Negitive Numbers:
    1--1= 2
    
    Functions:
    cos pi = -1
    sqrt 81 = 9
    max(1,2) = 2
    
    Exponents:
    round e^ln(2) = 2
    
    Variables:
    a = 1
    b = 2
    a * b = 2
    
    Implicit Multiplication & Constants:
    (2)(4) = 8
    2pi    = 6.28...
    
##### Usage:

```java
Expr expr = new Expr();
double result = expr.eval("1+1"); 
```

##### VCS

https://jitpack.io/#kylepls/Expr3/

