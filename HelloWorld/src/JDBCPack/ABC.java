package JDBCPack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ABC {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            String url = "jdbc:mysql://localhost:3306/scott";
            String userName = "root";
            String passWord = "prabhasasindran123";
            con = DriverManager.getConnection(url, userName, passWord);
            System.out.println("Connected");
            String sql = "INSERT INTO sample (name, city) VALUES (?, ?)";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, "Anju");
            pstmt.setString(2, "Bihar");
            pstmt.executeUpdate();
            System.out.println("Inserted data");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
