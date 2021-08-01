package com.huse.java;

import java.util.ArrayList;

/**
 * @author chenlei
 * @date 2021/8/1 - 10:23
 */


public class TemplateTest {
    //  psf/prsf
    private static final int i = 1;
    //模板一：pvsm
    public static void main(String[] args) {

        //模板二：sout
        System.out.println("hello");

        //打印形参soutp
        System.out.println("args = [" + args + "]");
        dog();
    }
    public static void dog(){
        // 数组模板
        int[] arr = new int[]{1,2,3};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //list.fori/forr
        ArrayList arrayList = new ArrayList();
        arrayList.add(123);
        arrayList.add(456);
        arrayList.add(789);
        for (int i = 0; i < arrayList.size(); i++) {

        }
    }




}
