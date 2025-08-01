package com.zad.excellence.practice.standard.model;

public class Person
{
        private String name;
        private int age;

        public Person(String name, int age)
        {
                this.name = name;
                this.age = age;
        }

        public String toString()
        {
                return "Person Details: " + this.name + ":" + this.age;
        }

        public int getAge()
        {
                return age;
        }

        public void setAge(int age)
        {
                this.age = age;
        }

        public String getName()
        {
                return name;
        }

        public void setName(String name)
        {
                this.name = name;
        }
}
