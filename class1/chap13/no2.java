package com.whoo.chap13;
import java.util.*;
import java.util.Scanner;
import java.util.Stack;

import static java.util.EnumSet.range;

public class no2 {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("방문 URL을 입력하세요 (단, exit을 입력하면 종료) : ");
            String url = sc.nextLine();
            stringStack.push(url);

            if(url.equals("exit")){
                break;
            }else {
                if (stringStack.size() == 1){
                    System.out.println("최근 방문 url : [" + stringStack.peek() + "]");
                } else if (stringStack.size() == 2) {
                    System.out.println("최근 방문 url : [" + stringStack.get(stringStack.size()-2) + ", " + stringStack.peek() +"]");
                } else if (stringStack.size() == 3) {
                    System.out.println("최근 방문 url : [" +stringStack.get(stringStack.size()-3) + ", " + stringStack.get(stringStack.size()-2) +", " + stringStack.peek() +"]");
                } else if (stringStack.size() == 4) {
                    System.out.println("최근 방문 url : [" +stringStack.get(stringStack.size()-4) + ", " + stringStack.get(stringStack.size()-3) +", " + stringStack.get(stringStack.size()-2) +", " + stringStack.peek() +"]");
                } else {
                    System.out.println("최근 방문 url : [" +stringStack.get(stringStack.size()-5) + ", " + stringStack.get(stringStack.size()-4) +", " + stringStack.get(stringStack.size()-3) +", " + stringStack.get(stringStack.size()-2) +", " + stringStack.peek() +"]");
                }
            }
        }
    }
}
