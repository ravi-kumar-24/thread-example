package com.ravi.arrayblockingqueue;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class DeQueProducor implements  Runnable {
    BlockingDeque<Integer> testArrayBlockingQueue =null;

    public DeQueProducor(BlockingDeque testArrayBlockingQueue){
        this.testArrayBlockingQueue = testArrayBlockingQueue;
    }

    @Override
    public void run() {
        try {
            testArrayBlockingQueue.put(1);
            testArrayBlockingQueue.put(2);
            testArrayBlockingQueue.put(3);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
