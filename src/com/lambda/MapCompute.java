package com.lambda;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapCompute {
    // Main method
    public static void main(String[] args)
    {

        // Create a Map and add some values
        Map<String, Integer> map = new HashMap<>();
        map.put("Key1", 12);
        map.put("Key2", 15);

        // print map details
        System.out.println("Map: " + map);

        // remap the values
        // using compute method
        map.compute("Key1", (key, val)
                -> (val == null)
                ? 1
                : val + 1);
        map.compute("Key2", (key, val)
                -> (val == null)
                ? 1
                : val + 5);

        // print new mapping
        System.out.println("New Map: " + map);

        Map<Character, Integer> sMap = new LinkedHashMap<>();
        String str = "thisisateststringinjava";
        char[] chars = str.toCharArray();
        for (Character c: chars) {
            sMap.compute(c, (k ,v) -> (v==null) ? 1: v +1);
        }
        System.out.println(sMap);
    }
}
