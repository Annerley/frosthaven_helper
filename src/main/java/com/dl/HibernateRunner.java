package com.dl;

import com.dl.entity.User;
import com.dl.entity.UserHelper;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.model.naming.CamelCaseToUnderscoresNamingStrategy;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.List;

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



        String lastname  = new UserHelper().getLastName();
        System.out.println(lastname);







    }
}
