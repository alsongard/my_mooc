package flightcontrol;

import java.util.Scanner;

import flightcontrol.logic.FlightControl;
import flightcontrol.ui.TextUI;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FlightControl flightcontrol = new FlightControl();
		TextUI text = new TextUI(flightcontrol, scanner);
		text.start();
    }
}
