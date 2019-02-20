package com.yj;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootTestApplicationTests {

    @Test
    public void contextLoads() {
    }


    //Git管理的test项目2


    @Test
    public void tesLength() {
        //数组有length属性
        int[] a = new int[10];
        System.out.println(a.length);
        //字符串有length()方法
        String str = "First Love!";
        System.out.println(str.length());


    }


    @Test
    public void time() {
        System.out.println(System.currentTimeMillis());//1550562575252
    }


    @Test
    public void length() {
        int[] a = {1, 2, 3};
        System.out.println(a.length);


        String str = "abc";
        System.out.println(str.length());
    }

}

