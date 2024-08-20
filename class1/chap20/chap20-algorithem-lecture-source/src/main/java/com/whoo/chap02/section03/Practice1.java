package com.whoo.chap02.section03;

import java.util.LinkedList;
import java.util.Queue;

public class Practice1 {

    public String solution(int n , int k){

        Queue <Integer> queue = new LinkedList<Integer>();
        StringBuilder sb = new StringBuilder("<");

        for(int i = 0; i < n; i++){
            queue.offer(i+1);
        }

        while(!queue.isEmpty()){
            // 앞에 두명을 스킵하고 맨 뒤로 보내줘야함
            for(int i = 1; i <= k-1; i++){
                queue.offer(queue.poll());
            }
            sb.append(queue.poll());


            // 제거할 사람 기록
            if(!queue.isEmpty())sb.append(", ");

        }
        sb.append(">");
        return sb.toString();


    }
}
