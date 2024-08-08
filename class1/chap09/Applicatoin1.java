package com.whoo.chap09;

import java.util.Scanner;

public class Applicatoin1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("문자열 입력 : ");
        String a = sc.nextLine();

        String[] aArr = a.split(" ");
        System.out.print("변환된 문자열 : ");
        for (int i = 0; i < aArr.length; i++) {
            String first = aArr[i].substring(0, 1);
            String second = aArr[i].substring(1);
            first = first.toUpperCase();
            second = second.toLowerCase();
            aArr[i] = first + second;
            System.out.print(aArr[i] + " ");
        }
        System.out.println(" ");
        System.out.println("총 단어의 갯수 : " + aArr.length);


        /* ----- 입력 예시 -----
         *
         * 문자열 입력 : I will be a good developer.
         *
         * ----- 출력 예시 -----
         *
         * 변환된 문자열: I Will Be A Good Developer.
         * 총 단어 개수: 6
         */

    }


}
