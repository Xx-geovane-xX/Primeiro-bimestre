/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.GasCompra;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u05682855140
 */
public class CompraDAO extends DAO_Abstract{
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
        Criteria criteria = session.createCriteria(GasCompra.class);
        criteria.add(Restrictions.eq("gasIdcompra", id));
        List Lista = criteria.list();
        session.getTransaction().commit();
        
        
        
        return Lista.get(0);
    }

    @Override
    public List listALL() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(GasCompra.class);
        List Lista = criteria.list();
        session.getTransaction().commit();
        return Lista;
    }
    
              public List listFormaDePagamento(String formaDePagamento) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(GasCompra.class);
        criteria.add(Restrictions.like("gasFormaDePagamento", "%" + formaDePagamento + "%"));
        List Lista = criteria.list();
        session.getTransaction().commit();
        return Lista;
    }

    public List listValorTotalFormaDePagamento(double total, String formaDePagamento) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(GasCompra.class);
        criteria.add(Restrictions.le("gasTotal", total ));
        criteria.add(Restrictions.like("gasFormaDePagamento", "%" + formaDePagamento + "%"));
        List Lista = criteria.list();
        session.getTransaction().commit();
        return Lista;
    }

    public List listTotal(double total) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(GasCompra.class);
        criteria.add(Restrictions.le("gasTotal", total));
        List Lista = criteria.list();
        session.getTransaction().commit();
        return Lista;
    }
    

    public Object Buscar(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(GasCompra.class);
        criteria.add(Restrictions.like("gasIdcompra", id));
        List Lista = criteria.list();
        session.getTransaction().commit();
        if (!Lista.isEmpty()) {
            return Lista.get(0);
        }
        return null;
    }

}
