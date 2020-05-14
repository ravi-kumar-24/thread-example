package com.ravi.arrayblockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class TestDequeue {

    public static void main(String[] args) throws InterruptedException {
        BlockingDeque<String> blockingQueue = new LinkedBlockingDeque<>();

        Thread consumerThread  = new Thread(new DeQueConsumer(blockingQueue));
        Thread producerThread  = new Thread(new DeQueProducor(blockingQueue));
        consumerThread.start();
        producerThread.start();
        Thread.sleep(4000);

        BlockingDeque<String> deque = new LinkedBlockingDeque<String>();

        deque.addFirst("1");
        deque.addLast("2");

        String two = deque.takeLast();
        String one = deque.takeFirst();
    }
}
