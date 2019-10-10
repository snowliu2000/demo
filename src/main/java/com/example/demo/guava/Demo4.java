package com.example.demo.guava;

import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;

/**
 * @author lsl
 * @version [1.0.0, 2019/8/30,14:27]
 */
public class Demo4 {
    public static void main(String[] args) {
        ImmutableList<String> names = ImmutableList.of("begin", "code", "Guava", "Java");
        Iterable<String> fitered = Iterables.filter(names, Predicates.or(Predicates.equalTo("Guava"), Predicates.equalTo("Java")));
        System.out.println(fitered);
    }
}
