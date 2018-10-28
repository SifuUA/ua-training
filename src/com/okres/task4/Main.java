package com.okres.task4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(4, 5, -6, 4, 5, 3, 4, 2, 4, 5, 7);

        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (Integer i : list) {
            int res = 1;
            if (!(map.containsKey(i))) {
                map.put(i, res);
            } else {
                countNum(map, i);
            }
        }
        System.out.println(map.toString());
    }

    private static int countNum(TreeMap<Integer, Integer> map, int value) {
        int res = 0;
        for (Map.Entry<Integer, Integer> i : map.entrySet()) {
            if (i.getKey().equals(value))
                i.setValue(i.getValue() + 1);
        }
        return res;
    }

}
