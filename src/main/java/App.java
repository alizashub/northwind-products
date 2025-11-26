import java.sql.*;

public class App {
    public static void main(String[] args) throws SQLException {
        Connection connection;
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "root", "yearup");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT ProductID, ProductName, UnitPrice, UnitsInStock FROM products");

        while(resultSet.next()) {
            int id = resultSet.getInt("ProductID");
            String name = resultSet.getString("productName");
            double price = resultSet.getDouble("UnitPrice");
            int stock = resultSet.getInt("UnitsInStock");

            System.out.println("Product ID: " + id);
            System.out.println("Product Name: " + name);
            System.out.println("Product Price: " + price);
            System.out.println("Product Quantity In Stock: " + stock);
            System.out.println("*****************************");
        }

        connection.close();

    }
}
