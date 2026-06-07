
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            // get firstname, lastName and identificationNumber
            // System.out.println("Enter firstname: ");
            String firstName =  scanner.nextLine();

            if (firstName.isEmpty()){
                break;
            }

            // System.out.println("Enter lastname: ");
            String lastName = scanner.nextLine();

            // System.out.println("Enter identification number: ");
            String identificationNumber = scanner.nextLine();
        
            PersonalInformation personalInfo = new PersonalInformation(firstName, lastName, identificationNumber);

            infoCollection.add(personalInfo);

        }

        for(PersonalInformation personalInfoItem: infoCollection) {
            System.out.println(personalInfoItem.getFirstName() + " "  + personalInfoItem.getLastName());

        }

    }
}

