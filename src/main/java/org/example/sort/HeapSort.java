package org.example.sort;

import org.example.sort.util.SortUtil;

public class HeapSort {

    public void sort(int[] numbs) {
        if (numbs == null || numbs.length == 0) {
            return;
        }

        for (int i = (numbs.length -2) / 2; i >= 0 ; i--) {
            heapify(numbs, numbs.length, i);
        }

        for (int i = numbs.length - 1; i >= 0 ; i--) {
            SortUtil.swap(numbs, 0, i);
            heapify(numbs, i, 0);
        }
    }

    public void heapify(int[] numbs, int length, int index) {

        while ((2 * index + 1) < length) {
            int largeChild = 2 * index + 1;
            if ((largeChild + 1) < length && numbs[largeChild + 1] > numbs[largeChild]) {
                largeChild = largeChild + 1;
            }
            if (numbs[index] < numbs[largeChild]) {
                SortUtil.swap(numbs, index, largeChild);
            }
            index = largeChild;
        }
    }
}
