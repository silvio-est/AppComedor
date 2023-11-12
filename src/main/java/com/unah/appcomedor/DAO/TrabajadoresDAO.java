package com.unah.appcomedor.DAO;

import com.unah.appcomedor.basedatos.ConexionBD;
import com.unah.appcomedor.interfaces.TrabajadoresInterface;
import com.unah.appcomedor.models.Trabajadores;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TrabajadoresDAO extends ConexionBD implements TrabajadoresInterface {

    @Override
    public List<Trabajadores> listarAll() throws Exception {
        List<Trabajadores> listaTrabajadores = null;
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM trabajadores");
            listaTrabajadores = new ArrayList();
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Trabajadores trabajadores = new Trabajadores();
                trabajadores.setIdTrabajador(rs.getInt("id_trabajadores"));
                trabajadores.setNombre(rs.getString("Nombre"));
                trabajadores.setPrimerApellido(rs.getString("Primer Apellido"));
                trabajadores.setSegundoApellido(rs.getString("Segundo Apellido"));
                trabajadores.setTrabajo(rs.getString("Trabajo"));
                trabajadores.setPaso(rs.getBoolean("Paso"));

                listaTrabajadores.add(trabajadores);
            }

            rs.close();
            st.close();

        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return listaTrabajadores;
    }

    @Override
    public List<Trabajadores> buscarNombre(String nombre) throws Exception {
        List<Trabajadores> listaBuscar = null;

        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM trabajadores WHERE Nombre LIKE '%" + nombre + "%'");
            listaBuscar = new ArrayList();
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Trabajadores trabajadores = new Trabajadores();
                trabajadores.setIdTrabajador(rs.getInt("id_trabajadores"));
                trabajadores.setNombre(rs.getString("Nombre"));
                trabajadores.setPrimerApellido(rs.getString("Primer Apellido"));
                trabajadores.setSegundoApellido(rs.getString("Segundo Apellido"));
                trabajadores.setTrabajo(rs.getString("Trabajo"));
                trabajadores.setPaso(rs.getBoolean("Paso"));

                listaBuscar.add(trabajadores);
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

    @Override
    public int pasoComedor(int idTrabajador) throws Exception {
        int pasoComedor = 0;
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT Paso FROM trabajadores WHERE id_trabajadores = ? ");
            st.setInt(1, idTrabajador);
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
            throw e;
        } finally {
            this.Cerrar();
        }
        return pasoComedor;
    }

    @Override
    public void cambiarPasoComedor(int idTrabajador) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE trabajadores SET Paso = 1 WHERE id_trabajadores = ?");
            st.setInt(1, idTrabajador);
            int executeUpdate = st.executeUpdate();

            st.close();

        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public List<Trabajadores> agregarTrabajadoresPasaron() throws Exception {
           List<Trabajadores> listaTrabajadoresesPasaron = null;
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM trabajadores WHERE Paso = ?");
            st.setBoolean(1, true);
            listaTrabajadoresesPasaron = new ArrayList();
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Trabajadores trabajadores = new Trabajadores();
                trabajadores.setNombre(rs.getString("Nombre"));
                trabajadores.setPrimerApellido(rs.getString("Primer Apellido"));
                trabajadores.setSegundoApellido(rs.getString("Segundo Apellido"));
                trabajadores.setTrabajo(rs.getString("Trabajo"));

                listaTrabajadoresesPasaron.add(trabajadores);
            }

            rs.close();
            st.close();

        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return listaTrabajadoresesPasaron;
    }
}
