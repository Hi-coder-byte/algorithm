package org.example.combinationSum;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CombinationSumTest {

    @Test
    public void combinationSum() {
        int[] nums = new int[] {2, 3, 6, 7};
        CombinationSum combinationSum = new CombinationSum();
        List<List<Integer>> result = combinationSum.combinationSum(nums, 7);
        System.out.println(result);
    }
}