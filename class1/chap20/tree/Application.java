package com.whoo.chap20.tree;

import java.util.TreeMap;
import java.util.TreeSet;

public class Application {
    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(3);
        treeSet.add(2);
        treeSet.add(1);

        System.out.println("Tree 최소값 조회 " + treeSet.first());
        System.out.println("Tree 최대값 조회 " + treeSet.last());

        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(3, "Three");
        treeMap.put(1, "one");
        treeMap.put(2, "two");

        System.out.println("TreeMap에서 키 2의 값" + treeMap.get(2));

        System.out.println("TreeMap 최대값" + treeMap.lastKey());
        System.out.println("TreeMap 최소값 " + treeMap.firstKey());


    }
}
