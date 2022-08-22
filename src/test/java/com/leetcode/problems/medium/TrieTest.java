package com.leetcode.problems.medium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TrieTest {

    @Test
    @DisplayName("Simple test-cases for Trie implementation")
    void test() {
        Trie tested = new Trie();
        tested.insert("apple");

        assertThat(tested.search("apple")).isTrue();
        assertThat(tested.search("app")).isFalse();
        assertThat(tested.startsWith("app")).isTrue();

        tested.insert("app");
        assertThat(tested.search("app")).isTrue();
    }
}