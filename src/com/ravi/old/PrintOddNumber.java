package com.ravi.old;

public class PrintOddNumber implements Runnable {
    Object obj;

    public PrintOddNumber(Object o) {
        this.obj = o;
    }

    @Override
    public void run() {
        synchronized (obj) {
            for (int i = 1; i < 20; ) {
                try {
                    obj.notifyAll();
                    System.out.println(i);
                    i = i + 2;
                    obj.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
