package practice.class1.chap04.no1;

import java.util.Scanner;

public class basic01Application2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        System.out.println("정수 하나를 입력하시오: ");
        if(num % 2 == 0) {
            System.out.println("짝수다");
        }else {
            System.out.println("홀수다");
        }
    }
}
