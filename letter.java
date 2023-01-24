package PracticeQ;

import java.util.Scanner;

public class letter {

	public static void main(String[] args) {
		char ch;
		Scanner scan = new Scanner(System.in);
	      System.out.print("Enter a letter character to check if it is a vowel or consonant: ");
	      ch = scan.next().charAt(0);
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");

	}

}
