package com.leetcode.problems.medium;

import java.util.HashSet;
import java.util.Set;

public class MaximumErasureValue {
    public int maximumUniqueSubarray(int[] nums) {
        int left = 0, right = 0, max = 0, sum = 0;

        final Set<Integer> met = new HashSet<>();

        while (right < nums.length) {

            if (met.contains(nums[right])) {
                max = Math.max(max, sum);
                met.remove(nums[left]);
                sum -= nums[left];
                left++;
            } else {
                met.add(nums[right]);
                sum += nums[right];
                right++;
            }
        }

        return Math.max(sum, max);
    }
}
