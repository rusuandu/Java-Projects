
import javax.swing.table.AbstractTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrei
 */
public class MyModel extends AbstractTableModel {
    
    private String[] columns;
    private Object[][] rows;
    
    public MyModel() {}
    
    public MyModel(Object[][] data, String[] colNames) {
        this.columns = colNames ;
        this.rows = data;
    }

    @Override
    public int getRowCount() {
        return this.rows.length;
    }

    @Override
    public int getColumnCount() {
        return this.columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       return this.rows[rowIndex][columnIndex];
    }
    
    @Override
    public String getColumnName(int col) {
        return this.columns[col];
    }
}
