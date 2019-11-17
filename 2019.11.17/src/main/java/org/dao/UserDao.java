package org.dao;

import org.vo.UserTable;

public interface UserDao {
    public boolean LoginCheck(UserTable userTable);
    public boolean addUser(UserTable userTable);
}
