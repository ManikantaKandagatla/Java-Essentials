/**
 * 
 */
package com.mywork;

/**
 * @author Manikanta Kandagatla
 *
 */
public class InnerClasses
{
    public class InnerClass
    {
        protected int i1;

        private int i2;

        public int getSum()
        {
            return this.i1 + this.i2;
        }

    }

    private InnerClass innerClassobj;

    public InnerClasses()
    {
        this.innerClassobj = new InnerClass();
    }

    public void setInnerClassObj(int a, int b)
    {
        this.innerClassobj.i1 = a;
        this.innerClassobj.i2 = b;
    }

    public int getSum()
    {
        return this.innerClassobj.getSum();

    }

    public static void runTestCases(InnerClasses testObj)
    {
        int tcs[][] = { { 1, 2 }, { 2, 5 } };
        for (int i = 0; i < tcs.length; i++)
        {
            testObj.setInnerClassObj(tcs[i][0], tcs[i][1]);
            System.out.println("Sum : " + testObj.getSum());
        }
    }

    public static void main(String[] args)
    {
        InnerClasses testObj = new InnerClasses();
        runTestCases(testObj);
    }

}
