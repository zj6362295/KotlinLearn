package com.zj.kotlin.learn.unit1_4;

public class Aj implements AInterface{

    public static final A a = new A();
    @Override
    public void putNumber(int num) {
        System.out.println("int");
    }

    @Override
    public void putNumber(Integer num) {
        System.out.println("Integer");
    }
}
