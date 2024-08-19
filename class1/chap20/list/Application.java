package com.whoo.chap20.list;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list.get(1));

        list.remove(2);
        System.out.println(list);

        


    }
}
