package com.leetcode.problems.medium.trie;

public interface Trie {
    public void insert(String word);
    public boolean search(String word);
    public boolean startsWith(String prefix);
}
