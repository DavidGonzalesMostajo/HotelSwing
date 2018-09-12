package edu.pe.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConexion {

    public static Connection conn = null;

    public static Connection getConexion() throws SQLException {

        if (conn == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/db_hotel", "root", "");
                System.out.println("Conexion exitosa");
                return conn;
            } catch (ClassNotFoundException e) {
                System.out.println("Conexion fallida");
                e.printStackTrace();
            }
        }

        return conn;
    }
}
