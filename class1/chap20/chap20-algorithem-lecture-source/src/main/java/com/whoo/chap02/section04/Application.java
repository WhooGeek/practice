package com.whoo.chap02.section04;


// Java collection Frameworkdptjsms Deque 인터페이스와 이를 구현한 클래스가 있다.
// 배열 기반의 동적 큐인 ArrayDeque 클래스를 이용해보자


import java.util.ArrayDeque;
import java.util.Deque;

public class Application {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        deque.addFirst(4);

        // 요소 확인
        System.out.println("확인 ----------------------------");
        System.out.println(deque.getFirst());
        System.out.println(deque.peekFirst());
        System.out.println(deque.getLast());
        System.out.println(deque.peekLast());
        System.out.println("제거-----------------");
        System.out.println(deque.removeFirst());
        System.out.println(deque.pollFirst());
        System.out.println(deque.removeLast());
        System.out.println(deque.pollLast());

    }
}
