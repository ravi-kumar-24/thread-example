package com.ravi.arrayblockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class TestArrayBlockingQueue {



    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue(200);

        Thread consumerThread  = new Thread(new Consumer(blockingQueue));
        Thread producerThread  = new Thread(new Producor(blockingQueue));
        consumerThread.start();
        producerThread.start();
        Thread.sleep(4000);

    }


}
