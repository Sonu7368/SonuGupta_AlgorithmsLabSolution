package com.labquestions.utility;

public class MergeSort {
    private final Comparator comparator;

    public MergeSort() {
        this.comparator = Comparator.ascending;
    }

    public MergeSort(Comparator comparator) {
        this.comparator = comparator;
    }

    private void merge(int [] elements, int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        
        int [] sortedArr = new int[end - start + 1];
        int k = 0;

        while (i <= mid && j <= end) {
            if (comparator.compare(elements[i], elements[j])) sortedArr[k++] = elements[i++];
            else sortedArr[k++] = elements[j++];
        }

        while (i <= mid) sortedArr[k++] = elements[i++];
        while (j <= end) sortedArr[k++] = elements[j++];

        k = 0;
        while (start <= end)    elements[start++] = sortedArr[k++];
    }

    private void sort(int [] elements, int start, int end) {
        if (start == end)   return;

        int mid = (start + end) / 2;
        sort(elements, start, mid);
        sort(elements, mid + 1, end);

        merge(elements, start, mid, end);

    }

    public void sort(int [] elements) {
        sort(elements, 0, elements.length - 1);
    }
}
