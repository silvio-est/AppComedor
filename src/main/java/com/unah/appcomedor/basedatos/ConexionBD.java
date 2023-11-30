package com.unah.appcomedor.basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConexionBD {
    protected Connection conexion;
    private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://localhost:3306/comedor";
    
    private final String USER = "root";
    private final String PASS = "";
    
       public void Conectar() throws ClassNotFoundException {
        try {
            conexion = DriverManager.getConnection(DB_URL, USER, PASS);
            Class.forName(JDBC_DRIVER);
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos: Error de conexión");

        }
    }
    
    public void Cerrar() throws SQLException{
        if (conexion != null) {
            if (!conexion.isClosed()) {
                conexion.close();
            }
        }
    }
    
}