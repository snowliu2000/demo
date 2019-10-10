package com.example.demo.guava;

import com.google.common.base.Joiner;

import java.util.Arrays;

/**
 * @author lsl
 * @version [1.0.0, 2019/9/16,16:35]
 */
public class Demo6 {
    public static void main(String[] args) {
        // returns "1,5,7"
        String num = Joiner.on("-").join(Arrays.asList(1, 5, 7));
        System.out.println(num);
    }
}
