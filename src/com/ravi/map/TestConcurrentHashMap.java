package com.ravi.map;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class TestConcurrentHashMap {

    public static void main(String[] args) {
        ConcurrentMap concurrentMap = new ConcurrentHashMap();
        concurrentMap.put(1,"ravi");
        concurrentMap.put(2,"aa");
        concurrentMap.put(3,"xxx");
        concurrentMap.entrySet().stream().forEach(System.out::println);
    }
}
