public class Cat extends Animal implements NoiseCapable{
	public Cat() {
		super("Cat");
		
	}

	public Cat(String catName) {
		super(catName);
	}

	public void purr() {
		String message = this.getName() + " purrs";
		System.out.println(message);
	}

	public void makeNoise() {
		this.purr();
	}
}

