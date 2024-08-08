package com.whoo.chap09;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Application02 {
    public static void main(String[] args) {
        Scanner a =  new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = a.nextLine();
        String[] aArr = str.split(" ");
        int cnt = 0;
        String[] bArr = new String[aArr.length];



        for (int i = 0; i < aArr[i].length(); i++) {
            char first = aArr[i].charAt(0);
            char lastChar = aArr[i].charAt(aArr[i].length() - 1);

            if(!(first >= 'a' && first <= 'z') && !(first >= 'A' && first <= 'Z')) {
                aArr[i] = null;
            } // 영어가 아니면 null로 변경

            if (!(lastChar >= 'a' && lastChar <= 'z') && !(lastChar >= 'A' && lastChar <= 'Z')) {
                aArr[i] = aArr[i].substring(0, aArr[i].length() - 1);
            } // 마지막에 특수문자 제거
            System.out.println(aArr[i]);
        }

        for(int i = 0; i < aArr.length; i++) {
            bArr[i] = aArr[i].toLowerCase();
        }

        Arrays.sort(bArr);
        String[] lastPrinted = new String[aArr.length];

        for(int i = 0; i < bArr.length; i++) {
            if(bArr[i].equals(bArr[i-1])) {
                cnt += 1;
            }else{
                if(lastPrinted == null || !lastPrinted.equals(bArr[i])){
                    System.out.println(bArr[i] + " : " + cnt);
                }

            }
        }









        /* ----- 입력 예시 -----
         *
         * 문자열 입력 : hello world Hello everyone! 안녕하세요 반갑습니다
         *
         * ----- 출력 예시 -----
         *
         * ===== 단어 빈도 =====
         * hello: 2
         * world: 1
         * everyone: 1
         * 가장 빈도 높은 단어 : hello (2 번)
         */

    }
}
