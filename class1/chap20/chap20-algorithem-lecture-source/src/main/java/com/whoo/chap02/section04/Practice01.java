package com.whoo.chap02.section04;

import java.util.ArrayDeque;
import java.util.Deque;

public class Practice01 {

        static class Balloon{
            int order;
            int noteValue;

            Balloon(int order, int noteValue){
                this.order = order;
                this.noteValue = noteValue;
            }
        }

    public String solution(Integer[] notes){

            StringBuilder sb = new StringBuilder();

            // 풍선을 디큐에 삽입
            Deque<Balloon> balloons = new ArrayDeque<>();
            for(int i =0; i<notes.length; i++){
                balloons.add(new Balloon(i + 1, notes[i]));
            }

            // 첫번째 풍선 무조건 먼저 제거
            Balloon current = balloons.removeFirst();
            sb.append(current.order);

            // 풍선 다 터질때 까지 반복
            while(!balloons.isEmpty()){

                // 터진 풍선에 기록 된 이동 값
                int moveValue = current.noteValue;

                if(moveValue > 0){
                    // 양수는 오른쪽 이동
                    for(int i = 1; i < moveValue; i++){
                        balloons.addLast(balloons.removeFirst());
                    }
                    current = balloons.removeFirst();


                }else{
                    // 음수는 왼쪽으로 이동
                    for(int i = -1; i < -moveValue; i++){
                        balloons.addLast(balloons.removeLast());
                    }
                    current = balloons.removeLast();

                }

                sb.append(" ").append(current.order);

            }


            return sb.toString();








    }
}
