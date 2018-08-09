package com.mywork;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @author Manikanta Kandagatla
 *
 */
class EvenList<Integer> implements Iterable<Integer>
{
    private Integer[] array;

    private int size;

    public EvenList(Integer[] arr)
    {
        this.array = arr;
        this.size = arr.length;
    }

    @Override
    public Iterator iterator()
    {
        Iterator<Integer> it = new Iterator<Integer>()
        {

            private int currentIndex = 0;

            @Override
            public boolean hasNext()
            {
                while (currentIndex < size && ((int) array[currentIndex] & 1) == 1)
                {
                    currentIndex++;
                }
                return currentIndex < size && array[currentIndex] != null;
            }

            @Override
            public Integer next()
            {
                return array[currentIndex++];
            }

            @Override
            public void remove()
            {
                throw new UnsupportedOperationException();
            }
        };
        return it;
    }

}

public class CustomIterator
{
    public void runTestCases()
    {
        Integer[][] testCases = { { 1, 2, 3, 4, 5, 6 }, { 2, 4, 6, 8 }, { 1, 5, 3, 7 } };
        for (int i = 0; i < testCases.length; i++)
        {
            System.out.println("#######################################################");
            System.out.println("Input: " + Arrays.toString(testCases[i]));
            System.out.print("Even Numbers: ");
            printEvenNumbers(testCases[i]);
            System.out.println("");
        }
    }

    public void printEvenNumbers(Integer[] is)
    {
        EvenList<Integer> evenList = new EvenList<Integer>(is);
        for (Integer evenNumber : evenList)
        {
            System.out.print(evenNumber + " ");
        }
    }

    public static void main(String[] args)
    {
        CustomIterator testObj = new CustomIterator();
        testObj.runTestCases();
    }

}
