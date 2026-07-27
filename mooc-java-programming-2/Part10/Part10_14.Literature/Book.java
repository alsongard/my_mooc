public class Book {
	private String bookName;
	private int recommendedAge;


	// constructor
	public Book(String name, int age)  {
		this.bookName =  name;
		this.recommendedAge = age;
	}


	public int getYear() {
		return this.recommendedAge;
	}

	public String  getBookName(){
		return this.bookName;
	}

	public String toString() {
		return this.bookName + " (recommended for " + this.recommendedAge + " years-old or older.)";
	}
}

