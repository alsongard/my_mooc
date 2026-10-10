package moocexercise;

import moocexercise.logic.ApplicationLogic;
import moocexercise.ui.UserInterface;

public class Program {
    public static void main(String[] args) {
        System.out.println("Hello this is Program test");

        UserInterface ui = new TextInterface();
        new ApplicationLogic(ui).execute(3);
    }
}
