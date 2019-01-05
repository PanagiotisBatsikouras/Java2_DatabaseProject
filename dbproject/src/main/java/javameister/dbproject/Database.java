package javameister.dbproject;
import java.util.*;

class Database {
	
	private static ArrayList<String> row = new ArrayList<String>();
	
	private static ArrayList<ArrayList<String>> aList = new ArrayList<ArrayList<String>>();
	
	
	public Database() {
		
	}
	
	public Database(ArrayList<String> rowIn) {
		row = rowIn;
		aList.add(row);
		
	}
	
	
	public static ArrayList<String> getRow() {
		return row;
	}

	/*useless method. still has warning*/
	/*
	public void setRow(ArrayList<String> rowIn) {
		row = rowIn;
	}*/

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
