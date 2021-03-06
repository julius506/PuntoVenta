/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package puntoventa;

import javax.swing.JOptionPane;

/**
 *
 * @author Julian
 */
public class ViewClientesEspeciales extends javax.swing.JFrame {

    /**
     * Creates new form ViewCajeroBuscarProducto
     */
    public ViewClientesEspeciales() {
        initComponents();
        ButtonModificar.setVisible(false);
        Conexion manager = new Conexion();
        
        String queryClientes = "select C.cedula, tipo, nombreP, apellido1, apellido2, descuento, Grado_Aca from (cliente natural join persona) as C, fisico where (C.cedula = fisico.cedula) UNION select C.cedula, tipo, nombre as nombreP, '', '', descuento, '' from (cliente natural join persona) as C, juridico where (C.cedula = juridico.cedula);";
        String fisicos = manager.getHileraResultado();
        
//        String queryClientesJuridicos = "select C.cedula, tipo, nombreP, apellido1, apellido2, descuento, Grado_Aca from (cliente natural join persona) as C, juridico where (C.cedula = juridico.cedula);";
//        String juridicos = manager.getHileraResultado();
        manager.llenarTabla(queryClientes, TableClientes);
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
        ButtonCancelar = new javax.swing.JButton();
        LabelNombre = new javax.swing.JLabel();
        LabelDescripcion = new javax.swing.JLabel();
        TextFieldNombre = new javax.swing.JTextField();
        TextFieldCedula = new javax.swing.JTextField();
        ButtonBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableClientes = new javax.swing.JTable();
        ButtonAgregarNuevo = new javax.swing.JButton();
        ButtonModificar = new javax.swing.JButton();
        ButtonEliminar = new javax.swing.JButton();
        ButtonTelefono = new javax.swing.JButton();
        ButtonDireccion = new javax.swing.JButton();
        ButtonRefrescar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ButtonCancelar.setText("Cancelar");
        ButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelarActionPerformed(evt);
            }
        });

        LabelNombre.setText("Nombre");

        LabelDescripcion.setText("Cedula");

        ButtonBuscar.setText("Buscar");
        ButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBuscarActionPerformed(evt);
            }
        });

        TableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Cedula", "Tipo Cedula", "Nombre", "Apellido1", "Apellido2", "Descuento", "Nivel Academico"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
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
        TableClientes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TableClientes);

        ButtonAgregarNuevo.setText("Agregar Nuevo");
        ButtonAgregarNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgregarNuevoActionPerformed(evt);
            }
        });

        ButtonModificar.setText("Modificar");

        ButtonEliminar.setText("Eliminar");
        ButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEliminarActionPerformed(evt);
            }
        });

        ButtonTelefono.setText("Telefonos");
        ButtonTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTelefonoActionPerformed(evt);
            }
        });

        ButtonDireccion.setText("Direcciones");
        ButtonDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDireccionActionPerformed(evt);
            }
        });

        ButtonRefrescar.setText("Refrescar");
        ButtonRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRefrescarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1112, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelNombre)
                            .addComponent(LabelDescripcion))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TextFieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ButtonAgregarNuevo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonTelefono)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonDireccion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ButtonRefrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ButtonCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                    .addComponent(ButtonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(ButtonCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNombre)
                    .addComponent(TextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelDescripcion)
                    .addComponent(TextFieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonBuscar)
                    .addComponent(ButtonAgregarNuevo)
                    .addComponent(ButtonTelefono)
                    .addComponent(ButtonDireccion)
                    .addComponent(ButtonRefrescar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(ButtonModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonEliminar)
                        .addGap(0, 123, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_ButtonCancelarActionPerformed

    private void ButtonAgregarNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgregarNuevoActionPerformed
        new ViewAgregarClienteEspecial().setVisible(true);
        Conexion manager = new Conexion();
        String queryClientes = "select C.cedula, tipo, nombreP, apellido1, apellido2, descuento, Grado_Aca from (cliente natural join persona) as C, fisico where (C.cedula = fisico.cedula)  UNION select C.cedula, tipo, nombre as nombreP, '', '', descuento, '' from (cliente natural join persona) as C, juridico where (C.cedula = juridico.cedula);";
        manager.llenarTabla(queryClientes, TableClientes);
    }//GEN-LAST:event_ButtonAgregarNuevoActionPerformed

    private void ButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEliminarActionPerformed
        int row = TableClientes.getSelectedRow();
        int column = 0;
        String cedula = TableClientes.getValueAt(row, column).toString();
        
        Conexion manager = new Conexion();
        String queryEliminarClientes = "delete from cliente where cedula ='"+cedula+"';";
        
        boolean exito = manager.consulta(queryEliminarClientes);
        if(exito) {
            String queryClientes = "select C.cedula, tipo, nombreP, apellido1, apellido2, descuento, Grado_Aca from (cliente natural join persona) as C, fisico where (C.cedula = fisico.cedula)  UNION select C.cedula, tipo, nombre as nombreP, '', '', descuento, '' from (cliente natural join persona) as C, juridico where (C.cedula = juridico.cedula);";
            manager.llenarTabla(queryClientes, TableClientes);
        }else{
            JOptionPane.showMessageDialog(null, "No se pudo eliminar cliente", "Alerta", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ButtonEliminarActionPerformed

    private void ButtonTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTelefonoActionPerformed
        int row = TableClientes.getSelectedRow();
        int column = 0;
        String cedula = TableClientes.getValueAt(row, column).toString();
        new ViewTelefonos(cedula).setVisible(true);
    }//GEN-LAST:event_ButtonTelefonoActionPerformed

    private void ButtonDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDireccionActionPerformed
       int row = TableClientes.getSelectedRow();
        int column = 0;
        String cedula = TableClientes.getValueAt(row, column).toString();
        new ViewDireccion(cedula).setVisible(true);
    }//GEN-LAST:event_ButtonDireccionActionPerformed

    private void ButtonRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRefrescarActionPerformed
        Conexion manager = new Conexion();
        String queryClientes = "select C.cedula, tipo, nombreP, apellido1, apellido2, descuento, Grado_Aca from (cliente natural join persona) as C, fisico where (C.cedula = fisico.cedula)  UNION select C.cedula, tipo, nombre as nombreP, '', '', descuento, '' from (cliente natural join persona) as C, juridico where (C.cedula = juridico.cedula);";
        manager.llenarTabla(queryClientes, TableClientes);
    }//GEN-LAST:event_ButtonRefrescarActionPerformed

    private void ButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBuscarActionPerformed
        String cedula = TextFieldCedula.getText();
        String nombre = TextFieldNombre.getText();
        String selectCliente = "";
        if(nombre.equals("")){
            selectCliente = "select * from (select C.cedula, tipo, nombreP, apellido1, apellido2, descuento, Grado_Aca from (cliente natural join persona) as C, fisico where (C.cedula = fisico.cedula)  UNION select C.cedula, tipo, nombre as nombreP, '', '', descuento, '' from (cliente natural join persona) as C, juridico where (C.cedula = juridico.cedula)) as A where A.cedula = '"+cedula+"';";
        }else{
            selectCliente = "select * from (select C.cedula, tipo, nombreP, apellido1, apellido2, descuento, Grado_Aca from (cliente natural join persona) as C, fisico where (C.cedula = fisico.cedula)  UNION select C.cedula, tipo, nombre as nombreP, '', '', descuento, '' from (cliente natural join persona) as C, juridico where (C.cedula = juridico.cedula)) as A where A.cedula = '"+cedula+"' or A.nombreP like '%"+nombre+"%' ;";
        }
        
        Conexion manager = new Conexion();
        manager.llenarTabla(selectCliente, TableClientes);
    }//GEN-LAST:event_ButtonBuscarActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ViewCajeroBuscarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ViewCajeroBuscarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ViewCajeroBuscarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ViewCajeroBuscarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ViewCajeroBuscarProducto().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAgregarNuevo;
    private javax.swing.JButton ButtonBuscar;
    private javax.swing.JButton ButtonCancelar;
    private javax.swing.JButton ButtonDireccion;
    private javax.swing.JButton ButtonEliminar;
    private javax.swing.JButton ButtonModificar;
    private javax.swing.JButton ButtonRefrescar;
    private javax.swing.JButton ButtonTelefono;
    private javax.swing.JLabel LabelDescripcion;
    private javax.swing.JLabel LabelNombre;
    private javax.swing.JTable TableClientes;
    private javax.swing.JTextField TextFieldCedula;
    private javax.swing.JTextField TextFieldNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
