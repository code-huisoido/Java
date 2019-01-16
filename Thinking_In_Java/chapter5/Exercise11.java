package com.dinghui.practice.chapter5;

public class Exercise11 {
    protected void finalize() {
        System.out.println("finalize() called");
    }

    public static void main(String[] args) {
        new Exercise10();
        System.gc();
        System.runFinalization();
    }
}