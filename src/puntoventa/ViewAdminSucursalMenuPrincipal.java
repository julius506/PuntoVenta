/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package puntoventa;

/**
 *
 * @author Julian
 */
public class ViewAdminSucursalMenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form ViewCajeroMenuPrincipal
     */
    public ViewAdminSucursalMenuPrincipal() {
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
        ButtonClientesEspeciales = new javax.swing.JButton();
        ButtonEmpleados = new javax.swing.JButton();
        ButtonEstadisticas = new javax.swing.JButton();

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

        ButtonClientesEspeciales.setText("Clientes Especiales");

        ButtonEmpleados.setText("Empleados");

        ButtonEstadisticas.setText("Estadisticas");

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
                            .addComponent(LabelNombreUsuario)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ButtonInventario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonFacturaNueva, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonClientesEspeciales, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonEstadisticas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ButtonBuscarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonSolicitarProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonEmpleados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(75, Short.MAX_VALUE))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonFacturaNueva)
                    .addComponent(ButtonBuscarProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonInventario)
                    .addComponent(ButtonSolicitarProductos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonClientesEspeciales)
                    .addComponent(ButtonEmpleados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonEstadisticas)
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
        new ViewAdminSucursalFactura().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ButtonFacturaNuevaActionPerformed

    private void ButtonInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonInventarioActionPerformed
        new ViewAdminSucursalInventario().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ButtonInventarioActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBuscarProducto;
    private javax.swing.JButton ButtonClientesEspeciales;
    private javax.swing.JButton ButtonEmpleados;
    private javax.swing.JButton ButtonEstadisticas;
    private javax.swing.JButton ButtonFacturaNueva;
    private javax.swing.JButton ButtonInventario;
    private javax.swing.JButton ButtonLogOut;
    private javax.swing.JButton ButtonSolicitarProductos;
    private javax.swing.JLabel LabelCedula;
    private javax.swing.JLabel LabelNombreUsuario;
    private javax.swing.JLabel LabelNumCedula;
    private javax.swing.JLabel LabelUsuario;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
