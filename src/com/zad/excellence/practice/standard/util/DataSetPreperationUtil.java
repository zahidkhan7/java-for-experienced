package com.zad.excellence.practice.standard.util;

import java.util.ArrayList;
import java.util.List;

import com.zad.excellence.practice.standard.model.Customer;
import com.zad.excellence.practice.standard.model.Employee;
import com.zad.excellence.practice.standard.model.Person;
import com.zad.excellence.practice.standard.model.StudentWithComparable;
import com.zad.excellence.practice.standard.model.StudentSimple;

public class DataSetPreperationUtil
{
        public static List<StudentWithComparable> buildStudentList()
        {
                List<StudentWithComparable> studentCollection = new ArrayList<StudentWithComparable>();
                StudentWithComparable student1 = new StudentWithComparable(101, "Mohan", 7, 6.4);
                studentCollection.add(student1);
                StudentWithComparable student2 = new StudentWithComparable(102, "Danish", 8, 8.4);
                studentCollection.add(student2);
                StudentWithComparable student3 = new StudentWithComparable(111, "Mahreen", 6, 8.4);
                studentCollection.add(student3);
                StudentWithComparable student4 = new StudentWithComparable(108, "Shohan", 12, 7.4);
                studentCollection.add(student4);
                StudentWithComparable student5 = new StudentWithComparable(128, "Rakesh", 18, 5.4);
                studentCollection.add(student5);
                StudentWithComparable student6 = new StudentWithComparable(118, "Raghavendra", 16, 6.8);
                studentCollection.add(student6);
                return studentCollection;
        }

        public static List<Person> buildPersonList()
        {
                List<Person> personCollection = new ArrayList<Person>();
                Person person1 = new Person("Mohan", 22);
                personCollection.add(person1);
                Person person2 = new Person("Danish", 34);
                personCollection.add(person2);
                Person person3 = new Person("Mahreen", 32);
                personCollection.add(person3);
                Person person4 = new Person("Shohan", 26);
                personCollection.add(person4);
                Person person5 = new Person("Rakesh", 37);
                personCollection.add(person5);
                Person person6 = new Person("Raghavendra", 28);
                personCollection.add(person6);
                return personCollection;
        }

        public static List<StudentSimple> buildStudent1List()
        {
                List<StudentSimple> studentCollection = new ArrayList<StudentSimple>();
                StudentSimple student1 = new StudentSimple(101, "Mohan", 7, 6.4);
                studentCollection.add(student1);
                StudentSimple student2 = new StudentSimple(102, "Danish", 8, 8.4);
                studentCollection.add(student2);
                StudentSimple student3 = new StudentSimple(111, "Mahreen", 6, 8.4);
                studentCollection.add(student3);
                StudentSimple student4 = new StudentSimple(108, "Shohan", 12, 7.4);
                studentCollection.add(student4);
                StudentSimple student5 = new StudentSimple(128, "Rakesh", 18, 5.4);
                studentCollection.add(student5);
                StudentSimple student6 = new StudentSimple(118, "Raghavendra", 16, 6.8);
                studentCollection.add(student6);
                return studentCollection;
        }

        public List<String> buildListOfNames()
        {
                List<String> stringCollection = new ArrayList<String>();
                stringCollection.add("Danish");
                stringCollection.add("Imran");
                stringCollection.add("Javed");
                stringCollection.add("Rajesh");
                stringCollection.add("Jagan");
                stringCollection.add("Shahid");
                return stringCollection;
        }

        /**** Helper Method #1 - This Method Prepares Employee List ****/
        public static List<Employee> buildListOfEmployee()
        {
                List<Employee> employees = new ArrayList<Employee>();
                employees.add(new Employee(105, "Harry", "Shocking"));
                employees.add(new Employee(108, "Daniel", "Wood"));
                employees.add(new Employee(110, "Lucifer", "Column"));
                employees.add(new Employee(102, "Aprilus", "Mark"));
                employees.add(new Employee(104, "Toby", "Sen"));
                employees.add(new Employee(105, "Harry ", "Poter"));
                employees.add(new Employee(102, "Aprilus ", "Poter"));
                return employees;
        }

        public static List<Customer> buildCustomerList()
        {
                List<Customer> customerList = new ArrayList<Customer>();
                customerList.add(
                                new Customer(105, "Harry", "Shocking@abc.com", 8974758724L));
                customerList
                                .add(new Customer(108, "Daniel", "Wood@abc.com", 8972358724L));
                customerList.add(
                                new Customer(110, "Lucifer", "Column@abc.com", 8912758724L));
                customerList
                                .add(new Customer(102, "Aprilus", "Mark@abc.com", 8974758224L));
                customerList.add(new Customer(104, "Toby", "Sen@abc.com", 8974758334L));
                customerList
                                .add(new Customer(105, "Harry ", "Poter@abc.com", 8974758744L));
                return customerList;
        }
}
