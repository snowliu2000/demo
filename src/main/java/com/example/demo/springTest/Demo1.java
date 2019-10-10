package com.example.demo.springTest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author lsl
 * @version [1.0.0, 2019/6/28,19:46]
 */
public class Demo1 {
    //    public void streamMethod(String...string){
////        Stream.of("tom","jim","lucy").forEach();
//    }
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    class Student {
        private String name;
        private Integer age;
    }

    public static void main(String[] args) {
        Integer method = new Demo1().method();
        System.out.println(method);
    }
    private Integer method(){
        ArrayList<Student> list = new ArrayList<>();
        Student student = new Student("tom",11);
        Student student1 = new Student("jim",20);
        list.add(student);
        list.add(student1);
        int sum = list.stream()
                .filter(a -> a.getName().equals("tom"))
                .mapToInt(va->va.getAge())
                .sum();
   list.stream().map(a -> a.getAge() + 12).forEach(System.out::println);
        return sum;

    }
}
