package com;
import java.sql.*;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import com.opensymphony.xwork2.ActionContext;
import dao.Dao;
@SuppressWarnings("serial")
public class UserAction extends ActionSupport{
    private Dao dao = new Dao();
    private String username;
    private String password;
    private  String newpassword;
    public String getNewpassword() {
        return newpassword;
    }

    public void setNewpassword(String newpassword) {
        this.newpassword = newpassword;
    }

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
                ActionContext actionContext = ActionContext.getContext();
                Map session = actionContext.getSession();
                session.put("username",getUsername());
                session.put("userpassword",getPassword());
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
            ActionContext actionContext = ActionContext.getContext();
            Map session = actionContext.getSession();
            session.put("username",getUsername());
            session.put("userpassword",getPassword());
            return "success";
        }
        return "error";
    }
    public  String update(){
        if(login().equals("loginin")) {
            System.out.println("密码验证成功");
            String sql = "update UserInfo set userpassword='" + getNewpassword() + "' where username='" + getUsername() + "'";
            System.out.println(sql);
            int i = dao.executeUpdate(sql);
            if (i > -1) {
                System.out.println("修改密码成功");
                return "success";
            }
        }
        else {
            System.out.println("密码验证失败");
        }
        return "error";
    }
}