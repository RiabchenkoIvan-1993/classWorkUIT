package com.company;

public class MyMinMax<T extends Comparable<T>> implements MinMax<T> {
    T[] a;

    public MyMinMax(T[] a) {
        this.a = a;
    }

    @Override
    public T min() {
        T min=a[0];
        for (int i = 0; i < a.length; i++) {
            if (min.compareTo(a[i])>0) {
                min=a[i];
            }
        }
        return min;
    }

    @Override
    public T max() {
        T max=a[0];
        for (int i = 0; i < a.length; i++) {
            if (max.compareTo(a[i])<0) {
                max=a[i];
            }
        }
        return max;
    }
}
