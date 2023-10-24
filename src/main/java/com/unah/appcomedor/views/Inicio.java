package com.unah.appcomedor.views;

import java.awt.Color;

public class Inicio extends javax.swing.JPanel {

    public Inicio() {
        initComponents();
        initStyle();
    }

    private void initStyle() {
        jLabel1.putClientProperty("FlatLaf.style", "font: $h2.font");
        jLabel1.setForeground(Color.black);
        
        jLabel2.putClientProperty("FlatLaf.style", "font: $h2.font");
        jLabel2.setForeground(Color.black);
        
        jLabel3.putClientProperty("FlatLaf.style", "font: $h2.font");
        jLabel3.setForeground(Color.black);
        
        jLabel4.putClientProperty("FlatLaf.style", "font: $h2.font");
        jLabel4.setForeground(Color.black);
        
        jLabel5.putClientProperty("FlatLaf.style", "font: $h3.font");
        jLabel5.setForeground(Color.black);
        
        jLabel6.putClientProperty("FlatLaf.style", "font: $h3.font");
        jLabel6.setForeground(Color.black);
        
        jLabel7.putClientProperty("FlatLaf.style", "font: $h3.font");
        jLabel7.setForeground(Color.black);
        
        jLabel8.putClientProperty("FlatLaf.style", "font: $h3.font");
        jLabel8.setForeground(Color.black);
        
        jLabel9.putClientProperty("FlatLaf.style", "font: $h3.font");
        jLabel9.setForeground(Color.black);
        
        jLabelDesarroladores.putClientProperty("FlatLaf.style", "font: $h3.font");
        jLabelDesarroladores.setForeground(Color.black);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabelDesarroladores = new javax.swing.JLabel();

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setPreferredSize(new java.awt.Dimension(780, 450));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Bienvenido al Sistema de Gestion del Comedor de la Universidad Agraria de la Habana");
        Background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 750, 56));

        jLabel2.setText("El uso de este Programa tiene como objetivo la correcta gestion del comedor                                      ");
        Background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, 60));

        jLabel3.setText("guardando la informacion de los usuarios que pasen a este");
        Background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, -1));

        jLabel4.setText("Las herramientas disponibles son:");
        Background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, -1, -1));

        jLabel5.setText("-Registros de Estudiantes");
        Background.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, -1, -1));

        jLabel6.setText("-Registro de Trabajadores");
        Background.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, -1, -1));

        jLabel7.setText("-Gestion de Usuarios");
        Background.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, -1, -1));

        jLabel8.setText("Gestion de Trabajadores");
        Background.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, -1, -1));

        jLabel9.setText("-Administracion");
        Background.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, -1, -1));
        Background.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 270, 260));

        jLabelDesarroladores.setText("Desarrollado por un equipo de ING de Primer Año de INF");
        Background.add(jLabelDesarroladores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelDesarroladores;
    // End of variables declaration//GEN-END:variables
}
