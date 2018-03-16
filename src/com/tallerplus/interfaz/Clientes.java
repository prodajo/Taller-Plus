
package com.tallerplus.interfaz;

import Validaciones.ValidarFormatos;
import VentanasEmergentes.Mensajes;
import com.tallerplus.files.Ficheros;
import com.tallerplus.gestion.GestionClientes;
import com.tallerplus.gestion.GestionTabla;
import com.tallerplus.objetos.Coche;
import java.awt.Color;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_OPTION;
import javax.swing.table.DefaultTableModel;

/**
 * Clase que gestiona el funcionamiento de la vetana Clientes, en dónde se pueden añadir, editar o eliminar clientes.
 * Hay una tabla dónde se muestra el contenido del ArrayList Ficheros.coches.
 * Cierra el programa al presionar el botón cerrar.
 * @author dani_
 */
public class Clientes extends javax.swing.JFrame {

    int cliente_editar;
    boolean edicion = false;
    DefaultTableModel tablaCliente = new DefaultTableModel();

    /**
     * Constructor en dónde se inicializan los componentes, se centra la ventana en la pantalla, se evita que sea redimensionable y se hace visible.
     * Se añade el contenido del ArrayList Ficheros.coches a la tabla.
     */
    public Clientes() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        tablaCliente.addColumn("Matrícula");
        tablaCliente.addColumn("Motor");
        tablaCliente.addColumn("cilindrada");
        tablaCliente.addColumn("caballos");
        tablaCliente.addColumn("nombre");
        tablaCliente.addColumn("DNI");
        tablaCliente.addColumn("telefono");
        edicion = false;
        // añadimos los coches a la tabla
        mostrarTabla();
    }

    /**
     * Método para validar todos los datos introducidos.
     *
     * @param caballos Caballos a validar.
     * @param matricula Matrícula a validar.
     * @param cilindrada Cilindrada a validar.
     * @param dni DNI a validar.
     * @param telefono Teléfono a validar.
     * @return True si son datos válidos, false si no lo son.
     */
    private boolean validarDatos(String caballos, String matricula, String cilindrada, String dni, String telefono) {
        boolean validado = false;
        boolean caballosValidos = ValidarFormatos.isNumeric(textoCaballos.getText()); // comprobacion de que los datos esten validados correctamente 
        boolean matriculaValida = ValidarFormatos.validarMatricula(textoMatricula.getText());
        boolean cilindradaValida = ValidarFormatos.validarPrecio(textoCilindrada.getText());
        boolean dniValido = ValidarFormatos.validarDni(textoDni.getText());
        boolean telefonoValido = ValidarFormatos.validarTelefono(textoTelefono.getText());
        if (caballosValidos == true && matriculaValida == true && cilindradaValida == true && dniValido == true && telefonoValido == true) {
            textoCaballos.setForeground(Color.black);
            textoMatricula.setForeground(Color.black);
            textoCilindrada.setForeground(Color.black);
            textoDni.setForeground(Color.black);
            textoTelefono.setForeground(Color.black);
            validado = true;
        } else {

            JOptionPane.showMessageDialog(null, "datos erroneos");
            if (caballosValidos == false) {
                textoCaballos.setForeground(Color.red);
            } else {
                textoCaballos.setForeground(Color.black);
            }
            if (matriculaValida == false) {
                textoMatricula.setForeground(Color.red);
            } else {
                textoMatricula.setForeground(Color.black);
            }
            if (cilindradaValida == false) {
                textoCilindrada.setForeground(Color.red);
            } else {
                textoCilindrada.setForeground(Color.black);
            }
            if (dniValido == false) {
                textoDni.setForeground(Color.red);
            } else {
                textoDni.setForeground(Color.black);
            }
            if (telefonoValido == false) {
                textoTelefono.setForeground(Color.red);
            } else {
                textoTelefono.setForeground(Color.black);

            }
            validado = false;

        }
        return validado;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        batras1 = new javax.swing.JLabel();
        titulousuarios = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textoCaballos = new javax.swing.JTextField();
        textoMatricula = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textoNombre = new javax.swing.JTextField();
        textoCilindrada = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        textoTelefono = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        textoDni = new javax.swing.JTextField();
        botonAnadirCliente = new javax.swing.JLabel();
        botonEditarCliente = new javax.swing.JLabel();
        botonEliminarCliente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        textoMotor = new javax.swing.JComboBox<>();

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clientes");
        setMinimumSize(new java.awt.Dimension(900, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(900, 500));

        jPanel1.setBackground(new java.awt.Color(109, 132, 180));

        batras1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tallerplus/icon/flecha-hacia-la-izquierda.png"))); // NOI18N
        batras1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                batras1MouseClicked(evt);
            }
        });

        titulousuarios.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        titulousuarios.setForeground(new java.awt.Color(255, 255, 255));
        titulousuarios.setText("Clientes");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("motor");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("matricula");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("cilindrada");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("caballos");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("nombre");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("DNI");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("telefono");

        botonAnadirCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tallerplus/icon/003-usuario.png"))); // NOI18N
        botonAnadirCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAnadirClienteMouseClicked(evt);
            }
        });

        botonEditarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tallerplus/icon/001-usuario-2.png"))); // NOI18N
        botonEditarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonEditarClienteMouseClicked(evt);
            }
        });

        botonEliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tallerplus/icon/002-usuario-1.png"))); // NOI18N
        botonEliminarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonEliminarClienteMouseClicked(evt);
            }
        });

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Matricula", "Motor ", "Cilindrada", "Caballos", "Nombre", "DNI", "Telefono"
            }
        ));
        tablaClientes.setToolTipText("");
        tablaClientes.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tablaClientes);
        tablaClientes.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        textoMotor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diesel", "Gasolina", "Hibrido", "Electrico" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulousuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(textoCaballos, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textoMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(textoCilindrada, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                    .addComponent(textoMotor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textoDni, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botonAnadirCliente)
                                .addGap(18, 18, 18)
                                .addComponent(botonEditarCliente)
                                .addGap(18, 18, 18)
                                .addComponent(botonEliminarCliente)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(batras1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titulousuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textoDni, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                            .addComponent(textoMotor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textoCilindrada, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoCaballos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonAnadirCliente)
                            .addComponent(botonEditarCliente)
                            .addComponent(botonEliminarCliente)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(batras1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Botón para volver a la pantalla anterior.
     * @param evt
     */
    private void batras1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_batras1MouseClicked
        VentanaPrincipal venanaprincipal = new VentanaPrincipal();
        dispose();
    }//GEN-LAST:event_batras1MouseClicked
    /**
     * Botón para añadir un cliente.
     * @param evt
     */
    private void botonAnadirClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAnadirClienteMouseClicked

        String matricula, motor, cilindrada, caballos, nombre, telefono, dni;
        matricula = textoMatricula.getText();
        motor = (String) textoMotor.getSelectedItem();
        cilindrada = textoCilindrada.getText();
        caballos = textoCaballos.getText();
        nombre = textoNombre.getText();
        dni = textoDni.getText();
        telefono = textoTelefono.getText();
        boolean validado = validarDatos(caballos, matricula, cilindrada, telefono, dni);
        if (validado == true) {

            // metemos los datos en un array para despues insertarlos en la tabla
            String[] datos = {matricula, motor, cilindrada, caballos, nombre, telefono, dni};

            // comprobamos que esten todos los datos introducidos
            if ("".equals(matricula) || "".equals(cilindrada) || "".equals(caballos) || "".equals(nombre) || "".equals(dni) || "".equals(telefono)) {
                JOptionPane.showMessageDialog(null, "Debes introducir todos los datos del vehiculo", "error", JOptionPane.OK_OPTION);

            } else {
                if (edicion == false) {
                    // si se han introducido todos los campos
                    boolean encontrado = GestionClientes.anadirCliente(matricula, motor, cilindrada, caballos, nombre, telefono, dni);
                    if (encontrado == false) {
                        tablaCliente.addRow(datos); // lo añadimos en la lista que tenemos en pantalla
                    }            // ponemos todos los campos a null
                } else {
                    GestionClientes.editarCliente(cliente_editar, matricula, motor, cilindrada, caballos, nombre, telefono, dni);
                    GestionTabla.borrarTabla(tablaCliente);
                    mostrarTabla();
                }
                edicion = false;
                textoMatricula.setText("");
                textoCilindrada.setText("");
                textoCaballos.setText("");
                textoNombre.setText("");
                textoDni.setText("");
                textoTelefono.setText("");
            }
        }
    }//GEN-LAST:event_botonAnadirClienteMouseClicked
    /**
     * Botón para editar un cliente seleccionado en la tabla.
     * @param evt
     */
    private void botonEditarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEditarClienteMouseClicked
        String eb = "editar";
        int editar = tablaClientes.getSelectedRow();
        if (editar >= 0) {
            textoMatricula.setText(tablaClientes.getValueAt(editar, 0).toString());
            textoMotor.setSelectedItem(tablaClientes.getValueAt(editar, 1).toString());
            textoCilindrada.setText(tablaClientes.getValueAt(editar, 2).toString());
            textoCaballos.setText(tablaClientes.getValueAt(editar, 3).toString());
            textoNombre.setText(tablaClientes.getValueAt(editar, 4).toString());
            textoTelefono.setText(tablaClientes.getValueAt(editar, 6).toString());
            textoDni.setText(tablaClientes.getValueAt(editar, 5).toString());

            if (tablaCliente.getValueAt(editar, 1).equals("Diesel")) {
                textoMotor.setSelectedIndex(0);
            } else if (tablaCliente.getValueAt(editar, 1).equals("Gasolina")) {
                textoMotor.setSelectedIndex(1);
            } else if (tablaCliente.getValueAt(editar, 1).equals("Hibrido")) {
                textoMotor.setSelectedIndex(2);
            } else {
                textoMotor.setSelectedIndex(3);
            }
            cliente_editar = editar;
            edicion = true;
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un usuario", "Error", 1);
        }
    }//GEN-LAST:event_botonEditarClienteMouseClicked
    /**
     * botón para eliminar al cliente seleccionado en la tabla.
     * @param evt
     */
    private void botonEliminarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarClienteMouseClicked
        if (edicion == false) {
            String eb = "eliminar";
            int eliminar = tablaClientes.getSelectedRow();
            if (eliminar >= 0) {
                int confirmado = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas eliminar este cliente?");
                if (confirmado == YES_OPTION) {
                    GestionClientes.borrarCliente(Ficheros.coches.get(eliminar).getMatricula(), eb);
                    tablaCliente.removeRow(eliminar);
                }

            } else {
                JOptionPane.showMessageDialog(null, "No hay usuarios para eliminar.", "Error", 0);
            }
        } else {
            Mensajes.ventanaError("No puedes eliminar un cliente mientras editas", "Edición");
        }
    }//GEN-LAST:event_botonEliminarClienteMouseClicked

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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    /**
     * Muestra la tabla actualizada.
     */
    private void mostrarTabla() {
        for (Coche elemento : Ficheros.coches) {
            String anadir[] = new String[7];
            anadir[0] = elemento.getMatricula();
            anadir[1] = elemento.getMotor();
            anadir[2] = elemento.getCilindrada();
            anadir[3] = elemento.getCaballos();
            anadir[4] = elemento.getNombreDueño();
            anadir[5] = elemento.getTelefono();
            anadir[6] = elemento.getDni();
            tablaCliente.addRow(anadir);
        }
        this.tablaClientes.setModel(tablaCliente);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel batras1;
    private javax.swing.JLabel botonAnadirCliente;
    private javax.swing.JLabel botonEditarCliente;
    private javax.swing.JLabel botonEliminarCliente;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTextField textoCaballos;
    private javax.swing.JTextField textoCilindrada;
    private javax.swing.JTextField textoDni;
    private javax.swing.JTextField textoMatricula;
    private javax.swing.JComboBox<String> textoMotor;
    private javax.swing.JTextField textoNombre;
    private javax.swing.JTextField textoTelefono;
    private javax.swing.JLabel titulousuarios;
    // End of variables declaration//GEN-END:variables
}
