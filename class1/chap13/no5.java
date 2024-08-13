package com.whoo.chap13;

import java.util.Scanner;
import java.util.TreeSet;

public class no5 {
    public static void main(String[] args) {
        TreeSet<String> tset = new TreeSet<>();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("단어 입력 ('exit' 입력 시 종료): ");
            String input = sc.nextLine();
            if(input.equals("exit")){
                System.out.print("정렬 된 단어 : " + tset);
                break;
            }else {
                tset.add(input);
            }

        }

    }
}
