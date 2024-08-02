package practice.class1.chap04.no2;

import java.util.Scanner;

public class hard02Application {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        while(true){
            int sum = 0;
            System.out.print("2보다 큰 정수를 하나 입력하세요: ");
            int n = in.nextInt();
            if (n <= 2) {
                System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
                continue;
            }else {
                for (int i = 2; i < n; i++) {
                    if(n % i == 0){
                        sum += i;
                    }
                }
            }
            System.out.println(sum);
            if (sum == 0) {
                System.out.println("소수입니다.");
            }else {
                System.out.println("소수가 아닙니다.");
            }


        }
    }
    /* 소수란?
     * 어떤 수를 1부터 자기 자신까지 차례대로 나누었을 때
     * 나누어 떨어지는 수가 1과 자기 자신만 존재하는 수를 소수라고 한다.
     *
     * -- 입력 예시 --
     * 2보다 큰 정수를 하나 입력하세요 : 7
     *
     * -- 출력 예시 --
     * 소수다.
     * */
}
