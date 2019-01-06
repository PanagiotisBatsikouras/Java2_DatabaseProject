package javameister.dbproject;

/**
 *
 * @author Javameister.
 *
 */
public class Printing {
	
	public static void test() {
		System.out.println("this is our printing class");
	}
	
	/**
	 * 
	 * method that prints a general display if database
	 */
	public static void displayData() {
		System.out.println("***This is a general view of your Data Base***");
		Database.printer();
	}
}