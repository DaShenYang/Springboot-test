package com.yj;

import org.junit.Test;

public class SimpleTest {

    @Test
    public void test() {
        Simple si = Simple.getSimple();
        System.out.println(si);
        Simple si2 = Simple.getSimple();
        System.out.println(si2);
    }
}
