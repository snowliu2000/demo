package com.example.demo.Multithreading.multiText;

/**
 * @author lsl
 * @version [1.0.0, 2019/5/13,10:43]
 */
public class Controller {
    private int control=1;
    private int num=1;

    public Controller() {
    }

    public Controller(int control, int num) {
        this.control = control;
        this.num = num;
    }

    public int getControl() {
        return control;
    }

    public void setControl(int control) {
        this.control = control;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
