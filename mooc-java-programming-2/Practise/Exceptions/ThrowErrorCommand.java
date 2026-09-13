import java.util.Scanner;

class ThrowErrorCommand {

	public static void main() {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("Enter any value: ");
			int userValue = Integer.valueOf(scan.nextLine());
			Grade gradeInstance = new Grade(userValue);

			System.out.println("This is the value entered by user: " + gradeInstance.getGrade());
		}
	}
}



