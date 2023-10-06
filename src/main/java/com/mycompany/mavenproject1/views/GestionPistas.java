package com.mycompany.mavenproject1.views;

import javax.swing.JFrame;
import com.mycompany.mavenproject1.views.*;
import com.mycompany.mavenproject1.controllers.*;
public class GestionPistas extends javax.swing.JFrame {

    public GestionPistas() {
        initComponents();
        
        // Configura la ventana de gestión de pistas
        setTitle("Gestión de Pistas");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Cierra solo esta ventana
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAñadirPista = new javax.swing.JButton();
        bSalirGestionPistas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAñadirPista.setText("Añadir");
        btnAñadirPista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirPistaActionPerformed(evt);
            }
        });

        bSalirGestionPistas.setText("Salir");
        bSalirGestionPistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirGestionPistasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnAñadirPista, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(511, 511, 511)
                .addComponent(bSalirGestionPistas, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(692, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAñadirPista, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSalirGestionPistas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(589, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAñadirPistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirPistaActionPerformed

        PistaController.addPista();
    }//GEN-LAST:event_btnAñadirPistaActionPerformed

    private void bSalirGestionPistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirGestionPistasActionPerformed
        PistaController.salirGestionPistas();
    }//GEN-LAST:event_bSalirGestionPistasActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bSalirGestionPistas;
    private javax.swing.JButton btnAñadirPista;
    // End of variables declaration//GEN-END:variables
}
