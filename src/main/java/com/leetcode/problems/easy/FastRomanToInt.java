package com.leetcode.problems.easy;

// Solution results overview:
// Runtime: 4 ms, faster than 98.18% of Java online submissions for Roman to Integer.
// Memory Usage: 42.5 MB, less than 92.31% of Java online submissions for Roman to Integer.
public class FastRomanToInt {
    public int romanToInt(final String romanNumber) {
        int sum = 0;

        for (int i = 0; i < romanNumber.length(); i++) {
            final int currentInt = intValueOf(romanNumber.charAt(i));

            if (i > 0 && currentInt > intValueOf(romanNumber.charAt(i - 1))) {
                sum -= intValueOf(romanNumber.charAt(i - 1)) * 2;
            }

            sum += currentInt;
        }

        return sum;
    }

    private int intValueOf(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
