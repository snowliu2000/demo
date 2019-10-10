package com.example.demo.guava;

import com.google.common.base.Joiner;

import java.util.ArrayList;

/**
 * @author lsl
 * @version [1.0.0, 2019/8/30,14:13]
 */
public class Demo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
//        StringBuilder stringBuilder = new StringBuilder();
//
//        for (String s : list) {
//            stringBuilder=stringBuilder.append("-").append(s);
//        }
//        System.out.println(stringBuilder.toString().substring(1));
//    }

    String result= Joiner.on("-").join(list);
        System.out.println(result);
    }
}
