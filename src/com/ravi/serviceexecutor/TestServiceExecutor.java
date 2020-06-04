package com.ravi.serviceexecutor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

public class TestServiceExecutor {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService3 = Executors.newScheduledThreadPool(10);
        test();
        testRunnaleExecutor();
        testCallable();
        testInvokeAny();
        testInvokeAll();
    }

    private static  void test(){
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        executorService.execute(new Runnable() {
            public void run() {
                System.out.println("Asynchronous task");
            }
        });

        executorService.shutdown();
    }
    private static void testRunnaleExecutor() throws ExecutionException, InterruptedException {
        ExecutorService executorService1 = Executors.newSingleThreadExecutor();
        Future future = executorService1.submit(new Runnable() {
            public void run() {
                System.out.println("Asynchronous task in submit of Runnable");
            }
        });
        executorService1.shutdown();

        future.get();  //returns null if the task has finished correctly.

    }

    private static void testCallable() throws ExecutionException, InterruptedException {

        ExecutorService executorService2 = Executors.newFixedThreadPool(10);

        Future futureCallable = executorService2.submit(new Callable<Object>(){
            public Object call() throws Exception {
                System.out.println("Asynchronous Callable");
                return "Callable Result";
            }
        });

        System.out.println("futureCallable.get() = " + futureCallable.get());
        executorService2.shutdown();
    }
    private static void testInvokeAny() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Set<Callable<String>> callables = new HashSet<>();

        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Task 1";
            }
        });
        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Task 2";
            }
        });
        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Task 3";
            }
        });

        String result = executorService.invokeAny(callables);

        System.out.println("result = " + result);

        executorService.shutdown();

    }

    private static void testInvokeAll() throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Set<Callable<String>> callables = new HashSet<Callable<String>>();

        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Task 1";
            }
        });
        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Task 2";
            }
        });
        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Task 3";
            }
        });

        List<Future<String>> futures = executorService.invokeAll(callables);

        for(Future<String> future : futures){
            System.out.println("future.get = " + future.get());
        }

        executorService.shutdown();
    }
}
