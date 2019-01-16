package com.dinghui.practice.chapter3;

class Value {
	int i;
}

class EqualsMethod2 {
    public static void main(String[] args) {
    	Value v1 = new Value();
    	Value v2 = new Value();
    	v1.i = v2.i = 100;
    	System.out.println(v1.equals(v2));
    }
} /* OutPut:
false
*///~