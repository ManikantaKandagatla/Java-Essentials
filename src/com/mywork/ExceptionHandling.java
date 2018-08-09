/**
 * 
 */
package com.mywork;

/**
 * @author ManiKanta Kandagatla
 *
 */

class MyCustomException extends Exception
{
    public String message;

    MyCustomException(String message)
    {
        super(message);
    }
}


public class ExceptionHandling
{

    public ExceptionHandling()
    {
    }

    public static void throwCustomExceptionGeneric() throws Exception
    {
        throw new MyCustomException("Exception is being thrown from function generic");
    }
    
    
    public static void ExceptionWithReturnType() throws MyCustomException
    {
        throw new MyCustomException("I am throwing an exception");
        
    }
        
    public static int returnException() throws MyCustomException
    {
        try
        {
            ExceptionWithReturnType();
        }
        catch(MyCustomException e)
        {
            throw e;
        }
        finally
        {
            System.out.println("Returning from function after exception is handled");
            return 1;
        }
    }
    
    public static void throwCustomExceptionSpecific() throws MyCustomException
    {
        throw new MyCustomException("Exception is being thrown from function specific");
    }

    public static void main(String[] args) throws Exception
    {
        try
        {
//            try
//            {
//                throwCustomExceptionSpecific();
//            }
//            catch (MyCustomException e)
//            {
//                System.out.println(e.getMessage());
//            }
//            try
//            {
//                throwCustomExceptionGeneric();
//            }
//            catch (MyCustomException e)
//            {
//                System.out.println(e.getMessage());
//            }
//            throwCustomExceptionGeneric();
            
            int a = -1;
            try
            {
                a = returnException();
            }
            catch(MyCustomException me)
            {
                
            }
            finally
            {
                System.out.println("Variable a value: "+ a);
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }

}
