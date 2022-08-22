package com.leetcode.problems.medium;

import java.util.HashMap;
import java.util.Map;

// Solution results overview:
// Runtime: 87 ms (faster than 23.85%).
// Memory Usage: 68.9 MB (less than 37.38%).
public class Trie {
    private static class TrieNode {
        private final Map<Character, TrieNode> childNodes = new HashMap<>();
        private boolean isWord = false;
    }

    private final TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        var currentNode = root;
        for (var currentChar : word.toCharArray()) {
            if (!currentNode.childNodes.containsKey(currentChar)) {
                currentNode.childNodes.put(currentChar, new TrieNode());
            }
            currentNode = currentNode.childNodes.get(currentChar);
        }
        currentNode.isWord = true;
    }

    public boolean search(String word) {
        var currentNode = root;
        for (var currentChar : word.toCharArray()) {
            if (!currentNode.childNodes.containsKey(currentChar)) {
                return false;
            }
            currentNode = currentNode.childNodes.get(currentChar);
        }
        return currentNode.isWord;
    }

    public boolean startsWith(String prefix) {
        var currentNode = root;
        for (var currentChar : prefix.toCharArray()) {
            if (!currentNode.childNodes.containsKey(currentChar)) {
                return false;
            }
            currentNode = currentNode.childNodes.get(currentChar);
        }
        return true;
    }
}
