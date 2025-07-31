package com.zad.excellence.practice.standard.collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueImplementationExample
{
        public static void main(String[] args)
        {
                QueueImplementationExample instance = new QueueImplementationExample();
                instance.standardOperation();
        }

        public void basicOperation()
        {
                Queue<String> myQueue = new LinkedList<String>();
                // add elements in the queue using offer() - return true/false
                myQueue.offer("Monday");
                myQueue.offer("Tuesday");
                boolean flag = myQueue.offer("Wednesday");
                System.out.println("Wednesday inserted successfully? " + flag);
                try
                {
                        myQueue.add("Thursday");
                        myQueue.add("Friday");
                        myQueue.add("Weekend");
                } catch (IllegalStateException ex)
                {
                        ex.printStackTrace();
                }
                System.out.println("Pick the head of the queue: " + myQueue.peek());
                String head = null;
                try
                {
                        head = (String) myQueue.remove();
                        System.out.print("1) Push out " + head + " from the queue ");
                        System.out.println("and the new head is now: " + myQueue.element());
                } catch (NoSuchElementException ex)
                {
                        ex.printStackTrace();
                }
                // remove the head - poll()
                head = (String) myQueue.poll();
                System.out.print("2) Push out " + head + " from the queue");
                System.out.println("and the new head is now: " + myQueue.peek());
                // find out if the queue contains an object
                System.out.println("Does the queue contain 'Weekend'? "
                                + myQueue.contains("Weekend"));
                System.out.println("Does the queue contain 'Monday'? "
                                + myQueue.contains("Monday"));
        }

        public void standardOperation()
        {
                Deque<String> myDoubleEndedQueue = new LinkedList<String>();
                try
                {
                        myDoubleEndedQueue.offer("Monday");
                        myDoubleEndedQueue.offer("Tuesday");
                        myDoubleEndedQueue.offer("Wednesday");
                        myDoubleEndedQueue.add("Thursday");
                        myDoubleEndedQueue.add("Friday");
                        myDoubleEndedQueue.add("Weekend");
                } catch (IllegalStateException ex)
                {
                        ex.printStackTrace();
                }
                myDoubleEndedQueue.removeLast();
                System.out.println("Element after removal:");
                myDoubleEndedQueue.forEach(element -> System.out.println(element));
                myDoubleEndedQueue.addFirst("Sunday");
                myDoubleEndedQueue.addLast("Saturday");
                System.out.println("Element after Adding:");
                myDoubleEndedQueue.forEach(element -> System.out.println(element));
        }
}
