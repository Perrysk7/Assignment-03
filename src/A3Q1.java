/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Parry Katodia
 */
public class A3Q1 {
    
    // create a swap method 
     public static void swap(int[] array, int p1, int p2) {
        // swap
        int temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;
    }
    // Efficient selection sorting 
    public void selectionSort(int[] array) {
        // creating a for loop to find the first lowest first value
        for(int position = 0; position < array.length; position++){
            // lowest value and it's position 
            int lowestValue = position; 
            // create another for loop to find the following smallest numbers 
            for(int i = position + 1; i < array.length; i++){
                // found he smaller number? 
                if(array[position] > array[i]){
                    // assigning the lowest value 
                    lowestValue = i; 
                    // if the lowest num is less than position
                    if(array[position] > array[lowestValue]){
                        // swap the numbers
                        swap(array, position, lowestValue);
                    }
                }
            }
        }   
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // test
        A3Q1 test = new A3Q1(); 
        // array of random integers 
        int[] nums = new int[10]; 
        // create a for loop to add numbers to the array
        for(int i = 0; i < nums.length; i++){
            // randomly generating numbers
            nums[i] = (int)(Math.random()*20); 
        }
        // Before 
        System.out.println("Before: ");
        for (int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
        // call the sorting method 
        test.selectionSort(nums);
        // After 
        System.out.println("After: ");
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }    
    } 
}
