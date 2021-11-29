package org.example.leetcode.findTargetSumWays;

import java.util.ArrayList;
import java.util.List;

public class FindTargetSumWays {
    private int count = 0;
    public int findTargetSumWays(int[] nums, int target) {
        find(nums, 0, target, 0);
        return count;
    }

    public void find(int[] nums, int index, int target, int sum) {
        if (index == nums.length) {
            if (target == sum) {
                count++;
            }
            return;
        }
        find(nums, index + 1, target, sum + nums[index]);
        find(nums, index + 1, target, sum - nums[index]);
    }

}
