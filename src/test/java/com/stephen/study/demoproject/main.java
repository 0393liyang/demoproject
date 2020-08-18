package com.stephen.study.demoproject;

/**
 * 断言
 * 启动项下拉里选择 edit configuration ，VM options里面加上  -ea
 */
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
