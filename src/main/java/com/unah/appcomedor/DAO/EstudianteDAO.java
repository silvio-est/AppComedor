package com.unah.appcomedor.DAO;

import com.unah.appcomedor.basedatos.ConexionBD;
import com.unah.appcomedor.interfaces.EstudiantesInterface;
import com.unah.appcomedor.models.Estudiante;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDAO extends ConexionBD implements EstudiantesInterface {

    @Override
    public int obtenerID() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Estudiante> listarAll() throws Exception {
        List<Estudiante> listaEstudiantes = null;
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM estudiantes");
            listaEstudiantes = new ArrayList();
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Estudiante estudiante = new Estudiante();
                estudiante.setIdEstudiante(rs.getInt("id_estudiante"));
                estudiante.setNombre(rs.getString("Nombre"));
                estudiante.setPrimerApellido(rs.getString("Primer Apellido"));
                estudiante.setSegundoApellido(rs.getString("Segundo Apellido"));
                estudiante.setCarrera(rs.getString("Carrera"));
                estudiante.setYear(rs.getInt("Año"));
                estudiante.setPaso(rs.getBoolean("Paso"));

                listaEstudiantes.add(estudiante);
            }

            rs.close();
            st.close();

        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return listaEstudiantes;
    }

    @Override
    public List<Estudiante> listarId(String nombre) throws Exception {
        List<Estudiante> listaBuscar = null;
        
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM estudiantes WHERE Nombre LIKE '%"+ nombre + "%'");
            listaBuscar = new ArrayList();
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Estudiante estudiante = new Estudiante();
                estudiante.setIdEstudiante(rs.getInt("id_estudiante"));
                estudiante.setNombre(rs.getString("Nombre"));
                estudiante.setPrimerApellido(rs.getString("Primer Apellido"));
                estudiante.setSegundoApellido(rs.getString("Segundo Apellido"));
                estudiante.setCarrera(rs.getString("Carrera"));
                estudiante.setYear(rs.getInt("Año"));
                estudiante.setPaso(rs.getBoolean("Paso"));

                listaBuscar.add(estudiante);
            }

            rs.close();
            st.close();

        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return listaBuscar;
    }

}
