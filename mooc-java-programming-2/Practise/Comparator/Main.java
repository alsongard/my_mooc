import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

class Main {

	public void main() {
		List<Film> films = new ArrayList<>();
		films.add(new Film("A", 2000));
		films.add(new Film("B", 1999));
		films.add(new Film("C", 2001));
		films.add(new Film("D", 2005));

		System.out.println("Before sorting");
		for (Film f: films) {
			System.out.println(f);
		}


		Comparator<Film> comparator = Comparator
			.comparing(Film::getReleaseYear)
			.thenComparing(Film::getName);

		Collections.sort(films, comparator);

		System.out.println("After sorting");
		
		for (Film f: films) {
			System.out.println(f);
		}

	}

}
