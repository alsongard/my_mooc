public class Grade {
	// instance variables
	public int grade;

	// constructor
	public Grade(int myGrade) {
		if (myGrade < 0 || myGrade > 5) {
			throw new IllegalArgumentException("Grade must be between  0 and 5");
		}
		this.grade = myGrade;
	}


	public int getGrade() { 
		return this.grade;
	}

}
