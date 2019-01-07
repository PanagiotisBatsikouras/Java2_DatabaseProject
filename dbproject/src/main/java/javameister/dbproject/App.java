/*
 * App class
 *
 * Copyright 2019 Javameister team
 *
 */
package javameister.dbproject;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Main class for program execution.
 * The class contains the main method for program execution and also provides
 * a method that takes user input and calls the appropriate methods for the
 * program use cases
 *
 * @author Javameister team
 *
 */
public class App {

    /**
     * @param SELECTION1.
     */
    public static final int SELECTION1 = 1;
    /**
     * @param SELECTION2.
     */
    public static final int SELECTION2 = 2;
    /**
     * @param SELECTION3.
     */
    public static final int SELECTION3 = 3;
    /**
     * @param SELECTION4.
     */
    public static final int SELECTION4 = 4;
    /**
     * @param SELECTION5.
     */
    public static final int SELECTION5 = 5;

    /**
     * Main method for program execution.
     *
     * @param args
     *            argument
     */
    public static void main(final String[] args) {
        System.out.println("Welcome to Javamaister Database");
        try {
            getMenu();
        } catch (Exception e) {

        }
    }

    /**
     * getMenu Method.
     */
    public static void getMenu() {

        Scanner input = new Scanner(System.in);

        boolean flag = true;

        int choice;

        try {

            do {
                System.out.println();
                System.out.println("***Menu***");
                System.out.println("1. Insert Data");
                System.out.println("2. Display Data");
                System.out.println("3. Delete Data");
                System.out.println("4. Change Data");
                System.out.println("5. Exit Database");
                System.out.println("Make your choice: ");
                choice = input.nextInt();
                System.out.println();
                switch (choice) {
                    case SELECTION1 :
                        Insertion.insertData();
                        break;
                    case SELECTION2 :
                        Printing.displayData();
                        break;
                    case SELECTION3 :
                        Deletion.deleteData();
                        break;
                    case SELECTION4 :
                        Modification.changeData();
                        break;
                    case SELECTION5 :
                        flag = false;
                        System.out.println("" + "Thank you for " + "using our "
                                + "database! Goodbye!");
                        break;
                    default :
                        System.out.println("Invalid choice");
                        break;
                }
            } while (flag);
        } catch (InputMismatchException e) {
            System.out.println("An error occurred during "
                    + "your input. The program will be " + "terminated. "
                    + "Sorry for any inconvenience.");
        } finally {
            input.close();
        }

        input.close();

    }

}
