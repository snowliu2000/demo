package com.example.demo.guava;

import org.apache.commons.lang3.concurrent.BasicThreadFactory;

import java.util.List;
import java.util.concurrent.*;

/**
 * @author lsl
 * @version [1.0.0, 2019/9/3,14:28]
 */
public class Demo5 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(20);

        ScheduledExecutorService executorService = new ScheduledThreadPoolExecutor(1,
                new BasicThreadFactory.Builder().namingPattern("example-schedule-pool-%d").daemon(true).build());
        for (int i=0;i<50;i++){



        }

    }
}
