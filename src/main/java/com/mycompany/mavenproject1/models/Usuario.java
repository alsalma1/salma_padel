package com.mycompany.mavenproject1.models;

import com.mycompany.mavenproject1.config.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Usuario {
    private String email;
    private String nombre;
    private String apellido;
    private String contrasena;
    private Date fecha_nacimiento;
    private String telefono;
    private String dni;
    private String foto;
    private Boolean socio;

    
    //Getters and Setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Boolean getSocio() {
        return socio;
    }

    public void setSocio(Boolean socio) {
        this.socio = socio;
    }
    
    //Metododos

    /*public Object[] obtenerUsuarios() {
        // Definir una lista para almacenar los resultados
        List<Object[]> usuariosList = new ArrayList<>();

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {            
            // Establecer conexión a la base de datos
            Conexion conn = new Conexion();
            connection = conn.establecerConexion();

            // Consulta SQL para obtener usuarios
            String sqlQuery = "SELECT * FROM usuarios";
            preparedStatement = connection.prepareStatement(sqlQuery);
            resultSet = preparedStatement.executeQuery();

            // Obtener el numero de columnas
            int columnCount = resultSet.getMetaData().getColumnCount();

            // Recorrer el resultado y almacenar los datos de cada usuario en un array de objetos
            while (resultSet.next()) {
                Object[] usuarioData = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    usuarioData[i - 1] = resultSet.getObject(i);
                }
                usuariosList.add(usuarioData);
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de errores: imprime el error en la consola
        } finally {
            // Cerrar recursos
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace(); // Manejo de errores: imprime el error en la consola
            }
        }

        // Convertir la lista de usuarios a un array de objetos
        return usuariosList.toArray();
    }*/
    public List<Usuario> obtenerUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Establecer conexión a la base de datos
            Conexion conn = new Conexion();
            connection = conn.establecerConexion();

            // Crear la consulta SQL
            String sql = "SELECT * FROM usuarios";

            // Crear el statement
            statement = connection.createStatement();

            // Ejecutar la consulta
            resultSet = statement.executeQuery(sql);

            // Iterar sobre los resultados y crear objetos Usuario
            while (resultSet.next()) {
                Usuario usuario = new Usuario();
                usuario.setNombre(resultSet.getString("nombre"));
                usuario.setApellido(resultSet.getString("apellido"));
                usuario.setEmail(resultSet.getString("email"));
                usuario.setContrasena(resultSet.getString("contraseña"));
                usuario.setFecha_nacimiento(resultSet.getDate("fecha_nacimiento"));
                usuario.setTelefono(resultSet.getString("telefono"));
                usuario.setDni(resultSet.getString("dni"));
                usuario.setSocio(resultSet.getBoolean("socio"));
                // Agregar más campos según la estructura de tu tabla
                // ...

                usuarios.add(usuario);
            }

        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de errores: imprime el error en la consola
        } finally {
            // Cerrar recursos
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace(); // Manejo de errores: imprime el error en la consola
            }
        }

        return usuarios;
    }
    
    public void insertarUsuario(){
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {            
            // Establecer conexión a la base de datos
            Conexion conn = new Conexion();
            connection = conn.establecerConexion();

            // Consulta SQL para obtener usuarios
            String sql = "INSERT INTO usuarios (email, nombre, apellido, dni, socio, telefono, foto, contraseña, fecha_nacimiento) VALUES (?, ?, ?, ?, ?,?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(sql);

            // Establecer los valores para los parámetros
            preparedStatement.setString(1, getEmail());
            preparedStatement.setString(2, getNombre());
            preparedStatement.setString(3, getApellido());
            preparedStatement.setString(4, getDni());
            preparedStatement.setBoolean(5, getSocio());
            preparedStatement.setString(6, getTelefono());
            preparedStatement.setString(7, getFoto());
            preparedStatement.setString(8, getContrasena());
            preparedStatement.setDate(9,  getFecha_nacimiento());
            
            // Ejecutar la consulta de inserción
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null,"Usuario insertado correctamente!");
            
            
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de errores: imprime el error en la consola
        } finally {
            // Cerrar recursos
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace(); // Manejo de errores: imprime el error en la consola
            }
        }
    }
    
    public Boolean existeUsuario(){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {            
            // Establecer conexión a la base de datos
            Conexion conn = new Conexion();
            connection = conn.establecerConexion();

            // Consulta SQL para obtener usuarios
            String sql = "SELECT COUNT(*) AS count FROM usuarios WHERE email = ? OR dni = ?";
            preparedStatement = connection.prepareStatement(sql);

            // Establecer los valores para los parámetros
            preparedStatement.setString(1, getEmail());
            preparedStatement.setString(2, getDni());

            // Ejecutar la consulta de inserción
            resultSet = preparedStatement.executeQuery();
            
            // Verificar si hay al menos un registro
            if (resultSet != null && resultSet.next()) {
                int count = resultSet.getInt("count");
                System.out.println(count);
                return count > 0;
            }
            return false;
            
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            // Cerrar recursos
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}