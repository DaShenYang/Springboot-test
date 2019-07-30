package com.yj;

import org.junit.Test;

public class StringTest {

    @Test
    public void test1() {
        String str = "iloveyou";
        System.out.println(str.endsWith(".jar"));
        System.out.println(str.contains(".jar"));


        System.out.println("------------------------");


    }


    @Test
    public void test2() {
        String str2 = "love.jar";
        System.out.println(str2.endsWith(".jar"));
        System.out.println(str2.contains(".jar"));
    }

}
