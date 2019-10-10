package com.example.demo.StringTest;

import org.springframework.boot.CommandLineRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lsl
 * @version [1.0.0, 2019/7/9,10:07]
 */
public class Demo2 implements CommandLineRunner {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        System.out.println(list.size());
        List<String> strings = Arrays.asList("12", "23");
        list.addAll(strings);
        System.out.println(list);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
