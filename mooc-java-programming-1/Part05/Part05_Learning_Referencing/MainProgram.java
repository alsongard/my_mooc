class MainProgram {
	public static void main(String[] args) {

		Person joan = new Person("Joan Ball");
		System.out.println(joan);

		Person ball = joan; // copies the reference value to ball 
		ball.growOlder();
		ball.growOlder();

		System.out.println(joan);

		joan = new Person("Joan B.");
		System.out.println(joan);


		System.out.println("Printing Ball");
		System.out.println(ball);
	}
}
