package javameister.dbproject;

/**
 *
 * @author Javameister.
 *
 */
import java.util.Scanner;

public class Deletion {
    /**
     * method that deletes an insertion from database user chooses the insertion
     * based on an unique auto-generated code.
     */
    public static void deleteData() {
        System.out.println("this is our deletion class");
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
    }

}
