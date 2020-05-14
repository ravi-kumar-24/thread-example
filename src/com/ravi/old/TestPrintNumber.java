package com.ravi.old;

public class TestPrintNumber {

    public static void main(String[] args) {
        Object object = new Object();
        Thread even = new Thread(new PrintEvenNumber(object));
        Thread odd = new Thread(new PrintOddNumber(object));
        even.start();
        odd.start();
        System.out.println("done with main thread");
    }
}
