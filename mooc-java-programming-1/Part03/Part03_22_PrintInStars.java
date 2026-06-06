
class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        // loop through and for each value print stars until finished
        int i = 0;
        while (i < array.length) {
            for (int a = 0; a < array[i]; a++) {
                System.out.print("*");
            }
            System.out.println();
            i++;            
        }
    }

}

