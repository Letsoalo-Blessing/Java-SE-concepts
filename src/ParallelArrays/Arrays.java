/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParallelArrays;

/**
 *
 * @author Reverside
 */

//import java.util.Arrays;

public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {9, 20, 60, 88, 12};

        for (int i : arr) {

            System.out.print(i + " ");
        }

//        Arrays.parallelSort(arr);
        System.out.print("\n");
        for (int i : arr) {

            System.out.print(i + " ");
        }
    }

}
