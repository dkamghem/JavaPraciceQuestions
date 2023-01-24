package PracticeQ;

import java.util.Scanner;

public class evenOrodd {

	public static void main(String[] args) {
		int number;
		Scanner scan = new Scanner(System.in);
	      
	      System.out.print("Enter the Number to see if it is even or odd: ");
	      number = scan.nextInt();
		String msg =  (number % 2 == 0) ? "The number is even!" : "The number is odd!";
	    System.out.println(msg);
	}

}
