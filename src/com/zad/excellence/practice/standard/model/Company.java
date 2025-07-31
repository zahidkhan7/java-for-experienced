package com.zad.excellence.practice.standard.model;

import java.util.Comparator;

public class Company implements Comparable<Company>
{
        private String companyName;
        private int noOfEmployees;
        private double revenue;

        public Company(String name, int employees, double rev)
        {
                this.setNoOfEmployees(employees);
                this.setCompanyName(name);
                this.revenue = rev;
        }

        public String toString()
        {
                return "Company Details : " + this.companyName + " "
                                + this.noOfEmployees + " " + this.revenue;
        }

        public String getCompanyName()
        {
                return companyName;
        }

        public void setCompanyName(String companyName)
        {
                this.companyName = companyName;
        }

        public int getNoOfEmployees()
        {
                return noOfEmployees;
        }

        public void setNoOfEmployees(int noOfEmployees)
        {
                this.noOfEmployees = noOfEmployees;
        }

        public double getRevenue()
        {
                return revenue;
        }

        public void setRevenue(double revenue)
        {
                this.revenue = revenue;
        }

        @Override
        public int compareTo(Company company)
        {
                return this.getCompanyName()
                                .compareToIgnoreCase(company.getCompanyName());
        }

        /*
         * Anonymous Inner Static Class is another way to create for
         * Custom Comparator implementation
         */
        public static final Comparator<Company> employeeCountComparator = new Comparator<Company>()
        {
                @Override
                public int compare(Company comp1, Company comp2)
                {
                        return comp1.getNoOfEmployees() - comp2.getNoOfEmployees();
                }
        };
        /*
         * Anonymous Inner Static Class is another way to create for
         * Custom Comparator implementation
         */
        public static final Comparator<Company> revenueComparator = new Comparator<Company>()
        {
                @Override
                public int compare(Company company1, Company company2)
                {
                        return company1.getRevenue() == company2.getRevenue() ? 0
                                        : company1.getRevenue() > company2.getRevenue() ? 1 : -1;
                }
        };
}
