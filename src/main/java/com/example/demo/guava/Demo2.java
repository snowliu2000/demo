package com.example.demo.guava;


import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author lsl
 * @version [1.0.0, 2019/8/30,11:14]
 */
public class Demo2 {
    public static void main(String[] args) {
//        HashMap<String, List<Integer>> map = new HashMap<>(2);
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(18);
//        list.add(20);
//        map.put("age",list);
//        System.out.println(map);

        Multimap<String,Integer> map = ArrayListMultimap.create();
        map.put("aa", 1);
        map.put("aa", 2);
        System.out.println(map.get("aa"));
    }
}
