package com.leetcode.problems.medium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class LongestSubstringWithoutRepeatingCharactersTest {

    private final LongestSubstringWithoutRepeatingCharacters tested = new LongestSubstringWithoutRepeatingCharacters();

    @DisplayName("Testing conversion from Roman number to int")
    @ParameterizedTest
    @MethodSource
    public void test(String string, int length) {
        var result = tested.lengthOfLongestSubstring(string);
        assertThat(result).isEqualTo(length);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("abcabcbb", 3),
                Arguments.of("abcdeaa", 5),
                Arguments.of("bbbbb", 1),
                Arguments.of("pwwkew", 3),
                Arguments.of("dvdf", 3),
                Arguments.of("qrsvbspk", 5),

                Arguments.of("au", 2),
                Arguments.of("", 0),
                Arguments.of(" ", 1)
        );
    }
}