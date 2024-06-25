
package btl_qlns;

import java.sql.*;

/**
 *
 * @author ACER
 */
public class ConnectDB {
    public Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/QLNS";
            String user = "root";
            String pass = "";
            conn = DriverManager.getConnection(url, user, pass);

            if(conn != null){
                System.out.println("Kết nối CSDL SQL Server thành công!");
            }

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.toString());
        }
        return conn;
    }
}

