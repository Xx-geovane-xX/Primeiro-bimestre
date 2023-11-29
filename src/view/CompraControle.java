/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.GasCompra;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author geova
 */
public class CompraControle extends AbstractTableModel{
      private List lista;

    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }

    public GasCompra getbean(int linha) {
        return (GasCompra) lista.get(linha);

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
        GasCompra gasCompra = (GasCompra) lista.get(rowIndex);
        if (columnIndex == 0) {
            return gasCompra.getGasIdcompra();
        }
        if (columnIndex == 1) {
            return gasCompra.getGasFormaDePagamento();
        }
        if (columnIndex == 2) {
            return gasCompra.getGasValorTotal();
        }
        if (columnIndex == 3) {
            return gasCompra.getGasDataCompra();
        }
        if (columnIndex == 4) {
            return gasCompra.getGasNumeroDaFatura();
        }
        

        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "ID";
        }
        if (columnIndex == 1) {
            return "Forma de Pagamento";
        }
        if (columnIndex == 2) {
            return "Valor Total";
        }
        if (columnIndex == 3) {
            return "Data da Compra";
        }
        if (columnIndex == 4) {
            return "Numero da Fatura";
        }
        return "";
    }

    
}
