package com.leetcode.problems.medium.trie;

import com.leetcode.problems.medium.trie.HashMapTrie;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TrieTest {

    @Test
    @DisplayName("Simple test-cases for Trie implementation")
    void test() {
        HashMapTrie tested = new HashMapTrie();
        tested.insert("apple");

        assertThat(tested.search("apple")).isTrue();
        assertThat(tested.search("app")).isFalse();
        assertThat(tested.startsWith("app")).isTrue();

        tested.insert("app");
        assertThat(tested.search("app")).isTrue();
    }
}