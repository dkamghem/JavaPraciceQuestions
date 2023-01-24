package PracticeQ;

import java.util.Scanner;

public class MaxNum3 {

	public static void main(String[] args) {
		int number1, number2, number3;
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.print("Enter the First Number: ");
	      number1 = scan.nextInt();
	      System.out.print("Enter the Second Number: ");
	      number2 = scan.nextInt();
	      System.out.print("Enter the Third Number: ");
	      number3 = scan.nextInt();
	      
	      if( number1 >= number2 && number1 >= number3)
	            System.out.println(number1 + " is the largest number.");

	        else if (number2 >= number1 && number2 >= number3)
	            System.out.println(number2 + " is the largest number.");

	        else
	            System.out.println(number3 + " is the largest number.");

	}

}
