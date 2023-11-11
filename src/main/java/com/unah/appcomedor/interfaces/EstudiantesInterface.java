package com.unah.appcomedor.interfaces;


import com.unah.appcomedor.models.Estudiante;
import java.util.List;

public interface EstudiantesInterface {
    public int pasoComedor(int idEstudiante) throws Exception;
    public List<Estudiante> listarAll() throws Exception;
    public List<Estudiante> listarNombre(String nombre) throws Exception;
    
}
