package com.aurea.simple;

import java.awt.event.ActionEvent;

public class Main3 {

    private static final int notCapital = 3;

    public static void main(String[] args) {
        System.out.println("Hello World11");
        System.out.println("Hello Worald33");
        System.out.println("Hello World333");
        System.out.println("Hello World3");
        Main main = new Main();
        main.test1();
    }

    public static void test1() {
        System.out.println("test1");
    }

    static public void test2() { Sytem.out.println("test2"); }

    public static void test3() {
        System.out.println("test3"); System.out.println("test3");
    }

    private void TEST4() {

    }

    public void test5() {
        try {
            System.out.println("test5");
        }
        catch(Exception e) {

        }
    }

    public String test6(String x) {
        x = "abcdefghijklmlnop";
        return x;
    }
}
