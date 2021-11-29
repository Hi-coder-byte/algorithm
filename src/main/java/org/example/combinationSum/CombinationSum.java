package org.example.combinationSum;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        backtrack(nums, new ArrayList<Integer>(), 0, target);

        return result;
    }

    private void backtrack(int[] nums, List<Integer> combination, int start, int target) {
        if (start == nums.length) return;
        if (target == 0) {
            result.add(new ArrayList<Integer>(combination));
            return;
        }


        backtrack(nums, combination, start + 1, target);;
        if (target - nums[start] >= 0) {
            combination.add(nums[start]);
            backtrack(nums, combination, start, target - nums[start]);
            combination.remove(combination.size() - 1);
        }
    }


}
