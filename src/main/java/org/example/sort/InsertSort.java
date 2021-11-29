package org.example.sort;

public class InsertSort {

    public void sort(int[] nums) {

        if (nums == null) {
            return;
        }
        // 外层循环每个元素
        for (int i = 0; i < nums.length; i++) {
            // 内层循环外层所在元素之前的所有元素
            // 当后面的元素小于前面的元素时交换
            for (int j = i; j > 0; j--) {
                if (nums[j] < nums[j-1]) {
                    swap(nums, j-1, j);
                }
            }
        }
    }
    // 交换两个元素
    private void swap(int[] nums, int i, int j) {
        int temp;
        temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}
