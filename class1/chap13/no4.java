package com.whoo.chap13;

import java.util.HashSet;
import java.util.Scanner;

public class no4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> hset = new HashSet<>();

        while (true){
            System.out.print("학생 ID 입력('exit' 입력 시 종료): ");
            String studentId = sc.nextLine();
            String input = studentId;
            if (hset.contains(input)){
                System.out.println("이미 등록 된 ID입니다.");

            } else if (input.equals("exit")) {
                System.out.print("모든 학생의 ID : ");
                System.out.print(hset);
                break;
            } else{
                hset.add(input);
                System.out.println("ID가 추가 되었습니다.");
            }
        }
    }
}
