package com.example.demo.climbStairs;


/**
 * @author lsl
 * @Date:2019/4/13
 * @Time:15:01
 */
public class ClimbStairs {
    public static void main(String[] args) {
        ClimbStairs climbStairs = new ClimbStairs();
        // 总台阶数
        int n = 5;
        System.out.println("方法总数量：" + climbStairs.fibonacci(n));
    }

    private int fibonacci(int n) {
        if (n < 1) {
            return 0;
        }
        int result = 1 + fibonacci(n - 1) + fibonacci(n - 2) + fibonacci(n - 3)+ fibonacci(n - 4)+ fibonacci(n - 5);
        return result ;



    }
}
