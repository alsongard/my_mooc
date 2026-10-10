package moocexercise.logic;

import moocexercise.ui.UserInterface;

public class ApplicationLogic {
    public UserInterface userInterfaceInstance;
    public ApplicationLogic(UserInterface ui) {
        this.userInterfaceInstance = ui;
    }

    public void   execute(int times) {
        int  i = 0;
        while (i < times) {
            System.out.println("Application logic is working");
            this.userInterfaceInstance.update();
            i++;
        }
    }

}
