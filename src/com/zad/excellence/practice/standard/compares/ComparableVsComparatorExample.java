package com.zad.excellence.practice.standard.compares;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.zad.excellence.practice.standard.model.Employee;
import com.zad.excellence.practice.standard.model.StudentWithComparable;
import com.zad.excellence.practice.standard.model.StudentSimple;
import com.zad.excellence.practice.standard.util.CustomStudentComparator;
import com.zad.excellence.practice.standard.util.DataSetPreperationUtil;
// Comparable interface can be used to provide single way of sorting 
// whereas Comparator interface is used to provide different ways of sorting 

public class ComparableVsComparatorExample
{
        public static void main(String args[])
        {
                ComparableVsComparatorExample instance = new ComparableVsComparatorExample();
                // instance.sortStudentCollectionUsignComparable();
                // instance.sortStudentBasedOnDiffentFields();
                instance.createTreeOfStudents();
                // instance.sortEmployeeBasedOnDifferentFields();
        }
        /*
         * Sort Student on Default comparison using Comparable : Sorting internally uses
         * to compare different Object
         * If Our Custom Object has not been implemented Comparable interface we can not
         * sort that.
         */

        public void sortStudentCollectionUsignComparable()
        {
                List<StudentWithComparable> studentList = DataSetPreperationUtil.buildStudentList();
                Collections.sort(studentList);
                studentList.forEach(System.out::println);
        }

        /*
         * When we want to sort our Custom object with different fields of Object
         * We should use comparator implementation and override compare(obj o1, obj o2)
         * method:
         */
        public void sortStudentBasedOnDiffentFields()
        {
                List<StudentSimple> studentList = DataSetPreperationUtil.buildStudent1List();
                Collections.sort(studentList, CustomStudentComparator.SortByName);
                System.out.println(
                                "<=================Student After Sorting By Name===============>");
                studentList.forEach(System.out::println);
                Collections.sort(studentList, CustomStudentComparator.SortByAge);
                System.out.println(
                                "<=================Student After Sorting By Age===============>");
                studentList.forEach(System.out::println);
        }

        // Create Collection of Students Order by Student Id:
        public void createTreeOfStudents()
        {
                Set<StudentWithComparable> studentTree = new TreeSet<StudentWithComparable>();
                List<StudentWithComparable> studentList = DataSetPreperationUtil.buildStudentList();
                System.out.println(
                                "<=================Student Present in List without Ordering===============>");
                studentList.forEach(System.out::println);
                System.out.println(
                                "<=================Student Inserted into TreeSet with Ordering===============>");
                studentTree.addAll(studentList);
                studentTree.forEach(System.out::println);
        }
        // Employee Sorting using Comparator

        public void sortEmployeeBasedOnDifferentFields()
        {
                List<Employee> employeeList = DataSetPreperationUtil
                                .buildListOfEmployee();
                System.out.println(
                                "<=================Employee Before Sorting ===============>");
                for (Employee emp : employeeList)
                {
                        System.out.println(emp);
                }
                Collections.sort(employeeList, Employee.firstNameComparator);
                System.out.println(
                                "<=================Employee After Sorting  based on Name ===============>");
                employeeList.forEach(System.out::println);
                System.out.println(
                                "<=================Employee After Sorting  based on EmployeeId ===============>");
                Collections.sort(employeeList, Employee.IdComparator);
                employeeList.forEach(System.out::println);
        }
}
