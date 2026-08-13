package flightcontrol.ui;

import flightcontrol.domain.Flight;
import flightcontrol.domain.Airplane;
import flightcontrol.logic.FlightControl;


// import flightcontrol.getAirplane; // this method is defined in a class  
import java.util.Scanner;

public class TextUI {
	private FlightControl flightControl;
	private Scanner Scanner;


	public TextUI(FlightControl flightctrl, Scanner scan){
		this.flightControl = flightctrl;
		this.Scanner = scan;	
	}

	public void start() {
		// let's start in two parts -- first start the asset control,
        // then the flight control
        startAssetControl();
        System.out.println();
        startFlightControl();
        System.out.println();
	}

	public void startAssetControl() {
		System.out.println("Airport Asset Control");
		System.out.println("-------------------");		
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("Choose an action:");
			System.out.println("[1] Add an airplane");
			System.out.println("[2] Add a flight");
			System.out.println("[x] Exit Airport Asset Control");
		
			System.out.println("> ");
			String answer = scanner.nextLine();

			if (answer.equals("1")) {
				addAirplane(scanner);
			} else if (answer.equals("2")) {
				addFlight(scanner) ;
			} else if (answer.equals("x")) {
				break;
			}
		}
		
	}	

	private void addAirplane(Scanner scanner) {
		System.out.println("Give the aiprlane id: ");
		String id = scanner.nextLine();

		System.out.println("Give the airplane capacity: ");
		int capacity = Integer.parseInt(scanner.nextLine());

		this.flightControl.addAirplane(id, capacity);

	}


	private void addFlight(Scanner scanner) {
		System.out.println("Give the airplane id: ");
		Airplane airplane = askForAirplane();

		System.out.println("Give th departure airport id: ");
		String departureId = scanner.nextLine();

		System.out.println("Give the target airport id: ");
		String destinationId = scanner.nextLine();

		this.flightControl.addFlight(airplane, departureId, destinationId);
	}



	private Airplane  askForAirplane() {
		Scanner scanner = new Scanner(System.in);
		Airplane airplane = null;
		while (airplane == null) {
			String id = scanner.nextLine();
			airplane  = flightControl.getAirplane(id);

			if  (airplane == null) {
				System.out.println("No airplane with id " + id + ".");
			}
		}

		return airplane;

	}


	private void startFlightControl() {

		System.out.println("Flight Control");
		System.out.println("------------");
		System.out.println();
		Scanner scanner = new Scanner(System.in);


		while(true) {
			System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");

			System.out.print("> ");
            String answer = scanner.nextLine();
            if (answer.equals("1")) {
                printAirplanes();
            } else if (answer.equals("2")) {
                printFlights();
            } else if (answer.equals("3")) {
                printAirplaneDetails();
            } else if (answer.equals("x")) {
                break;
            }
		}

	}

	private void printAirplanes() {
		for (Airplane plane : flightControl.getAirplanes()) {
			System.out.println(plane);
		}
	}

	private void printFlights() {
		for (Flight flight: flightControl.getFlights()) {
			System.out.println(flight);
			System.out.println("");
		}
	}

	private void printAirplaneDetails() {
		System.out.print("Give the airplane id: ");
        Airplane plane = askForAirplane();
        System.out.println(plane);
        System.out.println();
	}




}