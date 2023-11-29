/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.GasTipo;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u05682855140
 */
public class TipoDAO extends DAO_Abstract{

    @Override
    public void insert(Object object) {
       session.beginTransaction();
       session.save(object);
       session.getTransaction().commit();
    }

    @Override 
    public void update(Object object) {
       session.beginTransaction();
        session.flush();
       session.clear();
       session.update(object);
       session.getTransaction().commit();
       
    }

    @Override
    public void delete(Object object) {
       session.beginTransaction();
       session.flush();
       session.clear();
       session.delete( object);
       session.getTransaction().commit();
    }

    @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(GasTipo.class);
        criteria.add(Restrictions.eq("gasIdTipo", id));
        List Lista = criteria.list();
        session.getTransaction().commit();
        return Lista.get(0);
    }

    @Override
    public List listALL() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(GasTipo.class);
        List Lista = criteria.list();
        session.getTransaction().commit();
        return Lista;
    }
    
           public List listPeso(int peso) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(GasTipo.class);
        criteria.add(Restrictions.le("gasPeso", peso));
        List Lista = criteria.list();
        session.getTransaction().commit();
        return Lista;
    }

    public List listPesoPrecoMedio(int peso, int precoMedio) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(GasTipo.class);
        criteria.add(Restrictions.le("gasPeso",  peso ));
        criteria.add(Restrictions.le("gasPrecoMedio",  precoMedio));
        List Lista = criteria.list();
        session.getTransaction().commit();
        return Lista;
    }

    public List listPrecoMedio(int precoMedio) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(GasTipo.class);
        criteria.add(Restrictions.le("gasPrecoMedio", precoMedio ));
        List Lista = criteria.list();
        session.getTransaction().commit();
        return Lista;
    }
}
