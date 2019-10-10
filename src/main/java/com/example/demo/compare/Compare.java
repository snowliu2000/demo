package com.example.demo.compare;

import java.util.HashMap;

/**
 * @author lsl
 * @version [1.0.0, 2019/6/14,14:18]
 */
public class Compare {
    public static void main(String[] args) {
//        String a = "23";
//        String b = "22";
//        int i = a.compareTo(b);
//        System.out.println(i);
        HashMap<String, Object> map = new HashMap<>(2);
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        System.out.println(map);
    }
}
