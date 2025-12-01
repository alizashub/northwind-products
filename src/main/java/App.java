import java.sql.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "root", "yearup");
            ResultSet resultSet = null;
            Scanner myScanner = new Scanner(System.in);

            System.out.println("What do you like to do?");
            System.out.println("1 - Display all products");
            System.out.println("2 - Display all customers");
            System.out.println("0 - Exit");
            System.out.print("Please enter your option:");

            int userOption = myScanner.nextInt();
            Statement statement = connection.createStatement();


            switch (userOption) {
                case 1 -> displayProducts(connection);
                case 2 -> displayCustomers(connection);
                case 0 -> System.out.println("Goodbye! You are not exiting the application.");
                default -> System.out.println("You have made an invalid choice.");
            }

        } catch (SQLException e) {
            System.err.println("We have an error" + e);
        }
    }

    resultSet =statement.

            executeQuery("SELECT ProductID, ProductName, UnitPrice, UnitsInStock FROM products");

        while(resultSet.

                next())

    {
        int id = resultSet.getInt("ProductID");
        String name = resultSet.getString("productName");
        double price = resultSet.getDouble("UnitPrice");
        int stock = resultSet.getInt("UnitsInStock");

        System.out.

                println("Product ID: " + id);
        System.out.

                println("Product Name: " + name);
        System.out.

                println("Product Price: " + price);
        System.out.

                println("Product Quantity In Stock: " + stock);
        System.out.

                println("*****************************");
    }
}else if(userOption ==2)

        {


        }

        }catch(
SQLException e){
        System.err.

println("We have an error"+e);

        }

                }
                }
