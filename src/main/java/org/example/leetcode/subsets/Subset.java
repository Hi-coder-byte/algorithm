package org.example.leetcode.subsets;

import java.util.ArrayList;
import java.util.List;

public class Subset {

    public List<List<Integer>> subset(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        sub(nums, result, 0, new ArrayList<Integer>());
        return result;
    }

    private void sub(int[] nums, List<List<Integer>> result, int start, List<Integer> set) {
        result.add(new ArrayList<Integer>(set));
        for (int i = start; i < nums.length; i++) {
            set.add(nums[i]);
            sub(nums, result, i + 1, set);
            set.remove(set.size() - 1);
        }
    }
}
