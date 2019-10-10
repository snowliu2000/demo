package com.example.demo.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

/**
 * @author lsl
 * @Date:2019/5/6
 * @Time:15:28
 */
public class Streams {
    private enum Status {
        OPEN, CLOSED
    }

    ;

    private static final class Task {
        private final Status status;
        private final Integer points;

        Task(final Status status, final Integer points) {
            this.status = status;
            this.points = points;
        }

        public Integer getPoints() {
            return points;
        }

        public Status getStatus() {
            return status;
        }

        @Override
        public String toString() {
            return String.format("[%s, %d]", status, points);
        }
    }


    public static void main(String[] args) {
        Collection<Task> tasks = Arrays.asList(
                new Task(Status.OPEN, 5),
                new Task(Status.OPEN, 13),
                new Task(Status.CLOSED, 8)
        );

        int sum = tasks.stream().filter(new Predicate<Task>() {
            @Override
            public boolean test(Task task) {
                return task.getStatus() == Status.OPEN;
            }
        }).mapToInt(new ToIntFunction<Task>() {
            @Override
            public int applyAsInt(Task task) {
                return task.getPoints();
            }
        }).sum();
        System.out.println(sum);
    }
}
