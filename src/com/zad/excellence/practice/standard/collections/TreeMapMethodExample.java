package com.zad.excellence.practice.standard.collections;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

import com.zad.excellence.practice.standard.model.Employee;

public class TreeMapMethodExample
{
        public static void main(String args[])
        {
                TreeMapMethodExample instance = new TreeMapMethodExample();
                instance.standardMethodOperation();
        }

        public void standardMethodOperation()
        {
                System.out.println(
                                "================= Standard Method Operation ==============");
                TreeMap<String, String> treeMap = new TreeMap<String, String>();
                treeMap.put("first", "FIRST Data");
                treeMap.put("second", "SECOND Data");
                treeMap.put("third", "THIRD Data");
                // System.out.println(treeMap);
                Set<Entry<String, String>> entries = treeMap.entrySet();
                for (Entry<String, String> entry : entries)
                {
                        System.out.println(entry.getKey() + " ==> " + entry.getValue());
                }
                System.out.println(
                                "================= Map After Modification ==============");
                treeMap.put("third", "New Data");
                entries = treeMap.entrySet();
                for (Entry<String, String> entry : entries)
                {
                        System.out.println(entry.getKey() + " ==> " + entry.getValue());
                }
                // treeMap.clear();
        }

        // TreeMap is a Map but Same as HashMap
        public void advancedMethodExample()
        {
                System.out.println(
                                "================= TreeMap Example With Employee Object having IdComparator ==============");
                // TreeMap<Employee, String> treeMapOnId = new TreeMap<Employee,
                // String>();
                TreeMap<Employee, String> treeMapOnId = new TreeMap<Employee, String>(
                                Employee.IdComparator);
                treeMapOnId.put(new Employee(16257, "Noman", "Khan"), "PNB Bank ");
                treeMapOnId.put(new Employee(16256, "Jamal", "Hussain"), "Cognizent");
                treeMapOnId.put(new Employee(16255, "Zahid", "Khan"),
                                "Nisum Consulting");
                Set<Employee> keysOnId = treeMapOnId.keySet();
                keysOnId.forEach(value -> System.out
                                .println(value + "=" + treeMapOnId.get(value)));
                System.out.println(
                                "================= TreeMap Example with Employee Object having FirstNameComparator: ==============");
                TreeMap<Employee, String> treeMapOnName = new TreeMap<Employee, String>(
                                Employee.firstNameComparator);
                treeMapOnName.put(new Employee(16257, "Noman", "Khan"), "PNB Bank ");
                treeMapOnName.put(new Employee(16256, "Jamal", "Hussain"), "Cognizent");
                treeMapOnName.put(new Employee(16255, "Zahid", "Khan"),
                                "Nisum Consulting");
                Set<Employee> keysOnName = treeMapOnName.keySet();
                keysOnName.forEach(value -> System.out
                                .println(value + "=" + treeMapOnId.get(value)));
                System.out.println(
                                "================= TreeMap Example with Sepcific operation: =================");
                System.out.println(treeMapOnId.get(treeMapOnId.firstKey()));
                System.out.println(
                                "================= TreeMap Example with Reverse Order Operation: =================");
                NavigableMap<Employee, String> reverseMapOnId = treeMapOnId
                                .descendingMap();
                Set<Employee> keysOnReverse = reverseMapOnId.keySet();
                keysOnReverse.forEach(value -> System.out
                                .println(value + "=" + treeMapOnId.get(value)));
        }
}
