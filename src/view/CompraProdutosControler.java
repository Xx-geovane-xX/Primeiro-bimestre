/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.GasCompraProduto;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import tools.Util;

/**
 *
 * @author geova
 */
public class CompraProdutosControler extends AbstractTableModel {

    private List lista;

    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }

    public GasCompraProduto getbean(int linha) {
        return (GasCompraProduto) lista.get(linha);

    }

    public void addBean(GasCompraProduto gasCompraProduto) {
        lista.add(gasCompraProduto);
        this.fireTableDataChanged();

    }

    public void removeBean(int index) {
        lista.remove(index);
        this.fireTableDataChanged();

    }

    public void updateBean(int index, GasCompraProduto gasCompraProduto) {
        lista.set(index, gasCompraProduto);
        this.fireTableDataChanged();

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
        GasCompraProduto gasCompraProduto = (GasCompraProduto) lista.get(rowIndex);
        if (columnIndex == 0) {
            return gasCompraProduto.getGasIdcompraProduto();
        }
        if (columnIndex == 1) {
            return gasCompraProduto.getGasValorUnitario();
        }
        if (columnIndex == 2) {
            return gasCompraProduto.getGasQuantidade();
        }
        if (columnIndex == 3) {
            double quant = Util.intDouble(gasCompraProduto.getGasQuantidade());
            double valor = gasCompraProduto.getGasValorUnitario();

            return quant * valor;
        }

        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "ID";
        }
        if (columnIndex == 1) {
            return "Valor Unitario";
        }
        if (columnIndex == 2) {
            return "Quantidade";
        }
        if (columnIndex == 3) {
            return "Valor total";
        } 
        return "";
    }

}
