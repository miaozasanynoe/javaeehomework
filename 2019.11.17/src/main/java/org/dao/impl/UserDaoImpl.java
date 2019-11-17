package org.dao.impl;

import org.dao.UserDao;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.hibernate.Transaction;
import org.util.HibernateSessionFactory;
import org.vo.UserTable;

import java.util.List;

public class UserDaoImpl implements UserDao {
    public boolean LoginCheck(UserTable userTable) {
        Session session=null;
        Transaction tx=null;
        UserTable userTable2=null;
        List<UserTable> userTableList;
        System.out.println(userTable.toString());
        try {
            session= HibernateSessionFactory.getSession();
            tx=session.beginTransaction();
            Query query= session.createQuery("from UserTable where username=:name and password=:password");
            query.setParameter("name",userTable.getUsername());
            query.setParameter("password",userTable.getPassword());
          //  System.out.println(query.uniqueResult().toString());
            userTableList=query.list();
            tx.commit();
        }catch (Exception e) {
            if (tx != null)tx.rollback();
            e.printStackTrace();
            return false;
        }
        if(userTableList.isEmpty()){
            return false;
        }
        return true;
    }
    public boolean addUser(UserTable userTable) {
        Session session=null;
        Transaction tx=null;
        UserTable userTable2=null;
        List<UserTable> userTableList;
        System.out.println(userTable.toString());
        try {
            session= HibernateSessionFactory.getSession();
            tx=session.beginTransaction();
            session.save(userTable);
            tx.commit();
        }catch (Exception e) {
            if (tx != null)tx.rollback();
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
