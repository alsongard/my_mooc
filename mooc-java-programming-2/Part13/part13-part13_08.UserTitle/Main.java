import java.util.Scanner;

import javafx.application.Application;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter title for Window GUI: ");
        String title = scanner.nextLine();

        Application.launch(UserTitle.class, "--title=" + title);
    }
}
