/*
 * Printing class
 *
 * Copyright 2019 Javameister team
 *
 */
package javameister.dbproject;

/**
 *This class has the method that is called when the user selects
 * option 2 in order to view his database.
 *
 * @author Javameister team.
 *
 */
public class Printing {

    /**
     * .
     *
     * method that prints a general display if database
     */
    public static void displayData() {
        System.out
                .println("***This is a general " + "view of your Data Base***");
        Database.printer();
    }
}
