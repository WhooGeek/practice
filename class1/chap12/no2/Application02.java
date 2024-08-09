package com.whoo.chap12.no2;

import java.util.Arrays;
import java.util.List;

public class Application02 {

        public static void main(String[] args) {


            List<Integer> intArray = Arrays.asList(new Integer[] {1, 2, 3, 4, 5});
            System.out.println("Integer 합계 : " + sum(intArray));

            List<Double> doubleArray = Arrays.asList(new Double[] {1.1, 2.2, 3.3});
            System.out.println("Double 합계 : " + sum(doubleArray));

            List<String> strArray = Arrays.asList(new String[] {"A", "b", "c"});
//            String[] strArray = {"A", "B", "C"};
//            System.out.println("String 합계 : " + sum(strArray));  // 컴파일 에러 발생
        }

        static double sum(List<? extends Number> list){

            double value = 0;
            for(Number v : list)
                value += v.doubleValue();

            return value;

        }



}
