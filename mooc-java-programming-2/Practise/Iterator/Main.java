import java.util.Scanner;
class Main {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		Hand userHand = new Hand();
		while (true) {
			
			String userCard =  scanner.nextLine();
			if (userCard.isEmpty()) {
				break;
			}
			if (userCard.equals("HEART")) {
				userHand.add(new Card(1,Suit.HEART));
			} else if (userCard.equals("SPADE")) {
				userHand.add(new Card(1,Suit.SPADE));
			} else if (userCard.equals("CLUB")) {
				userHand.add(new Card(1,Suit.CLUB));
			} else if (userCard.equals("SPADE")) {
				userHand.add(new Card(1,Suit.SPADE));
			}
		}

		userHand.print();
	}

}
