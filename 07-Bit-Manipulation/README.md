# Bit Manipulation

## Sub-branches
- Binary representation; AND, OR, XOR, NOT, left and right shifts.
- Check, set, clear and toggle the ith bit.
- Odd/even and power-of-two checks.
- Count set bits using Brian Kernighan's method.
- XOR properties, bit masks and subset generation.

## Practice
Check ith bit, set/clear/toggle bit, count set bits, power of two, unique number when others occur twice, generate subsets using bit masks.


## Sprint teaching expansion

Java int 32-bit and long 64-bit; shifts, masks, signedness matter; >>> unsigned shift. Patterns test/set/clear/toggle, XOR, bit counts. Test zero, negative, width boundary.

Self-check: explain, trace, justify, implement, test boundaries and analyze complexity.


## Practical limits and Java details
- Bit positions for int are 0 through 31; bit 31 is the sign bit.
- Bitmask subset enumeration is capped at 20 input elements in the implementation because the number of subsets doubles with each additional element.
- For negative ints, bit counting treats the number's two's-complement representation as 32 bits.
