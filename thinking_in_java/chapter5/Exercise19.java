package com.dinghui.practice.chapter5;

public class Exercise19 {
    static void f(String... args) {
        for (String s : args) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Exercise19.f("hello", "world");
    }
}