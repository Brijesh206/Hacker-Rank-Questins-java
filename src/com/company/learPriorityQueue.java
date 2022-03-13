package com.company;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class learPriorityQueue {
    public static void main(String[] args) {


//        Queue<Integer> pq = new PriorityQueue<>();    by default it is minheap
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());   // parameter converts it to maxheap
        pq.offer(40);
        pq.offer(35);
        pq.offer(25);
        pq.offer(10);
        pq.offer(45);

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.peek());



    }
}
