package com.wst.demo;

import java.util.ArrayList;

/**
 * 1.IDEA中代码模板所处的位置 settings-Editor
 * 2.常用的模板
 * @author wst
 * @create 2019-03-10 13:45
 */
public class TestTemplate {

    // 模板六 prsf  private static final
    private static final Customer cust = new Customer();

    // 变形： psf public static final
    public static final int NUM = 1;
    // psfi
    public static final int NUM2 = 2;
    // psfs
    public static final String NATION="CHINA";



    //模板一 psvm
    public static void main(String[] args) {
        // 模板二 sout
        System.out.println("Hello, World!");
        // 变形 soutp / soutm / soutv / xxx.sout
        System.out.println("args = [" + args + "]");  // 打印形参 soutp
        System.out.println("TestTemplate.main");    // soutm

        int num1 = 10;
        System.out.println("num1 = " + num1); // soutv
        int num2 = 20;
        System.out.println("num2 = " + num2);

        // 模板三 fori
        String[] arr = new String[]{"Tom", "Jerry", "HanMeiMei", "LiLei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr = " + arr[i]);
        }
        // 增强for循环 变形 iter
        for (String s : arr) {
            System.out.println("s = " + s);
        }

        //变形 itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println("s = " + s);
        }
        method();

        // 模板四 list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(678);
        // list.for
        for (Object o : list) {
            System.out.println("o = " + o);
        }
        // 变形 list.fori
        for (int i = 0; i < list.size(); i++) {
            System.out.println("i = " + i);
        }
        //变形 list.forr  逆序遍历list集合
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println("i = " + i);
        }
    }
    private static void method( ) {
        System.out.println("TestTemplate.method");
        
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(678);

        // 模板五 ifn
        if (list == null) {
            System.out.println("list = " + list);
        }

        // 模板五 inn
        if (list != null) {
            System.out.println("list = " + list);
        }

        // 变形xxx.nn  / xx.null
        if (list != null) {

        }
        if (list == null) {

        }
    }
}
