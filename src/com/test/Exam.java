package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exam {
    public static void main(String[] args) {
        System.out.println("Hello");
        List<Integer> list = Arrays.asList(2,2,3,4,5,6,4,10,12,7,8,8,9);
        List<Integer> ls =list.stream().dropWhile((i) ->(i%2==1)).collect(Collectors.toList());
        System.out.println(ls);
        Exam exam = null;
        exam.test();
    }

    public void test(){
        System.out.println("hello world");
    }
}
