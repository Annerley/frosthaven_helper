package com.dl;

import com.dl.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.model.naming.CamelCaseToUnderscoresNamingStrategy;
import org.hibernate.cfg.Configuration;

import javax.naming.Context;
import javax.naming.InitialContext;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Properties;
import java.util.concurrent.BlockingDeque;

public class HibernateRunner {

    public static void main(String[] args) throws SQLException {



        Configuration configuration = new Configuration();
        configuration.setPhysicalNamingStrategy(new CamelCaseToUnderscoresNamingStrategy());
        configuration.addAnnotatedClass(User.class);
        configuration.configure();
        try (SessionFactory sessionFactory= configuration.buildSessionFactory();
             Session session = sessionFactory.openSession()) {

            session.beginTransaction();
            System.out.println("OK");

            User user = User.builder()
                    .username("maxim@gmail.com")
                    .firstname("Maxim")
                    .lastname("Rayev")
                    .birthDate(LocalDate.of(2000, 1, 19))
                    .age(20)
                    .build();

            session.save(user);
            session.getTransaction().commit();
        }



    }
}
