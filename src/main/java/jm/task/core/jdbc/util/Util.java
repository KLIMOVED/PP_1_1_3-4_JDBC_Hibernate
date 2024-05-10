package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    public static final String URL = "jdbc:mysql://localhost:3306/mydb";
    public static final String USER = "klim";
    public static final String PASSWORD = "klim";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Соединение с БД установлено!");
        } catch (SQLException e) {
            System.out.println("Ошибка соединения с БД! " + e.getMessage());
        }
        return connection;
    }
}
