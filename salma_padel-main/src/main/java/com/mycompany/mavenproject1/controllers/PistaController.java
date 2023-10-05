package com.mycompany.mavenproject1.controllers;

import com.mycompany.mavenproject1.config.Conexion;
import com.mycompany.mavenproject1.views.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PistaController {
    public static GestionPistas viewGestion = new GestionPistas();
    public static PaginaPrincipalAdmin viewAdminPanel = new PaginaPrincipalAdmin();
    public static ConfirmarInsercionDatos viewConfirmarDatos = new ConfirmarInsercionDatos();
    public static void mostrarGestionPistas(){
        viewGestion.setVisible(true);
    }
    public static void salirGestionPistas(){
        viewGestion.setVisible(false);
        viewAdminPanel.setVisible(true);
    }
    public static void añadirGestionPistas(){
    }
        public static void addPista(){
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            // Establece la conexión
            Conexion conexion = new Conexion();
            connection = conexion.establecerConexion();

            // Consulta SQL para añadir una pista
            String consultaSQL = "INSERT INTO pistas(estado) VALUES (?);";
            preparedStatement = connection.prepareStatement(consultaSQL);
            preparedStatement.setString(1,"Available");
            
            //Comprobar que se ha insertado correctamente
            int filasAfectadas = preparedStatement.executeUpdate();
            if (filasAfectadas > 0){
                viewConfirmarDatos.setVisible(true);
                ConfirmarInsercionDatos.labelConfirmar.setText("CORRECT");
            }else{
                viewConfirmarDatos.setVisible(true);
                ConfirmarInsercionDatos.labelConfirmar.setText("ERROR");
            }
            //Cerrar recursos
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Error");
        } 
    }
}
