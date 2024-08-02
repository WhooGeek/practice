package com.whoo.chap05.no01;
import java.util.Scanner;
public class normal01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 하나 입력하세요 :");
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        System.out.println("검색할 문자를 입력하세요");
        char ch = sc.next().charAt(0);
        int cnt =0 ;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ch){
                cnt++;
            }
        }
        System.out.println("입력하신 문자열 " + str + "에서 찾으시는 문자 " + ch + "은 "+cnt+"개 입니다.");


        /*
         * 문자열을 하나 입력받아 문자 자료형 배열로 바꾼 뒤
         * (String Class의 toCharArray() : char[] 메소드 활용 가능
         * char[] carr = 문자열변수.toCharArray(); 와 같이 사용)
         * 검색할 문자를 하나 입력 받아 입력 받은 검색할 문자가
         * 문자열에 몇개 있는지를 출력하세요
         *
         * -- 입력 예시 --
         * 문자열을 하나 입력하세요 : helloworld
         * 검색할 문자를 입력하세요 : l
         *
         * -- 출력 예시 --
         * 입력하신 문자열 helloworld에서 찾으시는 문자 l은 3개 입니다.
         */
    }
}
