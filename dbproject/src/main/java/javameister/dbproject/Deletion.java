/*
 * Deletion class
 *
 * Copyright 2019 Javameister team
 *
 */
package javameister.dbproject;
import java.util.Scanner;

/**
 *This class is provided with the method for the deletion of a specific insertion.
 *The user enters the unique auto-generated code of the insertion he wants delete
 *and then this insertion is deleted from the database.
 *
 * @author Javameister team.
 *
 */

public class Deletion {
    /**
     * method that deletes an insertion from database user chooses the insertion
     * based on an unique auto-generated code.
     */
    public static void deleteData() {

        Scanner sc = new Scanner(System.in);

        Database.printer();

        System.out.println(
                "Please select the code " + "of the data you wish to delete ");

        String x = (" " + sc.nextInt());
        for (int i = 0; i < Database.getaList().size(); i++) {
            if (Database.getaList().get(i).contains(x)) {
                Database.getaList().remove(Database.getaList().get(i));
            }

        }
        System.out.println("End of deletion process.");

    }

}
