package com.ravi.arrayblockingqueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

    BlockingQueue testArrayBlockingQueue;

    public Consumer(BlockingQueue testArrayBlockingQueue){
        this.testArrayBlockingQueue = testArrayBlockingQueue;
    }
    public void run(){
        try {
            System.out.println( testArrayBlockingQueue.take());
            System.out.println(testArrayBlockingQueue.take());
            System.out.println(testArrayBlockingQueue.take());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
