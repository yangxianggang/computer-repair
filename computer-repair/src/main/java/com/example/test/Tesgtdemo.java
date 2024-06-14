package com.example.test;

public class Tesgtdemo {
    private int age;
    private String name;



    public Tesgtdemo(int age, String name) {
        System.out.println("111111");
        this.age = age;
        this.name = name;
    }

    public   void  test(){

        System.out.println("test");
    }

    public static void main(String[] args) {
        Tesgtdemo tesgtdemo = new Tesgtdemo(12,"12");
        tesgtdemo.test();

    }
}
