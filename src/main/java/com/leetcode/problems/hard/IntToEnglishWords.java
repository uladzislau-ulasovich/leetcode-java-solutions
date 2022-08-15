package com.leetcode.problems.hard;

public class IntToEnglishWords {
    public String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }

        String res = "";
        int exp = 0;

        while (num > 0) {
            final int triad = num % 1000;

            if (triad > 0) {
                res = processTriad(triad) + " " + magnitude[exp] + res;
            }

            exp++;
            num /= 1000;
        }

        return res.trim();
    }

    private String processTriad(int triad) {
        String temp = "";

        final var tensPart = triad % 100;

        if (9 < tensPart && tensPart < 20) {
            temp = teens[tensPart % 10];
        } else {
            temp = tens[tensPart / 10] + ones[tensPart % 10];
        }

        temp = temp.trim();

        if (triad > 99) {
            temp = ones[triad / 100] + " Hundred " + temp;
        }

        return temp.trim();
    }

    private static final String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private static final String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] tens = {"", "", "Twenty ", "Thirty ", "Forty ", "Fifty ", "Sixty ", "Seventy ", "Eighty ", "Ninety "};
    private static final String[] magnitude = {"", "Thousand ", "Million ", "Billion "};
}
