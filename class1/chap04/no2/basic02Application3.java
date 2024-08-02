package practice.class1.chap04.no2;

import java.util.Scanner;

public class basic02Application3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하시오 :");
        int a = sc.nextInt();
        int sum = 0;
        for(int i =1;i<=a;i++){
            if (i%2 ==0){
                sum += i;
            }
        }
        System.out.println("1부터 "+ a +"까지의 합 :" + sum);
    }

    /* 1부터 입력받은 정수까지의 짝수의 합을 구하세요
     *
     * -- 입력 예시 --
     * 정수를 입력하세요 : 10
     *
     * -- 출력 예시 --
     * 1부터 10까지 짝수의 합 : 30
     * */
}
