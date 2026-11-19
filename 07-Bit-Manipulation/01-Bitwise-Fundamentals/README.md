# Bitwise Fundamentals

Bitwise operators work on individual bits in an integer's binary representation. Java uses fixed-width signed integer types; `int` has 32 bits and `long` has 64.

## Operators
| Operator | Meaning |
|---|---|
| `&` | AND: bit is 1 only when both bits are 1 |
| `|` | OR: bit is 1 when either bit is 1 |
| `^` | XOR: bit is 1 when bits differ |
| `~` | NOT: flips every bit |
| `<<` | left shift |
| `>>` | signed right shift |
| `>>>` | unsigned right shift |

## Bit masks
A mask `1 << i` selects bit i for int-sized indices. To check bit i: `(n & (1 << i)) != 0`. For larger bit positions or 64-bit values, use `1L << i`.

## Useful operations
- Set bit: `n | mask`
- Clear bit: `n & ~mask`
- Toggle bit: `n ^ mask`
- Test bit: `(n & mask) != 0`

## XOR identities
- `x ^ x = 0`
- `x ^ 0 = x`
- XOR is associative and commutative.

## Practice
- Check, set, clear and toggle a bit
- Count set bits
- Check power of two
- Single Number
- XOR of a range (after studying prefix XOR)

## Pitfalls
- Operator precedence: use parentheses.
- Shift counts are not arbitrary; Java masks shift distances.
- `1 << 31` is negative as an int because the sign bit is set.
- Avoid overflow and use long when needed.

## Checkpoint
Write bit-check/set/clear/toggle functions and explain the mask using a binary trace.
