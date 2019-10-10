package com.example.demo.climbStairs;

import java.util.Scanner;

/**
 * @author lsl
 * @Date:2019/4/13
 * @Time:21:18
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入斐波那契数列的长度：");
        int n = sc.nextInt();
        // 递推
        print(fibonacciRecursive(n));

    }

    /**
     * 递推斐波那契数列函数
     *
     * @param n
     * @return
     */
    public static int[] fibonacciRecursive(int n) {
        int[] fibs = new int[n];
        fibs[0] = 1;
        fibs[1] = 2;
        for (int i = 2; i < n; i++) {
            fibs[i] = fibs[i - 1] + fibs[i - 2];
        }
        return fibs;
    }

    /**
     * 打印斐波那契数列
     *
     * @param fibs
     */
    private static void print(int[] fibs) {
        int sum = 0;
        for (int i = 0; i < fibs.length; i++) {
            sum += fibs[i];

            System.out.print(fibs[i] + " ");
        }
    }
}

