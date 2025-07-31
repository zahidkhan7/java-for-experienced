package com.zad.excellence.practice.standard.model;

public class StudentWithComparable implements Comparable<StudentWithComparable>
{
        private int studentId;
        private String studentName;
        private int age;
        private double grade;

        public StudentWithComparable(int id, String name, int age, double grade)
        {
                this.studentId = id;
                this.studentName = name;
                this.age = age;
                this.grade = grade;
        }

        @Override
        public int compareTo(StudentWithComparable student)
        {
                return this.getStudentId() > student.getStudentId() ? 1 : -1;
        }

        public double getGrade()
        {
                return grade;
        }

        public void setGrade(double grade)
        {
                this.grade = grade;
        }

        public int getAge()
        {
                return age;
        }

        public void setAge(int age)
        {
                this.age = age;
        }

        public String getStudentName()
        {
                return studentName;
        }

        public void setStudentName(String studentName)
        {
                this.studentName = studentName;
        }

        public int getStudentId()
        {
                return studentId;
        }

        public void setStudentId(int studentId)
        {
                this.studentId = studentId;
        }

        public String toString()
        {
                return "Student ID: " + this.studentId + ": Student Name: "
                                + this.studentName;
        }
}
