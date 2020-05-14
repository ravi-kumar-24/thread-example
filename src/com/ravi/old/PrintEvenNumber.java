package com.ravi.old;

public class PrintEvenNumber implements Runnable {
    Object obj;

    public PrintEvenNumber(Object o) {
        this.obj = o;
    }

    @Override
    public void run() {
        synchronized (obj) {
            for (int i = 0; i < 20; ) {
                try {
                    obj.notifyAll();
                    System.out.println(i);
                    i = i + 2;
                    Thread.sleep(2000);
                    obj.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
