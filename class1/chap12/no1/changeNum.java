package com.whoo.chap12.no1;

public class changeNum {

    public static <T> void swap(T[] array, int i, int j){
            if(i < 0 || i >= array.length || j<0 || j >= array.length){
                throw new IndexOutOfBoundsException("오류 발생");
            }

            T temp = array[i];
            array[i] = array[j];
            array[j] = temp;


    }
}
