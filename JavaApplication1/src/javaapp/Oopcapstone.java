package javaapp;

import java.util.Scanner;

/**
 *
 * @author pingle
 */
public class Oopcapstone {

    public static void main(String[] args) {
        // Hardcoded username and password
        String correctusername = "admin";
        String correctpass = "admin123";

        Scanner loginscanner = new Scanner(System.in);

        boolean authenticated = false; // set the default state of auth to false so they need to login
        while (!authenticated) {
            System.out.println("Enter Username: ");
            String inputUsername = loginscanner.nextLine();

            System.out.println("Enter Password: ");
            String inputPassword = loginscanner.nextLine();

            if (inputUsername.equals(correctusername) && inputPassword.equals(correctpass)) {
                System.out.println("Login Successful! Welcome to the system.");
                authenticated = true; // Exit the loop after successful login
            } else {
                System.out.println("Invalid credentials. Please try again.");
            }
        }
        Scanner userinputscanner = new Scanner(System.in);// go to main program after successful login
        int choice;

        do {
            System.out.println("\nInventory and Sales Management System v2.01");
            System.out.println("\n1. Check inventory \n2. Edit inventory \n3. Stock Movement Analysis \n4. Suggestions \n5. Close Program");
            System.out.println("Select operation:");
            choice = userinputscanner.nextInt();

            switch (choice) {
                case 1:
                    subprograms.subprogram1();
                    break;

                case 2:
                    subprograms.subprogram2();
                    break;

                case 3:
                    subprograms.subprogram3();
                    break;

                case 4:
                    subprograms.subprogram4();
                    break;

                case 5:
                    System.out.println("Closing program");
                    break;

                default:
                    System.out.println("User Input Error");
                    break;
            }
        } while (choice != 5); // redo until the user chooses to close the program
        userinputscanner.close();
        loginscanner.close();//close the last 2 dingus scanners
    }
}
