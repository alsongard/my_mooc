
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class LiteracyComparison {
    
    public static void main(String[] args) {

		String filename = "literacy.csv";
		
		try {
			ArrayList<Literacy> literacyList  = Files.lines(Paths.get(filename))
				.map(rowItem -> rowItem.split(","))
				.map(rowArray -> new Literacy(rowArray[0].trim(), rowArray[1].trim(), rowArray[2].trim(), rowArray[3].trim(), Integer.valueOf(rowArray[4]), Double.valueOf(rowArray[5])))
				.collect(Collectors.toCollection(ArrayList::new));

			Collections.sort(literacyList,  (l1, l2) ->  Double.compare(l1.getLiteracyPercent() , l2.getLiteracyPercent()));
			for (Literacy item : literacyList) {
				System.out.println(item);
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}


    }
}

