/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.ControladorPedido;
import controlador.ControladorProveedor;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonna
 */
public class VentanaProveedor extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentanaProveedor
     */
    public ControladorProveedor controladorProveedor = new ControladorProveedor();
    public ControladorPedido controladorPedido = new ControladorPedido();

    public VentanaProveedor() {
        initComponents();

        this.setIconifiable(true);
        this.setIgnoreRepaint(true);
        this.setClosable(true);
        this.setResizable(true);
        this.setVisible(true);
        this.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        actualizarCombosPedido();
    }

    public void actualizarCombosPedido() {

        var data = new String[this.controladorPedido.mostrarInfo().size()];
        for (var i = 0; i < this.controladorPedido.mostrarInfo().size(); i++) {
            data[i] = String.valueOf(this.controladorPedido.mostrarInfo().get(i).getCodigoPedido());
        }
        this.cbCodigosPedidos.setModel(new javax.swing.DefaultComboBoxModel<>(data));

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbProveedores = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtRuta = new javax.swing.JTextField();
        btGuardar = new javax.swing.JButton();
        btModificar = new javax.swing.JButton();
        btBorrar = new javax.swing.JButton();
        txtCodigo = new javax.swing.JFormattedTextField();
        btCambios = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        cbCodigosPedidos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProveedores = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Proveedor");

        jPanel1.setBackground(new java.awt.Color(204, 255, 102));

        jLabel1.setText("Código");

        jLabel2.setText("Nombre");

        jLabel3.setText("Direccion");

        jLabel6.setText("Seleccionar Proveedor a Modificar");

        cbProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProveedoresActionPerformed(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Código \ndel pedido");

        btGuardar.setText("Guardar");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        btModificar.setText("Modificar");
        btModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarActionPerformed(evt);
            }
        });

        btBorrar.setText("Borrar");
        btBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBorrarActionPerformed(evt);
            }
        });

        try {
            txtCodigo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        btCambios.setText("Guardar ");
        btCambios.setEnabled(false);
        btCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCambiosActionPerformed(evt);
            }
        });

        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tbProveedores.setBackground(new java.awt.Color(204, 204, 255));
        tbProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbProveedores);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(btGuardar)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCodigo)
                                    .addComponent(txtRuta)
                                    .addComponent(txtNombre)
                                    .addComponent(cbCodigosPedidos, 0, 126, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jButton1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(cbProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 14, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btModificar)
                        .addGap(18, 18, 18)
                        .addComponent(btBorrar)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCambios)
                        .addGap(57, 57, 57))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbCodigosPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btGuardar)
                            .addComponent(jButton1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btModificar)
                            .addComponent(btBorrar))
                        .addGap(18, 18, 18)
                        .addComponent(btCambios)))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProveedoresActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cbProveedoresActionPerformed

    private void actualizarCombos() {
        var dataPro = new String[this.controladorProveedor.mostrarInfo().size()];
        for (int i = 0; i < controladorProveedor.mostrarInfo().size(); i++) {
            dataPro[i] = controladorProveedor.mostrarInfo().get(i).getNombre();
        }

        this.cbProveedores.setModel(new javax.swing.DefaultComboBoxModel<>(dataPro));
    }

    private void actualizarTabla() {
        var datosTabla = new Object[this.controladorProveedor.mostrarInfo().size()][4];

        for (int x = 0; x < this.controladorProveedor.mostrarInfo().size(); x++) {

            datosTabla[x][0] = this.controladorProveedor.mostrarInfo().get(x).getCodigo();
            datosTabla[x][1] = this.controladorProveedor.mostrarInfo().get(x).getNombre();
            datosTabla[x][2] = this.controladorProveedor.mostrarInfo().get(x).getRuta();
            datosTabla[x][3] = this.controladorProveedor.mostrarInfo().get(x).getCodigoPedido().getCodigoPedido();
        }

        var encabezado = new String[6];
        encabezado[0] = "Código";
        encabezado[1] = "Nombre";
        encabezado[2] = "Ruta";
        encabezado[3] = "Código de pedido";

        //jTable1.setModel(new javax.swing.table.DefaultTableModel(data, encabezado));
        this.tbProveedores.setModel(new javax.swing.table.DefaultTableModel(datosTabla, encabezado));

    }
    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        String[] datos = new String[4];
        datos[0] = txtCodigo.getText();
        datos[1] = txtNombre.getText();
        datos[2] = txtRuta.getText();
        datos[3] = cbCodigosPedidos.getSelectedItem().toString();

        controladorProveedor.validarDatos(datos);
        actualizarCombos();
        actualizarTabla();

    }//GEN-LAST:event_btGuardarActionPerformed

    private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed

        int codigoProveedor = Integer.valueOf(this.cbProveedores.getSelectedItem().toString());

        this.btGuardar.setEnabled(false);
        this.btCambios.setEnabled(true);

        for (int x = 0; x < controladorProveedor.mostrarInfo().size(); x++) {
            if (codigoProveedor == controladorProveedor.mostrarInfo().get(x).getCodigo()) {
                this.txtCodigo.setText(String.valueOf(codigoProveedor));
                this.txtNombre.setText(controladorProveedor.mostrarInfo().get(x).getNombre());
                this.txtRuta.setText(String.valueOf(controladorProveedor.mostrarInfo().get(x).getRuta()));
                this.cbCodigosPedidos.setSelectedItem(controladorProveedor.mostrarInfo().get(x).getCodigoPedido());
                break;
            }
        }
    }//GEN-LAST:event_btModificarActionPerformed

    private void btBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBorrarActionPerformed
        // TODO add your handling code here:
        int codigoProducto = Integer.valueOf(this.cbProveedores.getSelectedItem().toString());

        for (int x = 0; x < controladorProveedor.mostrarInfo().size(); x++) {
            if (codigoProducto == controladorProveedor.mostrarInfo().get(x).getCodigo()) {
                controladorProveedor.eliminarProveedor(x);
                JOptionPane.showMessageDialog(null, "Se ha eliminado un proveedor");
                actualizarCombos();
                actualizarTabla();
                break;

            }

        }
    }//GEN-LAST:event_btBorrarActionPerformed

    private void btCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCambiosActionPerformed
        // TODO add your handling code here:
        int codigoProducto = Integer.valueOf(this.cbProveedores.getSelectedItem().toString());
        this.btGuardar.setEnabled(true);
        this.btCambios.setEnabled(false);

        for (int x = 0; x < controladorProveedor.mostrarInfo().size(); x++) {
            if (codigoProducto == controladorProveedor.mostrarInfo().get(x).getCodigo()) {

                String[] datos = new String[4];
                datos[0] = this.txtCodigo.getText();
                datos[1] = this.txtNombre.getText();
                datos[2] = this.txtRuta.getText();
                datos[3] = this.cbCodigosPedidos.getSelectedItem().toString();

                controladorProveedor.eliminarProveedor(x);
                controladorProveedor.validarDatos(datos);
                actualizarTabla();

                break;

            }

        }
    }//GEN-LAST:event_btCambiosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        actualizarCombosPedido();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaProveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBorrar;
    private javax.swing.JButton btCambios;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btModificar;
    private javax.swing.JComboBox<String> cbCodigosPedidos;
    private javax.swing.JComboBox<String> cbProveedores;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbProveedores;
    private javax.swing.JFormattedTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRuta;
    // End of variables declaration//GEN-END:variables
}
