package com.leetcode.problems.medium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class IntToRomanTest {

    private final IntToRoman tested = new IntToRoman();

    @DisplayName("Testing conversion from Int to Roman")
    @ParameterizedTest
    @MethodSource
    public void test(int intNumber, String romanNumber) {
        var result = tested.intToRoman(intNumber);
        assertThat(result).isEqualTo(romanNumber);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(1, "I"),
                Arguments.of(2, "II"),
                Arguments.of(3, "III"),
                Arguments.of(4, "IV"),
                Arguments.of(5, "V"),
                Arguments.of(6, "VI"),
                Arguments.of(7, "VII"),
                Arguments.of(8, "VIII"),
                Arguments.of(9, "IX"),
                Arguments.of(10, "X"),
                Arguments.of(11, "XI"),
                Arguments.of(19, "XIX"),
                Arguments.of(20, "XX"),
                Arguments.of(40, "XL"),
                Arguments.of(49, "XLIX"),
                Arguments.of(50, "L"),
                Arguments.of(60, "LX"),
                Arguments.of(90, "XC"),
                Arguments.of(100, "C"),
                Arguments.of(110, "CX"),
                Arguments.of(400, "CD"),
                Arguments.of(440, "CDXL"),
                Arguments.of(445, "CDXLV"),
                Arguments.of(449, "CDXLIX"),
                Arguments.of(450, "CDL"),
                Arguments.of(500, "D"),
                Arguments.of(900, "CM"),
                Arguments.of(1000, "M")
        );
    }
}