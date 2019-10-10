package com.example.demo.Multithreading.test1;

/**
 * @author lsl
 * @version [1.0.0, 2019/9/23,11:32]
 */
public class NoVisibility {
    private static boolean ready;
    private static int number;

    private static class ReaderThread extends Thread{
        @Override
        public void run(){
            while (!ready){
                Thread.yield();
                System.out.println(number);
            }
        }

        public static void main(String[] args) {
            new ReaderThread().start();
            number=42;
            ready=true;


        }
    }
}
