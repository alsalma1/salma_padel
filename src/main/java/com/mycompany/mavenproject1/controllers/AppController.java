package com.mycompany.mavenproject1.controllers;

import com.mycompany.mavenproject1.models.Admin;
import com.mycompany.mavenproject1.models.Usuario;
import com.mycompany.mavenproject1.views.AñadirUsuario;
import com.mycompany.mavenproject1.views.EditarUsuario;
import com.mycompany.mavenproject1.views.GestionUsuarios;
import com.mycompany.mavenproject1.views.Login;
import com.mycompany.mavenproject1.views.Login;
import com.mycompany.mavenproject1.views.PaginaPrincipalAdmin;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;

public class AppController {
    
    public static PaginaPrincipalAdmin paginaPrincipalAdmin = new PaginaPrincipalAdmin();
    public static AñadirUsuario añadirUsuario = new AñadirUsuario();
    public static GestionUsuarios gestionUsuarios;
    
    private String datos = "";

    /* ------------------ Adminastrador --------------------- */
    public void mostrarLogin() {
        Login loginView = new Login();
        loginView.setVisible(true);
    }
    
    public void comprobarCredenciales(String usuario, String contrasena, Login login){
        Admin admin = new Admin(usuario, contrasena);
        if(admin.comprobarDatos()){
            // Las credenciales son válidas, abre la página principal del administrador
            paginaPrincipalAdmin.setVisible(true);
            login.setVisible(false);
        }
        else{
            JOptionPane.showMessageDialog(null, "Datos incorerctos, intenta otra vez!");
        }
    }
    
    public void volverAtras(int num){
        if(num == 0){
            Usuario usuario = new Usuario();

            // Llamar al método obtenerUsuarios
            List<Usuario> usuarios = usuario.obtenerUsuarios();
            GestionUsuarios gestionUsuarios = new GestionUsuarios();
            gestionUsuarios.cargarUsuariosEnTabla(usuarios);
            gestionUsuarios.setVisible(true);
        }
        else if(num == 1){
            paginaPrincipalAdmin.setVisible(true);
        }
        
    }
    /* ------------------ Usuario --------------------- */
    public void mostrarUsuarios(PaginaPrincipalAdmin paginaPrincipalAdmin){
        Usuario usuario = new Usuario();

        // Llamar al método obtenerUsuarios
        List<Usuario> usuarios = usuario.obtenerUsuarios();
        GestionUsuarios gestionUsuarios = new GestionUsuarios();
        gestionUsuarios.cargarUsuariosEnTabla(usuarios);

        // Mostrar la ventana de GestionUsuarios
        gestionUsuarios.setVisible(true);
        paginaPrincipalAdmin.setVisible(false);

        /*if (!usuarios.isEmpty()) {
            System.out.println("Registros de usuarios:");
            GestionUsuarios gestionUsuarios = new GestionUsuarios();
            gestionUsuarios.cargarUsuariosEnTabla(usuarios);

            // Mostrar la ventana de GestionUsuarios
            gestionUsuarios.setVisible(true);
        } else {
            System.out.println("No se encontraron registros de usuarios.");
        }*/
    }
    
    public void mostrarVentanaAñadirUsuario(GestionUsuarios gestionUsuarios){
        añadirUsuario.setVisible(true);
        gestionUsuarios.setVisible(false);
    }
    public void datosUsurios(){
        Usuario usuario = new Usuario();
        // Llamar al método obtenerUsuarios
        List<Usuario> usuarios = usuario.obtenerUsuarios();
        GestionUsuarios gestionUsuarios = new GestionUsuarios();
        gestionUsuarios.cargarUsuariosEnTabla(usuarios);
    }
    public void añadirUsuario(String nombre, String apellido, String dni, String email, String telef, String socio, Date fecha){
        
        Usuario usuario = new Usuario();
        usuario.setNombre(nombre);
        usuario.setApellido(apellido);
        usuario.setDni(dni);
        usuario.setEmail(email);
        usuario.setTelefono(telef);
        usuario.setFoto("De momento no hay");
        
        //Cambiar el formato de la fecha a "yyyy-MM-dd"
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String birth = simpleDateFormat.format(fecha);
        
        //Cambiar la fecha de String a objeto Date
        try{
            
            Date fechaNacimiento = simpleDateFormat.parse(birth);
            // Convertir java.util.Date a java.sql.Date
            java.sql.Date fechaNacimientoSQL = new java.sql.Date(fechaNacimiento.getTime());
            usuario.setFecha_nacimiento(fechaNacimientoSQL);
            
        } catch (ParseException e) {
            e.printStackTrace();
        }

        if(socio.equals("Sí")) {
            usuario.setSocio(Boolean.TRUE);
        } else {
            usuario.setSocio(Boolean.FALSE);
        }
        
        //Generar contraseña aleatoria
        String randomString = generarRandomString();
        String contraseña = nombre.toLowerCase()+randomString;
        usuario.setContrasena(contraseña);
        
        if(usuario.existeUsuario()){
            JOptionPane.showMessageDialog(null, "Este email o Dni ya estan registrados en el sistema, intenta otra vez!");
        }
        else{
            usuario.insertarUsuario();
        }
    }
    
