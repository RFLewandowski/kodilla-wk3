package gov.newworldorder.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class RealBookDB {

    @Autowired
    SessionFactory sessionFactory;

    public Session getCurrentSession() {
        System.out.println("TEST!!!!!!!!!!!!!");
        System.out.println("TEST!!!!!!!!!!!!!:"+sessionFactory.toString());
        return sessionFactory.getCurrentSession();
    }
}