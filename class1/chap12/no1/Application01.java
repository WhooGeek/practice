package com.whoo.chap12.no1;

import java.util.Arrays;

public class Application01 {

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("swap 전 : " + Arrays.toString(intArray));  // [1, 2, 3, 4, 5]
        changeNum.swap(intArray, 1, 3);
        System.out.println("swap 후 : " + Arrays.toString(intArray));  // [1, 4, 3, 2, 5]

        String[] strArray = {"A", "B", "C", "D"};
        System.out.println("swap 전 : " + Arrays.toString(strArray));  // [A, B, C, D]
        changeNum.swap(strArray, 0, 2);
        System.out.println("swap 후 : " + Arrays.toString(strArray));  // [C, B, A, D]
    }



}
