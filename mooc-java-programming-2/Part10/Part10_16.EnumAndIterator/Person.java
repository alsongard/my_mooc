public class Person {

	private String name;
	private Education educ;

	// constructor
	public Person(String username, Education educ)  {
		this.name = username;
		this.educ = educ;
	}

	public Education getEducation() {
		return this.educ;
	}

	public String toString() {
		return this.name  + ", " + this.educ;
	}
}

