package Practise;
class StarsPractice{
	public static void main(String[] args) {
	
		int a = 0;

		System.out.println("Inverted Right Half Pyramid Pattern ");
		while (a < 5) {
			for (int i = a; i < 5; i++){
				System.out.print("*");	
			} 
			System.out.println("");
			a++;
		}



		System.out.println("Right Half Pyramid Star Pattern");


		int g = 0;
		while (g < 5) {
			for (int i = 0; i < g + 1; i++) {
				System.out.print("*");
			}
			System.out.println("");
			g++;
		}


		System.out.println("Print Stars and Spaces");
		int s = 0;

		while ( s < 5) {
			for (int b = s; b < 5-1 ; b++) {
				System.out.print(" ");
			}
			for (int c = 0; c < s + 1; c++) {
				System.out.print("*");
			}
			System.out.println(" ");
			s++;
		}
	}
}
