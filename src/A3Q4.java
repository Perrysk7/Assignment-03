/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Parry Katodia
 */
public class A3Q4 {
    // counting sort method 
    public void countSort(int[]array){
        // create an array (tracker of the numbers)
        int[] tracker = new int[101]; 
        // start the tracting position from 0
        int pos = 0; 
        // create a for loop to go through the array and add one if a num is in it's right position  
        for(int i = 0; i < array.length; i++){
            tracker[array[i]]++; 
        }
        // create a for loop to go through the array
        for(int i = 0; i < tracker.length; i++){
            for(int x = 0; x < tracker[i]; x++){
                array[pos] = i; 
                pos++; 
            }
        }
        
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Test 
        A3Q4 test = new A3Q4(); 
        // making an array of random nums
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            // make a random number
            numbers[i] = (int) (Math.random() * 101);
        }
        // print (before)
        System.out.println("Before:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        // call the sorting method 
        test.countSort(numbers);
        System.out.println("----------------");
        // print (after)
        System.out.println("After: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }    
    }  
}
