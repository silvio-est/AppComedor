
package com.unah.appcomedor.views;

import com.unah.appcomedor.DAO.TrabajadoresDAO;
import com.unah.appcomedor.interfaces.TrabajadoresInterface;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Trabajador extends javax.swing.JPanel {


    public Trabajador() {
        initComponents();
        initStyle();
        loadTrabajadores();
    }
    private void initStyle() {
        initJLabe();
    }
    
    private void initJLabe(){
        jLabelTitulo.putClientProperty("FlatLaf.style", "font: $h2.font");
        jLabelTitulo.setForeground(Color.black);
        
        jLabelID.putClientProperty("FlatLaf.style", "font: $h2.font");
        jLabelID.setForeground(Color.black);
    }
    
        private void loadTrabajadores() {
        try {
            TrabajadoresInterface trabajadoresInterface = new TrabajadoresDAO();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            
            trabajadoresInterface.agregarTrabajadoresPasaron().forEach((u) -> model.addRow(new Object[]{u.getNombre(),
                u.getPrimerApellido(), u.getSegundoApellido(), u.getTrabajo()}));
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelID = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jLabelAceptar = new javax.swing.JLabel();
        jLabelCancelar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jLabelTitulo.setText("Verificar si el trabajdor puede pasar al comedor");

        jLabelID.setText("ID del Trabajador");
        jLabelID.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jTextFieldID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldIDKeyPressed(evt);
            }
        });

        jLabelAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aceptar.png"))); // NOI18N
        jLabelAceptar.setText("Aceptar");
        jLabelAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAceptarMouseClicked(evt);
            }
        });

        jLabelCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cancelar.png"))); // NOI18N
        jLabelCancelar.setText("Cancelar");
        jLabelCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCancelarMouseClicked(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Primer Apellido", "Segundo Apellido", "Trabajo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(jLabelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabelID, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BackgroundLayout.createSequentialGroup()
                                .addComponent(jLabelAceptar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelCancelar))
                            .addComponent(jTextFieldID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabelID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(279, Short.MAX_VALUE))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAceptarMouseClicked
        int idTrabajador = Integer.parseInt(jTextFieldID.getText());
        
        TrabajadoresInterface trabajadoresInterface = new TrabajadoresDAO();
        try {
            Integer pasoComedor = trabajadoresInterface.pasoComedor(idTrabajador);
            
            switch (pasoComedor) {
                case 1:
                    JOptionPane.showMessageDialog(null, "El trabajador con ID " + idTrabajador + " ya paso al comedor.");
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "El trabajador con ID " + idTrabajador + " puede pasar al comedor.");
                    jTextFieldID.setText("");
                    trabajadoresInterface.cambiarPasoComedor(idTrabajador);
                    loadTrabajadores();
                    break;
                case -1:
                    JOptionPane.showMessageDialog(null, "El trabajador con ID " + idTrabajador + " no existe en la base de datos.");
                    break;
                default:
                    break;
            }
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jLabelAceptarMouseClicked

    private void jLabelCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCancelarMouseClicked
        jTextFieldID.setText("");
    }//GEN-LAST:event_jLabelCancelarMouseClicked

    private void jTextFieldIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldIDKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
                    int idTrabajador = Integer.parseInt(jTextFieldID.getText());
        
        TrabajadoresInterface trabajadoresInterface = new TrabajadoresDAO();
        try {
            Integer pasoComedor = trabajadoresInterface.pasoComedor(idTrabajador);
            
            switch (pasoComedor) {
                case 1:
                    JOptionPane.showMessageDialog(null, "El trabajador con ID " + idTrabajador + " ya paso al comedor.");
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "El trabajador con ID " + idTrabajador + " puede pasar al comedor.");
                    jTextFieldID.setText("");
                    trabajadoresInterface.cambiarPasoComedor(idTrabajador);
                    loadTrabajadores();
                    break;
                case -1:
                    JOptionPane.showMessageDialog(null, "El trabajador con ID " + idTrabajador + " no existe en la base de datos.");
                    break;
                default:
                    break;
            }
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
        }
    }//GEN-LAST:event_jTextFieldIDKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel jLabelAceptar;
    private javax.swing.JLabel jLabelCancelar;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldID;
    // End of variables declaration//GEN-END:variables
}
