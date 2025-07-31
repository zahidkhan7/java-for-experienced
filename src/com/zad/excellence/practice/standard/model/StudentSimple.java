package com.zad.excellence.practice.standard.model;

public class StudentSimple
{
        private int studentId;
        private String studentName;
        private int age;
        private double grade;

        public StudentSimple(int id, String name, int age, double grade)
        {
                this.studentId = id;
                this.studentName = name;
                this.age = age;
                this.grade = grade;
        }

        public StudentSimple()
        {
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

        @Override
        public String toString()
        {
                return "studentId=" + studentId + ", studentName=" + studentName + ", age=" + age;
        }
}
