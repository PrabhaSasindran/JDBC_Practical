package JDBCPack;

import java.sql.*;
import java.util.Scanner;

public class IUDJDBC {
    public static void main(String[] args){
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/scott";
        String userName = "root";
        String passWord = "prabhasasindran123";
        try {
            Scanner sc = new Scanner(System.in);
            boolean lol = true;
            con = DriverManager.getConnection(url,userName,passWord);
            Statement stmt = con.createStatement();
            while(lol)
            {
                System.out.println("Press 1 for Update");
                System.out.println("Press 2 for Delete");
                System.out.println("Press 3 for Insert");
                System.out.println("Press 4 for Cancel");
                System.out.println("Press 5 for reading data");
                System.out.println();
                System.out.println("++++++++++++++++++++++ +++++++++++++++++++++++++++");
                System.out.println();
                System.out.println("Pls Enter u r choice");
                int a = sc.nextInt();
                sc.nextLine();
                switch (a)
                {
                    case 1:update(stmt,sc);
                    break;

                    case 2: Delete(stmt,sc);
                    break;

                    case 3:insert(stmt,sc);
                    break;

                    case 4:lol=false;
                    break;

                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public static void insert(Statement stmt,Scanner sc) throws SQLException {
        System.out.println("Enter the name to be inserted");
        String name = sc.nextLine();
        System.out.println("Enter the city to be inserted");
        String city = sc.nextLine();
        String sql = "insert into sample values('"+name+"','"+city+"')";
        stmt.execute(sql);
    }
    public static void update(Statement stmt, Scanner sc) throws SQLException {
        System.out.println("Enter the name to update");
        String name = sc.nextLine();
        System.out.println("Enter the new name");
        String name1 = sc.nextLine();
        String sql = "update sample set name ='"+name1+"' where name ='"+name+"'";
        stmt.executeUpdate(sql);
    }
    public static void Delete(Statement stmt, Scanner sc) throws SQLException {
        System.out.println("Enter the name to be deleted");
        String name = sc.nextLine();
        String sql = "Delete from sample where name ='"+name+"'";
        stmt.execute(sql);
    }
    public static void Read(Statement stmt,Scanner sc){
        System.out.println("Enter the name");
        String name = sc.nextLine();
        String sql = "Select * from sample where name='"+name+"'";
        ResultSet rs = stmt.executeQuery(sql);
    }
}
