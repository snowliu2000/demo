package com.example.demo.Multithreading.multiText;

/**
 * @author lsl
 * @version [1.0.0, 2019/5/13,10:40]
 */
public class Thread2 implements Runnable{
    private Controller c;

    public Thread2(Controller c) {
        this.c = c;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (c){
                if (c.getControl()!=2){
                    try {
                        c.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    if (c.getNum()>100){
                        break;
                    }
                    for (int i = 0; i < 5; i++) {
                        System.out.println(c.getNum());
                        c.setNum(c.getNum()+1);
                    }
                    c.setControl(3);
                    c.notifyAll();
                }
            }

        }
    }
}
