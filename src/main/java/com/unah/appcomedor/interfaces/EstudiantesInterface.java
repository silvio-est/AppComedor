package com.unah.appcomedor.interfaces;


import com.unah.appcomedor.models.Estudiante;
import java.util.List;

public interface EstudiantesInterface {
    public int pasoComedor(int idEstudiante) throws Exception;
    public void cambiarPasoComedor(int idEstudiante) throws Exception; //Cambia de falso a verdadero en la BD cuando el estudiante pase 
    public List<Estudiante> agregarEstudiantesPasaron() throws Exception;
    public List<Estudiante> listarAll() throws Exception;
    public List<Estudiante> buscarNombre(String nombre) throws Exception;
    
}
