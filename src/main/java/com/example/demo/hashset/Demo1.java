package com.example.demo.hashset;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author lsl
 * @version [1.0.0, 2019/7/5,15:53]
 */
public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(1);
        ArrayList<Integer> list2 = new ArrayList<>();
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(1);
        HashSet<Object> resultNumber = new HashSet<>();
        for (Integer integer : list) {
            resultNumber.add(integer);
        }
        for (Integer integer : list2) {
            resultNumber.add(integer);
        }
        for (Object o : resultNumber) {
            System.out.println(o);
        }
    }
}
