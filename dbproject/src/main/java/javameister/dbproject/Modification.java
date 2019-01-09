/*
 * Modification class
 *
 * Copyright 2019 Javameister team
 *
 */
package javameister.dbproject;

import java.util.Scanner;

/**
 *This class provides a method for modification of the fields.
 *First it prints the existing insertions, the asks from the user to enter
 *the code of the insertion he wants to modify, after that prints the
 *existing fields with their codes and then asks from the user to select
 *the field he wants to modify. Then the user gives the new value of the
 *field and he is redirected to the basic menu.
 *
 * @author Javameister team.
 *
 */
class Modification {

    /**
     *
     * Change data method.
     * It modifies a specific field of the already existing
     * insertions of user. The user chooses the field, and types
     *  the new value of the element he wants to change.
     */
    public static void changeData() {

        Scanner sc = new Scanner(System.in);

        Database.printer();
        System.out.println(
                "Please select the code" + " of the data you wish to change ");
        String x = (" " + sc.nextInt());
        Database.printer2();
        int y = 0;
        System.out.println("Please select the number "
                + "of the field that you wish to change ");
        y = sc.nextInt();
        String el;
        System.out.println("Please enter the new element ");
        Scanner scanner = new Scanner(System.in);
        el = scanner.nextLine();
        for (int i = 0; i < Database.getaList().size(); i++) {

            if (Database.getaList().get(i).contains(x)) {
                Database.getaList().get(i).set(y, el);
                System.out.println("Data successfully" + " changed!");
            }

        }
    }
}
