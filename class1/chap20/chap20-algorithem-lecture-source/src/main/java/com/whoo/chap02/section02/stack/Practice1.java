package com.whoo.chap02.section02.stack;

import java.util.Scanner;
import java.util.Stack;

public class Practice1 {

    public String solution(String input){

        Stack<Character> stack = new Stack<>();
        for(char c : input.toCharArray()){
            if(c == '('){
                // 여는 괄호일 경우 스택에 넣는다
                stack.push(c);
            }else {
                if(stack.isEmpty()) return "NO";

                // 닫는 괄호일 경우 stack에서 pop 한다
                stack.pop();
            }
        }
        // 모든 문자에 대해 처리했는데 스택에 여는 괄호가 남아있다는 거는 짝이 안맞는 상황
        if(!stack.isEmpty()) return "NO";
        return "YES";
    }

}
