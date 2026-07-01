
import java.util.ArrayList;
import java.util.Scanner;

class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> myNumberArray = new ArrayList<>();

        while (true) {
            int userValue = Integer.valueOf(scanner.nextLine());
            if (userValue == 0) {
                break;
            }
            myNumberArray.add(userValue);

        }


        // get average
        int sum = 0;
        int positiveCount = 0;
        for (int value: myNumberArray) {
            if (value > 0) {
                sum += value;
                positiveCount ++;
            }
        }
        if (positiveCount == 0) {
            System.out.println("Cannot calculate average");
            return;
        }
        double average = (double) sum /positiveCount;
        System.out.println(average);

    }
}

