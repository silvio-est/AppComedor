package com.unah.appcomedor.interfaces;

import com.unah.appcomedor.models.Trabajadores;
import java.util.List;


public interface TrabajadoresInterface {
    public int pasoComedor(int idTrabajador) throws Exception;
    public void cambiarPasoComedor(int idTrabajador) throws Exception; //Cambia de falso a verdadero en la BD cuando el trabajador pase 
    public List<Trabajadores> agregarTrabajadoresPasaron() throws Exception;
    public List<Trabajadores> listarAll() throws Exception;
    public List<Trabajadores> buscarNombre(String nombre) throws Exception;
}
