package com.whoo.chap12.no2;

public class featureSum {

    public static void sum(Calculate<? super > array){

        Object a = 0;
        for(int i = 0; i < array.length; i++){
            a += array[i];
        }


    }
}
