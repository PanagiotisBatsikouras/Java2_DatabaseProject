package javameister.dbproject;
import java.util.ArrayList;

/**
 *
 * @author Javameister.
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
    private static ArrayList<ArrayList<String>> aList = new ArrayList<ArrayList<String>>();

    /**
     * empty constructor.
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
     * basic printing method.
     */
    public static void printer() {
        for (ArrayList<String> a : aList) {
            System.out.println(a);
        }
    }

    /**
     * secondary.
     */
    public static void printer2() {
        ArrayList<String> a = new ArrayList<String>();
        a = aList.get(0);
        for (int i = 1; i < a.size(); i++) {
            System.out.println(" " + i + ". " + a.get(i));
        }
    }
}
