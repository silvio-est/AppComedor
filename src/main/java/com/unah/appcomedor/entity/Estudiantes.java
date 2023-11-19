package com.unah.appcomedor.entity;

public class Estudiantes extends Persona {

    private String carrera;
    private int year;

    public Estudiantes() {
    }

    public Estudiantes(String carrera, int year) {
        this.carrera = carrera;
        this.year = year;
    }

    public Estudiantes(String carrera, int year, int id, String nombre, String primerApellido, String segundoApellido, Boolean paso) {
        super(id, nombre, primerApellido, segundoApellido, paso);
        this.carrera = carrera;
        this.year = year;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    
}
