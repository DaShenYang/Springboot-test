package com.yj;

public class Simple {
    private Simple() {
    }

    private static class Soler {
        static Simple si = new Simple();
    }

    public static Simple getSimple() {
        return Soler.si;
    }
}
