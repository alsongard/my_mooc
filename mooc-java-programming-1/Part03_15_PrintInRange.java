
import java.util.ArrayList;

class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer>  myList = new ArrayList<>();
        myList.add(5);
        myList.add(4);
        myList.add(3);
        myList.add(2);
        myList.add(1);
        myList.add(10);
        myList.add(11);

        printNumbersInRange(myList, 1, 4);
    }
    

    // print values which are in the range of (equal and greater)lowerlimit and (less and equal)upperlimit
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        // exlcusive of upperlimit
        System.out.println("The numbers in the range of [" + lowerLimit + "," + upperLimit + "]");
        for(int i = 0; i <= numbers.size() - 1; i++) {
            if (numbers.get(i) >= lowerLimit && numbers.get(i) <= upperLimit) { // print number 
                System.out.println(numbers.get(i));
            }
        }
    }
}

