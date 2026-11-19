# Operators

**Theory-only foundation.** No standalone interview problem files are needed at this stage.

## 1. Arithmetic
`+`, `-`, `*`, `/`, `%`. Integer division truncates toward zero. Remainder is useful for parity, divisibility and extracting digits. Integer division by zero throws ArithmeticException.

## 2. Unary
`++`, `--`, unary `+`, unary `-`, and `!`. Prefix changes the value before the expression uses it; postfix uses the old value before changing it. Prefer separate statements when this distinction harms readability.

## 3. Relational and equality
`==`, `!=`, `<`, `>`, `<=`, `>=`. For primitives equality compares values. For object references, `==` compares identity; use value-comparison methods such as `equals` when appropriate.

## 4. Logical and short-circuiting
`&&`, `||`, `!`. With `&&`, the right side is skipped if the left side is false. With `||`, the right side is skipped if the left side is true.

## 5. Assignment
`=`, `+=`, `-=`, `*=`, `/=`, `%=` and related forms. Compound assignment has conversion rules that can differ from a separately written expression.

## 6. Bitwise and shifts
`&`, `|`, `^`, `~`, `<<`, `>>`, `>>>`. These operate on integral values; boolean logical operators are conceptually different.

## 7. Ternary
`condition ? valueIfTrue : valueIfFalse` is a compact conditional expression. Avoid deep nesting.

## 8. Precedence
Operators follow precedence rules. Parentheses make intended grouping clearer and safer than relying on memorization.

## Trace exercises
Predict `9 / 2`, `9.0 / 2`, `9 % 2`, `false && (10 / 0 > 1)`, prefix/postfix increment, `5 & 3`, `5 | 3`, `5 ^ 3`, and `1 << 3`.

## Self-check
Explain integer division, short-circuiting, reference equality, prefix/postfix and bitwise versus logical operators.