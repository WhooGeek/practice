package com.whoo.chap20.stack;

import java.util.Stack;

public class Practice2 {
    public int solution(String input){
        Stack<String> stack = new Stack<>();
        int num = 0;
        for(int i =0; i < input.length(); i++){
            if (input.charAt(i) == '('){
                stack.push("(");
            }else {
               if (input.charAt(i-1) == '('){
                   stack.pop();
                   num += stack.size();
               }else{
                   stack.pop();
                   num +=  1;
               }
            }
        }

        return num;
    }

}

