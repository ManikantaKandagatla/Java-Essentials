package com.mywork;

class Age
{
    int age;

    String name;

    public Age(int age, String name)
    {
        this.age = age;
        this.name = name;
    }
    
    public boolean equals(Age a)
    {
        return (this.age == a.age && this.name.equals(a.name));
    }
    
    public int hashCode()
    {
        return 1;
    }
}

public class HashMapBasics
{

    public HashMapBasics()
    {
    }

    public static void main(String args[])
    {
        Age a1 = new Age(24, "Kanta");
        Age a2 = new Age(24, "Kanta");
        
        System.out.println(a1.equals(a2));
    }

}
