/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.GasFornecedor;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u05682855140
 */
public class FornecedorDAO extends DAO_Abstract{

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
        Criteria criteria = session.createCriteria(GasFornecedor.class);
        criteria.add(Restrictions.eq("gasIdfornecedor", id));
        List Lista = criteria.list();
        session.getTransaction().commit();
        return Lista.get(0);
    }

    @Override
    public List listALL() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(GasFornecedor.class);
         List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    
      public List listNome(String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(GasFornecedor.class);
        criteria.add(Restrictions.like("gasNome", "%" + nome + "%"));
        List Lista = criteria.list();
        session.getTransaction().commit();
        return Lista;
    }

    public List listApelidoNome(String apelido, String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(GasFornecedor.class);
        criteria.add(Restrictions.like("gasApelido", "%" + apelido + "%"));
        criteria.add(Restrictions.like("gasNome", "%" + nome + "%"));
        List Lista = criteria.list();
        session.getTransaction().commit();
        return Lista;
    }

    public List listApelido(String Apelido) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(GasFornecedor.class);
        criteria.add(Restrictions.like("gasApelido", "%" + Apelido + "%"));
        List Lista = criteria.list();
        session.getTransaction().commit();
        return Lista;
    }
}
