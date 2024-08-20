package com.whoo.chap02.section06.heap;


// java collection framework에는 heap을 직접 지원한느 클래스는 없지만
// PriorityQueue 클래스를 이용해서 heap을 구현할 수 있음

import java.util.PriorityQueue;

public class Application {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b-a);

        // 요소 추가
        minHeap.offer(10);
        minHeap.offer(5);
        minHeap.offer(8);


        maxHeap.offer(10);
        maxHeap.offer(5);
        maxHeap.offer(8);
        //최소값 조회
        System.out.println(minHeap.peek());

        // 최소값 제거
        System.out.println(minHeap.poll());

        // 제거 후 최소값 조회
        System.out.println(minHeap.peek());

        // 최대 힙 조회
        System.out.println(maxHeap.peek());
        System.out.println(maxHeap.poll());
        System.out.println(maxHeap.peek());

    }
}
