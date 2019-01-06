package javameister.dbproject;
import java.util.ArrayList;

/**
 *
 * @author Javameister.
 *
 */
class Database {

	/**
	 * @param row.
	 */
	private static ArrayList<String> row = new ArrayList<String>();

	/**
	 * @param aList.
	 */
	private static ArrayList<ArrayList<String>>
		aList = new ArrayList<ArrayList<String>>();

	/**
	 * empty constructor.
	 */
	public Database() {

	}

	/**
	 *
	 * @param rowIn parameter.
	 */
	public Database(ArrayList<String> rowIn) {
		row = rowIn;
		aList.add(row);

	}

	/**
	 *
	 * @return row.
	 */
	public static ArrayList<String> getRow() {
		return row;
	}

	/*useless method. still has warning*/
	/*
	public void setRow(ArrayList<String> rowIn) {
		row = rowIn;
	}*/

	/**
	 *
	 * @return aList.
	 */
	public static ArrayList<ArrayList<String>> getaList() {
		return aList;
	}

	/*useless method, still has warning*/
	/*
	public void setaList(ArrayList<ArrayList<String>> aListIn) {
		aList = aListIn;
	}
	*/



}
