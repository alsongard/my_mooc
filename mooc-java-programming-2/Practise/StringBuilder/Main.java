import java.lang.StringBuilder;

class Main {
	public void main(String[] args) {

		StringBuilder numbers = new StringBuilder();
		
		for (int i = 0; i < 5; i++) {
			numbers.append(i + "\n");
		}
		
		System.out.println(numbers.toString());
	}
}
