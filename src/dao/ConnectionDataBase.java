package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDataBase {
    private static String URL_MYSQL = "jdbc:mysql://localhost/pedidos";
    private static String DRIVER = "com.mysql.jdbc.Driver";
    private static String PASSWORD = "root";
    private static String USER = "root";

    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL_MYSQL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } catch (SQLException e){
            throw new RuntimeException(e);
        }
            return null;
        }
    }