package com.lambda;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class JavaPredicateEx2 {

    public static void main(String[] args) { 

        List<Integer> nums = List.of(2, 3, 1, 5, 6, 7, 8, 9, 12);

        Predicate<Integer> btf = n -> n > 5;

      Map<Integer, Integer> map =  nums.stream().
                filter(a ->a<6).
                collect(Collectors.toMap( a ->a, Function.identity()));
      map.entrySet().stream().forEach(System.out::println);
    }
}
