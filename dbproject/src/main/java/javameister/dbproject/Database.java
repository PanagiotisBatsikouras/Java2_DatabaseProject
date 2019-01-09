/*
 * Database class
 *
 * Copyright 2019 Javameister team
 *
 */
package javameister.dbproject;
import java.util.ArrayList;

/**
 *This the core of the database.
 *This class is responsible for storing and printing the data by
 *providing basic methods for storing and printing.
 *
 * @author Javameister team.
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
    private static ArrayList<ArrayList<String>> aList =
            new ArrayList<ArrayList<String>>();

    /**
     * Empty constructor.
     */
    public Database() {

    }

    /**
     *
     * @param rowIn
     *            parameter.
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

    /**
     *
     * @return aList.
     */
    public static ArrayList<ArrayList<String>> getaList() {
        return aList;
    }

    /**
     * Basic method for printing all data.
     */
    public static void printer() {
        for (ArrayList<String> a : aList) {
            System.out.println(a);
        }
    }

    /**
     * Secondary method for printing data.
     */
    public static void printer2() {
        ArrayList<String> a = new ArrayList<String>();
        a = aList.get(0);
        for (int i = 1; i < a.size(); i++) {
            System.out.println(" " + i + ". " + a.get(i));
        }
    }
}
