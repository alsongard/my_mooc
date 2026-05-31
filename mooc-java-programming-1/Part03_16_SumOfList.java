
import java.util.ArrayList;

class SumOfList{

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        numbers.add(-5);

        int sumOfList = sum(numbers);
        System.out.println("Sum: " + sumOfList);

    }

    public static int sum(ArrayList<Integer> numbers) {
        // the method returns the sum of the values in List
        // if list is empty return -1

        if (numbers.size() == 0) {
            return -1;
        }
        int sum = 0;
        for (int valueInList : numbers) {
            sum += valueInList;
        }
        return sum;
    }
}

