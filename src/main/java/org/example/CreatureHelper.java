package org.example;


import com.dl.HibernateUtil;
import com.dl.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class CreatureHelper {

    private SessionFactory sessionFactory;

    public CreatureHelper() { sessionFactory = HibernateUtil.getSessionFactory();}



    public int getHp (int id){

        Session session = sessionFactory.openSession();
        session.beginTransaction();


        Creature creature = session.get(Creature.class, id);

        session.getTransaction().commit();
        return creature.getHitPoints();
    }

    public int getIdByName (String str){

        Session session = sessionFactory.openSession();
        session.beginTransaction();


        //HQL example - Get Employee with id
        String hql = "SELECT E.id FROM Creature E";
        Query query = session.createQuery(hql);
        List results = query.list();


        session.getTransaction().commit();
        return Integer.valueOf(results.get(0).toString());
    }

    public Creature getCreature (int id){


        Session session = sessionFactory.openSession();
        session.beginTransaction();


        Creature creature = session.get(Creature.class, id);

        session.getTransaction().commit();
        return creature;

    }

    public void changeHp(Creature creature, int hp){

        int res = creature.getHitPoints() + hp;

        if (res < 0){
            res = 0;
        }
        if(res > creature.getMaxHp()){
            res = creature.getMaxHp();
        }
        creature.setHitPoints(res);
    }


}
