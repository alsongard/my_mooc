import java.util.ArrayList;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        while( true) {
            String movieName = scanner.nextLine();
            if (movieName.isEmpty()) {
                break;
            }

            int movieDuration = Integer.valueOf(scanner.nextLine());

            TelevisionProgram userProgram =  new TelevisionProgram(movieName, movieDuration);
        
            programs.add(userProgram);
        }
        System.out.println("Program's maxium duration? ");
        int duration = Integer.valueOf(scanner.nextLine());


        for(TelevisionProgram programItem: programs) {
            if (programItem.getDuration() <= duration) {
                System.out.println(programItem);
            }
        }
    }
}

