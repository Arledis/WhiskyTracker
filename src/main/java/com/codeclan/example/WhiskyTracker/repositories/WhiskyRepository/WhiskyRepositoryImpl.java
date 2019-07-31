package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;


import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class WhiskyRepositoryImpl implements WhiskyRepositoryCustom {
    @Autowired
    EntityManager entityManager;


//    @Override
//    public List<Whisky> findWhiskyByYear(int age) {
//        return null;
//    }

    @Transactional
    public List<Whisky> findWhiskyByDistilleryAndAge(String distillery, int age){
        List<Whisky> result = null;
        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(Whisky.class);
            cr.createAlias("distillery", "distillery");
            cr.add(Restrictions.eq("distillery.name", distillery ));
            cr.add(Restrictions.eq("age", age));
            result = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return result;


    }

    @Transactional
    public List<Whisky> findAllWhiskyByRegion(String region) {
        List<Whisky> result = null;
        Session session = entityManager.unwrap(Session.class);
        try{
            Criteria cr = session.createCriteria(Whisky.class);
            cr.createAlias("distillery", "distillery");
            cr.add(Restrictions.eq("distillery.region", region));
            result = cr.list();
        } catch (HibernateException e){
            e.printStackTrace();
        }
        return result;
    }


}
