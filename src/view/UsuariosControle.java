/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.GasUsuarios;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author u05682855140
 */
public class UsuariosControle extends AbstractTableModel {
    private List lista;
    
    public void setList(List lista){
        this.lista = lista;
    }

    public GasUsuarios getbean(int linha){
    return (GasUsuarios) lista.get(linha);
        
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
    public Object getValueAt(int rowIndex, int columnIndex) {
        GasUsuarios gasUsuarios = (GasUsuarios) lista.get(rowIndex);
         if(columnIndex == 0){
           return gasUsuarios.getGasIdusuarios();
       } 
         if(columnIndex == 1){
           return gasUsuarios.getGasNome();
       } 
         if(columnIndex == 2){
           return gasUsuarios.getGasApelido();
       } 
         if(columnIndex == 3){
           return gasUsuarios.getGasCpf();
       } 
         
           return "";
    }
    
    
    @Override
    public String getColumnName(int columnIndex){
       if(columnIndex == 0){
           return "ID";
       } 
       if(columnIndex == 1){
           return "Nome";
       } 
       if(columnIndex == 2){
           return "Apelido";
       } 
       if(columnIndex == 3){
           return "Cpf";
       } 
       return "";
    }
}
