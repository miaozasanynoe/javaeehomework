import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;
import org.util.HibernateSessionFactory;
import org.vo.Cj;
import org.vo.CjPK;

public class Exert3 {

    @Test
    public void insert(){
        Session session= HibernateSessionFactory.getSession();
        Transaction transaction =session.beginTransaction();
        CjPK cjPK=new CjPK();
        cjPK.setXh("123");
        cjPK.setKch("001");
        Cj cj=new Cj();
        cj.setId(cjPK);
        cj.setCj(120);
        session.save(cj);
        transaction.commit();
    }
    @Test
    public void update(){
        Session session= HibernateSessionFactory.getSession();
        Transaction transaction =session.beginTransaction();
        CjPK cjPK=new CjPK();
        cjPK.setXh("123");
        cjPK.setKch("001");
        Cj cj=(Cj)session.load(Cj.class,cjPK);
        cj.setCj(100);
        session.save(cj);
        transaction.commit();
    }
    @Test
    public void delete(){
        Session session= HibernateSessionFactory.getSession();
        Transaction transaction =session.beginTransaction();
        CjPK cjPK=new CjPK();
        cjPK.setXh("123");
        cjPK.setKch("001");
        Cj cj=(Cj)session.load(Cj.class,cjPK);
        session.delete(cj);
        transaction.commit();
    }
    @Test
    public void serch(){
        Session session= HibernateSessionFactory.getSession();
        Transaction transaction =session.beginTransaction();
        CjPK cjPK=new CjPK();
        cjPK.setXh("123");
        cjPK.setKch("001");
        Cj cj=(Cj)session.load(Cj.class,cjPK);
        System.out.println(cj.toString());
        transaction.commit();
    }
}
