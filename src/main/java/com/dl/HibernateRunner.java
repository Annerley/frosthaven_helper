package com.dl;

import com.dl.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.naming.Context;
import javax.naming.InitialContext;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.concurrent.BlockingDeque;

public class HibernateRunner {

    public static void main(String[] args) throws SQLException {



        Configuration configuration = new Configuration();
        configuration.configure();
        try (SessionFactory sessionFactory= configuration.buildSessionFactory();
             Session session = sessionFactory.openSession()) {
            System.out.println("OK");

            User user = User.builder().build();

        }




    }
}
