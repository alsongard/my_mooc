
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
		String  fileName = "random.txt";
		List<Book> allBooks  = new ArrayList<>();
		allBooks = readBooks(fileName);
		for (Book item: allBooks) {
			System.out.println(item);
		}
    }


	public static List<Book> readBooks(String file) {
		List<Book> myRows = new ArrayList<>();

		try {

			return Files.lines(Paths.get(file))
				.map(rowItem -> rowItem.split(","))
				.map(rowArray -> new Book(rowArray[0],Integer.valueOf(rowArray[1]),Integer.valueOf(rowArray[2]),rowArray[3]))
				.collect(Collectors.toList());
			// Files.lines(Paths.get(file)).forEach(rowItem->
			// 	// System.out.println(rowItem)
			// 	myRows.add(new Book(rowItem.split(",")[0],Integer.valueOf(rowItem.split(",")[1]),Integer.valueOf(rowItem.split(",")[2]),rowItem.split(",")[3]))
			// );
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

		// myRows
		return myRows;
	}
}

