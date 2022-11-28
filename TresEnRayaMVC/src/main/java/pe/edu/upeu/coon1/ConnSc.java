/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.coon1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class ConnSc {

    private static volatile ConnSc instance;
    private static volatile Connection connection;

    private ConnSc() {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create ");
        }
        if (connection != null) {
            throw new RuntimeException("Use getConnection() method to create ");
        }
    }
    
    public static ConnSc getInstance() {
        if (instance == null) {
            synchronized (ConnSc.class) {
                if (instance == null) {
                    instance = new ConnSc();
                    System.out.println("Se instancio ConnS");
                }
            }
        }
        return instance;
    }


public Connection getConnection() {
        if (connection == null) {
            synchronized (ConnSc.class) {
                if (connection == null) {
                    try {
                        String dbUrl= "jdbc:sqlite:data/db_tresray.db?foreign_keys=on;";
                        connection = DriverManager.getConnection(dbUrl);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return connection;
    }
}
