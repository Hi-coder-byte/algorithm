package org.example.sort;

import org.example.sort.util.Sort;

public class ShellSort implements Sort {

    @Override
    public int[] sort(int[] nums) {
        if (nums == null) {
            return null;
        }
//        for (int gap = nums.length / 2; gap > 0 ; gap/=2) {
//            for (int i = 0; i < nums.length; i+=gap) {
//                for (int j = i; j > 0 ; j-=gap) {
//                    if ((j -gap) >= 0 && nums[j] < nums[j - gap]) {
//                        swap(nums, j-gap, j);
//                    }
//                }
//            }
//        }

        int j;
        for (int gap = nums.length / 2; gap >  0; gap /= 2) {
            for (int i = gap; i < nums.length; i++) {
                Integer tmp = nums[i];
                for (j = i; j >= gap && tmp.compareTo(nums[j - gap]) < 0; j -= gap) {
                    nums[j] = nums[j - gap];
                }
                nums[j] = tmp;
            }
        }

        /*for (int gap = nums.length / 2; gap >  0; gap /= 2) {
            for (int i = gap; i < nums.length; i++) {
                for (int j = i; j >= gap ; j -= gap) {
                    if (nums[i]< nums[j - gap])
                        swap(nums, j-gap, i);
                }
            }
        }*/

        return nums;
    }

    // 交换两个元素
    private void swap(Integer[] nums, int i, int j) {
        Integer temp;
        temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}
