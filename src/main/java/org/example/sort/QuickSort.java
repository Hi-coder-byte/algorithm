package org.example.sort;

import org.example.sort.util.SortUtil;

public class QuickSort {

    public void sort(int[] numbs) {
        if (numbs == null || numbs.length == 0) {
            return;
        }
        quickSort(numbs, 0, numbs.length - 1);

    }

    public void quickSort(int[] numbs, int low, int high) {
        if (low >= high) {
            return;
        }
        int pollIndex = partition(numbs, low, high);
        quickSort(numbs, low, pollIndex);
        quickSort(numbs, pollIndex + 1, high);
    }

    public int partition(int[] numbs, int low, int high) {
        int pollIndex = low;
        int pollValue = numbs[low];
        for (int i = low + 1; i <= high; i++) {
            if (pollValue > numbs[i]) {
                pollIndex++;
                SortUtil.swap(numbs, pollIndex, i);
            }
        }
        SortUtil.swap(numbs, low, pollIndex);
        return pollIndex;
    }
}
