package practice.class1.chap04.no1;

import java.util.Scanner;

public class basic01Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 하나 입력하세요 :");
		int num = sc.nextInt();
		if(num > 0) {
			System.out.println("양수다");
		}
    }
}







