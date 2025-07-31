package com.zad.excellence.practice.standard.collections;

import java.util.ArrayDeque;

public class QueueArrayDequeImplementationExample {

    public static void main(String args[]) {

        QueueArrayDequeImplementationExample instance = new QueueArrayDequeImplementationExample();
        instance.basicOperation();

    }

    public void basicOperation() {
        ArrayDeque<String> arrayDeque = new ArrayDeque<String>();
        arrayDeque.offer("Monday");
        arrayDeque.offer("Tuesday");
        arrayDeque.offer("Wednesday");
        arrayDeque.offer("Thursday");
        arrayDeque.push("Friday");
        arrayDeque.push("Weekend");

        System.out.println(arrayDeque);

        System.out.println(arrayDeque.poll());
        System.out.println(arrayDeque.poll());

    }

}
