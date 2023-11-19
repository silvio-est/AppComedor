package com.unah.appcomedor.entity;

public abstract class Persona {
    protected int id;
    protected String nombre;
    protected String primerApellido;
    protected String segundoApellido;
    protected Boolean paso;

    public Persona() {
    }

    public Persona(int id, String nombre, String primerApellido, String segundoApellido, Boolean paso) {
        this.id = id;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.paso = paso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Boolean getPaso() {
        return paso;
    }

    public void setPaso(Boolean paso) {
        this.paso = paso;
    }
    
    
}
