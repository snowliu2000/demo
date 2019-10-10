package com.example.demo.random;

/**
 * 生成一个随机四位数编码
 * @author lsl
 * @version [1.0.0, 2019/6/18,10:36]
 */
public class Demo {
    public static void main(String[] args) {
        String num = (int) ((Math.random() * 9 + 1) * 1000) + "";
        System.out.println(num);
    }
}
