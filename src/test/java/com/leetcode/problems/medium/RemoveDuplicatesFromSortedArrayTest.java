package com.leetcode.problems.medium;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class RemoveDuplicatesFromSortedArrayTest {
    @DisplayName("Testing \"26. Remove Duplicates from Sorted Array\" problem")
    @ParameterizedTest
    @MethodSource
    public void test(int[] nums, int[] sortedArray) {
        var tested = new RemoveDuplicatesFromSortedArray();
        var k = tested.removeDuplicates(nums);

        assertThat(k).isEqualTo(sortedArray.length);
        for (int i = 0; i < sortedArray.length; i++) {
            assertThat(nums[i]).isEqualTo(sortedArray[i]);
        }
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(array(0), array(0)),
                Arguments.of(array(0, 0), array(0)),
                Arguments.of(array(0, 0, 0), array(0)),
                Arguments.of(array(1, 1, 2), array(1, 2)),
                Arguments.of(array(0, 0, 1, 1, 1, 2, 2, 3, 3, 4), array(0, 1, 2, 3, 4))
        );
    }

    private static int[] array(int... numbers) {
        return numbers;
    }
}