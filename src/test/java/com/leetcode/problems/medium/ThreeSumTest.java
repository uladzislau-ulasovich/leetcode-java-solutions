package com.leetcode.problems.medium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ThreeSumTest {

    @DisplayName("Testing 3Sum problem")
    @ParameterizedTest
    @MethodSource
    public void test(int[] nums, List<List<Integer>> triplets) {
        var tested = new ThreeSum();
        var result = tested.threeSum(nums);
        assertThat(result).isEqualTo(triplets);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{-1, 0, 1, 2, -1, -4}, List.of(List.of(-1, -1, 2), List.of(-1, 0, 1))),
                Arguments.of(new int[]{0, 0, 0, 0}, List.of(List.of(0, 0, 0))),
                Arguments.of(new int[]{-1,0,1,0}, List.of(List.of(-1, 0, 1))),
                Arguments.of(new int[]{0, 0, 0}, List.of(List.of(0, 0, 0))),
                Arguments.of(new int[]{0, 1, 1}, List.of())
        );
    }
}