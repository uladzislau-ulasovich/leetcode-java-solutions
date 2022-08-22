package com.leetcode.problems.medium.trie;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class TrieTest {

    @ParameterizedTest(name = "#{index} - Testing implementation {0}")
    @MethodSource
    public void test(String name, Trie tested) {
        tested.insert("apple");

        assertThat(tested.search("apple")).isTrue();
        assertThat(tested.search("app")).isFalse();
        assertThat(tested.startsWith("app")).isTrue();

        tested.insert("app");
        assertThat(tested.search("app")).isTrue();
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("HashMapTrie", new HashMapTrie()),
                Arguments.of("ArrayTrie", new ArrayTrie())
        );
    }
}