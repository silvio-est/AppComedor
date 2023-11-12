package com.unah.appcomedor.models;

public class Trabajadores {

    private int idTrabajador;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String trabajo;
    private Boolean paso;

    public Trabajadores() {
    }

    public Trabajadores(int idTrabajador, String nombre, String primerApellido, String segundoApellido, String trabajo, Boolean paso) {
        this.idTrabajador = idTrabajador;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.trabajo = trabajo;
        this.paso = paso;
    }

    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public Boolean getPaso() {
        return paso;
    }

    public void setPaso(Boolean paso) {
        this.paso = paso;
    }
    
    

}
