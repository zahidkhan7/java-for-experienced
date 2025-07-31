package com.zad.excellence.practice.standard.model;

import java.util.Comparator;

/* Explanation with example for  HashCode and Equals methods:
 * 
 * http://tutorials.jenkov.com/java-collections/hashcode-equals.html
 * 
 */
public class Employee {
	protected int employeeId;
	protected String firstName;
	protected String lastName;

	public Employee(int empId, String fname, String lname) {
		this.employeeId = empId;
		this.firstName = fname;
		this.lastName = lname;
	}

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof Employee))
			return false;
		Employee other = (Employee) obj;
		return this.employeeId == other.employeeId;
	}

	public int hashCode() {
		return (int) employeeId;
	}

	public String toString() {
		return "EmployeeId: " + this.employeeId + " " + "Employee Name : " + this.firstName + " " + this.lastName;
	}
	/*
	 * We want that equality should be defined on the basis of employeeId, firstName
	 * & lastName public boolean equals(Object o){ if(o == null) return false;
	 * if(!(o instanceof) Employee) return false;
	 * 
	 * Employee other = (Employee) o; if(this.employeeId != other.employeeId) return
	 * false; if(! this.firstName.equals(other.firstName)) return false; if(!
	 * this.lastName.equals(other.lastName)) return false;
	 * 
	 * return true; }
	 */
	/*
	 * We want that hashCode should be generated considering employeeId, firstName &
	 * lastName public int hashCode() { return (int) employeeId *
	 * firstName.hashCode() * lastName.hashCode(); }
	 */

	public static final Comparator<Employee> IdComparator = new Comparator<Employee>() {
		@Override
		public int compare(Employee emp1, Employee emp2) {
			return emp1.employeeId - emp2.employeeId;
		}
	};
	/*
	 * Anonymous Inner Static Class is another way to create for Custom Comparator
	 * implementation
	 */
	public static final Comparator<Employee> firstNameComparator = new Comparator<Employee>() {
		@Override
		public int compare(Employee emp1, Employee emp2) {
			return emp1.firstName.compareToIgnoreCase(emp2.firstName);
		}
	};
	/*
	 * Anonymous Inner Static Class is another way to create for Custom Comparator
	 * implementation
	 */
	public static final Comparator<Employee> lastNameComparator = new Comparator<Employee>() {
		@Override
		public int compare(Employee emp1, Employee emp2) {
			return emp1.lastName.compareToIgnoreCase(emp2.lastName);
		}
	};
}
