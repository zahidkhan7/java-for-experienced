package com.zad.excellence.practice.standard.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.zad.excellence.practice.standard.model.Employee;

public class HashSetVsSortedSetExamples {

    public static void main(String args[]) {
        HashSetVsSortedSetExamples instance = new HashSetVsSortedSetExamples();
        instance.comparisonOfHashSetVsSortedSetExample();

    }

    public void standardOperationOfSortedSetLikeTreeSet() {
        // Example of SortedSet below
        TreeSet<Employee> employeeSortedOnID = new TreeSet<Employee>(
                Employee.IdComparator);
        employeeSortedOnID.add(new Employee(16255, "Zahid", "Khan"));
        employeeSortedOnID.add(new Employee(16256, "Naureen", "Zafar"));
        employeeSortedOnID.add(new Employee(16257, "Jamal", "Hussain"));
        employeeSortedOnID.add(new Employee(16260, "Noman", "Hussain"));
        employeeSortedOnID.add(new Employee(16262, "Syed", "Aftab"));

        System.out.println("Print Data for SortedSet Based on ID:");
        employeeSortedOnID
                .forEach(value -> System.out.println(value.toString()));

        System.out.println("Print Data of HeadSet :");
        Set<Employee> headSet = employeeSortedOnID
                .headSet(new Employee(16257, "Zahid", "Khan"));
        headSet.forEach(value -> System.out.println(value.toString()));

        System.out.println("Print Data of TailSet :");
        Set<Employee> tailSet = employeeSortedOnID
                .tailSet(new Employee(16257, "Zahid", "Khan"));
        tailSet.forEach(value -> System.out.println(value.toString()));

        System.out.println("Print Data of Fisrt and Last :");
        System.out.println(employeeSortedOnID.first());
        System.out.println(employeeSortedOnID.last());

    }

    // comparison with HashSet and TreeSet Examples:
    public void comparisonOfHashSetVsSortedSetExample() {
        // Example of Normal Set below
        HashSet<Employee> employeeSet = new HashSet<Employee>();
        employeeSet.add(new Employee(16255, "Zahid", "Khan"));
        employeeSet.add(new Employee(16256, "Naureen", "Zafar"));
        employeeSet.add(new Employee(16257, "Jamal", "Hussain"));

        System.out.println("===Print Data for Simple HashSet: ====");
        employeeSet.forEach(value -> System.out.println(value.toString()));

        // Example of SortedSet below
        TreeSet<Employee> employeeSortedOnID = new TreeSet<Employee>(
                Employee.IdComparator);
        employeeSortedOnID.add(new Employee(16257, "Jamal", "Hussain"));
        employeeSortedOnID.add(new Employee(16255, "Zahid", "Khan"));
        employeeSortedOnID.add(new Employee(16256, "Naureen", "Zafar"));

        System.out.println("====Print Data for SortedSet Based on ID:====");

        employeeSortedOnID
                .forEach(value -> System.out.println(value.toString()));

        // Example of SortedSet below
        TreeSet<Employee> employeeSortedOnName = new TreeSet<Employee>(
                Employee.firstNameComparator);
        employeeSortedOnName.add(new Employee(16255, "Zahid", "Khan"));
        employeeSortedOnName.add(new Employee(16256, "Naureen", "Zafar"));
        employeeSortedOnName.add(new Employee(16257, "Jamal", "Hussain"));
        System.out.println("====Print Data for SortedSet Based on Name:====");

        employeeSortedOnName
                .forEach(value -> System.out.println(value.toString()));
    }

}
