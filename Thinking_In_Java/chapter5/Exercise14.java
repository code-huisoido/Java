package com.dinghui.practice.chapter5;

public class Exercise14 {
    /*static int i = 1;
    static char c = 'w';*/

    static int i;
    static char c;

    static {
        i = 5;
        c = 'o';
    }

    static void printStatic() {
        System.out.println("i = " + i);
        System.out.println("c = " + c);
    }

    public static void main(String[] args) {
        Exercise14.printStatic();
    }
}