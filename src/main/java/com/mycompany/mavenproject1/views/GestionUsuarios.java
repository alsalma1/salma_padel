package com.mycompany.mavenproject1.views;

import com.mycompany.mavenproject1.controllers.AppController;
import com.mycompany.mavenproject1.models.Usuario;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class GestionUsuarios extends javax.swing.JFrame {
    private AppController appController;

    public void setAppController(AppController appController) {
        this.appController = appController;
    }

    public GestionUsuarios() {
        initComponents();
        setTitle("Gestión usuarios");
       // setExtendedState(JFrame.MAXIMIZED_BOTH);
       setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelUsuarios = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUsuarios = new javax.swing.JTable();
        returnIcon = new javax.swing.JLabel();
        addIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Email", "Nombre", "Apellido", "Contraseña", "Fecha nacimiento", "Teléfono", "DNI", "Socio", "Editar", "Eliminar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableUsuarios);
        if (tableUsuarios.getColumnModel().getColumnCount() > 0) {
            tableUsuarios.getColumnModel().getColumn(0).setResizable(false);
        }

        returnIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                returnIconMouseEntered(evt);
            }
        });

        addIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addIconMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 973, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(returnIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(334, 334, 334))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(returnIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(addIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(labelUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnIconMouseEntered
        // TODO add your handling code here:
        this.returnIcon.setCursor(new Cursor(Cursor.HAND_CURSOR));
        returnIcon.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int num = 1;
                // Lógica para manejar el evento de clic en el icono
                setVisible(false);
                AppController appController = new AppController();
                appController.volverAtras(num);
            }
        });
    }//GEN-LAST:event_returnIconMouseEntered

    private void addIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addIconMouseEntered
        // TODO add your handling code here:
        this.addIcon.setCursor(new Cursor(Cursor.HAND_CURSOR));
        addIcon.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                AppController appController = new AppController();
                appController.mostrarVentanaAñadirUsuario(GestionUsuarios.this);
            }
        });
    }//GEN-LAST:event_addIconMouseEntered


    public void cargarUsuariosEnTabla(List<Usuario> usuarios) {
        DefaultTableModel model = (DefaultTableModel) tableUsuarios.getModel();
        model.setRowCount(0); // Limpiar la tabla antes de cargar los datos
      
        ButtonRenderer buttonRendererEdit = new ButtonRenderer();
        ButtonRenderer buttonRendererDelete = new ButtonRenderer();

        tableUsuarios.getColumnModel().getColumn(8).setCellRenderer(buttonRendererEdit);
        tableUsuarios.getColumnModel().getColumn(9).setCellRenderer(buttonRendererDelete);
        tableUsuarios.getColumnModel().getColumn(8).setCellEditor(new NonEditableEditor(new JTextField()));
        
        for (Usuario usuario : usuarios) {
            String esSocio = usuario.getSocio() ? "Sí" : "No";
            Object[] row = {
                    usuario.getEmail(),
                    usuario.getNombre(),
                    usuario.getApellido(),
                    usuario.getContrasena(),
                    usuario.getFecha_nacimiento(),
                    usuario.getTelefono(),
                    usuario.getDni(),
                    esSocio,
                    "Editar",
                    "Eliminar"
            };
            model.addRow(row);
        }
        tableUsuarios.setRowHeight(40);
        // Asignar MouseListener al botón para manejar el clic
        tableUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            int column = tableUsuarios.getColumnModel().getColumnIndexAtX(evt.getX());
            int row = evt.getY() / tableUsuarios.getRowHeight();

            if (row < tableUsuarios.getRowCount() && column == 8) {
                String dni = tableUsuarios.getValueAt(row, 6).toString();
                buttonRendererEdit.buttonEditAction(dni, GestionUsuarios.this);
            } else if (row < tableUsuarios.getRowCount() && column == 9) {
                String dni = tableUsuarios.getValueAt(row, 6).toString();
                buttonRendererDelete.buttonDeleteAction(dni);
            }
        }
        });       
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addIcon;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel labelUsuarios;
    private javax.swing.JLabel returnIcon;
    public javax.swing.JTable tableUsuarios;
    // End of variables declaration//GEN-END:variables
}
