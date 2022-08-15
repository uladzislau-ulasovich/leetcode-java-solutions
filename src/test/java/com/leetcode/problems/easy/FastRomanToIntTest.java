package com.leetcode.problems.easy;


import com.leetcode.problems.easy.FastRomanToInt;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class FastRomanToIntTest {
    private final FastRomanToInt tested = new FastRomanToInt();

    @DisplayName("Testing conversion from Roman number to int (optimized impl.)")
    @ParameterizedTest
    @MethodSource
    public void test(String romanNumber, int intNumber) {
        var result = tested.romanToInt(romanNumber);
        assertThat(result).isEqualTo(intNumber);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                // Problem's tests
                Arguments.of("III", 3),
                Arguments.of("MCMXCIV", 1994),
                Arguments.of("LVIII", 58),
                // Corner cases
                Arguments.of("I", 1),
                Arguments.of("II", 2),
                Arguments.of("VI", 6),
                Arguments.of("VII", 7),
                Arguments.of("VIII", 8),
                Arguments.of("XI", 11),
                Arguments.of("IV", 4),
                Arguments.of("IX", 9),
                Arguments.of("XL", 40),
                Arguments.of("XC", 90),
                Arguments.of("CD", 400),
                Arguments.of("CM", 900),
                Arguments.of("CMXIX", 919),
                Arguments.of("DCXXI", 621)         // DCXXI 500 100 10 10 1
        );
    }
}