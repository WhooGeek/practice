package com.whoo.chap20.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Practice1 {

    public String solution(Integer[] notes){
        Deque<Integer> bol = new ArrayDeque<>();
        Deque<Integer> num = new ArrayDeque<>();
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < notes.length; i++){
            num.offer(i+1);
            bol.offer(notes[i]);
        }
        result.append(num.pollFirst());
        int box = bol.pop();


        while(!bol.isEmpty()){
            if(box > 0){
                for(int i = 1; i < box; i++){
                    bol.add(bol.pop());
                    num.add(num.pop());
                }
                if(!num.isEmpty()){
                    result.append(" " + num.pop());
                }else{
                    result.append(" " + num.pop());
                }

                box = bol.pop();

            }else{
                for(int i = 1; i < -1 * box; i++){
                    bol.addFirst(bol.pollLast());
                    num.addFirst(num.pollLast());
                }

                box = bol.pop();
                if(!num.isEmpty()){
                    result.append(" " + num.pollLast());
                }else{
                    result.append(" " + num.pollLast());
                }

            }
        }



        return result.toString();
    }
}
