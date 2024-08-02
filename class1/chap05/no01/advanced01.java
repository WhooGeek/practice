package com.whoo.chap05.no01;
import java.util.Arrays;
import java.util.Scanner;


public class advanced01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[6];

        for (int i = 0; i < arr.length; i++) {
            int num = (int) (Math.random() * 44 + 1);
            arr[i] = num;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;
                }
            }

        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+ "");
        }
        /* 로또번호 생성기
         * 1부터 45까지의 중복되지 않는 난수를 발생시켜 각 인덱스에 대입한 뒤
         * 오름차순 정렬하여 출력하세요.
         * Arrays.sort(배열) 메소드 활용하여 정렬 가능.
         * */
    }
}
