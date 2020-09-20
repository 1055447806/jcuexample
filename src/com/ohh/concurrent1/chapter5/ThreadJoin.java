package com.ohh.concurrent1.chapter5;

import java.util.stream.IntStream;

public class ThreadJoin {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            IntStream.range(1, 1000).forEach(i -> System.out.println(Thread.currentThread().getName() + "->" + i));
        });

        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        IntStream.range(1, 1000).forEach(i -> System.out.println(Thread.currentThread().getName() + "->" + i));
    }
}
