/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author pingle
 */
public class connection {
    public static void connection(){
        String url = "jdbc:mysql://localhost:3306/jdbcoop";//replace jdbcoop with your table name
        String username = "root";//place username for myphp here
        String password ="admin1";//place password for myphp here
        

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password); //allows access since it has the right password and username
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select* from products");//db table is called products
            System.out.println("|ID|  |Product| |Price| |Quantity|  |Sold|");
            while(resultSet.next()){
                
                System.out.println("|" + resultSet.getInt(1)+ "|" + " " + "|" +resultSet.getString(2)+ "|" + " "+ "|" +resultSet.getInt(3)+ "|" +" " +"|" +resultSet.getInt(4)+"|"+ "|" +" " +"|" +resultSet.getInt(5)+"|" ); //gets each of the things in products like id, name, price, quantity
                
                
            }
        }
        catch(Exception e){
            System.err.println(e); //catches errors
        }
        
    }
}
