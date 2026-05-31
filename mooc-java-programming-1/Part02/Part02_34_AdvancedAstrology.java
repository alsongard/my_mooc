
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print("*");    
        }
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int a = 1;
        while (a <= size){
            printSpaces(size - a);
            printStars(a);
            System.out.println();
            a++;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        // printing the tree

        int b = 1;  // h = 10
        while (b <= height) {
            printSpaces(height - b);
            printStars(b);
            printStars(b - 1);
            System.out.println();
            b++;
        }

        // printing the base
        for (int a = 0; a < 2; a++) {
            printSpaces(height - 2);
            printStars(3);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        // printSpaces(3);
        // printStars(3);


        printTriangle(3);
        System.out.println("---");

        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}

