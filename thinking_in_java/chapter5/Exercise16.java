package com.dinghui.practice.chapter5;

public class Exercise16 {
    public static void main(String[] args) {
        String[] s1 = new String[4];
        s1[0] = "There";
        s1[1] = "are";
        s1[2] = "some";
        s1[3] = "String";
        for (String s : s1) {
            System.out.print(s + " ");
        }
        System.out.println();

        String[] s2 = {
            "There", "are", "some", "String"
        };
        for (int i = 0; i < s2.length; i++) {
            System.out.print(s2[i] + " ");
        }
        System.out.println();
    }
}