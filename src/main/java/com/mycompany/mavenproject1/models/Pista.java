package com.mycompany.mavenproject1.models;

public class Pista {
    private int id_pista;
    private String estado;

    // Constructor
    public Pista(int id_pista, String estado) {
        this.id_pista = id_pista;
        this.estado = estado;
    }
    
    //Getters and Setters

    public int getId_pista() {
        return id_pista;
    }

    public void setId_pista(int id_pista) {
        this.id_pista = id_pista;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
