package org.action;

import com.opensymphony.xwork2.*;
import org.dao.impl.UserDaoImpl;
import org.vo.UserTable;

public class UserAction extends ActionSupport {
    private UserTable userTable;
    private String message;

    public UserTable getUserTable() {
        return userTable;
    }

    public void setUserTable(UserTable userTable) {
        this.userTable = userTable;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public String Login(){
        UserDaoImpl userDao=new UserDaoImpl();
        if(userDao.LoginCheck(userTable)){
            return SUCCESS;
        }
        return ERROR;
    }
    public String Regist(){
        UserDaoImpl userDao=new UserDaoImpl();
        if(userDao.addUser(userTable)){
            return SUCCESS;
        }
        return ERROR;
    }
}
