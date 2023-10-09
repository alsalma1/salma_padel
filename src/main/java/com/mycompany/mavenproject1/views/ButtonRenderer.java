package com.mycompany.mavenproject1.views;

import com.mycompany.mavenproject1.controllers.AppController;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

class ButtonRenderer extends DefaultTableCellRenderer {
    private JButton buttonEdit;
    private JButton buttonDelete;
    private boolean editActionExecuted = false;
    private boolean deleteActionExecuted = false;

    public ButtonRenderer() {
        buttonEdit = new JButton("Editar");
        buttonDelete = new JButton("Eliminar");
        buttonEdit.setBackground(Color.decode("#00CC66"));
        buttonDelete.setBackground(Color.decode("#E32525"));
    }

    public void buttonEditAction(String dni, GestionUsuarios gestionarUsuarios) {
        // Verificar si la acción ya se ejecutó para no cada vez que se clica en el boton llamar al metodo mostrarDatosUusario
        if (!editActionExecuted) {
            // Acción específica para el botón
            AppController appController = new AppController();
            appController.mostrarDatosUsuario(dni, gestionarUsuarios);
            editActionExecuted = true;  // Marcar que la acción se ejecutó
        }
    }

    public void buttonDeleteAction(String dni) {
        if (!deleteActionExecuted) {
            deleteActionExecuted = true;
            AppController appController = new AppController();
            appController.desactivarUsuario(dni);
        }
    }
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        if (column == 8) {
            return buttonEdit;
        } else if (column == 9) {
            return buttonDelete;
        }
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }
}


