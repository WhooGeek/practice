package com.whoo.chap13;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class no1 {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("학생 성적 : ");
            int n = sc.nextInt();
            list.add(n);
            System.out.print("추가 입력하려면 y : ");
            String str = sc.next();
            if(str.equals("n")){
                System.out.println("학생 인원 : " + list.size());
                int result = 0;
                for(int i = 0; i < list.size(); i++){
                    result += list.get(i);
                }

                System.out.println("평균 점수 : " + (double) (result/list.size()));
                break;
            }
        }


    }



}
