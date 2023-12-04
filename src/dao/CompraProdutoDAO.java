/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.GasCompra;
import bean.GasCompraProduto;
import bean.GasProduto;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u05682855140
 */
public class CompraProdutoDAO extends DAO_Abstract {

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
        session.delete(object);
        session.getTransaction().commit();
    }

   // public void deleteFk(int fk) {
     //   session.beginTransaction();
      //  Criteria criteria = session.createCriteria(GasCompraProduto.class);
      //  criteria.add(Restrictions.like("gasCompra", fk));
      //  List lista = criteria.list();
       // for (int i = 0; i < lista.size(); i++) {;
          //  Object object = lista.get(i);
       //     session.delete(lista);
       //}
     //   session.getTransaction().commit();
  //  }

//    public void deleteFk(int fk) {
//       session.beginTransaction();
//       session.flush();
//       session.clear();
//       Criteria criteria = session.createCriteria(GasCompraProduto.class);
//        criteria.add(Restrictions.eq("gasCompra", fk));
//        List Lista = criteria.list();
//       for (int vez = 0; vez < Lista; vez++) {
//                                session.delete();
//            }
//        
//        
//       session.delete(Lista);
//       session.getTransaction().commit();
//    }
    @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(GasCompraProduto.class);
        criteria.add(Restrictions.eq("idcompraProduto", id));
        List Lista = criteria.list();
        session.getTransaction().commit();
        return Lista.get(0);
    }

    @Override
    public List listALL() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(GasCompraProduto.class);
        List Lista = criteria.list();
        session.getTransaction().commit();
        return Lista;
    }

    public List listaProduto(GasCompra gasCompra) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(GasCompraProduto.class);
        criteria.add(Restrictions.eq("gasCompra", gasCompra));
        List Lista = criteria.list();
        session.getTransaction().commit();
        return Lista;
    }

}
