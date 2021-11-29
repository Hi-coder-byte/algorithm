package org.example.sort.util;

import org.example.sort.ShellSort;
import org.junit.Test;

public class ShellSortTest {

    @Test
    public void sort() {
        int[] nums = SortUtil.generateRandomArray(10000000, -10000000, 10000000);
//        System.out.println("nums = " + Arrays.toString(nums));
        ShellSort shellSort = new ShellSort();
        shellSort.sort(nums);
//        System.out.println("nums = " + Arrays.toString(nums));
    }
}