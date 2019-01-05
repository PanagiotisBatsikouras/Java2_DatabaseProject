package javameister.dbproject;
import java.util.*;

class Insertion {
	private static int counter = 0;
	private static int code = 0;
	
	public static void test() {
		System.out.println( "this is our insertion class" );
	}
	
	/**
	 * 
	 * recursive method that takes input from user in order to create the database
	 */
	public static void insertData() {
		
		Scanner input = new Scanner(System.in);
		if (counter == 0) {
			columnsName();
			counter += 1;
		}
		String element = null;
		ArrayList<String> a = new ArrayList<String>();
		
		System.out.println("Insert your data.");
		System.out.println("Press enter to enter the next element of this line.");
		System.out.println("Type nextline to change line and endofinput in order to end inserting data.");
		
		code += 1;
		a.add(" "+code);
		do {
			element = input.nextLine();
			if (!element.equals("nextline") && !element.equals("endofinput")) {
				a.add(element);
			}
		} while (!element.equals("nextline") && !element.equals("endofinput"));
		//new Database(a);
		if (element.equals("nextline")) {
			insertData();
		}
	}
	/**
	 * 
	 * method that let the user create the name of the columns-the fields of each insertion
	 * this method also generates automatically an extra column with a unique key for each insertion
	 */
	public static void columnsName() {
		
		Scanner input = new Scanner(System.in);
		
		String element=null;
		
		ArrayList<String> b = new ArrayList<String>();
		
		System.out.println("Insert the titles of data.");
		System.out.println("Press enter to enter the next column of this line.");
		System.out.println("Type 0 when you wish to stop.");
		
		b.add("Code");
		
		do {
			element = input.next().toLowerCase();
			
			if (!element.equals("0")) {	
				b.add(element);
			}
			
		} while (!element.equals("0"));
		//new Database(b);
		
	}
}
