package com.leetcode.problems.medium;

// Runtime: 6 ms, faster than 91.57% of Java online submissions for Integer to Roman.
// Memory Usage: 42 MB, less than 93.03% of Java online submissions for Integer to Roman.
public class IntToRoman {
    public String intToRoman(int num) {
        String result = "";
        int exponent = 0;
        while (num > 0) {
            int multiplier = (int) Math.pow(10, exponent);

            final int digit = num % 10;

            final var one = romanOf(multiplier);
            final var five = romanOf(5 * multiplier);
            final var ten = romanOf(10 * multiplier);

            String asRoman;

            if (digit <= 3) {
                asRoman = one.repeat(digit);
            } else if (digit <= 8) {
                if (digit - 5 >= 0) {
                    asRoman = five + one.repeat(digit - 5);
                } else {
                    asRoman = one + five;
                }
            } else {
                asRoman = one + ten;
            }

            result = asRoman + result;

            num /= 10;
            exponent++;
        }

        return result;
    }

    private String romanOf(int num) {
        return switch (num) {
            case 1 -> "I";
            case 5 -> "V";
            case 10 -> "X";
            case 50 -> "L";
            case 100 -> "C";
            case 500 -> "D";
            case 1000 -> "M";
            default -> "";
        };
    }
}
