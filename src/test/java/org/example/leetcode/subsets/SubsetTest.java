package org.example.leetcode.subsets;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SubsetTest {

    @Test
    public void subset() {
        int[] nums = new int[]{1, 2, 3};
        Subset subset = new Subset();
        List<List<Integer>> result = subset.subset(nums);
        System.out.println(result);
    }
}