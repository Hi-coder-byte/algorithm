package org.example.sort;

import org.example.sort.util.SortUtil;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class HeapSortTest {

    @Test
    public void sort() {
        int[] numbs = SortUtil.generateRandomArray(10000, 0, 200000);
        HeapSort heapSort = new HeapSort();
        heapSort.sort(numbs);
        for (int i = 0; i < numbs.length - 1; i++) {
            assert numbs[i+1] >= numbs[i];
        }
        System.out.println("Arrays.toString(numbs) = " + Arrays.toString(numbs));
    }
}