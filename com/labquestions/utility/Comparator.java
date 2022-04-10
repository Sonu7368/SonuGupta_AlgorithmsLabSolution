package com.labquestions.utility;

public interface Comparator {
    public boolean compare(int a, int b);
    public static Comparator ascending = ((a, b) -> (int) a < (int) b);
    public static Comparator descending = ((a, b) -> (int) a > (int) b);
}
