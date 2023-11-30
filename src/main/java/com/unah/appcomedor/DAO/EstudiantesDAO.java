package com.unah.appcomedor.DAO;

import com.unah.appcomedor.basedatos.ConexionBD;
import com.unah.appcomedor.interfaces.EstudiantesInterface;
import com.unah.appcomedor.entity.Estudiantes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EstudiantesDAO extends ConexionBD implements EstudiantesInterface {

    @Override
    public List<Estudiantes> listarAll() throws Exception {
        List<Estudiantes> listaEstudiantes = null;
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM estudiantes");
            listaEstudiantes = new ArrayList();
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Estudiantes estudiante = new Estudiantes();
                estudiante.setId(rs.getInt("id_estudiante"));
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
             JOptionPane.showMessageDialog(null, "Error al obtener la lista de estudiantes:", "Error de base de datos", JOptionPane.ERROR_MESSAGE);

        } finally {
            this.Cerrar();
        }
        return listaEstudiantes;
    }

    @Override
    public List<Estudiantes> buscarNombre(String nombre) throws Exception {
        List<Estudiantes> listaBuscar = null;

        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM estudiantes WHERE Nombre LIKE '%" + nombre + "%'");
            listaBuscar = new ArrayList();
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Estudiantes estudiante = new Estudiantes();
                estudiante.setId(rs.getInt("id_estudiante"));
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
             JOptionPane.showMessageDialog(null, "Error al buscar un estudiante por el nombre:", "Error de base de datos", JOptionPane.ERROR_MESSAGE);

        } finally {
            this.Cerrar();
        }
        return listaBuscar;
    }

    @Override
    public int pasoComedor(int idEstudiante) throws Exception {
        int pasoComedor = 0;
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT Paso FROM estudiantes WHERE id_estudiante = ? ");
            st.setInt(1, idEstudiante);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                if (rs.getBoolean("Paso")) {
                    pasoComedor = 1;
                } else if (rs.getBoolean("Paso") == false) {
                    pasoComedor = 0;

                }
            } else {
                pasoComedor = -1;
            }

            rs.close();
            st.close();

        } catch (Exception e) {
        } finally {
            this.Cerrar();
        }
        return pasoComedor;
    }

    @Override
    public void cambiarPasoComedor(int idEstudiante) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE estudiantes SET Paso = 1 WHERE id_estudiante = ?");
            st.setInt(1, idEstudiante);
            int executeUpdate = st.executeUpdate();

            st.close();

        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }

    }

    @Override
    public List<Estudiantes> agregarTrabajadoresPasaron() throws Exception {
        List<Estudiantes> listaEstudiantesPasaron = null;
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM estudiantes WHERE Paso = ?");
            st.setBoolean(1, true);
            listaEstudiantesPasaron = new ArrayList();
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Estudiantes estudiante = new Estudiantes();
                estudiante.setNombre(rs.getString("Nombre"));
                estudiante.setPrimerApellido(rs.getString("Primer Apellido"));
                estudiante.setSegundoApellido(rs.getString("Segundo Apellido"));
                estudiante.setCarrera(rs.getString("Carrera"));
                estudiante.setYear(rs.getInt("Año"));

                listaEstudiantesPasaron.add(estudiante);
            }

            rs.close();
            st.close();

        } catch (Exception e) {
        } finally {
            this.Cerrar();
        }
        return listaEstudiantesPasaron;
    }

    @Override
    public void cambiarPasoComedorAll() throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE estudiantes SET Paso = 0");
            int executeUpdate = st.executeUpdate();

            st.close();

        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }

    }

    @Override
    public int[] resumenComedor(){
        int[] resumen = new int[2];

        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT COUNT(*) AS total FROM estudiantes");
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                resumen[0] = rs.getInt("total");
            }

            st = this.conexion.prepareStatement("SELECT COUNT(*) AS totalPasaron FROM estudiantes WHERE Paso = 1");
            rs = st.executeQuery();

            while (rs.next()) {
                resumen[1] = rs.getInt("totalPasaron");
            }

            rs.close();
            st.close();

        } catch (Exception e) {
        } finally {
            try {
                this.Cerrar();
            } catch (SQLException ex) {
                Logger.getLogger(EstudiantesDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return resumen;
    }
}
