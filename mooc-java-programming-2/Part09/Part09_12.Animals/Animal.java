public abstract class Animal {

	private String animalName;

	// constructor
	public Animal(String animal) {
		this.animalName = animal;
	}

	public String getName() {
		return this.animalName;
	}
	public void eat() {
		String message = this.animalName + " eats";
		System.out.println(message);
	}
	public void sleep () {
		String message = this.animalName + " sleeps";

		System.out.println(message);

	}

}

