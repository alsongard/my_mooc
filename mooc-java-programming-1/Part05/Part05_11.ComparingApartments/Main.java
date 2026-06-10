
public class Main {

    public static void main(String[] args) {
        // you can write code here to try out your program
        Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
        Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
        Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);
  
        System.out.println(manhattanStudioApt.largerThan(atlantaTwoBedroomApt));      
        System.out.println(bangorThreeBedroomApt.largerThan(atlantaTwoBedroomApt));  

        System.out.println(manhattanStudioApt.priceDifference(atlantaTwoBedroomApt));  //71600
        System.out.println(bangorThreeBedroomApt.priceDifference(atlantaTwoBedroomApt));


        Apartment a1 = new Apartment(1,20,1000); 
        Apartment a2 = new Apartment(2,30,2000); 
        Apartment a3 = new Apartment(2, 23, 1500);
        a1.priceDifference(a2);
        // expected:<40000> but was:<-40000>
    }
}

