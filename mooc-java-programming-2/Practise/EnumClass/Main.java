class Main  {

	public static void main(String[] args) {
	
		User james = new User("James", Gender.MALE);
		System.out.println(james);


		// Get ordinal values
		System.out.println("Gender.Male " + Gender.MALE.ordinal());

		System.out.println("Gender.Female " + Gender.FEMALE.ordinal());


		if (james.getGender() == Gender.MALE) {
			System.out.println("James gender is MALE");
		}

	}
}
