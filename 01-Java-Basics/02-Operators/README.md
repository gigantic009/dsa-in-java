# Operators

Operators combine, compare, transform or assign values. Understand the expression's type and evaluation order—not only the symbol.

## 1. Arithmetic

`+`, `-`, `*`, `/`, `%`. Integer division truncates toward zero. Remainder is useful for parity, divisibility and digit extraction. Integer division by zero throws `ArithmeticException`.

```java
int quotient = 9 / 2; // 4
int remainder = 9 % 2; // 1
double decimal = 9.0 / 2; // 4.5
```

## 2. Unary and increment

`++`, `--`, unary `+`, unary `-`, `!`.

Prefix increment updates before the expression uses the value; postfix increment uses the old value in that expression and then updates. When tracing is confusing, prefer separate statements.

## 3. Comparison

`==`, `!=`, `<`, `>`, `<=`, `>=`. Primitive comparisons compare values. For object references, `==` compares whether references identify the same object; compare string contents using `equals()`.

## 4. Logical operators and short-circuiting

`&&`, `||`, `!`.

- `a && b`: if `a` is false, `b` is not evaluated.
- `a || b`: if `a` is true, `b` is not evaluated.

```java
int n = 0;
boolean safe = n != 0 && 10 / n > 1; // second expression is skipped
```

Short-circuiting can prevent errors, but write clear conditions.

## 5. Assignment

`=`, `+=`, `-= `, `*= `, `/= `, `%=`. Compound assignments have conversion behaviour; for example, `byte b = 1; b += 1;` is legal whereas `b = b + 1;` requires a narrowing cast because the expression is promoted to int.

## 6. Bitwise operators and shifts

`&`, `|`, `^`, `~`, `<<`, `>>`, `>>>` work on integral values. They differ from boolean short-circuit operators.

For example, the binary representation of 5 and 3 is:
- 5: `0101`
- 3: `0011`
- AND: `0001` → 1
- OR: `0111` → 7
- XOR: `0110` → 6

## 7. Ternary expression

`condition ? valueIfTrue : valueIfFalse` selects one of two expressions. Use it for simple choices, not deeply nested logic.

## 8. Precedence and parentheses

Operators follow precedence rules. Parentheses help make intended grouping explicit. Avoid relying on memorised precedence when a simple parenthesised expression is clearer.

## Dry-run practice

Predict each before executing:
- `9 / 2`, `9.0 / 2`, `9 % 2`
- `false && (10 / 0 > 1)`
- prefix vs postfix increment
- `5 & 3`, `5 | 3`, `5 ^ 3`
- `1 << 3`
- `byte b = 1; b += 1;`

## Exercises
1. Check divisibility by both 3 and 5.
2. Use remainder to extract the last digit.
3. Demonstrate prefix and postfix increments in separate traced statements.
4. Compare two strings by content.
5. Write a bitwise AND example and explain each bit.

## Checkpoint
Explain integer division, short-circuit evaluation, reference equality, prefix/postfix and logical vs bitwise operators.