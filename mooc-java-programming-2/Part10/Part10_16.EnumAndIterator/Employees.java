import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
	// instance variables
	private ArrayList<Person> persons;
	public Employees() {
		this.persons = new ArrayList<>();
	}

	public void add(Person personToAdd) {
		this.persons.add(personToAdd);
	}


	// public void add(List<Person> peopleToAdd) adds the given list of people to the employees list
	public void add(List<Person> peopleToAdd) {
		for(Person item: peopleToAdd) {
			this.persons.add(item);
		}
	}

	public void print()  { // prints all employees
	
		Iterator<Person> iterator = this.persons.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	public void print(Education education) { //prints the employees whose education matches the education given as a parameter.
	
		Iterator<Person> iterator  = this.persons.iterator();
		while(iterator.hasNext()) {
			Person item = iterator.next();
			if (item.getEducation() == education) {
				System.out.println(item);
			}
		}
		// for(Person item: this.persons) {
		// 	if (item.getEducation()  == education)  {
		// 		System.out.println(item);
		// 	}
		// }
	}	

	public void fire(Education education) { //The method removes all employees whose education matches the education given as parameter from the employees list.
		Iterator<Person> iterator =  this.persons.iterator();

		while (iterator.hasNext()) {
			if (iterator.next().getEducation() == education) {
				iterator.remove();
			}
		}
	}
}