    public static String generarRandomString() {
        // Lista de caracteres que queremos considerar
        List<Character> characters = new ArrayList<>();
        for (char ch = 'a'; ch <= 'z' || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9'); ch++) {
            characters.add(ch);
        }
        // Generar la cadena aleatoria
        Random random = new Random();
        StringBuilder randomString = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            int randomIndex = random.nextInt(characters.size());
            randomString.append(characters.get(randomIndex));
        }
        return randomString.toString();
    }
    
    public void mostrarDatosUsuario(String dni, GestionUsuarios gestionUsuarios){
        Usuario usuario = new Usuario();
        EditarUsuario editUser = new EditarUsuario();
        usuario.setDni(dni);
        List<Usuario> usuarios = usuario.datosUsuarioConDni();
        String contraseña = "";
        // Imprime los datos de los usuarios
        for (Usuario user : usuarios) {
            editUser.fieldNombre.setText(user.getNombre());
            editUser.fieldApellido.setText(user.getApellido());
            editUser.fieldDni.setText(user.getDni());
            editUser.fieldTelefono.setText(user.getTelefono());
            editUser.fieldEmail.setText(user.getEmail());
            editUser.fieldFecha.setDate(user.getFecha_nacimiento());
            contraseña = user.getContrasena();
            // Establecer selección del JComboBox basado en user.getSocio()
            if (user.getSocio()) {
                editUser.boxSocio.setSelectedItem("Sí");
            } else {
                editUser.boxSocio.setSelectedItem("No");
            }
        }
        editUser.setContraseña(contraseña);
        gestionUsuarios.setVisible(false);
        editUser.setVisible(true);
    }
    
    public void editarUsuario(String nombre, String apellido, String dni, String email, String telef, String socio, Date fecha, String contraseña, EditarUsuario editarUsuario){
        Usuario user = new Usuario();
        user.setNombre(nombre);
        user.setApellido(apellido);
        user.setTelefono(telef);
        user.setDni(dni);
        user.setEmail(email);
        user.setContrasena(contraseña);
        
        java.sql.Date fechaNacimientoSQL = new java.sql.Date(fecha.getTime());
        user.setFecha_nacimiento(fechaNacimientoSQL);  
        
        if(socio.equals("Sí")) {
            user.setSocio(Boolean.TRUE);
        } else {
            user.setSocio(Boolean.FALSE);
        }
        
        try {
            // Intenta editar el usuario
            user.editarUsuario();
            JOptionPane.showMessageDialog(null, "Usuario modificado correctamente!");
            editarUsuario.setVisible(false);
            // Actualiza y muestra la ventana de gestión de usuarios
            actualizarYMostrarUsuarios();
        } catch (Exception e) {
            // Si hay un error, muestra un mensaje de error
            JOptionPane.showMessageDialog(null, "Error al editar el usuario: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void actualizarYMostrarUsuarios(){
        Usuario usuario = new Usuario();

        // Llamar al método obtenerUsuarios para obtener los datos actualizados
        List<Usuario> usuarios = usuario.obtenerUsuarios();

        // Cerrar la ventana anterior de GestionUsuarios si está abierta
        if (gestionUsuarios != null && gestionUsuarios.isVisible()) {
            gestionUsuarios.dispose();
        }

        gestionUsuarios = new GestionUsuarios();  // Crear una nueva instancia
        gestionUsuarios.cargarUsuariosEnTabla(usuarios);

        // Mostrar la ventana de GestionUsuarios
        gestionUsuarios.setVisible(true);
    }
    public void desactivarUsuario(String dni){
        Usuario user = new Usuario();
        user.setDni(dni);
        user.desactivar();
        JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente");
    }
    

    
    /* ------------------ Pistas --------------------- */
        
    /* ------------------ Reservas --------------------- */

        
}
