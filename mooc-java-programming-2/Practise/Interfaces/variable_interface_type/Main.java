import java.util.ArrayList;

class Main {
	public void main(String[] args) {
		Readable myBook = new Ebook("Art of War");

		ArrayList<String> allPages = new ArrayList<>();

		allPages.add("Weapons are of illomen, only to be used as a last resort, Du Mu");
		allPages.add("One must know himself, and the enemy to win a battle, Du Mu");
		myBook.addPages(allPages);

		for (int i = 0 ; i < myBook.bookPages(); i++) {
		   System.out.println(myBook.read(i));
		}
	
	}
}
