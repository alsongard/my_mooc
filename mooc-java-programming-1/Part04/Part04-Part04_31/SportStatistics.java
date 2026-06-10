
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        // prompt user for the name of the file
        System.out.println("File: ");
        String fileName = scan.nextLine();

        System.out.println("Team:");
        String teamName = scan.nextLine();
        int count = 0;
        int wins = 0;
        int losses = 0;

        try (Scanner fileReader = new Scanner(Paths.get(fileName))){
            while (fileReader.hasNextLine()) {
                String row = fileReader.nextLine();
                if (row.isEmpty()) {
                    continue;
                }

                // split 
                String[] parts = row.split(","); //homeTeam,VisitingTeam,homeTeamPoints,visitingPointss
                if (parts[0].equals(teamName) || parts[1].equals(teamName)) {
                    count++;
                }

                if (parts[0].equals(teamName)) { // this is the homeTeam 
                    int getDifference = Integer.valueOf(parts[2]) - Integer.valueOf(parts[3]);
                    if (getDifference > 0) {
                        wins++;
                    } else { 
                        losses++;
                    }
                } else if (parts[1].equals(teamName)) {
                    int getDifference = Integer.valueOf(parts[3]) - Integer.valueOf(parts[2]);
                    if (getDifference > 0) {
                        wins++;
                    } else { 
                        losses++;
                    }
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Games: " + count);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}

