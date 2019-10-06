package dao;
import java.sql.*;
public class Dao {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://106.54.23.221:3306/homework";

    static final String USER = "root";
    static final String PASS = "miaoz1103";
    Connection con = null;
    Statement stat = null;
    ResultSet rs = null;
    public Dao() {
        try {
            Class.forName(JDBC_DRIVER);
            con = DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("连接成功");
            stat = con.createStatement();
        } catch (Exception e) {
// TODO: handle exception
            System.out.println("连接失败");
            con = null;
        }
    }
    public static void main(String[] args) {
        Dao d=new Dao();
    }
    public ResultSet executeQuery(String sql) {
        try {
            rs = stat.executeQuery(sql);
        } catch (Exception e) {
// TODO: handle exception
            rs = null;
        }
        return rs;
    }
    public int executeUpdate(String sql) {
        try {
            stat.executeUpdate(sql);
            return 0;
        } catch (Exception e) {
// TODO: handle exception
        }
        return -1;
    }
}