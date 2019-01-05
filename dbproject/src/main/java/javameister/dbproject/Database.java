package javameister.dbproject;
import java.util.*;

class Database {
	
	private static ArrayList<String> row = new ArrayList<String>();
	
	private static ArrayList<ArrayList<String>> aList = new ArrayList<ArrayList<String>>();
	
	
	public Database() {
		
	}
	
	public Database(ArrayList<String> row) {
		this.row = row;
		aList.add(this.row);
		
	}
	
	
	public static ArrayList<String> getRow() {
		return row;
	}

	public void setRow(ArrayList<String> row) {
		this.row = row;
	}

	public static ArrayList<ArrayList<String>> getaList() {
		return aList;
	}

	public void setaList(ArrayList<ArrayList<String>> aList) {
		this.aList = aList;
	}
	

}
