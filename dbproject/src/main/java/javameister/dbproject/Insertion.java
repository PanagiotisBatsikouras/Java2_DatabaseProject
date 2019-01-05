package javameister.dbproject;
import java.util.Scanner;
import java.util.InputMismatchException;

class Insertion {
	
	public static int getNumOfAtts() {
		System.out.println("---Welcome to our first Data Base---");
		System.out.println("You can store 10 attributes max for each element");
		
		Scanner input = new Scanner(System.in);
		int number = 0;
		
		do {
		//while (number > 10 || number < 1) {
			try {
				System.out.print("Please enter the num of attributes you want:");
				number = input.nextInt();
			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				System.out.println("Progam will be terminated");
				number = 0 ;
				System.exit(number);
				
			}
				
			if (number > 10 || number < 0) {
				System.out.println("Number of attributes must be between 1 and 10");
			}
		//}
				
			
		} while (number > 10 || number < 1);
		input.close();
		
		return number;
	}
	

}
