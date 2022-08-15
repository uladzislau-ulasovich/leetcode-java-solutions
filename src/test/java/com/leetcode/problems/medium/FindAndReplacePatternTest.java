package com.leetcode.problems.medium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class FindAndReplacePatternTest {

    private final FindAndReplacePattern tested = new FindAndReplacePattern();

    @DisplayName("Tests for the '890. Find and replace pattern' problem")
    @ParameterizedTest
    @MethodSource
    public void test(String[] words, String pattern, List<String> matched) {
        var result = tested.findAndReplacePattern(words, pattern);
        assertThat(result).isEqualTo(matched);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(arrayOf("a","b","c"), "a", List.of("a","b","c")),
                Arguments.of(arrayOf("rrr", "ccc"), "bbq", List.of()),
                Arguments.of(arrayOf("bgbgq", "fdfdf"), "ababc", List.of("bgbgq")),
                Arguments.of(arrayOf("abc","deq","mee","aqq","dkd","ccc"), "abb", List.of("mee","aqq")),
                Arguments.of(arrayOf("fcvxuskhcl"), "rdzkpkbmda", List.of()),
                Arguments.of(arrayOf("qqcojjumwp","mqidrqudxu","xwrvnueult","lubbymxyro","fcvxuskhcl"), "rdzkpkbmda", List.of())

        );
    }

    private static String[] arrayOf(String... s) {
        return s;
    }
}