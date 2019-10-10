package com.example.demo.StringTest;

import java.util.HashMap;

/**
 * @author lsl
 * @Date:2019/4/12
 * @Time:15:46
 */
public class Demo1 {
    /**
     * 需求把字符串转成map
     * @param args
     */
    public static void main(String[] args) {
        String str="name=tom,age=10";
        String[] split = str.split(",");
        HashMap<String, Object> map = new HashMap<>();
        int length = split.length;
        System.out.println(length);
        for (String s : split) {
            String[] split1 = s.split("=");
            System.out.println(split1[1]);
            map.put(split1[0],split1[1]);
        }
        System.out.println(map);


        Object name = map.get("name");
    }
}
