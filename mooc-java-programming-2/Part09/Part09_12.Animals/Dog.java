public class Dog extends Animal implements NoiseCapable{

	// constructor
	public Dog(String name) {
		super(name);
	}

	public Dog() {
		super("Dog");
	}

	public void bark() {
		String message = this.getName() + " barks";
		System.out.println(message);
	}
	public void makeNoise() {
		this.bark();
	}
}

