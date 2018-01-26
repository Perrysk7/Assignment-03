/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Parry Katodia
 */
public class A3Q3 {
    // method counting ones in an array 
    public int countOnes(int[]array){
        // start off the counter by setting it equal to zero
        int counter = 0; 
        // create a for loop to go through the array 
        for(int i = 0; i < array.length; i++){
            // add one if the array has a one
            if(array[i] == 1){
                counter++; 
            }
        }
        return counter; 
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // test 
        A3Q3 test = new A3Q3(); 
        // array 
        int[] nums = {1,0,1,1,1,0,0,1,0,0,1}; 
        // call the count method
        int countOnes = test.countOnes(nums); 
        // print 
        System.out.println("There are " + countOnes + " ones in the array");  
    } 
}
