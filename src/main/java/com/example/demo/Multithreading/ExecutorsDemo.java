package com.example.demo.Multithreading;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

/**
 * @author lsl
 * @version [1.0.0, 2019/5/13,14:45]
 */
public class ExecutorsDemo {
    private static ThreadFactory namedThreadFactory = new ThreadFactoryBuilder()
            .setNameFormat("demo-%d").build();

    private static ExecutorService pool = new ThreadPoolExecutor(3, 200,
            0L, TimeUnit.MILLISECONDS,
            new LinkedBlockingQueue<Runnable>(1024), namedThreadFactory, new ThreadPoolExecutor.AbortPolicy());

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            pool.execute(()-> System.out.println(Thread.currentThread().getName()));
        }
    }
}
