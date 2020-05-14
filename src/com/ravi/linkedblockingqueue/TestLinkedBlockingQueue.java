package com.ravi.linkedblockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class TestLinkedBlockingQueue {
    public static void main(String[] args) throws InterruptedException {

        BlockingQueue<String> unbounded = new LinkedBlockingQueue<>();
        BlockingQueue<String> bounded   = new LinkedBlockingQueue<String>(1024);

        bounded.put("Value");
       bounded.put(null);

        String value = bounded.take();
        System.out.println(value);
    }
}
