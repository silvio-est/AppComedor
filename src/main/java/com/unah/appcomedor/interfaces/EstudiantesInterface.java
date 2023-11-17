package com.unah.appcomedor.interfaces;


import com.unah.appcomedor.entity.Estudiantes;
import java.util.List;

public interface EstudiantesInterface {
    public int pasoComedor(int idEstudiante) throws Exception;
    public void cambiarPasoComedor(int idEstudiante) throws Exception; //Cambia de falso a verdadero en la BD cuando el estudiante pase 
    public void cambiarPasoComedorAll() throws Exception;
    public List<Estudiantes> agregarTrabajadoresPasaron() throws Exception;
    public List<Estudiantes> listarAll() throws Exception;
    public List<Estudiantes> buscarNombre(String nombre) throws Exception;
    
}
