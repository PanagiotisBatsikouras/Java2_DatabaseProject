/*
 * Deletion class
 *
 * Copyright 2019 Javameister team
 *
 */
package javameister.dbproject;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *This is the basic class for the creation of the database based in user input.
 *It provides 2 methods. The method columnname() that let the user enter the name
 *of the fields which are the columns in his database. The method insertData() is responsible
 *for consecutive reading of users input and storing in it using Database class methods and variables.
 *The methods give exact directions to the user on how to write his insertions. Specifically
 *each field insertion is separated with "enter". The user in order to enter the insertions of
 *another line types "nextline" and "endofinput" when he is done with the insertion.
 *The method insertData() provides each insertion with a unique code, like a primary key
 *that is used for the other use cases.
 *
 * @author Javameister team.
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
     * Recursive method for data insert which asks the user to insert or change data one by one until he wants to stop.
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
        System.out.println(
                "Press enter to enter the" + " next element of this line.");
        System.out.println("Type nextline to change line"
                + " and endofinput in order" + " to end inserting data.");

        code += 1;
        a.add(" " + code);
        do {
            element = input.nextLine();
            if (!element.equals("nextline") && !element.equals("endofinput")) {
                a.add(element);
            }
        } while (!element.equals("nextline") && !element.equals("endofinput"));
        new Database(a);
        if (element.equals("nextline")) {
            insertData();
        }
    }

    /**
     * Column method that takes the user's columns by asking him the titles one by one.
     */
    public static void columnsName() {

        Scanner input2 = new Scanner(System.in);

        String element = null;

        ArrayList<String> b = new ArrayList<String>();

        System.out.println("Insert the titles of data.");
        System.out.println(
                "Press enter to enter the" + " next column of this line.");
        System.out.println("Type 0 when you wish to stop.");

        b.add("Code");

        do {
            element = input2.nextLine();

            if (!element.equals("0")) {
                b.add(element);
            }

        } while (!element.equals("0"));
        new Database(b);

    }
}
