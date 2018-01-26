/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Parry Katodia
 */
public class A3Q5 {
    // create a swap method for strings
    public void swap(String[] array, int p1, int p2){
        // swap
        String temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;
    }
    // create a method to sort strings in alphabetical order 
    public void insertionSort (String[] array){
        // create a for loop to go through the array 
        for(int i = 0; i < array.length; i++){
            // store the position 
            int pos = i; 
            // compare the strings 
            while (pos >= 0 && array[pos].compareTo(array[pos + 1])>0){
                // if they are not in the correct position, swap until...
                swap(array, pos, pos + 1); 
                // subtract one from the position
                pos--;
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // test 
        A3Q5 test = new A3Q5(); 
        // make an array of random strings
        String[] array = new String[5]; 
        // list of the strings
        array[0] = "dsf";
        array[1] = "dbs";
        array[2] = "cml";
        array[3] = "zxy";
        array[4] = "pot";
        
        // call the method
        test.insertionSort(array);
        // print the sorted array 
        System.out.println("Sorted: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }    
    }
}
     
