package com.stephen.study.demoproject;

public class main {
    public int add(){
        int a=1;
        int b=2;
        int c=a+b;
        return c;
    }
    public static void main(String[] args) {
        /*main main=new main();
        int result=main.add();
        System.out.println(result);*/
        int a = 10;
        int b = 20;
        assert a > b : "错误,a不大于b";
    }
}
