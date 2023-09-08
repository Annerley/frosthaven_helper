package com.dl.entity;

import com.dl.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class UserHelper {

    private SessionFactory sessionFactory;

    public UserHelper() { sessionFactory = HibernateUtil.getSessionFactory();}

    public String getLastName (){

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        User user = session.get(User.class, "maxim@gmail.com");

        session.getTransaction().commit();
        return user.getLastname();
    }
}
