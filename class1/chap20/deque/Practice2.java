package com.whoo.chap20.deque;

import java.util.*;

public class Practice2 {

    public String solution(String command, Integer[] array) {
        Deque <Integer> deque = new ArrayDeque<>();
        Deque <Character> ch = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();



        for(int i = 0; i < array.length; i++){
            deque.offer(array[i]);
        }

        for(int i = 0; i < command.length(); i++){
            ch.offer(command.charAt(i));
        }

        for(int i = 0; i < command.length(); i++){
            if(ch.peek() == 'R'){
                ch.pop();
                List<Integer> list = new ArrayList<>(deque);
                Collections.reverse(list);
                Deque<Integer> reversedDeque = new ArrayDeque<>(list);
                deque = reversedDeque;

            }else{
                if (deque.isEmpty()){
                    return "error";
                }else{
                    ch.pop();
                    deque.pop();
                }
            }
        }
        if (deque.isEmpty()){
            return "error";

        }else{

            for(int i = 0; i <= deque.size(); i++){
                if(!sb.isEmpty()){
                    sb.append("," + deque.pop());

                }else{
                    sb.append("[");
                    sb.append(deque.pop());
                }
            }

            sb.append("]");


            return sb.toString();

        }

    }
}
