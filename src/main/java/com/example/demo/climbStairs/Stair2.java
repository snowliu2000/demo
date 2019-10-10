package com.example.demo.climbStairs;

import java.util.Stack;

/**
 * 题目：走楼梯
 * 给定台阶数目 -- SUM,
 * 每次最大的台阶数 -- MAX
 * 每次最小的台阶数 -- MIN
 * 期望值（最多在几步之内完成） -- EXPECT
 * <p>
 * 思路：
 * 采用递归的方法实现。采用Stack结构来存储。
 *
 * @author
 */
public class Stair2 {

    private Stack<Integer> stack = new Stack<Integer>();

    private int currentCount = 0;

    /**
     * @param min
     * @param max
     * @param current
     * @param expect
     * @param sum
     */
    private void getWalkWays(int min, int max, int current, int expect, int sum) {
        //当Stack中的数据和与总的台阶数一样时，输出结果
        if (sum == current) {
            //输出满足条件的内容，其中，期望值（最多在几步之内完成）
            if (expect >= stack.size()) {
                print(stack);
            }
        }
        //循环最小值到最大值
        for (int currentIndex = min; currentIndex <= max; currentIndex++) {
            /*
             * 如果当前Stack中的值的和（current）加上当前循环的值（currentIndex）
             * 小于等于总的台阶数，那么就先把当前循环的值压入到Stack中，
             * 当前Stack中所有数据值的和加上当选循环的值
             * 递归调用getWalkWays方法
             * 然后，将stack的pop值去掉并修改Stack中当前所有元素的和
             */
            if (current + currentIndex <= sum) {
                stack.push(currentIndex);
                current += currentIndex;
                getWalkWays(min, max, current, expect, sum);
                current -= stack.pop();
            }
        }
    }

    /**
     * 得到输出的前缀。
     * 如：
     * 第50中走法
     *
     * @return
     */
    private String getCountInformation() {
        return new StringBuilder().append("第").append(++currentCount).append(
                "中走法：").toString();
    }

    /**
     * 打印当前Stack中的元素
     * 如：
     * 第50中走法：4 4 2
     *
     * @param stack
     */
    private void print(Stack stack) {
        // 添加满足条件集合的元素个数范围
        StringBuilder sb = new StringBuilder();
        sb.append(getCountInformation());
        for (Object o : stack) {
            sb.append(o).append(" ");
        }
        System.out.println(sb.deleteCharAt(sb.length() - 1).toString());

    }

    /**
     * 输出符合条件的走楼梯条件信息。
     */
    private void printResultTips(int min, int max, int sum, int expectTimes) {
        System.out.println(new StringBuilder().append("条件==》").append("台阶数为").append(sum)
                .append(", 每步走的最小台阶数为").append(min).append(", 每步走的最大台阶数为")
                .append(max).append(",最多走的次数是").append(expectTimes).toString());
    }

    /**
     * 测试方法
     * 给定台阶数目 -- SUM,
     * 每次最大的台阶数 -- MAX
     * 每次最小的台阶数 -- MIN
     * 期望值（最多在几步之内完成） -- EXPECT
     */
    public void test() {
        int min = 1;
        int max = 5;
        int expectTimes = 5;
        int totalSteps = 5;

        printResultTips(min, max, totalSteps, expectTimes);
        getWalkWays(min, max, 0, expectTimes, totalSteps);
    }

    public static void main(String[] args) {
        //测试
        new Stair2().test();
    }
}
