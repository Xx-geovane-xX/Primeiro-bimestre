/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.GasFornecedor;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author J.A NET
 */
public class FornecedorControle extends AbstractTableModel{
    
    private List lista;

    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }

    public GasFornecedor getbean(int linha) {
        return (GasFornecedor) lista.get(linha);

    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        GasFornecedor gasFornecedor = (GasFornecedor) lista.get(rowIndex);
        if (columnIndex == 0) {
            return gasFornecedor.getGasIdfornecedor();
        }
        if (columnIndex == 1) {
            return gasFornecedor.getGasNome();
        }
        if (columnIndex == 2) {
            return gasFornecedor.getGasApelido();
        }
        if (columnIndex == 3) {
            return gasFornecedor.getGasEmail();
        }
        if (columnIndex == 4) {
            return gasFornecedor.getGasTelefone();
        }
        

        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "ID";
        }
        if (columnIndex == 1) {
            return "Nome";
        }
        if (columnIndex == 2) {
            return "apelido";
        }
        if (columnIndex == 3) {
            return "Email";
        }
        if (columnIndex == 4) {
            return "Telefone";
        }
        return "";
    }

    
}
