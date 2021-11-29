package org.example.sort.util;

public class SortUtil {
    public static int[] generateRandomArray(int n, int rangeL, int rangeR) {

        assert rangeL <= rangeR;

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = (int)(Math.random() * (rangeR - rangeL + 1) + rangeL);
        return arr;
    }

    public static void swap(int[] numbs, int i, int j) {
        int temp = numbs[i];
        numbs[i] = numbs[j];
        numbs[j] = temp;
    }
}
