import java.sql.*;
import org.apache.commons.dbcp2.BasicDataSource;

public class App {
    public static void main(String[] args) {

        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/northwind");
        dataSource.setUsername("root");
        dataSource.setPassword("yearup");

        try (
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "root", "yearup");
                Statement statement = connection.createStatement();
                ResultSet resultSetProducts = statement.executeQuery("SELECT ProductID, ProductName, UnitPrice, UnitsInStock FROM products");
                ) {
            System.out.println("Products");
            while (resultSetProducts.next()) {
                int id = resultSetProducts.getInt("ProductID");
                String name = resultSetProducts.getString("productName");
                double price = resultSetProducts.getDouble("UnitPrice");
                int stock = resultSetProducts.getInt("UnitsInStock");

                System.out.println("Product ID: " + id);
                System.out.println("Product Name: " + name);
                System.out.println("Product Price: " + price);
                System.out.println("Product Quantity In Stock: " + stock);
                System.out.println("*****************************");
            }

            ResultSet resultSetCustomer = statement.executeQuery("SELECT ContactName, CompanyName, City, Country, Phone " + "FROM customers ORDER BY Country");

            System.out.println("Customers");
            while (resultSetCustomer.next()) {
                String contact = resultSetCustomer.getString("ContactName");
                String company = resultSetCustomer.getString("CompanyName");
                String city = resultSetCustomer.getString("City");
                String country = resultSetCustomer.getString("Country");
                String phone = resultSetCustomer.getString("Phone");

                System.out.println("Contact : " + contact);
                System.out.println("Company : " + company);
                System.out.println("City    : " + city);
                System.out.println("Country : " + country);
                System.out.println("Phone   : " + phone);
                System.out.println("*****************************");

            }
        } catch (SQLException e) {
            System.out.println("Error" + e);
        }
    }

}