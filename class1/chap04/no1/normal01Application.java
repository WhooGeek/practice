package practice.class1.chap04.no1;

import java.util.Scanner;

public class normal01Application {
    public static void main(String[] args) {
        System.out.println("수를 입력해주세요");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(0< n && n <= 10){
            if (n % 2 ==0){
                System.out.println("짝수다");
            }else{
                System.out.println("홀수다");
            }
        }else{
            System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
        }

        /* 1~10 사이의 정수 한개를 입력받아 홀수인지 짝수인지 인지 확인하고,
         * 홀수이면 "홀수다.", 홀수가 아니면 "짝수다." (라고 출력하세요.
         * 단, 1~10 사이의 정수가 아닌 경우 "반드시 1~10 사이의 정수를 입력해야 합니다." 를 출력하세요.
         * */
    }
}
