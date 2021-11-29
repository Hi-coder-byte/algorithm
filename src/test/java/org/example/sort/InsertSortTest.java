package org.example.sort;

import org.example.sort.util.SortUtil;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class InsertSortTest {
    private int[] nums;

    @Before
    public void setUp() throws Exception {
//        nums = new int[]{3, 1, 5, 2, 9, 7, 6};
        nums = SortUtil.generateRandomArray(500000, -1000000, 1000000);
    }

    @Test
    public void sort() {
        InsertSort sort = new InsertSort();
        sort.sort(nums);
//        print(nums);
    }

    private void print(Integer[] nums) {
        System.out.println("nums = " + Arrays.toString(nums));
    }
}