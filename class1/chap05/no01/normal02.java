package com.whoo.chap05.no01;
import java.util.Scanner;
public class normal02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("주민등록번호를 입력하시오: ");
        String no = sc.nextLine();
        char[] number = no.toCharArray();
        number[7] = '*';
        for (int i = 0; i< number.length; i++){
            System.out.print(number[i]);
        }

        /* 주민등록번호를 스캐너로 입력 받고 문자 배열로 저장한 뒤,
         * 성별 자리 이후부터 *로 가려서 출력하세요
         *
         * -- 입력 예시 --
         * 주민등록번호를 입력하세요 : 990101-1234567
         *
         * -- 출력 예시 --
         * 990101-1******
         */
    }
}
