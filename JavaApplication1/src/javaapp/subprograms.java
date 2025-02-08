/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapp;
/**
 *
 * @author pingle
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.SQLException;

public class subprograms {
    public static void subprogram1(){
        connection.connection();
    }
    public static void subprogram2() {
    String url = "jdbc:mysql://localhost:3306/jdbcoop";//replace jdbcoop with your table name
    String username = "root";//place username for myphp here
    String password = "admin1";//place password for myphp here
    Scanner scanner = new Scanner(System.in); // scanner for user input
    System.out.println("Edit inventory");
    try (
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement mystmt = connection.createStatement()
    ) {// Fetch and display product details
        String fetchQuery = "SELECT id, productname, price, quantity, sold FROM Products";
        ResultSet resultset = mystmt.executeQuery(fetchQuery);

        System.out.println("Current Inventory:");
        while (resultset.next()) {
            int id = resultset.getInt("id");
            String productName = resultset.getString("productname");
            int price = resultset.getInt("price");
            int quantity = resultset.getInt("quantity");
            int sold = resultset.getInt("sold");
            System.out.printf("%d. %s - Price: %d, Quantity: %d, Sold: %d%n", id, productName, price, quantity, sold);
        }
        System.out.print("Enter the ID of the product to edit: ");// makes sure that userinput isnt fucked
        while (!scanner.hasNextInt()) { //makes sure if user isnt braindead and put letters
            System.out.println("Invalid input. Please enter a valid product ID (integer): ");
            scanner.next(); // Clear invalid input
        }
        int productId = scanner.nextInt(); // Read product ID
        System.out.print("Enter new quantity: ");
        while (!scanner.hasNextInt()) { // Check if input is a valid integer
            System.out.println("Invalid input. Please enter a valid quantity (integer): ");
            scanner.next(); // Clear invalid input
        }
        int newQuantity = scanner.nextInt(); // Read new quantity
        System.out.print("Enter new sold value: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid sold value (integer): ");
            scanner.next(); // Clear invalid input
        }
        int newSold = scanner.nextInt(); // Read new sold value

        // Update query
        String updateQuery = "UPDATE Products SET quantity = " + newQuantity + ", sold = " + newSold + " WHERE id = " + productId;
        int rowsAffected = mystmt.executeUpdate(updateQuery);

        if (rowsAffected > 0) {
            System.out.println("Inventory updated successfully.");
        } else {
            System.out.println("Failed to update inventory. Please check the product ID.");
        }

    } catch (SQLException e) {
        System.out.println("Database error: " + e.getMessage());
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }

}
    
    public static void subprogram3() {
    String url = "jdbc:mysql://localhost:3306/jdbcoop";
    String username = "root";
    String password = "admin1";

    System.out.println("Stock Movement Analysis");

    try (
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement mystmt = connection.createStatement()
    ) {
        String fetchQuery = "SELECT id, productname, price, quantity, sold FROM Products";
        ResultSet resultset = mystmt.executeQuery(fetchQuery);
        int totalSalesRevenue = 0; // Variables to hold analysis data
        int remainingStockValue = 0;
        String mostPopularProduct = "";
        int mostSoldCount = 0;
        String leastPopularProduct = "";
        int leastSoldCount = Integer.MAX_VALUE;
        System.out.println("Stock Movement Summary:");
        while (resultset.next()) {// Process each row in the result set
            int id = resultset.getInt("id");
            String productName = resultset.getString("productname");
            int price = resultset.getInt("price");
            int quantity = resultset.getInt("quantity");
            int sold = resultset.getInt("sold");
            totalSalesRevenue += (price * sold);// Calculate total sales revenue
            remainingStockValue += (price * quantity);// Calculate remaining stock value
            if (sold > mostSoldCount) {// Determine most popular product
                mostSoldCount = sold;
                mostPopularProduct = productName;
            }
            if (sold < leastSoldCount) {// Determine least popular product
                leastSoldCount = sold;
                leastPopularProduct = productName;
            }
        }
        System.out.println("1. Total Sales Revenue: " + totalSalesRevenue);// Display results
        System.out.println("2. Remaining Stock Value: " + remainingStockValue);
        System.out.println("3. Most Popular Product: " + mostPopularProduct + " (Sold: " + mostSoldCount + ")");
        System.out.println("4. Least Popular Product: " + leastPopularProduct + " (Sold: " + leastSoldCount + ")");
    } catch (SQLException e) {
        System.out.println("Database error: " + e.getMessage());
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
}
    
    public static void subprogram4(){
        System.out.println("Suggestions");
        System.out.println("Under Construction");
    }
}
