/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort;

/**
 * InsertionSort
 * 
 * 
 * 
 * Adapted From: 
 * "Introduction to Java: Programming and Data Structures, 11th Edition" by Y. Daniel Liang
 * 
 * @author jrcro
 */
public class InsertionSort {
    
    
    public static int[] InsertionSort(int[] array){
        
        for (int x = 1 ; x < array.length ; x++)
        {
            int currentElement = array[x];
            
            int y;
            for (y = x - 1 ; y >= 0 && array[y] > currentElement ; y--){
                
                array[y + 1] = array[y];
            }
            
            array[y + 1] = currentElement;
        }

        return array;
    }
}
