public class User {

	// class instances
	private String name;
	private Gender gender;

	//  Contructor
	public User(String username, Gender userGender){
		this.name = username;
		this.gender = userGender;
	}


	public Gender getGender(){
		return this.gender;
	}

	@Override
	public String toString() {
		return this.name + " is " + this.gender;
	}


}
