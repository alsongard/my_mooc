
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;

class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

		ArrayList<Book> myBookArray = new ArrayList<>();

		while(true) {
			System.out.println("Input the name of the book, empty stops: ");
			String bookName = scanner.nextLine();

			if (bookName.isEmpty()) {
				break;
			}

			System.out.println("Input the age recommendation: ");
			int age = Integer.valueOf(scanner.nextLine());
			myBookArray.add(new Book(bookName, age));
		}

		System.out.println(myBookArray.size() + " books in total.");
		System.out.println("Books: ");

		Comparator<Book> comparator = Comparator
			.comparing(Book::getYear)
			.thenComparing(Book::getBookName);
		
		
		Collections.sort(myBookArray, comparator);

		for (Book item : myBookArray)  {
			System.out.println(item);
		}
    }

}

