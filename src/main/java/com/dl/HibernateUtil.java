package com.dl;

import com.dl.entity.User;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.model.naming.CamelCaseToUnderscoresNamingStrategy;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory sessionFactory;

    static {
        final StandardServiceRegistry registry= new StandardServiceRegistryBuilder()
                .configure()
                .build();
        try{

            Configuration configuration = new Configuration();
            configuration.setPhysicalNamingStrategy(new CamelCaseToUnderscoresNamingStrategy());
            configuration.addAnnotatedClass(User.class);
            configuration.configure();
            sessionFactory = configuration.buildSessionFactory();


        }
        catch(Exception e){

            StandardServiceRegistryBuilder.destroy(registry);
        }

    }

    public static SessionFactory getSessionFactory() { return sessionFactory; }
}
