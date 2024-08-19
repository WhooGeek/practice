package com.whoo.chap20.queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Practice2 {

    public int solution(int w, int l, Integer[] truckWeight){
        Queue<Integer> truck = new LinkedList<>(Arrays.asList(truckWeight));
        Queue<Integer> bridge = new LinkedList<>();

        for(int i = 0 ; i < w; i++){
            bridge.offer(0);
        }

        int time = 0;
        int currentLoad = 0;


        while(!bridge.isEmpty()){
            time++;
            currentLoad -= bridge.poll();

            if(!truck.isEmpty()){
                if(currentLoad + truck.peek() <= l){

                    int newTruck = truck.poll();
                    bridge.offer(newTruck);
                    currentLoad += newTruck;
                } else{
                    bridge.offer(0);
                }
            }
        }
    return time;



    }
}
