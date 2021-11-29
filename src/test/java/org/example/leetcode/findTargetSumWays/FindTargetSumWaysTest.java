package org.example.leetcode.findTargetSumWays;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindTargetSumWaysTest {

    @Test
    public void findTargetSumWays() {
        int[] nums = new int[] {42,36,4,15,17,15,31,1,11,2,12,28,22,9,2,31,48,18,48,5};
        FindTargetSumWays findTargetSumWays = new FindTargetSumWays();
        int result = findTargetSumWays.findTargetSumWays(nums, 15);
        System.out.println(result);
    }
}