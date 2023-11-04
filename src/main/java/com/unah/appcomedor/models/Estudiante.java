
package com.unah.appcomedor.models;


public class Estudiante {
    private int idEstudiante;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String carrera;
    private int year;
    private Boolean paso;

    public Estudiante() {
    }

    public Estudiante(int idEstudiante, String nombre, String primerApellido, String segundoApellido, String carrera, int year, Boolean paso) {
        this.idEstudiante = idEstudiante;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.carrera = carrera;
        this.year = year;
        this.paso = paso;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
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

    public Boolean getPaso() {
        return paso;
    }

    public void setPaso(Boolean paso) {
        this.paso = paso;
    }

    
    
    
    
    
    
}
