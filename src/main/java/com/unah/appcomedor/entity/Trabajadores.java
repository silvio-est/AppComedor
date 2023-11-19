package com.unah.appcomedor.entity;

public class Trabajadores extends Persona {

    private String trabajo;

    public Trabajadores() {
    }

    public Trabajadores(String trabajo) {
        this.trabajo = trabajo;
    }

    public Trabajadores(String trabajo, int id, String nombre, String primerApellido, String segundoApellido, Boolean paso) {
        super(id, nombre, primerApellido, segundoApellido, paso);
        this.trabajo = trabajo;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

}
