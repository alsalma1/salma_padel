package com.mycompany.mavenproject1.views;

import com.mycompany.mavenproject1.controllers.AppController;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AñadirUsuario extends javax.swing.JFrame {

    public AñadirUsuario() {
        initComponents();
        setTitle("Añadir nuevo usuario");
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fieldNombre = new javax.swing.JTextField();
        fieldApellido = new javax.swing.JTextField();
        fieldDni = new javax.swing.JTextField();
        fieldEmail = new javax.swing.JTextField();
        boxSocio = new javax.swing.JComboBox<>();
        btnAñadir = new javax.swing.JButton();
        fieldTelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fieldFecha = new com.toedter.calendar.JDateChooser();
        returnIcon = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido");

        jLabel3.setText("DNI");

        jLabel4.setText("Email");

        jLabel6.setText("Teléfono");

        jLabel7.setText("Socio");

        fieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNombreActionPerformed(evt);
            }
        });
        fieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldNombreKeyTyped(evt);
            }
        });

        fieldDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldDniActionPerformed(evt);
            }
        });

        boxSocio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sí", "No" }));
        boxSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxSocioActionPerformed(evt);
            }
        });

        btnAñadir.setText("Añadir");
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });

        fieldTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldTelefonoActionPerformed(evt);
            }
        });
        fieldTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldTelefonoKeyTyped(evt);
            }
        });

        jLabel5.setText("Fecha nacimiento");

        fieldFecha.setDateFormatString("yyyy-MM-dd");

        returnIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                returnIconMouseEntered(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setText("Añadir nuevo usuario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boxSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(fieldFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(68, 68, 68)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(fieldNombre)
                                        .addComponent(fieldApellido)
                                        .addComponent(fieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(120, 120, 120))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(returnIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(btnAñadir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(fieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(fieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(fieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(boxSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(returnIcon)
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnAñadir)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        Calendar calendar = Calendar.getInstance();
        Date fechaActual = calendar.getTime();

        // Establecer la fecha actual como el límite máximo para la selección
        fieldFecha.setMaxSelectableDate(fechaActual);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boxSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxSocioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxSocioActionPerformed

    private void fieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNombreActionPerformed

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        //El boton para añadir el usuario
        String nombre, apellido, dni, email, telef, socio;
        Date fecha;
        
        nombre = fieldNombre.getText();
        apellido = fieldApellido.getText();
        dni = fieldDni.getText();
        email = fieldEmail.getText();
        telef = fieldTelefono.getText();
        socio = boxSocio.getSelectedItem().toString();
        fecha = fieldFecha.getDate();

            // Verificar que los campos no estén vacíos
        if (nombre.isEmpty() || apellido.isEmpty() || dni.isEmpty() || email.isEmpty() ||
                telef.isEmpty() || socio.isEmpty() || fecha == null) {
            // Mostrar un mensaje indicando que todos los campos deben estar llenos
            if(fecha == null){
                JOptionPane.showMessageDialog(null, "Por favor, selecciona una fecha válida");
            }
            else{
            // Mostrar un mensaje indicando que todos los campos deben estar llenos
            JOptionPane.showMessageDialog(this, "Todos los campos deben estar llenos", "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
            }        
        } else {
            // Llamar a la función para añadir el usuario solo si todos los campos están llenos
            AppController appController = new AppController();
            appController.añadirUsuario(nombre, apellido, dni, email, telef, socio, fecha);
        }
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void fieldTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldTelefonoActionPerformed

    private void fieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldNombreKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_fieldNombreKeyTyped

    private void fieldTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldTelefonoKeyTyped
        //Para controlar la entrada de solo numeros en el campo telefono
        char c = evt.getKeyChar();
        if((c<'0' || c>'9') && fieldTelefono.getText().length() == 9) evt.consume();
    }//GEN-LAST:event_fieldTelefonoKeyTyped

    private void returnIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnIconMouseEntered
        // TODO add your handling code here:
        this.returnIcon.setCursor(new Cursor(Cursor.HAND_CURSOR));
        returnIcon.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
                int num = 0;
                // Lógica para manejar el evento de clic en el icono
                setVisible(false);
                AppController appController = new AppController();
                appController.volverAtras(num);
            }
        });
    }//GEN-LAST:event_returnIconMouseEntered

    private void fieldDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldDniActionPerformed
        // TODO add your handling code here:
        JTextField dniField = fieldDni;
        String dni = dniField.getText();

        // Validación específica para DNI y NIE
        if (dni.length() == 8) {
            if (!dni.matches("\\d{8}")) {
                // Muestra un mensaje de error si no es un DNI válido
                JOptionPane.showMessageDialog(this, "El DNI ingresado no es válido", "Error de formato", JOptionPane.ERROR_MESSAGE);
                dniField.setText("");
            }
        } else if (dni.length() == 9) {
            if (!dni.matches("[XYZ]\\d{7}[A-Z]")) {
                // Muestra un mensaje de error si no es un NIE válido
                JOptionPane.showMessageDialog(this, "El NIE ingresado no es válido", "Error de formato", JOptionPane.ERROR_MESSAGE);
                dniField.setText("");
            }
        } else {
            // Muestra un mensaje de error si no tiene una longitud válida
            JOptionPane.showMessageDialog(this, "El DNI/NIE debe tener 8 o 9 caracteres", "Error de formato", JOptionPane.ERROR_MESSAGE);
            dniField.setText("");
        }
    }//GEN-LAST:event_fieldDniActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxSocio;
    private javax.swing.JButton btnAñadir;
    private javax.swing.JTextField fieldApellido;
    private javax.swing.JTextField fieldDni;
    private javax.swing.JTextField fieldEmail;
    private com.toedter.calendar.JDateChooser fieldFecha;
    private javax.swing.JTextField fieldNombre;
    private javax.swing.JTextField fieldTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel returnIcon;
    // End of variables declaration//GEN-END:variables
}
