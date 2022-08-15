package com.leetcode.problems.medium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MaximumErasureValueTest {

    private final MaximumErasureValue tested = new MaximumErasureValue();

    @DisplayName("Testing conversion from Roman number to int")
    @ParameterizedTest
    @MethodSource
    public void test(int[] nums, int max) {
        var result = tested.maximumUniqueSubarray(nums);
        assertThat(result).isEqualTo(max);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{4,2,4,5,6}, 17),
                Arguments.of(new int[]{5,2,1,2,5,2,1,2,5}, 8)
        );
    }
}