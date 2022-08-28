package com.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an integer array {@code nums}, return all the triplets {@code [nums[i], nums[j], nums[k]]} such that
 * {@code i != j}, {@code i != k}, and {@code j != k}, and {@code nums[i] + nums[j] + nums[k] == 0}.
 * <p>
 * Notice that the solution set must not contain duplicate triplets.
 * <p>
 * Submission results:
 * Runtime: 26 ms, faster than 87.41%
 * Memory Usage: 58.7 MB, less than 66.84%
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            // avoid duplicates in result list
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {

                int left = i + 1,
                        right = nums.length - 1,
                        sum = -nums[i];

                while (left < right) {
                    if (nums[left] + nums[right] == sum) {
                        result.add(List.of(nums[i], nums[left], nums[right]));
                        // mode left and right indexes through duplicates until we find a new value
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        left++;
                        right--;
                    } else if (nums[left] + nums[right] < sum) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return result;
    }
}
