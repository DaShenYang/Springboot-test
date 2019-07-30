package com.yj;

import org.junit.Test;

public class ArraySortTest {

    @Test
    public void maopao() {
        int[] a = {3, 1, 0, 2, 9, 8};

        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < a.length - i; j++) {
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }


        for (int arr : a
        ) {
            System.out.println(arr);
        }
    }
}
