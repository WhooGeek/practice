package com.whoo.chap04.no2;
import java.util.Scanner;
public class advanced02Application2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("받으신 금액을 입력하세요: ");
        int received = sc.nextInt();
        System.out.println("상품 가격을 입력하세요: ");
        int price = sc.nextInt();

        int charge = received - price; //거스름돈
        int charge1 = received - price;
        int cnt = 0;
        String[] credit_back = {"원권", "원권", "원권", "원권", "원권", "원권", "원권", "원권"};
        int[] credit_front = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

        System.out.println("============================");
        for(int i = 0; i < credit_back.length; i++){
            if(charge1 / credit_front[i] >= 1){
                cnt = charge1 / credit_front[i];
                System.out.println(credit_front[i] + credit_back[i] + " 지폐 " + cnt + "장");
            }
            charge1 = charge1 - (cnt * credit_front[i]);
        }
        System.out.println("============================");
        System.out.println("거스름돈 : " + charge + "원");


    }



    /* 받은 금액을 입력 받고, 상품 가격을 입력 받아 거스름돈을 계산하는 프로그램을 작성하세요
     *
     * 단, 거스름돈은 대한민국 화폐 단위 별 필요 수량이 출력되도록 작성하고,
     * 지폐외 동전을 구분하여 단위를 표기하세요
     *
     * -- 입력 예시 --
     * 받으신 금액을 입력하세요 : 100000
     * 상품 가격을 입력하세요 : 22340
     *
     * -- 출력 예시 --
     * ============================
     * 50000원권 지폐 1장
     * 10000원권 지폐 2장
     * 5000원권 지폐 1장
     * 1000원권 지폐 2장
     * 500원권 동전 1개
     * 100원권 동전 1개
     * 50원권 동전 1개
     * 10원권 동전 1개
     * ============================
     * 거스름돈 : 77660원
     * */
}
