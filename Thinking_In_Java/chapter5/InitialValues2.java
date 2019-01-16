package com.dinghui.practice.chapter5;

public class InitialValues2 {
    boolean t = true;
    char c = 'x';
    byte b = 47;
    short s = 0xff;
    int i = 999;
    long lng = 1;
    float f = 3.14f;
    double d = 3.14159;
    void printValues() {
        print("Data type          Initial value");
        print("boolean            " + t);
        print("char               " + c);
        print("byte               " + b);
        print("short              " + s);
        print("int                " + i);
        print("long               " + l);
        print("float              " + f);
        print("double             " + d);
    }

    public static void main(String[] args) {
        new InitialValues().printValues();
    }
}