# oop-capstone
oop capstone done during 2nd year 1st sem

Documentation for Inventory and Management System V2.01

Authored by Aaron Teng

This program is designed for small scale businesses for more efficient stock management. Users can check inventory, edit product details, analyze stock movement, and suggest future improvements to the program. It also includes a login feature for security.

Features
The program currently has 4 main features. 

Login System: Users need to log in using a valid username and password to access the system.
Check Inventory: Displays the current inventory details including product name, price, quantity, and sold units.
Edit Inventory: Allows users to update the quantity and sold units of products in the inventory.
Stock Movement Analysis: Provides insights into product sales trends for better decision-making.

Prerequisites
Ensure that the following are installed:
Java Runtime Environment version 11 or higher
Xaamp Control Panel
Netbeans Apache
Jdbc library

Installation and setup
Download the programs source code
Open the application in netbeans ide
Ensure that the username and password in subprograms.subprogram2 and connection.connection are the same with your myphp home login.
If you have not set up your myphp and have the default then please delete the text in both strings
Create a new table for your program and change the string url tojdbc:mysql://localhost:3306/(your table name) in subprograms.subprogram2 and connection.connection
Import the sql database into your sqldatabase. navigate to the import topbar buttonand locate the sql file 
Before launching the application ensure that your xaamp is on and both apache and mysql services are running
Create a java program using netbeans and select build with ant
Import the program files into your project
Make sure to attach the jdbc library jar file to the libraries folder
To launch the application please run the oopcapstone java file.
The application should be running now.


Common troubleshooting
Error: java.lang.ClassNotFoundException: com.mysql.cj.jdbc.Driver

Solution: Ensure the MySQL Connector/J library is included in your project dependencies.

Error: Access Denied for User 'root'@'localhost'

Solution: Verify your MySQL username and password in the program.

Program Does Not Start:

Solution: Check if the database is running and accessible.
