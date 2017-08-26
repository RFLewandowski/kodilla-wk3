package gov.newworldorder.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class RealBookDB {

    @Autowired
    SessionFactory sessionFactory;

     public Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }
}