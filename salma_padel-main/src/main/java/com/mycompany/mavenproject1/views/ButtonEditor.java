package com.mycompany.mavenproject1.views;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultCellEditor;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTable;

public class ButtonEditor extends DefaultCellEditor {
    private JLabel button;

    public ButtonEditor() {
        super(new JTextField());
        button = new JLabel("Editar");
        button.setOpaque(true);
        button.setHorizontalAlignment(JLabel.CENTER);

        // Acción al hacer clic en el "botón"
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                // Acciones al hacer clic en el "botón"
                // Puedes agregar aquí lo que deseas que suceda al hacer clic en el "botón"
                //System.out.println("Botón clicado en la fila " + table.getSelectedRow());
            }
        });
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        return button;
    }
}


