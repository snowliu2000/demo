package com.example.demo.Multithreading;

import java.util.concurrent.*;

/**
 * @author lsl
 */
public class CallableThreadTest implements Callable<Integer> {
    public static void main(String[] args) {
        FutureTask<Integer> ft = new FutureTask<>(new CallableThreadTest());
//        ExecutorService executorService = Executors.newCachedThreadPool();
        ExecutorService executorService= Executors.newFixedThreadPool(5);
        Future future=null;

        executorService.execute(ft);
    }

    @Override
    public Integer call() throws Exception {
        int i = 0;
        for (; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        return i;

    }
}
