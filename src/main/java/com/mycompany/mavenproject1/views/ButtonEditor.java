package com.mycompany.mavenproject1.views;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ButtonEditor extends DefaultCellEditor {
    private JButton button;
    private JTable table;
    private DefaultTableModel tableModel;
    
    public ButtonEditor(JTable table, DefaultTableModel tableModel) {
        super(new JTextField());
        this.table = table;
        this.tableModel = tableModel;

        button = new JButton("Editar");
        button.setOpaque(true);
        button.setHorizontalAlignment(JLabel.CENTER);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("hola");
                /*int selectedRow = table.convertRowIndexToModel(table.getSelectedRow());
                String dni = (String) tableModel.getValueAt(selectedRow, 6); // Assuming DNI is in column 6
                System.out.println("DNI: "+ dni);
                JOptionPane.showMessageDialog(table, "DNI: " + dni);*/
            }
        });
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        return button;
    }
}



