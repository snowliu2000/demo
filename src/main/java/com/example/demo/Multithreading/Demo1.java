package com.example.demo.Multithreading;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lsl
 * @version [1.0.0, 2019/6/24,21:17]
 */
public class Demo1 {

    private static ThreadLocal<Object> threadData = new ThreadLocal<Object>();
    public static void main(String[] args) {
        Object o = threadData.get();
        System.out.println(o);
    }
}
