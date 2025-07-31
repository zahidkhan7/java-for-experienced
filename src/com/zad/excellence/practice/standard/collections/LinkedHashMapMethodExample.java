package com.zad.excellence.practice.standard.collections;

import java.util.LinkedHashMap;
import java.util.Set;

import com.zad.excellence.practice.standard.model.Employee;
/*
 * LinkedHashMap Example and internal Working :
 * http://www.thejavageek.com/2016/06/05/working-linkedhashmap-java/
 * http://www.devinline.com/2015/03/how-linkedhashmap-works-internally.html
 * 
 */

public class LinkedHashMapMethodExample
{
        public static void main(String args[])
        {
                LinkedHashMapMethodExample instance = new LinkedHashMapMethodExample();
                instance.usingCustomObjectAsKeyForLinkedHashMapExample();
        }

        // Works Similar like HashMap but as it stores data as per insertion order
        // by default, hence it maintains head and tail.
        public void basicMethodOperationOfLinkedHashMap()
        {
                LinkedHashMap<String, String> linkedMap = new LinkedHashMap<String, String>();
                linkedMap.put("one", "This is first element");
                linkedMap.put("two", "This is second element");
                linkedMap.put("third", "this element inserted at 3rd position");
                linkedMap.put("four", "this element inserted at fourth position");
                System.out.println(linkedMap);
                System.out.println(
                                "Getting value for key 'one': " + linkedMap.get("one"));
                System.out.println("Size of the map: " + linkedMap.size());
                System.out.println("Is map empty? " + linkedMap.isEmpty());
                System.out
                                .println("Contains key 'two'? " + linkedMap.containsKey("two"));
                System.out.println("Contains value 'This is first element'? "
                                + linkedMap.containsValue("This is first element"));
                System.out.println("delete element 'one': " + linkedMap.remove("one"));
                System.out.println(linkedMap);
        }

        // By Default LinkedHashMap is maintain insertion order:
        // Passing true value make the LinkedHashMap as access order: Means LRU
        // ( least Recent used)
        public void exampleOfLinkedHashMapMaintainAccessOrder()
        {
                LinkedHashMap<String, String> cities = new LinkedHashMap<String, String>(
                                10, 0.75f, true);
                cities.put("Mumbai", "Mumbai");
                cities.put("Pune", "Pune");
                cities.put("Nashik", "Nashik");
                cities.get("Mumbai");
                cities.forEach((key, value) -> {
                        System.out.println("Key:" + key + ", Value:" + value);
                });
        }

        public void standardMethodOperationOfLinkedHashMap()
        {
                LinkedHashMap<String, String> linkedMap = new LinkedHashMap<String, String>();
                linkedMap.put("one", "This is first element");
                linkedMap.put("two", "This is second element");
                linkedMap.put("third", "this element inserted at 3rd position");
                linkedMap.put("four", "this element inserted at fourth position");
                System.out.println(linkedMap);
                Set<String> keys = linkedMap.keySet();
                for (String key : keys)
                {
                        System.out.println(key + " -- " + linkedMap.get(key));
                }
                System.out.println("Map contains value 'This is first element'? "
                                + linkedMap.containsValue("This is first element"));
        }

        public void usingCustomObjectAsKeyForLinkedHashMapExample()
        {
                LinkedHashMap<Employee, String> linkedMap = new LinkedHashMap<Employee, String>();
                linkedMap.put(new Employee(16255, "Zahid", "Khan"), "Nisum Consulting");
                linkedMap.put(new Employee(16256, "Jamal", "Hussain"), "Cognizent");
                linkedMap.put(new Employee(16257, "Noman", "Khan"), "PNB Bank ");
                linkedMap.put(null, "Tata Consultancy");
                Set<Employee> keys = linkedMap.keySet();
                for (Employee emp : keys)
                {
                        System.out.println(linkedMap.get(emp));
                }
                System.out.println("=====HashMap After modification:======");
                Employee duplicate = new Employee(16257, "Zahid", "Khan");
                // linkedMap.put(duplicate, "DUPLICATE VALUE");
                Set<Employee> tempSet = linkedMap.keySet();
                for (Employee emp : tempSet)
                {
                        System.out.println(linkedMap.get(emp));
                }
                System.out.println("=====LinkedHashMap get value using key:======");
                System.out.println(linkedMap.get(duplicate));
                System.out
                                .println("======LinkedHashMap Before removing :=============");
                Set<Employee> tempSet1 = linkedMap.keySet();
                for (Employee emp : tempSet1)
                {
                        System.out.println(linkedMap.get(emp));
                }
                System.out.println(linkedMap.remove(duplicate));
                System.out.println("======LinkedHashMap after removing :=============");
                Set<Employee> tempSet2 = linkedMap.keySet();
                for (Employee emp : tempSet2)
                {
                        System.out.println(linkedMap.get(emp));
                }
        }
}
