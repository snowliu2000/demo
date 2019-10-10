package com.example.demo.climbStairs;

/**
 * @author lsl
 * @version [1.0.0, 2019/7/9,15:40]
 */
public class Demo1 {
    //        int steps;
//        int goal;
//        int solution;
//    int[] steps = {};
//    int[] goal = {};
//    int[] solution = {};

    public static void main(String[] args) {
        int[] steps = {1, 3, 4, 6, 8};
        int goal = 10;
        int[] solution = {};
        calc(steps, goal, solution);
    }

    private static void calc(int[] steps, int goal, int[] solution) {
        for (int i = 0; i < steps.length; i++) {
            int step = steps[i];
            int diff = goal - sum(solution) - step;
            if(diff == 0){

            }else if(diff > 0){
                calc(steps,goal,solution);
            }
        }
    }

    private static int sum(int[] arr) {
        int sum = 0;
        if (arr.length == 0) {
            return 0;
        } else {
            for (int i : arr) {
                sum += i;
            }
            return sum;
        }
    }
}


//    function calc(steps,goal,solution = []){
//        for (var i = 0; i < steps.length; i++) {
//            let step = steps[i]
//            let diff = goal - sum(solution) - step
//
//            if(diff === 0){
//                console.log([...solution,step])
//            }else if(diff > 0){
//                calc(steps,goal,[...solution,step])
//            }
//        }
//    }
//
//    function sum(arr) {
//        if(arr.length === 0){
//            return 0
//        }else{
//            return arr.reduce((sum, x) => sum + x)
//        }
//    }
//
//    window.onload = function(){
//		const steps = [1,3,4,6,8]
//		const goal = 10
//        calc(steps,goal)
//    }

