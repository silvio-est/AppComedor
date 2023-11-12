package com.unah.appcomedor.views;

import java.awt.Color;

public class Inicio extends javax.swing.JPanel {

    public Inicio() {
        initComponents();
        initStyle();
    }

    private void initStyle() {
        jLabelTitulo.putClientProperty("FlatLaf.style", "font: $h2.font");
        jLabelTitulo.setForeground(Color.black);
        
        jLabelCabeza.putClientProperty("FlatLaf.style", "font: $h2.font");
        jLabelCabeza.setForeground(Color.black);
        
        jLabelCabeza2.putClientProperty("FlatLaf.style", "font: $h2.font");
        jLabelCabeza2.setForeground(Color.black);
        
        jLabelTexto.putClientProperty("FlatLaf.style", "font: $h2.font");
        jLabelTexto.setForeground(Color.black);
        
        jLabelTexto1.putClientProperty("FlatLaf.style", "font: $h3.font");
        jLabelTexto1.setForeground(Color.black);
        
        jLabelTexto2.putClientProperty("FlatLaf.style", "font: $h3.font");
        jLabelTexto2.setForeground(Color.black);
        
        jLabelTexto3.putClientProperty("FlatLaf.style", "font: $h3.font");
        jLabelTexto3.setForeground(Color.black);
        
        jLabelTexto4.putClientProperty("FlatLaf.style", "font: $h3.font");
        jLabelTexto4.setForeground(Color.black);
        
        jLabelTexto5.putClientProperty("FlatLaf.style", "font: $h3.font");
        jLabelTexto5.setForeground(Color.black);
        
        jLabelDesarroladores.putClientProperty("FlatLaf.style", "font: $h3.font");
        jLabelDesarroladores.setForeground(Color.black);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelCabeza = new javax.swing.JLabel();
        jLabelCabeza2 = new javax.swing.JLabel();
        jLabelTexto = new javax.swing.JLabel();
        jLabelTexto1 = new javax.swing.JLabel();
        jLabelTexto2 = new javax.swing.JLabel();
        jLabelTexto3 = new javax.swing.JLabel();
        jLabelTexto4 = new javax.swing.JLabel();
        jLabelTexto5 = new javax.swing.JLabel();
        jLabelDesarroladores = new javax.swing.JLabel();
        jLabelLogoUnah = new javax.swing.JLabel();

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setPreferredSize(new java.awt.Dimension(780, 450));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setText("Bienvenido al Sistema de Gestion del Comedor de la Universidad Agraria de la Habana");
        Background.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 750, 56));

        jLabelCabeza.setText("El uso de este Programa tiene como objetivo la correcta gestion del comedor                                      ");
        Background.add(jLabelCabeza, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, 60));

        jLabelCabeza2.setText("guardando la informacion de los usuarios que pasen a este");
        Background.add(jLabelCabeza2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, -1));

        jLabelTexto.setText("Las herramientas disponibles son:");
        Background.add(jLabelTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, -1, -1));

        jLabelTexto1.setText("-Registros de Estudiantes");
        Background.add(jLabelTexto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));

        jLabelTexto2.setText("-Registro de Trabajadores");
        Background.add(jLabelTexto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, -1, -1));

        jLabelTexto3.setText("-Gestion de Estudiantes");
        Background.add(jLabelTexto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, -1, -1));

        jLabelTexto4.setText("-Gestion de Trabajadores");
        Background.add(jLabelTexto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, -1, -1));

        jLabelTexto5.setText("-Administracion");
        Background.add(jLabelTexto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, -1));

        jLabelDesarroladores.setText("Desarrollado por un equipo de ING de Primer Año de INF");
        Background.add(jLabelDesarroladores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, -1, -1));

        jLabelLogoUnah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoUNAH.png"))); // NOI18N
        Background.add(jLabelLogoUnah, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 370, 50, 60));

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
    private javax.swing.JLabel jLabelCabeza;
    private javax.swing.JLabel jLabelCabeza2;
    private javax.swing.JLabel jLabelDesarroladores;
    private javax.swing.JLabel jLabelLogoUnah;
    private javax.swing.JLabel jLabelTexto;
    private javax.swing.JLabel jLabelTexto1;
    private javax.swing.JLabel jLabelTexto2;
    private javax.swing.JLabel jLabelTexto3;
    private javax.swing.JLabel jLabelTexto4;
    private javax.swing.JLabel jLabelTexto5;
    private javax.swing.JLabel jLabelTitulo;
    // End of variables declaration//GEN-END:variables
}
