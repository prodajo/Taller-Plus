/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tallerplus.interfaz;

import com.tallerplus.files.Ficheros;
import com.tallerplus.gestion.GestionCitas;
import com.tallerplus.objetos.Cita;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dani_
 */
public class Citas extends javax.swing.JFrame {
    DefaultTableModel tabla=new DefaultTableModel();
    /**
     * Creates new form Citas
     */
    public Citas() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        //Columnas de la tabla
        tabla.addColumn("Matrícula");
        tabla.addColumn("Fecha y hora");
        tabla.addColumn("Descripción");
        tabla.addColumn("Precio");
        tabla.addColumn("Estado");
        //Añadimos todas las citas existentes
        for (Cita elemento : Ficheros.citas) {
            String anadir[] = new String[5];
            anadir[0] = elemento.getMatricula();
            anadir[1] = elemento.getFechaHora();
            anadir[2] = elemento.getDescripcion();
            anadir[3]=Float.toString(elemento.getPrecio());
            anadir[4]=elemento.getEstado();
            tabla.addRow(anadir);
        }

        this.tablacitas.setModel(tabla);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        inmatricula = new javax.swing.JTextField();
        labelfechahora = new javax.swing.JLabel();
        infechahora = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        indescripcion = new javax.swing.JTextField();
        bañadircita = new javax.swing.JLabel();
        bborrarcita = new javax.swing.JLabel();
        comboestado = new javax.swing.JComboBox<>();
        inprecio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        batras = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablacitas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 500));
        setPreferredSize(new java.awt.Dimension(900, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(900, 500));

        jPanel1.setBackground(new java.awt.Color(109, 132, 180));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Matrícula");

        inmatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inmatriculaActionPerformed(evt);
            }
        });

        labelfechahora.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelfechahora.setForeground(new java.awt.Color(255, 255, 255));
        labelfechahora.setText("Fecha y Hora");

        infechahora.setText("DD/MM/AAAA HH:MM");
        infechahora.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                infechahoraFocusGained(evt);
            }
        });
        infechahora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infechahoraActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Descripción");

        indescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indescripcionActionPerformed(evt);
            }
        });

        bañadircita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tallerplus/icon/mas.png"))); // NOI18N
        bañadircita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bañadircitaMouseClicked(evt);
            }
        });

        bborrarcita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tallerplus/icon/error.png"))); // NOI18N
        bborrarcita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bborrarcitaMouseClicked(evt);
            }
        });

        comboestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pendiente", "En proceso", "Finalizado", "Cerrado" }));

        inprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inprecioActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("€");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Precio");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Estado");

        batras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tallerplus/icon/flecha-hacia-la-izquierda.png"))); // NOI18N
        batras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                batrasMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Citas");

        tablacitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Matrícula", "Fecha y hora", "Descripcion", "Precio", "Estado"
            }
        ));
        jScrollPane1.setViewportView(tablacitas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(indescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(labelfechahora, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(infechahora, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(inmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(comboestado, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bañadircita))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bborrarcita)))
                .addGap(39, 39, 39))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(797, Short.MAX_VALUE)
                    .addComponent(batras)
                    .addGap(39, 39, 39)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(infechahora, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelfechahora))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(indescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(comboestado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(bañadircita, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bborrarcita, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 40, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(batras)
                    .addContainerGap(414, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void batrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_batrasMouseClicked
        VentanaPrincipal venanaprincipal = new VentanaPrincipal();
        dispose();
    }//GEN-LAST:event_batrasMouseClicked

    private void inprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inprecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inprecioActionPerformed

    private void bborrarcitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bborrarcitaMouseClicked
        int eliminar = tablacitas.getSelectedRow();
        if (eliminar >= 0) {
            boolean correcto = GestionCitas.borrarCita(Ficheros.citas.get(eliminar).getMatricula(), Ficheros.citas.get(eliminar).getFechaHora());
            if (correcto != false) {
                tabla.removeRow(eliminar);
            }
        }
    }//GEN-LAST:event_bborrarcitaMouseClicked

    private void bañadircitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bañadircitaMouseClicked

        try {

            String anadir[] = new String[5];
            anadir[0] = inmatricula.getText();
            anadir[1] = infechahora.getText();
            anadir[2] = indescripcion.getText();
            anadir[3]=inprecio.getText();
            anadir[4]=(String) comboestado.getSelectedItem();
            GestionCitas.anadirCita(anadir[0], anadir[1], anadir[2], Float.parseFloat(anadir[3]),anadir[4]);
            tabla.addRow(anadir);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Valor de precio erróneo", "Error", 0);
        } finally {
            inmatricula.setText("");
            infechahora.setText("DD/MM/AAAA HH:MM");
            inprecio.setText("");
            indescripcion.setText("");
        }
    }//GEN-LAST:event_bañadircitaMouseClicked

    private void indescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_indescripcionActionPerformed

    private void infechahoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infechahoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_infechahoraActionPerformed

    private void infechahoraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_infechahoraFocusGained
        infechahora.setText("");
    }//GEN-LAST:event_infechahoraFocusGained

    private void inmatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inmatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inmatriculaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Citas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel batras;
    private javax.swing.JLabel bañadircita;
    private javax.swing.JLabel bborrarcita;
    private javax.swing.JComboBox<String> comboestado;
    private javax.swing.JTextField indescripcion;
    private javax.swing.JTextField infechahora;
    private javax.swing.JTextField inmatricula;
    private javax.swing.JTextField inprecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelfechahora;
    private javax.swing.JTable tablacitas;
    // End of variables declaration//GEN-END:variables
}