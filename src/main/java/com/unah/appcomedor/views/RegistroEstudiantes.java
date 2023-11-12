package com.unah.appcomedor.views;

import com.unah.appcomedor.DAO.EstudianteDAO;
import com.unah.appcomedor.interfaces.EstudiantesInterface;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.table.DefaultTableModel;

public class RegistroEstudiantes extends javax.swing.JPanel {

    public RegistroEstudiantes() {
        initComponents();
        initStyle();
        loadEstudiantes();
    }

    private void initStyle() {
        initJLabe();
        jTextFieldID.putClientProperty("JTextField.placeholderText", "Ingrese el Nombre del estudiante a buscar");

    }

    private void initJLabe() {
        jLabelTitulo.putClientProperty("FlatLaf.style", "font: $h2.font");
        jLabelTitulo.setForeground(Color.black);

        jLabelID.putClientProperty("FlatLaf.style", "font: $h4.font");
        jLabelID.setForeground(Color.black);

    }

    private void loadEstudiantes() {
        try {
            EstudiantesInterface estudiantesInterface = new EstudianteDAO();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            estudiantesInterface.listarAll().forEach((u) -> model.addRow(new Object[]{
                u.getIdEstudiante(), u.getNombre(),
                u.getPrimerApellido(), u.getSegundoApellido(), u.getCarrera(), u.getYear(), u.getPaso()}));

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void buscarEstudiantesNombre() {
        try {
            EstudiantesInterface estudiantesInterface = new EstudianteDAO();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            String idEstudiante = jTextFieldID.getText();
            model.setRowCount(0);
            estudiantesInterface.buscarNombre(idEstudiante).forEach((u) -> model.addRow(new Object[]{
                u.getIdEstudiante(), u.getNombre(),
                u.getPrimerApellido(), u.getSegundoApellido(), u.getCarrera(), u.getYear(), u.getPaso()}));

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldID = new javax.swing.JTextField();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelID = new javax.swing.JLabel();
        jLabelBuscar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jTextFieldID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldIDKeyPressed(evt);
            }
        });

        jLabelTitulo.setText("Registro de Todos los Estudiantes");

        jLabelID.setText("ID del Estudiante a Buscar");

        jLabelBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar.png"))); // NOI18N
        jLabelBuscar.setText("Buscar");
        jLabelBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabelBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBuscarMouseClicked(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Primer Apellido", "Segundo Apellido", "Carrera", "Año", "Entro"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTitulo)
                .addGap(282, 282, 282))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelID)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelTitulo)
                .addGap(14, 14, 14)
                .addComponent(jLabelID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBuscarMouseClicked
        buscarEstudiantesNombre();
    }//GEN-LAST:event_jLabelBuscarMouseClicked

    private void jTextFieldIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldIDKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            buscarEstudiantesNombre();
        }
    }//GEN-LAST:event_jTextFieldIDKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelBuscar;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldID;
    // End of variables declaration//GEN-END:variables
}
