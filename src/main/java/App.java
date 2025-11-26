import java.sql.*;

public class App {
    public static void main(String[] args) throws SQLException {
        Connection connection;
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "root", "yearup");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM northwind.products");

        while(resultSet.next()) {
        String name = resultSet.getString("productName");
            System.out.println(name);
        }

        connection.close();

    }
}
