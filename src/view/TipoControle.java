/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.GasTipo;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u05682855140
 */
public class TipoControle extends AbstractTableModel {
       List lista;
   
    
    public void setLista(List lista){
        this.lista =lista;
        this.fireTableDataChanged();
    }
    
    public GasTipo getBean(int row){
    return (GasTipo) lista.get(row);
    }
            
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int row, int column) {
       GasTipo GasTipo = (GasTipo) lista.get(row);
        if (column == 0) {
            return GasTipo.getGasIdTipo();
        }
        if (column == 1){
            return GasTipo.getGasNome();
        } 
        if (column == 2){
            return GasTipo.getGasDescricao();
        }
        if (column == 3){
            return GasTipo.getGasPeso();
        } 
        return null;
    }
    
      @Override
    public String getColumnName(int column){
     if (column == 0 )   {
         return "ID";
    }
     if (column == 1 )   {
         return "Nome";
    }
     if (column == 2 )   {
         return "descrição";
    }
     if (column == 3 )   {
         return "peso";
    }
     return null;
    }
    
}
