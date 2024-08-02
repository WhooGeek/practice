package practice.class1.chap04.no1;

import java.util.Scanner;

public class advanced01Application2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("월 급여 입력 :");
        int n = in.nextInt();
        System.out.print("매출액 입력 :");
        int m = in.nextInt();

        if (m >= 50000000){
            System.out.println("======================");
            System.out.println("매출액 :" + m);
            System.out.println("보너스율 : 5%");
            System.out.println("월 급여:" + n);
            System.out.println("보너스 금액:" + (m*0.05));
            System.out.println("======================");
            System.out.println("총 급여: "+ (n +(m*0.05)));
        } else if (m >= 30000000) {
            System.out.println("======================");
            System.out.println("매출액 :" + m);
            System.out.println("보너스율 : 3%");
            System.out.println("월 급여:" + n);
            System.out.println("보너스 금액:" + (m*0.03));
            System.out.println("======================");
            System.out.println("총 급여: "+ (n +(m*0.03)));
        } else if (m >= 10000000) {
            System.out.println("======================");
            System.out.println("매출액 :" + m);
            System.out.println("보너스율 : 1%");
            System.out.println("월 급여:" + n);
            System.out.println("보너스 금액:" + (m*0.01));
            System.out.println("======================");
            System.out.println("총 급여: "+ (n +(m*0.01)));

        }else if (m < 1000000) {
            System.out.println("======================");
            System.out.println("매출액 :" + m);
            System.out.println("보너스율 : 0%");
            System.out.println("월 급여:" + n);
            System.out.println("보너스 금액:" + (m*0));
            System.out.println("======================");
            System.out.println("총 급여: "+ (n +(m*0)));
        }
        /*
         *
         * -- 총 급여 계산식 --
         * 총 급여 = 월 급여  + (매출액 * 보너스율)
         *
         * -- 매출액 대비 보너스율 --
         *   매출액       보너스율
         * 5천만원 이상      5%
         * 3천만원 이상      3%
         * 1천만원 이상      1%
         * 1천만원 미만      0%
         *
         * -- 입력 예시 --
         * 월 급여 입력 : 3000000
         * 매출액 입력 : 20000000
         *
         * -- 출력 예시 --
         * ======================
         * 매출액 : 20000000
         * 보너스율 : 1%
         * 월 급여 : 3000000
         * 보너스 금액 : 200000
         * ======================
         * 총 급여 : 3200000
         * */
    }
}
