package com.example.demo.StringTest;

/**
 * @author lsl
 * @Date:2019/4/13
 * @Time:11:26
 */
public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.print(i == 0 ? args[i] : " " + args[i]);
            System.out.println();
        }
    }
}
