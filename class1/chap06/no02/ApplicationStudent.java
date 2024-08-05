package com.whoo.chap06.no02;

import java.util.Scanner;

public class ApplicationStudent {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDTO[] student = new StudentDTO[10];
        int a = 0;
        label:
        do{
            System.out.print("학년 : ");
            int grade = sc.nextInt();
            System.out.print("반 : ");
            int classroom = sc.nextInt();
            System.out.print("이름 : ");
            String name = sc.next();
            System.out.print("국어점수 : ");
            int kor = sc.nextInt();
            System.out.print("영어점수 : ");
            int eng = sc.nextInt();
            System.out.print("수학점수 : ");
            int math = sc.nextInt();

            student[a] =  new StudentDTO(grade, classroom, name, kor, eng, math);
            a++;

            System.out.println("계속 추가할 겁니까? (y/n)");
            if (sc.next().equals("n")) {
                for(int i = 0; i < a; i++){
                    System.out.println(student[i].getinformation());
                };
                break label;
            }
        }while(true);


    }
}
