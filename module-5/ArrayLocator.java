/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Author: Jelani Jenkins
 * Date: Jun 22, 2025
 * Class Name: Java for Programmers
 * Teacher: Elijah Finch
 */
public class jjenkins_module_5 {

    static int[][] intArray;
    static double[][] doubleArray;

    public static void init() {
        intArray = new int[][] {
            {5, 8, 3},
            {9, 2, 4}
        };

        doubleArray = new double[][] {
            {3.5, 7.2, 1.8},
            {6.3, 0.4, 9.9}
        };
    }

    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = {0, 0};
        double max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = {0, 0};
        int max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = {0, 0};
        double min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = {0, 0};
        int min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    public static void main(String[] args) {
        init();

        int[] maxIntLoc = locateLargest(intArray);
        int maxIntVal = intArray[maxIntLoc[0]][maxIntLoc[1]];
        
        System.out.println("Largest interger is " + maxIntVal + " at (" + maxIntLoc[0] + ", " + maxIntLoc[1] + ")");

        int[] minIntLoc = locateSmallest(intArray);
        int minIntVal = intArray[minIntLoc[0]][minIntLoc[1]];
        System.out.println("Smallest interger is " + minIntVal + " at (" + minIntLoc[0] + ", " + minIntLoc[1] + ")");

        int[] maxDoubleLoc = locateLargest(doubleArray);
        double maxDoubleVal = doubleArray[maxDoubleLoc[0]][maxDoubleLoc[1]];
        System.out.println("Largest double is " + maxDoubleVal + " at (" + maxDoubleLoc[0] + ", " + maxDoubleLoc[1] + ")");

        int[] minDoubleLoc = locateSmallest(doubleArray);
        double minDoubleVal = doubleArray[minDoubleLoc[0]][minDoubleLoc[1]];
        System.out.println("Smallest double is " + minDoubleVal + " at (" + minDoubleLoc[0] + ", " + minDoubleLoc[1] + ")");
    }
}
