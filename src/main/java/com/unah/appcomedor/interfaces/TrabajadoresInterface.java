package com.unah.appcomedor.interfaces;

import com.unah.appcomedor.models.Trabajadores;
import java.util.List;


public interface TrabajadoresInterface {
    public List<Trabajadores> listarAll() throws Exception;
    public List<Trabajadores> buscarNombre(String nombre) throws Exception;
}
