package com.unah.appcomedor.interfaces;


import com.unah.appcomedor.models.Estudiante;
import java.util.List;

public interface EstudiantesInterface {
    public int obtenerID() throws Exception;
    public List<Estudiante> listar() throws Exception;
    
}
