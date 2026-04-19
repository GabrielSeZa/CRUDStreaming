package crudstreaming;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    public static Connection conectar() {
        try {
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/streaming_db",
                "root",
                "2421$G"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}