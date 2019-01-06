package javameister.dbproject;

/**
 *
 * @author Javameister.
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
