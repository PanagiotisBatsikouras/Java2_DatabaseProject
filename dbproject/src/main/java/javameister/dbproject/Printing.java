/*
 * Printing class
 *
 * Copyright 2019 Javameister team
 *
 */
package javameister.dbproject;

/**
 *Class that calls printers.
 *This class has the method that is called when the user selects
 * option 2 in order to view the database his has created.
 *
 * @author Javameister team.
 *
 */
public class Printing {

    /**
     *
     * Print method that prints the general display of the current database.
     */
    public static void displayData() {
        System.out
                .println("***This is a general " + "view of your Data Base***");
        Database.printer();
    }
}
