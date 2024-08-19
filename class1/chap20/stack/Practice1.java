package com.whoo.chap20.stack;

import java.util.Stack;

public class Practice1 {


    public String solution(String input){
        Stack<String> stack = new Stack<>();

        for(int i = 0; i < input.length(); i++){
            if (input.charAt(i) == '('){
                stack.push("(");
            }else {
                if(!stack.isEmpty()){
                    stack.pop();
                }else{
                    return "NO";
                }
            }
        }

        if (stack.isEmpty()){
            return "YES";
        } else{
            return "NO";
        }


    }


}
