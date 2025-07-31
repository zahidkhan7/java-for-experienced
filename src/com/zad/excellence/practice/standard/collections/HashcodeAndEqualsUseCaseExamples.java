package com.zad.excellence.practice.standard.collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import com.zad.excellence.practice.standard.model.Employee;
import com.zad.excellence.practice.standard.model.Person;
import com.zad.excellence.practice.standard.model.StudentWithComparable;
import com.zad.excellence.practice.standard.util.DataSetPreperationUtil;
/* Java Collection good URL:
     https://www.edureka.co/blog/java-collections/  
    */

public class HashcodeAndEqualsUseCaseExamples
{
        public static void main(String args[])
        {
                HashcodeAndEqualsUseCaseExamples instance = new HashcodeAndEqualsUseCaseExamples();
                instance.collectionOfStudentWithoutHashCodeAndEqualsMethodOverRidden();
                // instance.removeObjectFromCollectionWithoutHashCodeAndEqulasOverRidden();
                // instance.removeObjectFromCollectionWithHashCodeAndEqulasOverRidden();
        }
        /*
         * Code example showing impact of Hashcode implementation
         * Since HashSet compare object for equality before adding object to HashSet
         * When we have no implementation to hashCode and equals methods below
         * hashSet example stores all the entry since the HashCode for all object
         * are different But when we implement hashCode and equals methods based on
         * employeeId in Employee object it can only store different Object of
         * Employee and therefore store only 3 entries.
         */

        public void collectionOfStudentWithoutHashCodeAndEqualsMethodOverRidden()
        {
                System.out.println(
                                "========= Set of collection of Student Without Haschcode and Equals method Overridden ============= ");
                List<StudentWithComparable> studentList = DataSetPreperationUtil.buildStudentList();
                System.out.println(
                                "Total Student Present in List :" + studentList.size());
                Collection<StudentWithComparable> studentSet = new HashSet<StudentWithComparable>();
                for (StudentWithComparable student : studentList)
                {
                        studentSet.add(student);
                }
                System.out.println(
                                "Total Student Present in Collected Set :" + studentSet.size());
                System.out.println(
                                "============= Student Present in Collected Set =============");
                studentSet.forEach(student -> System.out.println(student));
        }

        public void collectionOfEmployeeWithHashCodeAndEqualsMethodOverRidden()
        {
                System.out.println(
                                "========= Set of collection of Employee With Haschcode and Equals method Overridden ============= ");
                List<Employee> employeeList = DataSetPreperationUtil
                                .buildListOfEmployee();
                System.out.println(
                                "Total Employee Present in List :" + employeeList.size());
                Collection<Employee> employeeSet = new HashSet<Employee>();
                for (Employee employee : employeeList)
                {
                        employeeSet.add(employee);
                }
                System.out.println("Total Employee Present in Collected Set :"
                                + employeeSet.size());
                employeeSet.forEach(value -> System.out.println(value));
        }

        /*
         * Here Hashcode of newly Created Object is not Mapped with existing Object
         * with same Data in Collection:
         */
        public void removeObjectFromCollectionWithoutHashCodeAndEqulasOverRidden()
        {
                List<Person> personList = DataSetPreperationUtil.buildPersonList();
                Person person3 = new Person("Mahreen", 32);
                System.out.println("Total Person Present in List before Removal :"
                                + personList.size());
                personList.remove(person3);
                System.out.println("Total Person Present in List after Removal :"
                                + personList.size());
                List<StudentWithComparable> studentList = DataSetPreperationUtil.buildStudentList();
                StudentWithComparable student3 = new StudentWithComparable(111, "Mahreen", 6, 8.4);
                System.out.println("Total Student Present in List before Removal :"
                                + studentList.size());
                studentList.remove(student3);
                System.out.println("Total Student Present in List After removal:"
                                + studentList.size());
        }

        /*
         * Here Hashcode of newly Created Object is not Mapped with existing Object
         * with same Data in Collection:
         */
        public void removeObjectFromCollectionWithHashCodeAndEqulasOverRidden()
        {
                List<Employee> employeeList = DataSetPreperationUtil
                                .buildListOfEmployee();
                Employee employee = new Employee(110, "Lucifer", "Column");
                System.out.println("Total Employee Present in List before Removal :"
                                + employeeList.size());
                employeeList.remove(employee);
                System.out.println("Total Employee Present in List After removal:"
                                + employeeList.size());
        }

        public void addingDuplicateEmployeeInHashSet()
        {
                System.out.println("===============================");
                Collection<Employee> employeeSet = new HashSet<Employee>();
                employeeSet.add(new Employee(16255, "Zahid", "Khan"));
                employeeSet.add(new Employee(16256, "Naureen", "Zafar"));
                employeeSet.add(new Employee(16257, "Jamal", "Hussain"));
                
                System.out.println("Print Data bofore Adding ");
                
                employeeSet.forEach(value -> System.out.println(value.toString()));
                Employee duplicate = new Employee(16257, "Shahid", "Hussain");
                
                System.out.println("================No Change in Data Due to HashCode And Equals Implemenation===============");
                employeeSet.add(duplicate);
                
                System.out.println("Print Data After Adding ");
                employeeSet.forEach(value -> System.out.println(value.toString()));
                
                System.out.println(employeeSet.contains(duplicate));
                System.out.println(employeeSet.remove(duplicate));
        }
}
