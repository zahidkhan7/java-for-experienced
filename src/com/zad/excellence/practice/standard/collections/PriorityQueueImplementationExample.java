package com.zad.excellence.practice.standard.collections;

import java.util.PriorityQueue;

import com.zad.excellence.practice.standard.model.Employee;
import com.zad.excellence.practice.standard.model.StudentWithComparable;
/*
 * Simple & Good Example for Priority Queue implementation:
 * https://www.youtube.com/watch?v=c4ES6jGxqEw
 */

public class PriorityQueueImplementationExample
{
        public static void main(String args[])
        {
                PriorityQueueImplementationExample instance = new PriorityQueueImplementationExample();
                instance.useOfPriorityQueueOnEmployeeName();
        }

        public void useOfPriorityQueueOnStudentId()
        {
                StudentWithComparable imran = new StudentWithComparable(54, "Imran", 23, 65.5);
                StudentWithComparable shahil = new StudentWithComparable(43, "Imran", 24, 62.4);
                StudentWithComparable jainab = new StudentWithComparable(25, "Imran", 22, 65.5);
                PriorityQueue<StudentWithComparable> entranceQueue = new PriorityQueue<>();
                entranceQueue.add(imran);
                entranceQueue.add(shahil);
                entranceQueue.add(jainab);
                int count = 1;
                while (!entranceQueue.isEmpty())
                {
                        System.out.println("Student are taken entrance :" + count + "-->"
                                        + entranceQueue.remove());
                        count++;
                }
        }

        public void useOfPriorityQueueOnEmployeeID()
        {
                // PriorityQueue on the basis of Id:
                PriorityQueue<Employee> employeeQueue = new PriorityQueue<Employee>(
                                Employee.IdComparator);
                employeeQueue.add(new Employee(16255, "Zahid", "Khan"));
                employeeQueue.add(new Employee(16256, "Naureen", "Zafar"));
                employeeQueue.add(new Employee(16257, "Jamal", "Hussain"));
                employeeQueue.add(new Employee(16255, "Kailash", "kher"));
                System.out.println("Employee are present on Queue as: ");
                employeeQueue.forEach(emp -> System.out.println(emp));
                while (!employeeQueue.isEmpty())
                {
                        System.out
                                        .println("Employee taken as:-->" + employeeQueue.poll());
                }
        }

        public void useOfPriorityQueueOnEmployeeName()
        {
                // PriorityQueue on the basis of Id:
                PriorityQueue<Employee> employeeQueue = new PriorityQueue<Employee>(
                                Employee.firstNameComparator);
                employeeQueue.add(new Employee(16255, "Zahid", "Khan"));
                employeeQueue.add(new Employee(16256, "Naureen", "Zafar"));
                employeeQueue.add(new Employee(16257, "Jamal", "Hussain"));
                employeeQueue.add(new Employee(16255, "Kailash", "kher"));
                System.out.println("Employee are present on Queue as: ");
                employeeQueue.forEach(emp -> System.out.println(emp));
                while (!employeeQueue.isEmpty())
                {
                        System.out
                                        .println("Employee taken as:-->" + employeeQueue.remove());
                }
        }
}
