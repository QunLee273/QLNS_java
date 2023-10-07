/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btl_qlns;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ACER
 */
public class ConnectDB {
    public Connection getConnection() throws ClassNotFoundException {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=QLTK";
            conn = DriverManager.getConnection(url);

            if(conn != null){
                System.out.println("Kết nối CSDL SQL Server thành công!");
            }

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.toString());
        }
        return conn;
    }
}

