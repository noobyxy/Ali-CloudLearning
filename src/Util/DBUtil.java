package Util;

import java.sql.*;

public class DBUtil {
    private static String driverClass = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/user_login";
    private static String username = "root";
    private static String password = "YJBcsh00..";

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("error_mysql");
        }
    }


    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

    public static void Close(ResultSet rs, PreparedStatement pstm,Connection connection) throws SQLException {
        if (!rs.isClosed()) {
            rs.close();
        }
        if (!pstm.isClosed()) {
            pstm.close();
        }
        if (!connection.isClosed()) {
            connection.close();
        }
    }
}
