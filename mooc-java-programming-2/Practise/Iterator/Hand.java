import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Hand {
    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public void print() {

	// using iterator
		Iterator<Card> iterator = this.cards.iterator();
	

		while (iterator.hasNext()) {
			System.out.println(iterator.next()); // prints the value at the cursor point and moves it forward
		}
		

        /* this.cards.stream().forEach(card -> {
            System.out.println(card);
        });
	*/
    }
}
