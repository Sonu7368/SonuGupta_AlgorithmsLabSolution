package com.labquestions.utility;

public class BubbleSort {
    private final Comparator comparator;

    public BubbleSort() {
        this.comparator = Comparator.ascending;
    }

    public BubbleSort(Comparator comparator) {
        this.comparator = comparator;
    }


    public void sort(int [] elements) {
        for (int i = elements.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (comparator.compare(elements[j], elements[j + 1])) continue;
                int temp = elements[j];
                elements[j] = elements[j + 1];
                elements[j + 1] = temp;
            }
        }
    }

}
