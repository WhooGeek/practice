package com.whoo.chap13;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class no3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> que = new LinkedList<String>();
        while(true){
            System.out.print("대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): ");
            String input = sc.nextLine();
            if(input.equals("exit")){
                break;
            } else if (input.equals("next")) {
                if (que.isEmpty()){
                    System.out.println("대기 고객이 없습니다.");
                } else {
                    System.out.println(que.poll() + " 고객님 차례입니다.");
                }
            } else {
                que.add(input);
                System.out.println(((LinkedList<String>) que).peekLast() + " 고객님 대기 등록 되었습니다.");
            }
        }
    }
}
