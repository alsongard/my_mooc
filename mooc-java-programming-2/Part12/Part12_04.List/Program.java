
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your class here
        List<String> myList = new List<>();
        System.out.println("Check if myList has hello word: " + myList.contains("hello"));
        myList.add("hello");
        System.out.println("Check if myList has hello word: " + myList.contains("hello"));
        int index = myList.indexOfValue("hello");
        System.out.println("This is index of myList: " + index);
        System.out.println("this is the value:  " + myList.value(index));
        System.out.println("Removing hello in the next code statement");
        myList.remove("hello");
        System.out.println(myList.contains("hello"));
    }

}

