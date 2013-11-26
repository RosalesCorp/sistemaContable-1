/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacontable;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Wilfredo
 */
public class TipoCuentaTableModel extends AbstractTableModel{
    List<TipoCuenta> tiposCuenta = new ArrayList<>();

    @Override
    public int getRowCount() {
        return tiposCuenta.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        TipoCuenta tc=  tiposCuenta.get(rowIndex);
        Object valor = null;
        
        switch(columnIndex){
            case 0: valor = tc.getIdTipoCuenta();
                break;
            case 1: valor = tc.getNombreCuenta();
                break;
            case 2: valor = tc.getNombreCuenta();
        }
        
        return valor;   
    }
}
