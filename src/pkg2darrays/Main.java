/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2darrays;

/**
 *
 * @author celeb
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] TwoDArray;
        TwoDArray = new int[5][7]; // 5 rows and 7 columns
        
        int[][] AnotherArray = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12} }; // 4x3
        
        int[][] JaggedArray = { {1, 2, 3}, {4, 5}, {6, 7, 8, 9} };
        
        int[][] NotSpecifyingSizes = new int[5][];
        
        System.out.println(AnotherArray[1][0]); // 4
        System.out.println(TwoDArray[1][0]); // 0 (int default value)
//        System.out.println(NotSpecifyingSizes[1][0]); // Second (inner) array is unallocated, so there is nothing to read.
        
        double[] doubleArray = new double[10];
        System.out.println(doubleArray[4]);
        
        boolean[] booleanArray = new boolean[10];
        System.out.println(booleanArray[4]);
        
        char[] charArray = new char[6];
        System.out.println(charArray[3]);
        
        String[] stringArray = new String[10];
        System.out.println(stringArray[4]);
        
        /*
        Nested loops
        */
        
        System.out.println(AnotherArray);
        
        for (int row=0; row<AnotherArray.length; row++) { // use AnotherArray.length instead of 4
            System.out.println(AnotherArray[row]);
            for (int col=0; col<AnotherArray[row].length; col++) {
                System.out.println(AnotherArray[row][col]);
            }
        }
    }
    
}
