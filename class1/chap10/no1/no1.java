package com.whoo.chap10.no1;


import java.util.Scanner;

public class no1 {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        no1Exception exception = new no1Exception();


        try{
            System.out.print("분자 입력 : ");
            String a = sc.nextLine();
            exception.firstCheck(a);
            System.out.print("분모 입력 : ");
            String b = sc.nextLine();
            exception.checknumber(a,b);

        }catch(ZeroException e){
            System.out.println(e.getMessage());
        }catch(NumberException e){
            System.out.println(e.getMessage());
        }
            System.out.println("실행이 완료되었습니다.");
        }
        /* ----- 입력 예시 -----
         *
         *
         * 분자 입력 : 10
         * 분모 입력 : 2
         *
         * ----- 출력 예시 -----
         *
         * 결과 : 5
         * 실행이 완료되었습니다.
         *
         * ----- 입력 예시 -----
         *
         * 분자 입력 : 십
         *
         * ----- 출력 예시 -----
         *
         * 오류 : 유효한 정수를 입력하세요.
         * 실행이 완료되었습니다.
         *
         * ----- 입력 예시 -----
         *
         * 분자 입력 : 10
         * 분모 입력 : 0
         *
         * ----- 출력 예시 -----
         *
         * 오류 : 0으로 나누는 것은 허용되지 않습니다.
         * 실행이 완료되었습니다.
         */
}
