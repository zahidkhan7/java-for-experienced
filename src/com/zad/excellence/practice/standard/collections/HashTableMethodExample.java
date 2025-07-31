package com.zad.excellence.practice.standard.collections;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.zad.excellence.practice.standard.model.Employee;

public class HashTableMethodExample
{
        public static void main(String args[])
        {
                HashTableMethodExample instance = new HashTableMethodExample();
                // instance.basicMethodOperationOfHashTable();
                // instance.standardMethodOperationOfHashTable();
                instance.usingCustomObjectAsKeyForHashTableExample();
        }

        /*
         * HashTable and HashMap both works exactly same only HashTable methods are
         * Synchronized but not HashMap methods
         */
        public void basicMethodOperationOfHashTable()
        {
                Hashtable<String, String> hashTableData = new Hashtable<String, String>();
                hashTableData.put("first", "FIRST INSERTED");
                hashTableData.put("second", "SECOND INSERTED");
                hashTableData.put("third", "THIRD INSERTED");
                System.out.println(hashTableData);
                System.out.println(
                                "Value of key 'second': " + hashTableData.get("second"));
                System.out.println("Is Hashtable empty? " + hashTableData.isEmpty());
                hashTableData.remove("third");
                System.out.println(hashTableData);
                System.out.println("Size of the Hashtable: " + hashTableData.size());
        }

        public void standardMethodOperationOfHashTable()
        {
                Hashtable<String, String> hashTableData = new Hashtable<String, String>();
                hashTableData.put("first", "FIRST INSERTED");
                hashTableData.put("second", "SECOND INSERTED");
                hashTableData.put("third", "THIRD INSERTED");
                Set<String> keys = hashTableData.keySet();
                Iterator<String> itr = keys.iterator();
                while (itr.hasNext())
                {
                        System.out.println(hashTableData.get(itr.next()));
                }
                for (String key : keys)
                {
                        System.out.println(hashTableData.get(key));
                }
                System.out.println("Copy Data from HashMap:");
                HashMap<String, String> dataMap = new HashMap<String, String>();
                dataMap.put("firstCopy", "FIRST INSERTED");
                dataMap.put("secondCopy", "SECOND INSERTED");
                hashTableData.putAll(dataMap);
                Set<String> keysCopy = hashTableData.keySet();
                for (String key : keysCopy)
                {
                        System.out.println(hashTableData.get(key));
                }
                System.out.println(hashTableData.containsKey("first"));
                System.out.println(hashTableData.containsValue("SECOND "));
                Set<Entry<String, String>> entrySet = hashTableData.entrySet();
                System.out.println("Use Of Enumeration in HashTable");
                Enumeration<String> elements = hashTableData.elements();
                while (elements.hasMoreElements())
                {
                        System.out.println(elements.nextElement());
                }
        }

        /*
         * We can Use Custom Object as Key in HashTable as well in HashMap:The rule
         * Our Custom Object should override HashCode and Equals method to check
         * equality for two object. Two Object hashcode can be same.
         */
        public void usingCustomObjectAsKeyForHashTableExample()
        {
                Hashtable<Employee, String> hashTableData = new Hashtable<Employee, String>();
                hashTableData.put(new Employee(16255, "Zahid", "Khan"),
                                "Nisum Consulting");
                hashTableData.put(new Employee(16256, "Jamal", "Hussain"), "Cognizent");
                hashTableData.put(new Employee(16257, "Noman", "Khan"), "PNB Bank ");
                Set<Employee> keys = hashTableData.keySet();
                for (Employee emp : keys)
                {
                        System.out.println(hashTableData.get(emp));
                }
        }
}
