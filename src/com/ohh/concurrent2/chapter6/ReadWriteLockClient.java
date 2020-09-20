package com.ohh.concurrent2.chapter6;

public class ReadWriteLockClient {
    public static void main(String[] args) {
        final SharedData sharedData = new SharedData(10);
        new ReadWorker(sharedData).start();
        new ReadWorker(sharedData).start();
        new ReadWorker(sharedData).start();
        new ReadWorker(sharedData).start();
        new ReadWorker(sharedData).start();
        new WriteWorker(sharedData, "qwertyuiop").start();
        new WriteWorker(sharedData, "QWERTYUIOP").start();
    }
}
