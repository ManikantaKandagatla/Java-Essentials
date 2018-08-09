/**
 * 
 */
package com.mywork;

class CustomException extends Exception
{
    public CustomException(String message)
    {
        super(message);
    }
}

class Parent
{
    public void throwCustomException() throws Exception
    {
        throw new CustomException("Exception thrown from Parent class");
    }
    
    public int add(int m, int n){
        return m+n;
    }
    
    public static  void Method2()
    {
        System.out.println("Print function in Parent");
    }
    
    public static void Method1()
    {
        System.out.println("Public Static void Method1 function in Parent");
    }
}

public class A extends Parent
{

    public A()
    {
    }
    
    public static void Method2()
    {
        
    }
    
    public int add(int m,int n,int o){
        return super.add(super.add(m, n),o);
    }
    
    public void print()
    {
        System.out.println("Print function in Child");
    }
    public static void Method1()
    {
        System.out.println("Public Static void Method1 function in child");
    }
    
    public static void  Method1(int a, int b)
    {
        
    }
    
    public static void Method1(int a)
    {
        
    }
    
    public void throwCustomException() throws CustomException
    {
        throw new CustomException("Exception thrown from Parent class");
    }
    
    public void throwCustomException(String a)
    {
        System.out.println("Haiii");
    }
    
    public static void main(String[] args)
    {
        Parent parentObj = new A();
        
        A atestObj = new A();
        atestObj.Method1();
        atestObj.print();
        
        System.out.println("Add:  "+ atestObj.add(4, 5, 10));
        parentObj.Method2();
        parentObj.Method1();
    }

}






abstract class Z
{
    protected abstract void method1();
}

class Temp extends Z
{
    private void method1(int x)
    {
        
    }

    @Override
    protected void method1()
    {
        // TODO Auto-generated method stub
        
    }
    public static void main(String[] args)
    {
        Parent parentObj = new A();
        
        int a,b, c;
        b = 10;
        a = b =c =20;
        System.out.println("a" + a);
            
        int i = 0, j ; 
        for( j = 0; j< 10 ; ++j )
        {
            i++;
        }
        System.out.println("i" + i+ " "+ j);
        A atestObj = new A();
        atestObj.Method1();
        atestObj.print();
        
        
        parentObj.Method2();
        parentObj.Method1();
    }

}
