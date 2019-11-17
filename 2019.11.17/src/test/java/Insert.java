import org.dao.impl.UserDaoImpl;
import org.vo.UserTable;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;
public class Insert {
    @Test
    public void fun1() {

        Configuration conf = new Configuration().configure();

        SessionFactory sessionFactory = conf.buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction tx = session.beginTransaction();
/******************************************************/
        UserTable userTable =new UserTable();
        userTable.setUsername("fuck hib1");
//        brand.setId((long) 231);
        userTable.setPassword("11111");
        session.save(userTable);
/******************************************************/
        tx.commit();
        session.close();
        sessionFactory.close();

    }
    @Test
    public void UserDaoTest(){
        UserDaoImpl userDao=new UserDaoImpl();
        UserTable userTable=new UserTable();
        userTable.setUsername("miaoz");
        userTable.setPassword("123");
        System.out.println(userDao.LoginCheck(userTable));
    }
    @Test
    public  void UseDaoInserttest(){
        UserDaoImpl userDao=new UserDaoImpl();
        UserTable userTable=new UserTable();
        userTable.setUsername("miaoz");
        userTable.setPassword("123");
        System.out.println(userDao.addUser(userTable));
    }

}
