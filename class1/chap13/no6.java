package com.whoo.chap13;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class no6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap hmap = new HashMap();

        while(true){
            System.out.print("이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): ");
            String input = sc.nextLine();

            if(input.equals("exit")){
                break;
            } else if (input.equals("search")) {
                System.out.print("검색 할 이름 ");
                String ipname = sc.nextLine();
                if(hmap.containsKey(ipname)){
                    System.out.println(ipname + "씨의 전화번호 : " + hmap.get(ipname));
                }else{
                    System.out.println(ipname + "씨의 번호는 등록 되어 있지 않습니다.");
                }
            } else{
                String[] list = input.split(" ", 2);
                if(list.length == 2 ){
                    hmap.put(list[0], list[1]);
                    System.out.println("추가 완료 : " + list[0] + " " + list[1]);

                }else {
                    System.out.println("입력이 잘못 되었습니다. 다음 양식으로 입력해주세요 : <이름> <전화번호>");
                }
            }

        }
    }

}
