package Practise;
class PostIncrement {

	public static void main (String[] args) {
		int
		       	result = 0;

		int i = 0;
		while (true) {
    			result += 3; // shorthand for result = result + 3
    			i++;  // shorthand for i = i + 1
			System.out.println("value of i" + i);
    			if (i == 4) {
    			    break;
    			}
		}

		System.out.println(result);
	}
}
