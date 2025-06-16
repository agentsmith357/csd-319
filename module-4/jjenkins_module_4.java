
// Author: Jelani Jenkins
// Course: CSD-402
// Module: 4
// Write four overloaded methods that return the average of an array with the following headers:
// public static short average (short [ ] array)
// public static int average (int [ ] array)
// public static long average (long [ ] array)
// public static double average (double [ ] array)

public class jjenkins_module_4 {

    public static short average(short[] array) {
        int sum = 0;
        for (short value : array) {
            sum += value;
        }
        return (short) (sum / array.length);
    }

    public static int average(int[] array) {
        long sum = 0;
        for (int value : array) {
            sum += value;
        }
        return (int) (sum / array.length);
    }

    public static long average(long[] array) {
        long sum = 0;
        for (long value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (double value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        short[] shortArray = {10, 20, 30};
        int[] intArray = {100, 200, 300, 400};
        long[] longArray = {1000L, 2000L, 3000L, 4000L, 5000L};
        double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5};

        System.out.println("Short Array: ");
        displayArray(shortArray);
        System.out.println("Average: " + average(shortArray));
        System.out.println();

        System.out.println("Int Array: ");
        displayArray(intArray);
        System.out.println("Average: " + average(intArray));
        System.out.println();

        System.out.println("Long Array: ");
        displayArray(longArray);
        System.out.println("Average: " + average(longArray));
        System.out.println();

        System.out.println("Double Array: ");
        displayArray(doubleArray);
        System.out.println("Average: " + average(doubleArray));
    }

    public static void displayArray(short[] array) {
        for (short value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void displayArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void displayArray(long[] array) {
        for (long value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void displayArray(double[] array) {
        for (double value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}