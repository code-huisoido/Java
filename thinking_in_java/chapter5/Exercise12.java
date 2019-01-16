package com.dinghui.practice.chapter5;

class Tank {
    static int count;
    int i = count++;
    boolean full;
    Tank() {
        full = true;
        System.out.println("Tank " + i + " created");
    }
    void empty() {
        full = false;
    }
    protected void finalize() {
        if (full) {
            System.out.println("Error: tank " + i + " must be empty at cleanup");
        } else {
            System.out.println("Tank " + i + " cleaned up OK");
        }
    }
}

public class Exercise12 {
    public static void main(String[] args) {
        new Tank().empty();
        new Tank();
        System.gc();
        System.runFinalization();
    }
}