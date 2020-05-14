package com.ravi.arrayblockingqueue;

import java.util.concurrent.BlockingQueue;

public class Producor implements  Runnable {
    BlockingQueue<Integer> testArrayBlockingQueue =null;

    public  Producor(BlockingQueue testArrayBlockingQueue){
        this.testArrayBlockingQueue = testArrayBlockingQueue;
    }

    @Override
    public void run() {
        try {
            testArrayBlockingQueue.put(1);
            Thread.sleep(1000);
            testArrayBlockingQueue.put(2);
            Thread.sleep(10000);
            testArrayBlockingQueue.put(3);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
