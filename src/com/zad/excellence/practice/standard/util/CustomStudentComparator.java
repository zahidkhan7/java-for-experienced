package com.zad.excellence.practice.standard.util;

import java.util.Comparator;

import com.zad.excellence.practice.standard.model.StudentSimple;

public class CustomStudentComparator
{
        /*
         * Inner Static Class is one way to create for Custom Comparator implementation
         */
        public static Comparator<StudentSimple> SortByName = new Comparator<StudentSimple>()
        {
                public int compare(StudentSimple std1, StudentSimple std2)
                {
                        return std1.getStudentName().compareToIgnoreCase(std2.getStudentName());
                }
        };
        public static Comparator<StudentSimple> SortByAge = new Comparator<StudentSimple>()
        {
                public int compare(StudentSimple std1, StudentSimple std2)
                {
                        return std1.getAge() > std2.getAge() ? 1 : -1;
                }
        };
}
