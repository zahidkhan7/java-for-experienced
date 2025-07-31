package com.zad.excellence.practice.standard.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

import com.zad.excellence.practice.standard.model.Customer;
import com.zad.excellence.practice.standard.model.StudentWithComparable;
import com.zad.excellence.practice.standard.util.DataSetPreperationUtil;
// https://www.journaldev.com/378/java-util-concurrentmodificationexception

public class ConcurrentCollectionExamples {
	public static void main(String args[]) {
		ConcurrentCollectionExamples instance = new ConcurrentCollectionExamples();
		instance.concurrentCollectionExamplesForConcurrentHashMap();
	}
	/*
	 * Concurrent Modification exception happens when Collection are modified while
	 * Iterator is created on that.
	 */

	public void concurrentModificationExceptionUsingIterator() {
		List<StudentWithComparable> studentList = DataSetPreperationUtil.buildStudentList();
		Iterator<StudentWithComparable> iterator = studentList.iterator();
		while (iterator.hasNext()) {
			StudentWithComparable student = iterator.next();
			System.out.println(student);
			studentList.add(new StudentWithComparable(112, "Raghav", 8, 8.4));
		}
		for (StudentWithComparable student : studentList) {
			System.out.println(student);
			studentList.add(new StudentWithComparable(112, "Raghav", 8, 8.4));
		}
	}

	/*
	 * enhanced for loop is nothing but a syntactic sugar over Iterator in Java:
	 * Hence for each loop behaves similar for Collection as Iterator does
	 */
	public void concurrentModificationExceptionUsingForEach() {
		List<StudentWithComparable> studentList = DataSetPreperationUtil.buildStudentList();
		for (StudentWithComparable student : studentList) {
			System.out.println(student);
			studentList.add(new StudentWithComparable(112, "Raghav", 8, 8.4));
		}
	}

	/*
	 * Take the Student List in CopyOnWriteArrayList and Then we can modify the
	 * ArrayList without any ConcurrentModification Exception
	 */
	public void concurrentCollectionExamplesForCopyOnWriteArrayList() {
		List<StudentWithComparable> studentList = DataSetPreperationUtil.buildStudentList();
		CopyOnWriteArrayList<StudentWithComparable> copyStudentList = new CopyOnWriteArrayList<StudentWithComparable>();
		copyStudentList.addAll(studentList);
		for (StudentWithComparable student : copyStudentList) {
			copyStudentList.add(new StudentWithComparable(115, "Raghav", 8, 8.4));
			System.out.println(student);
		}
	}

	/*
	 * Take the Customer List in ConcurrentHashMap and While iterating Add one more
	 * Customer to Map: This will not throw any exception like
	 * ConcurrentModification Exception
	 */
	public void concurrentCollectionExamplesForConcurrentHashMap() {
		List<Customer> customerList = DataSetPreperationUtil.buildCustomerList();
		ConcurrentHashMap<String, Customer> concurrentCustmerMap = new ConcurrentHashMap<String, Customer>();
		for (Customer cust : customerList) {
			concurrentCustmerMap.put(cust.getMailId(), cust);
		}
		Enumeration<String> keysEnum = concurrentCustmerMap.keys();
		while (keysEnum.hasMoreElements()) {
			System.out.println(concurrentCustmerMap.get(keysEnum.nextElement()));
			concurrentCustmerMap.put("115", new Customer(115, "Chary", "chary@abc.com", 8234758724L));
		}
	}
}
