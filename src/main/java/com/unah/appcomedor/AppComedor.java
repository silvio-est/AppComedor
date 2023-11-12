package com.unah.appcomedor;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import com.unah.appcomedor.views.Estudiante;
import com.unah.appcomedor.views.Inicio;
import com.unah.appcomedor.views.RegistroEstudiantes;
import com.unah.appcomedor.views.RegistroTrabajadores;
import com.unah.appcomedor.views.Trabajador;
import java.awt.BorderLayout;
import java.awt.Color;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class AppComedor extends javax.swing.JFrame {

    public AppComedor() {
        initComponents();
        initStyles();
        setDate();
        showJPanel(new Inicio());
    }

    private void initStyles() {
        initButton();
        initJLabel();

    }

    private void initButton() {
        jButton1.putClientProperty("FlatLaf.style", "font: $h3.font");
        jButton1.setForeground(Color.white);

        jButton2.putClientProperty("FlatLaf.style", "font: $h3.font");
        jButton2.setForeground(Color.white);

        jButton3.putClientProperty("FlatLaf.style", "font: $h3.font");
        jButton3.setForeground(Color.white);

        jButton4.putClientProperty("FlatLaf.style", "font: $h3.font");
        jButton4.setForeground(Color.white);

        jButton5.putClientProperty("FlatLaf.style", "font: $h3.font");
        jButton5.setForeground(Color.white);

        jButton6.putClientProperty("FlatLaf.style", "font: $h3.font");
        jButton6.setForeground(Color.white);

    }

    private void initJLabel() {
        jLabelMensaje.putClientProperty("FlatLaf.style", "font: 230% $light.font");
        jLabelMensaje.setForeground(Color.black);

        jLabelNavText.putClientProperty("FlatLaf.style", "font: $h1.font");
        jLabelNavText.setForeground(Color.white);

        jLabelFecha.putClientProperty("FlatLaf.style", "font: 230% $light.font");
        jLabelFecha.setForeground(Color.white);

        jLabelAppName.putClientProperty("FlatLaf.style", "font: $h1.font");
        jLabelAppName.setForeground(Color.white);
    }

    private void setDate() {
        LocalDate now = LocalDate.now();
        Locale fecha = new Locale("es", "CU");
        jLabelFecha.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE dd 'de' MMMM 'de' yyyy", fecha)));
    }
    
    private void showJPanel(JPanel panel){
        panel.setSize(750, 430);
        panel.setLocation(0, 0);
        
        contenido.removeAll();
        contenido.add(panel, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
        
    }
    
 


@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jPanelMenu = new javax.swing.JPanel();
        jLabelAppName = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanelHeader = new javax.swing.JPanel();
        jLabelNavText = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        contenido = new javax.swing.JPanel();
        jLabelMensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Comedor");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(255, 255, 255));

        jPanelMenu.setBackground(new java.awt.Color(13, 71, 161));
        jPanelMenu.setPreferredSize(new java.awt.Dimension(240, 640));
        jPanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelAppName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAppName.setText("Comedor UNAH");
        jLabelAppName.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanelMenu.add(jLabelAppName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 34, 240, 46));
        jPanelMenu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 240, 10));

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inicio.png"))); // NOI18N
        jButton1.setText("Inicio");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHideActionText(true);
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 136, 240, 70));

        jButton2.setBackground(new java.awt.Color(102, 102, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estudiantes.png"))); // NOI18N
        jButton2.setText("Estudiantes ");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 240, 80));

        jButton3.setBackground(new java.awt.Color(102, 102, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabajador.png"))); // NOI18N
        jButton3.setText("Trabajadores");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 240, 80));

        jButton4.setBackground(new java.awt.Color(102, 102, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registroEstudiantes.png"))); // NOI18N
        jButton4.setText("Registro de Estudiantes ");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 240, 80));

        jButton5.setBackground(new java.awt.Color(102, 102, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registroTrabajadores.png"))); // NOI18N
        jButton5.setText("Registro de Trabajadores");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 240, 80));

        jButton6.setBackground(new java.awt.Color(102, 102, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/administracion.png"))); // NOI18N
        jButton6.setText("Administracion");
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 240, 80));
        jPanelMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 30, 40));

        jPanelHeader.setBackground(new java.awt.Color(25, 118, 210));
        jPanelHeader.setPreferredSize(new java.awt.Dimension(744, 150));

        jLabelNavText.setText("Administración del Comedor de la UNAH");

        jLabelFecha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelFecha.setText("Hoy es {dayname} {day} de {month} del {year}");

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelNavText, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNavText, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addGap(53, 53, 53))
        );

        contenido.setBackground(new java.awt.Color(255, 255, 255));
        contenido.setForeground(new java.awt.Color(102, 153, 255));

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 456, Short.MAX_VALUE)
        );

        jLabelMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMensaje.setText("Bienvenido de Vueltas");
        jLabelMensaje.setFocusable(false);
        jLabelMensaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                    .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                    .addComponent(contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(jLabelMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        showJPanel(new Inicio());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        showJPanel(new Estudiante());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        showJPanel(new Trabajador());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      showJPanel(new RegistroEstudiantes());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        showJPanel(new RegistroTrabajadores());
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    
    }//GEN-LAST:event_jButton6ActionPerformed

    public static void main(String args[]) {
        FlatMaterialLighterIJTheme.setup();
        UIManager.put("TextComponent.arc", 999);

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppComedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel contenido;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAppName;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelMensaje;
    private javax.swing.JLabel jLabelNavText;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
