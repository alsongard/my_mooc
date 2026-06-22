import java.util.ArrayList;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    
        // int[] numbers = {-1, 6, 9, 8, 12};
        // System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
        // System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
        // System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));

        int[] numbers = {4, 7, 1};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {

        int smallestValue = array[0];
        for (int value : array) {
            if (value < smallestValue) {
                smallestValue = value;
            }
        }

        return smallestValue;
    }

    public static int indexOfSmallest(int[] array) {
        int index=0;
        int smallestVal = array[0];
        for (int i = 0; i < array.length;  i++) {
            if (array[i] < smallestVal ) {
                smallestVal = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int index=startIndex;
        int smallestVal = table[startIndex];

        for (int i = startIndex; i < table.length; i++) {
            // System.out.println("Index: " + i  +  " Value: " + table[i]);
            if (table[i] < smallestVal) {
                index = i;
                smallestVal = table[i];
            }
        }
        return index;
    }


    public static void swap(int[] array, int index1, int index2) {
        // write your code here
        int value1 = array[index1];
        array[index1] = array[index2];
        array[index2] = value1;
    }


    public static void sort(int[] array) {

        System.out.println("Before sorting");
        for (int value: array) {
            System.out.println(value);
        }



        for (int i = 0; i < array.length; i++) {

            int index = indexOfSmallestFrom(array, i);

            int smallestValue = array[index]; 


            int swapValue = array[i];

            array[i] = smallestValue;
            array[index] = swapValue;

        }
        System.out.println("Array after sorting:");

        for (int value: array) {

            System.out.println(value);
        }

        
    }

}

