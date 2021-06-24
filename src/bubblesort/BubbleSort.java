/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

/**
 *
 * @author jrcro
 */
public class BubbleSort {
    
    public static int[] BubbleSort(int [] array)
    {
        int temp;
        
        for (int x = 1 ; x < array.length ; x++)
        {
            for (int y = 0 ; y < array.length ; y++)
            {
                temp = array[y+1];
                array[y+1] = array[y];
                array[y] = temp;
                
            }   
        }
        
        return array;
    }
    
    public static int[] BubbleSortImproved(int [] array)
    {
        int temp;
        boolean needNextPass = true;
        for (int x = 1 ; x < array.length && needNextPass; x++)
        {
            needNextPass = false;
            for (int y = 0 ; y < array.length ; y++)
            {
                if(array[y] > array[y+1])
                {
                    temp = array[y+1];
                    array[y+1] = array[y];
                    array[y] = temp;
                    needNextPass = true;
                }

                
            }   
        }
        
        return array;
    }
    
}
