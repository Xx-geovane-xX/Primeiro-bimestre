/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.GasProduto;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u05682855140
 */
public class ProdutoControle extends AbstractTableModel {
      List lista;
   
    
    public void setLista(List lista){
        this.lista =lista;
         this.fireTableDataChanged();
    }
    
    public GasProduto getBean(int row){
    return (GasProduto) lista.get(row);
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
       GasProduto gasProduto = (GasProduto) lista.get(row);
        if (column == 0) {
            return gasProduto.getGasIdproduto();
        }
        if (column == 1){
            return gasProduto.getGasNome();
        } 
        if (column == 2){
            return gasProduto.getGasTipo();
        }
        if (column == 3){
            return gasProduto.getGasValor();
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
         return "tipo";
    }
     if (column == 3 )   {
         return "Valor";
    }
     return null;
    }
}
