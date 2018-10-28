package com.okres.task4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(4, 5, -6, 4, 5, 3, 4, 2, 4, 5, 7);
        Map<Integer, Integer> map = new TreeMap<>();

        for (Integer i : list) {
            if (!(map.containsKey(i)))
                map.put(i, 1);
            else
                countNum(map, i);
        }
        print(map);
    }

    private static void countNum(Map<Integer, Integer> map, int value) {
        for (Map.Entry<Integer, Integer> i : map.entrySet()) {
            if (i.getKey().equals(value))
                i.setValue(i.getValue() + 1);
        }
    }

    private static void print(Map<Integer, Integer> map) {
        for (Map.Entry<Integer, Integer> i : map.entrySet()) {
            System.out.println(i.getKey() + " - " + i.getValue());
        }
    }
}
