package Practise;
// Source - https://stackoverflow.com/q/32798803
// Posted by mcfred, modified by community. See post 'Timeline' for change history
// Retrieved 2026-05-29, License - CC BY-SA 3.0

import java.util.Scanner;

public class Welcome2
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Next enter two words:");

        int n; 
        String s1, s2; 

        n = keyboard.nextInt(); 
        s1 = keyboard.next(); 
        s2 =  keyboard.nextLine(); 
        System.out.println(" n is " + n + " s1 is " + s1 + " s2 is " + s2); 
    }
}

