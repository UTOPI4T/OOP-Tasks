package Meet_13;

import java.sql.*;
public class Meet_13_SQL {
public static void main(String[] args) {
    Connection connection = null;
        try {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_name","username"
        ,"password");
            System.out.println("Koneksi ke database berhasil!");
        } catch (SQLException e) {
    System.out.println("Koneksi ke database gagal!");
    e.printStackTrace();
        }
    }
}
import java.sql.*;
public class SelectQuery {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_name","username","password");
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM table_name");
        while(resultSet.next()) {
        System.out.println(resultSet.getInt("id") + " " +
        resultSet.getString("name"));
        }
        } catch (SQLException e) {
        e.printStackTrace();
        } finally {
        try {
        if(resultSet != null) resultSet.close();
        if(statement != null) statement.close();
        if(connection != null) connection.close();
        } catch (SQLException e) {
        e.printStackTrace();
    }
    }
 }
