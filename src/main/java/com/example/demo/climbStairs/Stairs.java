package com.example.demo.climbStairs;

/**
 * @author lsl
 * @Date:2019/4/13
 * @Time:21:36
 */
public class Stairs {
    // 统计个数
    private int currentCount = 1;

    /**
     * @param remainingSteps ： 剩余的台阶数,开始调用的值是总的台阶数
     * @param currentSteps   ： 递归过程中某种情况下，已经走的步骤，如 1 2 走了三步的情况
     */
    private void walkStairs(int remainingSteps, String currentSteps) {
        /*
         * 当剩下小于等于三级台阶时，输出楼梯的走法
         */
        if (remainingSteps <= 3) {
            printWalkWays(remainingSteps, currentSteps);
        } else {
            for (int step = 1; step <= 3; step++) {
                walkStairs(remainingSteps - step, currentSteps + " " + step);
            }
        }
    }

    private StringBuilder getCurrentCountStepInformation(String currentSteps) {
        return new StringBuilder().append("第").append(currentCount++).append(
                "种走法").append(currentSteps);
    }

    /**
     * 输出满足条件的台阶走法
     *
     * @param remainingSteps
     * @param currentSteps
     */
    private void printWalkWays(int remainingSteps, String currentSteps) {
        if (1 == remainingSteps) {
            System.out.println(getCurrentCountStepInformation(currentSteps)
                    .append(" 1").toString());
        } else if (2 == remainingSteps) {
            System.out.println(getCurrentCountStepInformation(currentSteps)
                    .append(" 1 1").toString());
            System.out.println(getCurrentCountStepInformation(currentSteps)
                    .append(" 2").toString());
        } else if (3 == remainingSteps) {
            System.out.println(getCurrentCountStepInformation(currentSteps)
                    .append(" 1 1 1").toString());
            System.out.println(getCurrentCountStepInformation(currentSteps)
                    .append(" 1 2").toString());
            System.out.println(getCurrentCountStepInformation(currentSteps)
                    .append(" 2 1").toString());
            System.out.println(getCurrentCountStepInformation(currentSteps)
                    .append(" 3").toString());
        } else {
            /**
             * 0 ==remainingSteps, 表明已经走完台阶了,直接输出就可以了
             */
            System.out.println(getCurrentCountStepInformation(currentSteps)
                    .toString());
        }
    }

    public static void main(String []args) {
        Stairs s = new Stairs();
        // 调用方法前需要先判断STEPS是否是大于0的。
        s.walkStairs(5, "");
    }
}

