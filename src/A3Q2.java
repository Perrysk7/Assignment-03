/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Parry Katodia
 */
public class A3Q2 {
    // sort the array first 
    public void Sorting(int[]array){
        // creating a for loop to find the first lowest first value
        for(int position = 0; position < array.length; position++){
            // lowest value and it's position 
            int lowestValue = position; 
            // create another for loop to find the following smallest numbers 
            for(int x = position + 1; x < array.length; x++){
                // found he smaller number? 
                if(array[position] > array[x]){
                    // assigning the lowest value 
                    lowestValue = x; 
                    // if the lowest num is less than position
                    if(array[position] > array[lowestValue]){
                        // swap the numbers
                        int temp = array[position];
                        array[position] = array[x];
                        array[x] = temp; 
                    }
                }
            }
        }   
    }
    // create a method to find smallest missing number in an array 
     public int smallestMissingNum(int[] array) {
         // start off with 0
         int nums = 0; 
         // go through the array (to find the smallest missing number)
         for(int i = 0; i < array.length; i++){
             // if the number is found
             if(nums == array[i]){
                 nums++;
             }
         }
         return nums;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // test 
        A3Q2 test = new A3Q2();
        // array of numbers 
        int[] array = {0,3,5,1,7,11,8,10,9,2};
        // call the sort method
        test.Sorting(array);
        // display the array and then the missing number
        System.out.println("Sorted Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        // display the smallest missing number
        System.out.println("The smallest missing number is: " + test.smallestMissingNum(array));   
    }
}
