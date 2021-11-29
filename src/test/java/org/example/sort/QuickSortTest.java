package org.example.sort;

import org.example.sort.util.SortUtil;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void sortA() {
        int[] numbs = SortUtil.generateRandomArray(10, 0, 30);
        System.out.println("Arrays.toString(numbs) = " + Arrays.toString(numbs));
        QuickSort quickSort = new QuickSort();
        quickSort.sort(numbs);
        System.out.println("Sorted Array = " + Arrays.toString(numbs));
        for (int i = 0; i < numbs.length - 1; i++) {
            assert numbs[i] <= numbs[i + 1];
        }
    }

    @Test
    public void sortMountainOfElementArray() {
        int[] numbs = SortUtil.generateRandomArray(500000000, 0, 2000000000);
//        System.out.println("Arrays.toString(numbs) = " + Arrays.toString(numbs));
        long start = System.currentTimeMillis();
        QuickSort quickSort = new QuickSort();
        quickSort.sort(numbs);
        System.out.println("Time spend: " + (System.currentTimeMillis() - start));
//        System.out.println("Sorted Array = " + Arrays.toString(numbs));
//        for (int i = 0; i < numbs.length - 1; i++) {
//            assert numbs[i] <= numbs[i + 1];
//        }
    }
}