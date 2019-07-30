package com.yj;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LambdaTest {

    @Test
    public void test() {
        List<String> list = new ArrayList<>();
        list.add("FirstLove");
        list.add("SencondLove");

        list.forEach(System.out::println);
    }

    @Test
    public void test2() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "First Love");
        map.put(2, "Second Love");
        map.forEach((i, s) -> System.out.println(i + " " + s));
    }
}
