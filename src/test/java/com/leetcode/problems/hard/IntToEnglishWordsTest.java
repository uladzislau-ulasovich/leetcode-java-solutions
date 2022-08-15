package com.leetcode.problems.hard;

import com.leetcode.problems.hard.IntToEnglishWords;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class IntToEnglishWordsTest {

    private final IntToEnglishWords tested = new IntToEnglishWords();

    @DisplayName("Testing conversion from Int to English words")
    @ParameterizedTest
    @MethodSource
    public void test(int intNumber, String numberAsWords) {
        var result = tested.numberToWords(intNumber);
        assertThat(result).isEqualTo(numberAsWords);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(1, "One"),
                Arguments.of(2, "Two"),
                Arguments.of(3, "Three"),
                Arguments.of(4, "Four"),
                Arguments.of(5, "Five"),
                Arguments.of(6, "Six"),
                Arguments.of(7, "Seven"),
                Arguments.of(8, "Eight"),
                Arguments.of(9, "Nine"),
                Arguments.of(10, "Ten"),
                Arguments.of(11, "Eleven"),
                Arguments.of(12, "Twelve"),
                //
                Arguments.of(13, "Thirteen"),
                Arguments.of(14, "Fourteen"),
                Arguments.of(15, "Fifteen"),
                Arguments.of(16, "Sixteen"),
                Arguments.of(17, "Seventeen"),
                Arguments.of(18, "Eighteen"),
                Arguments.of(19, "Nineteen"),
                //
                Arguments.of(20, "Twenty"),
                Arguments.of(21, "Twenty One"),
                Arguments.of(22, "Twenty Two"),
                Arguments.of(23, "Twenty Three"),
                Arguments.of(24, "Twenty Four"),
                Arguments.of(25, "Twenty Five"),
                Arguments.of(26, "Twenty Six"),
                Arguments.of(27, "Twenty Seven"),
                Arguments.of(28, "Twenty Eight"),
                Arguments.of(29, "Twenty Nine"),
                //
                Arguments.of(30, "Thirty"),
                Arguments.of(40, "Forty"),
                Arguments.of(50, "Fifty"),
                Arguments.of(60, "Sixty"),
                Arguments.of(70, "Seventy"),
                Arguments.of(80, "Eighty"),
                Arguments.of(90, "Ninety"),
                //
                Arguments.of(100, "One Hundred"),
                //
                Arguments.of(123, "One Hundred Twenty Three"),
                Arguments.of(12345, "Twelve Thousand Three Hundred Forty Five"),
                Arguments.of(1234567, "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"),
                //
                Arguments.of(1_000_000, "One Million"),
                Arguments.of(1_000_001, "One Million One"),
                Arguments.of(1_000_011, "One Million Eleven"),
                Arguments.of(1_001_000, "One Million One Thousand"),
                //
                Arguments.of(0, "Zero")
        );
    }
}