package com.mywork;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * @author Manikanta Kandagatla
 *
 */
class Employee
{
    String name;

    int age;

    public Employee(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
}

class Student implements Comparable
{
    String name;

    int age;

    public Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    
//    @Override
//    public int hashCode()
//    {
//        final int prime = 31;
//        int result = 1;
//        result = prime * result + age;
//        result = prime * result + ((name == null) ? 0 : name.hashCode());
//        return result;
//    }
    
    @Override
    public boolean equals(Object o)
    {
        Student s= (Student) o;
        return this.name.equalsIgnoreCase(s.name) && this.age == s.age;
    }

    @Override
    public int compareTo(Object o)
    {
        // TODO Auto-generated method stub
        return 0;
    }

//    @Override
//    public int compareTo(Object o)
//    {
//        return 0;
//    }
}

public class HashMapUsage
{
    public HashMapUsage()
    {
        // TODO Auto-generated constructor stub
    }

    public static void checkHashCode()
    {
        Employee e1 = new Employee("kmk", 20);
        Employee e2 = new Employee("kmk", 20);
        HashMap<Employee, Integer> empMap = new HashMap<Employee, Integer>();
        empMap.put(e1, 1);
        empMap.put(e2, 1);
        System.out.println("With hashCode override Size: " + empMap.size());

    }

    public static void checkEquals()
    {
        Student s1 = new Student("kmk", 20);
        Student s2 = new Student("kmk", 20);
        Student s3 = new Student("kmk", 24);
        Student s4 = new Student("kmk", 21);
        HashMap<Student, Integer> studentMap = new HashMap<Student, Integer>();
        studentMap.put(s1, 1);
        studentMap.put(s2, 1);
        studentMap.put(s3, 1);
        studentMap.put(s4, 1);
        
        Comparator<Student> nameComparator = new Comparator<Student>(){

            @Override
            public int compare(Student o1, Student o2)
            {
                int diff = o1.name.compareTo(o2.name);
                return  diff == 0? (o1.age > o2.age? 1: 0 ): diff ;
            }
        };
        
        TreeSet<Student> stSet = new TreeSet<Student>(nameComparator);
        stSet.add(s1);
        stSet.add(s2);
        stSet.add(s3);
        stSet.add(s4);
        //System.out.println("With Equals override Size: " + studentMap.size());
        System.out.println("With Equals override Size: " +stSet+" " + stSet.size());

    }

    public static void main(String[] args)
    {
        checkHashCode();
        checkEquals();
    }

}
