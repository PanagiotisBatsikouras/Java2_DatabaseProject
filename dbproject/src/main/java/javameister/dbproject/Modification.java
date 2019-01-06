package javameister.dbproject;

import java.util.Scanner;

/**
 *
 * @author Javameister.
 *
 */
class Modification {

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
        el = sc.next().toLowerCase();
        for (int i = 0; i < Database.getaList().size(); i++) {

            if (Database.getaList().get(i).contains(x)) {
                Database.getaList().get(i).set(y, el);
                System.out.println("Data successfully" + " changed!");
            }

        }
    }
}
