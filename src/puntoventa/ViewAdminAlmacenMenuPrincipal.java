/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package puntoventa;

/**
 *
 * @author Julian
 */
public class ViewAdminAlmacenMenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form ViewCajeroMenuPrincipal
     */
    public ViewAdminAlmacenMenuPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        LabelUsuario = new javax.swing.JLabel();
        LabelNombreUsuario = new javax.swing.JLabel();
        LabelCedula = new javax.swing.JLabel();
        LabelNumCedula = new javax.swing.JLabel();
        ButtonLogOut = new javax.swing.JButton();
        ButtonFacturaNueva = new javax.swing.JButton();
        ButtonBuscarProducto = new javax.swing.JButton();
        ButtonInventario = new javax.swing.JButton();
        ButtonSolicitarProductos = new javax.swing.JButton();
        ButtonComprar = new javax.swing.JButton();
        ButtonProveedores = new javax.swing.JButton();
        ButtonEmpleados = new javax.swing.JButton();
        ButtonClientesEspeciales = new javax.swing.JButton();
        ButtonEstadisticas = new javax.swing.JButton();
        ButtonCambiarDatos = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelUsuario.setText("Usuario:");

        LabelNombreUsuario.setText("Manuel Zuniga");

        LabelCedula.setText("Cedula");

        LabelNumCedula.setText("1-1365-0901");

        ButtonLogOut.setText("Log Out");
        ButtonLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLogOutActionPerformed(evt);
            }
        });

        ButtonFacturaNueva.setText("Factura Nueva");
        ButtonFacturaNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonFacturaNuevaActionPerformed(evt);
            }
        });

        ButtonBuscarProducto.setText("Buscar Producto");
        ButtonBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBuscarProductoActionPerformed(evt);
            }
        });

        ButtonInventario.setText("Inventario");
        ButtonInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonInventarioActionPerformed(evt);
            }
        });

        ButtonSolicitarProductos.setText("Solicitar Productos");
        ButtonSolicitarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSolicitarProductosActionPerformed(evt);
            }
        });

        ButtonComprar.setText("Comprar");
        ButtonComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonComprarActionPerformed(evt);
            }
        });

        ButtonProveedores.setText("Proveedores");
        ButtonProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonProveedoresActionPerformed(evt);
            }
        });

        ButtonEmpleados.setText("Empleados");
        ButtonEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEmpleadosActionPerformed(evt);
            }
        });

        ButtonClientesEspeciales.setText("Clientes Especiales");
        ButtonClientesEspeciales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonClientesEspecialesActionPerformed(evt);
            }
        });

        ButtonEstadisticas.setText("Estadisticas");
        ButtonEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEstadisticasActionPerformed(evt);
            }
        });

        ButtonCambiarDatos.setText("Cambiar Datos");
        ButtonCambiarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCambiarDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ButtonLogOut))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelUsuario)
                            .addComponent(LabelCedula))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelNumCedula)
                            .addComponent(LabelNombreUsuario))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ButtonEstadisticas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonInventario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonFacturaNueva, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonClientesEspeciales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ButtonEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonSolicitarProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonBuscarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonCambiarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonComprar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(ButtonLogOut)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelUsuario)
                    .addComponent(LabelNombreUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCedula)
                    .addComponent(LabelNumCedula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonFacturaNueva, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ButtonBuscarProducto, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonInventario)
                    .addComponent(ButtonSolicitarProductos)
                    .addComponent(ButtonComprar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonProveedores)
                    .addComponent(ButtonEmpleados)
                    .addComponent(ButtonClientesEspeciales))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonEstadisticas)
                    .addComponent(ButtonCambiarDatos))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLogOutActionPerformed
        new LogIn().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ButtonLogOutActionPerformed

    private void ButtonBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBuscarProductoActionPerformed
        new ViewCajeroBuscarProducto().setVisible(true);
    }//GEN-LAST:event_ButtonBuscarProductoActionPerformed

    private void ButtonFacturaNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonFacturaNuevaActionPerformed
        new ViewAdminAlmacenFactura().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ButtonFacturaNuevaActionPerformed

    private void ButtonInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonInventarioActionPerformed
        new ViewAdminAlmacenInventario().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ButtonInventarioActionPerformed

    private void ButtonSolicitarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSolicitarProductosActionPerformed
        new ViewAdminAlmacenSolicitarProductos().setVisible(true);

    }//GEN-LAST:event_ButtonSolicitarProductosActionPerformed

    private void ButtonComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonComprarActionPerformed
        new ViewAdminAlmacenComprarProductos().setVisible(true);

    }//GEN-LAST:event_ButtonComprarActionPerformed

    private void ButtonClientesEspecialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonClientesEspecialesActionPerformed
        new ViewClientesEspeciales().setVisible(true);
    }//GEN-LAST:event_ButtonClientesEspecialesActionPerformed

    private void ButtonEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEmpleadosActionPerformed
        new ViewEmpleados().setVisible(true);
    }//GEN-LAST:event_ButtonEmpleadosActionPerformed

    private void ButtonProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonProveedoresActionPerformed
        new ViewProveedores().setVisible(true);
    }//GEN-LAST:event_ButtonProveedoresActionPerformed

    private void ButtonEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEstadisticasActionPerformed
        new ViewEstadisticas().setVisible(true);
    }//GEN-LAST:event_ButtonEstadisticasActionPerformed

    private void ButtonCambiarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCambiarDatosActionPerformed
        new ViewCambiarDatos().setVisible(true);
    }//GEN-LAST:event_ButtonCambiarDatosActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBuscarProducto;
    private javax.swing.JButton ButtonCambiarDatos;
    private javax.swing.JButton ButtonClientesEspeciales;
    private javax.swing.JButton ButtonComprar;
    private javax.swing.JButton ButtonEmpleados;
    private javax.swing.JButton ButtonEstadisticas;
    private javax.swing.JButton ButtonFacturaNueva;
    private javax.swing.JButton ButtonInventario;
    private javax.swing.JButton ButtonLogOut;
    private javax.swing.JButton ButtonProveedores;
    private javax.swing.JButton ButtonSolicitarProductos;
    private javax.swing.JLabel LabelCedula;
    private javax.swing.JLabel LabelNombreUsuario;
    private javax.swing.JLabel LabelNumCedula;
    private javax.swing.JLabel LabelUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
