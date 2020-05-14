package com.ravi.arrayblockingqueue;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class DeQueConsumer implements Runnable {

    BlockingDeque testArrayBlockingQueue;

    public DeQueConsumer(BlockingDeque testArrayBlockingQueue){
        this.testArrayBlockingQueue = testArrayBlockingQueue;
    }
    public void run(){
        try {
            System.out.println( testArrayBlockingQueue.takeFirst());
            Thread.sleep(10000);
            System.out.println(testArrayBlockingQueue.takeLast());
            System.out.println(testArrayBlockingQueue.takeFirst());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
