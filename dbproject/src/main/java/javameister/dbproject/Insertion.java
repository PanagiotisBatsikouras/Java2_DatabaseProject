package javameister.dbproject;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Javameister.
 *
 */
class Insertion {

	/**
	* @param counter.
	*/
	private static int counter = 0;

	/**
	 * @param code.
	 */
	private static int code = 0;

	/**
	 * Recursive method for data insert.
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
		System.out.println("Press enter to enter the"
				+ " next element of this line.");
		System.out.println("Type nextline to change line"
				+ " and endofinput in order"
				+ " to end inserting data.");

		code += 1;
		a.add(" " + code);
		do {
			element = input.nextLine();
			if (!element.equals("nextline")
					&& !element.equals("endofinput")) {
				a.add(element);
			}
		} while (!element.equals("nextline")
				&& !element.equals("endofinput"));
		new Database(a);
		if (element.equals("nextline")) {
			insertData();
		}
	}


	/**
	 * Method that takes the user columns.
	 */
	public static void columnsName() {

		Scanner input = new Scanner(System.in);

		String element = null;

		ArrayList<String> b = new ArrayList<String>();

		System.out.println("Insert the titles of data.");
		System.out.println("Press enter to enter the"
				+ " next column of this line.");
		System.out.println("Type 0 when you wish to stop.");

		b.add("Code");

		do {
			element = input.next().toLowerCase();

			if (!element.equals("0")) {
				b.add(element);
			}

		} while (!element.equals("0"));
		new Database(b);

	}
}
