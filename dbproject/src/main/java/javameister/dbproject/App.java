package javameister.dbproject;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * main class for program execution
 *
 */
public class App {
	
	public static void main( String[] args ) {
		System.out.println("Welcome to Javamaister Database");
		try {
			getMenu();
		} catch (Exception e) {
			
		}
	}
	
	
	
	public static void getMenu() {
		
		Scanner input = new Scanner(System.in);
		
		boolean flag = true;
		
		int choice;
		
		try {
			
			do {
				System.out.println();
				System.out.println("***Menu***");
				System.out.println("1. Insert Data");
				System.out.println("2. Display Data");
				System.out.println("3. Delete Data");
				System.out.println("4. Change Data");
				System.out.println("5. Exit Database");
				System.out.println("Make your choice: ");
				choice = input.nextInt() ;
				System.out.println();
				switch(choice) {
				case 1 :
					//Insertion.insertData();
					break;
				case 2 :
					//Printing.displayData();
					break;
				case 3 :
					//Deletion.deleteData();
					break;
				case 4 :
					//Modification.changeData();
					break;
				case 5 :
					flag = false;
					System.out.println("Thank you for using our database! Goodbye!");
					break;
				default:
					System.out.println("Invalid choice");
					break;
				}
			} while(flag);
			
		} catch (InputMismatchException e) {
			System.out.println("An error occurred during your input. The program will be terminated. Sorry for any inconvenience.");
		} finally  {
			input.close();
		}
		
		input.close();
		
	}
	
}
