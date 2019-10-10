package com.example.demo.Multithreading.multiText;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

/**
 * @author lsl
 * @version [1.0.0, 2019/5/13,10:38]
 * <p> 启动3个线程打印递增的数字,线程1先打印1,2,3,4,5,然后线程2打印6,7,8,9,10,然后线程3打印11,12,13,14,15.
 * 接着再由线程1打印16,17,18,19,20以此类推,直到打印到100程序结束.
 * </p>
 */
public class Text {

  public static  Controller c = new Controller();

    public static void excuteMethod(int num,int threadNum) {

            while (true) {
                synchronized (c) {
                    if (c.getControl() != num) {
                        try {
                            c.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        if (c.getNum() > 100) {
                            break;
                        }
                        for (int i = 0; i < 5; i++) {
                            System.out.println(Thread.currentThread().getName() + "号线程  " + c.getNum());
                            c.setNum(c.getNum() + 1);
                        }
                        c.setControl(threadNum);
                        c.notifyAll();
                    }

                }
            }
        }



    public static void main(String[] args) {


//    Controller c = new Controller();
//    public void print(){
//        if (c.getNum() > 100) {
//            break;
//        }
//        for (int i = 0; i < 5; i++) {
//            System.out.println(Thread.currentThread().getName()+"号线程  "+c.getNum());
//            c.setNum(c.getNum() + 1);
//        }
//    }

        ThreadFactory namedThreadFactory = new ThreadFactoryBuilder().setNameFormat("demo-pool-%d").build();
        ExecutorService pool = new ThreadPoolExecutor(3, 200,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>(1024), namedThreadFactory, new ThreadPoolExecutor.AbortPolicy());


        pool.execute(() -> {
          excuteMethod(1,2);
                });

        pool.execute(() -> {
          excuteMethod(2,3);
                });

        pool.execute(() -> {
          excuteMethod(3,1);
                });


//        pool.execute(() -> {
//            while (true) {
//                synchronized (c) {
//                    if (c.getControl() != 2) {
//                        try {
//                            c.wait();
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                    } else {
//                        if (c.getNum() > 100) {
//                            break;
//                        }
//                        for (int i = 0; i < 5; i++) {
//                            System.out.println(Thread.currentThread().getName()+"号线程  "+c.getNum());
//                            c.setNum(c.getNum() + 1);
//                        }
//                        c.setControl(3);
//                        c.notifyAll();
//                    }
//
//                }
//            }
//        });
//
//        pool.execute(() -> {
//            while (true) {
//                synchronized (c) {
//                    if (c.getControl() != 3) {
//                        try {
//                            c.wait();
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                    } else {
//                        if (c.getNum() > 100) {
//                            break;
//                        }
//                        for (int i = 0; i < 5; i++) {
//                            System.out.println(Thread.currentThread().getName()+"号线程  "+c.getNum());
//                            c.setNum(c.getNum() + 1);
//                        }
//                        c.setControl(1);
//                        c.notifyAll();
//                    }
//
//                }
//            }
//        });
   }
}


