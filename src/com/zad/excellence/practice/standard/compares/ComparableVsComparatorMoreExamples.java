package com.zad.excellence.practice.standard.compares;

import java.util.TreeSet;

import com.zad.excellence.practice.standard.model.Company;

public class ComparableVsComparatorMoreExamples
{
        public static void main(String args[])
        {
                ComparableVsComparatorMoreExamples instance = new ComparableVsComparatorMoreExamples();
                instance.buildListOfCompaniesInSortedOrder();
        }

        // Here To build List of Company on Sorted Order , We can use TreeSet.
        public void buildListOfCompaniesInSortedOrder()
        {
                TreeSet<Company> companySortedOnEmployeesCount = new TreeSet<Company>(
                                Company.employeeCountComparator);
                companySortedOnEmployeesCount.add(new Company("Nisum", 350, 45000));
                companySortedOnEmployeesCount
                                .add(new Company("Infosys", 42550, 12500000));
                companySortedOnEmployeesCount
                                .add(new Company("RazorSight", 300, 32000));
                companySortedOnEmployeesCount.add(new Company("HCL", 35000, 4500000));
                System.out.println(
                                "==========Print Data for SortedSet Based on Employee Count:===============");
                companySortedOnEmployeesCount.forEach(data -> System.out.println(data));
                // Revenue is in Lakhs of Dollar
                TreeSet<Company> companySortedOnRevenue = new TreeSet<Company>(
                                Company.revenueComparator);
                companySortedOnRevenue.add(new Company("Nisum", 350, 45000));
                companySortedOnRevenue.add(new Company("Infosys", 42550, 12500000));
                companySortedOnRevenue.add(new Company("RazorSight", 300, 32000));
                companySortedOnRevenue.add(new Company("HCL", 35000, 4500000));
                System.out.println(
                                "===============Print Data for SortedSet Based on Company Revenue:============");
                companySortedOnRevenue.forEach(data -> System.out.println(data));
        }
}
