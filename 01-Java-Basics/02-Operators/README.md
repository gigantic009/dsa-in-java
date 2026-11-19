# Operators

**Theory-only foundation.** No standalone interview problem files are needed at this stage.

## 1. Arithmetic operators
`+`, `-`, `*`, `/`, `%`. Integer division truncates toward zero. The remainder operator is useful for parity, divisibility and extracting digits. Division by zero with integer operands throws ArithmeticException.

## 2. Unary operators
`++`, `--`, unary `+`, unary `-`, and logical negation `!`. Distinguish prefix from postfix when used inside expressions:
```java
int x = 5;
int a = ++x; // x becomes 6, then value is used
int b = x++; // value 6 is used, then x becomes 7
```
Prefer separate statements when the distinction makes code hard to read.

## 3. Relational and equality operators
`==`, `!=`, `<`, `>`, `<=`, `>=`. For primitive values, equality compares values. For object references, `==` compares whether references identify the same object; use appropriate methods such as `equals` for value equality when supported.

## 4. Logical operators and short circuiting
`&&`, `||`, `!`. With `&&`, the right operand is skipped when the left operand is false. With `||`, it is skipped when the left operand is true. This can make guarded expressions safe.

## 5. Assignment operators
`=`, `+=`, `-=`, `*=`, `/=`, `%=` and related forms. Compound assignment includes an implicit cast in certain cases, so do not assume it behaves exactly like a separately written expression.

## 6. Bitwise operators and shifts
`&`, `|`, `^`, `~`, `<<`, `>>`, `>>>`. Bitwise operations work on integral values. Logical operators on booleans are different from bitwise operators.

## 7. Ternary operator
`condition ? valueIfTrue : valueIfFalse` provides a compact conditional expression. Avoid deeply nested ternaries if readability suffers.

## 8. Precedence and associativity
Operators follow precedence rules. Parentheses are the clearest way to communicate intended grouping; don't rely on memorized precedence for complicated expressions.

## Trace exercises
Predict each before running:
- `9 / 2` and `9.0 / 2`
- `9 % 2`
- `false && (10 / 0 > 1)`
- prefix/postfix increment
- `5 & 3`, `5 | 3`, `5 ^ 3`
- `1 << 3`

## Self-check
Explain integer division, short-circuiting, reference equality, prefix/postfix, bitwise versus logical operators and why parentheses can improve clarity.