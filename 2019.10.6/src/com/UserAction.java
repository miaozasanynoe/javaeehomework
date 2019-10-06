package com;
import java.sql.*;
import com.opensymphony.xwork2.ActionSupport;
import dao.Dao;
@SuppressWarnings("serial")
public class UserAction extends ActionSupport{
    private Dao dao = new Dao();
    private String username;
    private String password;
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String login() {
        String sql = "select * from UserInfo where username='" + getUsername()+"' and userpassword ='"+getPassword()+"'";
        ResultSet rS = dao.executeQuery(sql);
        try {
            if (rS.next()) {
                return "loginin";
            }
            return "loginout";
        } catch (SQLException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
            return "loginout";
        }
    }
    public String regist() {
        String sql = "insert into UserInfo(username,userpassword) values('"+getUsername()+"','"+getPassword()+"')";
        int i = dao.executeUpdate(sql);
        if (i > -1) {
            return "success";
        }
        return "error";
    }
}