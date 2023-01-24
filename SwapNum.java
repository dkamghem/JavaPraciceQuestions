package PracticeQ;

import java.util.Scanner;

public class SwapNum {

	public static void main(String[] args) {
		int numberOne, numberTwo, temp;
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.print("Enter the First Number: ");
	      numberOne = scan.nextInt();
	      System.out.print("Enter the Second Number: ");
	      numberTwo = scan.nextInt();
	      
	      System.out.println("--Before swap--");
	        System.out.println("First number = " + numberOne);
	        System.out.println("Second number = " + numberTwo);
	      
	      temp = numberOne;
	      numberOne = numberTwo;
	      numberTwo = temp;
	      
	      System.out.println("--After swap--");
	        System.out.println("First number = " + numberOne);
	        System.out.println("Second number = " + numberTwo);

	}

}
