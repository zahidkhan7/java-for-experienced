package com.zad.excellence.practice.standard.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.zad.excellence.practice.standard.model.Employee;
/* Example is written from :
        http://www.java2novice.com/java-collections-and-util/linkedlist
        https://www.javatpoint.com/difference-between-arraylist-and-linkedlist
*/

public class LinkedListMethodsExample
{
        public static void main(String args[])
        {
                LinkedListMethodsExample instance = new LinkedListMethodsExample();
                instance.usingCustomObjectToAddInLinkedListExample();
        }

        // ArrayList and LinkedList Differs on the Basis of Storing data.
        // ArrayList internally uses dynamic array while LinkedList uses doubly
        // linked list to store the element: All methods are same as ArrayList
        public void basicOperationalMethodForLinkedList()
        {
                // Adding element to List
                LinkedList<String> nameList = new LinkedList<String>();
                nameList.add("zahid Khan");
                nameList.add("Naureen Zafar");
                nameList.add("Mahreen Z Khan");
                // Iterating using Iterator
                Iterator<String> itr = nameList.iterator();
                while (itr.hasNext())
                {
                        System.out.println(itr.next());
                }
                // Cloning Linked List
                LinkedList<String> cloneList = (LinkedList<String>) nameList.clone();
                // Using for each for LinkedList
                cloneList.forEach(value -> System.out.println(value));
                // Removing All element from List
                cloneList.removeAll(nameList);
                nameList.add("Jamal Hussain");
                nameList.add("Pani Shekhar");
        }

        // LinkedList has some more methods due to Implementation of Deque
        // These methods are : getFirst(), getLast() , peekFirst(), peekLast()
        public void standardMethodsOfArrayListVsLinkedList()
        {
                LinkedList<String> nameList = new LinkedList<String>();
                nameList.add("zahid Khan");
                nameList.add("Naureen Zafar");
                nameList.add("Mahreen Z Khan");
                nameList.add("Jamal Hussain");
                nameList.add("Pani Shekhar");
                List<String> tempList = new ArrayList<String>();
                tempList.add("Jamal Hussain");
                tempList.add("Pani Shekhar");
                tempList.add(" Shekhar");
                System.out.println(nameList.containsAll(tempList));
                String[] strArr = new String[nameList.size()];
                nameList.toArray(strArr);
                System.out.println("Created Array content:");
                for (String str : strArr)
                {
                        System.out.println(str);
                }
                System.out.println("First Element: " + nameList.getFirst());
                nameList.forEach(value -> System.out.println(value));
                System.out.println("First Element: " + nameList.peekFirst());
                nameList.forEach(value -> System.out.println(value));
                LinkedList<String> otherList = new LinkedList<String>();
                System.out.println(
                                "First Element of Other List: " + otherList.peekFirst());
                // this will throw java.util.NoSuchElementException if there is no
                // element found
                System.out.println(
                                "First Element of Other List: " + otherList.getFirst());
        }

        // It has some methods for desending Iterator, removeFirstOccurrence
        // ,removeLastOccurrence
        public void moreStandardMethodsOfLinkedListExample()
        {
                LinkedList<String> nameList = new LinkedList<String>();
                nameList.add("zahid Khan");
                nameList.add("Naureen Zafar");
                nameList.add("Mahreen Z Khan");
                nameList.add("Jamal Hussain");
                nameList.add("Naureen Zafar");
                nameList.add("Pani Shekhar");
                Iterator<String> itr = nameList.descendingIterator();
                while (itr.hasNext())
                {
                        System.out.println(itr.next());
                }
                nameList.push("push element");
                System.out.println("After push operation:");
                Iterator<String> iteratorPush = nameList.iterator();
                while (iteratorPush.hasNext())
                {
                        System.out.println(iteratorPush.next());
                }
                nameList.pop();
                System.out.println("After pop operation:");
                Iterator<String> iteratorPop = nameList.iterator();
                while (iteratorPop.hasNext())
                {
                        System.out.println(iteratorPop.next());
                }
                Collections.swap(nameList, 2, nameList.size() - 1);
                System.out.println("After Swapping operation:");
                Iterator<String> iteratorSwap = nameList.iterator();
                while (iteratorSwap.hasNext())
                {
                        System.out.println(iteratorSwap.next());
                }
                nameList.removeFirst();
                nameList.removeLast();
                System.out.println(nameList.removeFirstOccurrence("zahid Khan"));
                System.out.println(nameList.removeLastOccurrence("Naureen Zafar"));
                nameList.addFirst("Arnab");
                nameList.addLast("Javed");
        }

        public void usingCustomObjectToAddInLinkedListExample()
        {
                LinkedList<Employee> nameList = new LinkedList<Employee>();
                nameList.add(new Employee(16255, "Zahid", "Khan"));
                nameList.add(new Employee(16256, "Naureen", "Zafar"));
                nameList.add(new Employee(16260, "Jamal", "Hussain"));
                Collections.sort(nameList, Employee.IdComparator);
                System.out.println("Sorted with employeeId");
                nameList.forEach(value -> System.out.println(value));
                System.out.println("Sorted with First Name:");
                Collections.sort(nameList, Employee.firstNameComparator);
                nameList.forEach(value -> System.out.println(value));
        }
}
