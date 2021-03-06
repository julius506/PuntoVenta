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
public class ViewCajeroMenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form ViewCajeroMenuPrincipal
     */
    public ViewCajeroMenuPrincipal(String usr) {
        initComponents();
        LabelNumCedula.setText(usr);
        ToggleButtonCaja.setText("Cerrada");
        ButtonEstadoCaja.setVisible(false);
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
        LabelCedula = new javax.swing.JLabel();
        LabelNumCedula = new javax.swing.JLabel();
        ButtonLogOut = new javax.swing.JButton();
        ButtonFacturaNueva = new javax.swing.JButton();
        ButtonBuscarProducto = new javax.swing.JButton();
        ButtonEstadoCaja = new javax.swing.JButton();
        ToggleButtonCaja = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        ButtonEstadoCaja.setText("Abrir Caja");
        ButtonEstadoCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEstadoCajaActionPerformed(evt);
            }
        });

        ToggleButtonCaja.setText("jToggleButton1");
        ToggleButtonCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToggleButtonCajaActionPerformed(evt);
            }
        });

        jLabel1.setText("Caja");

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
                        .addComponent(LabelCedula)
                        .addGap(25, 25, 25)
                        .addComponent(LabelNumCedula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ToggleButtonCaja))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ButtonFacturaNueva)
                        .addGap(71, 71, 71)
                        .addComponent(ButtonBuscarProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addComponent(ButtonEstadoCaja)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(ButtonLogOut)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCedula)
                    .addComponent(LabelNumCedula)
                    .addComponent(ToggleButtonCaja)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonFacturaNueva)
                    .addComponent(ButtonBuscarProducto)
                    .addComponent(ButtonEstadoCaja))
                .addContainerGap(185, Short.MAX_VALUE))
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
        // Falta crear un if para que cierre la caja automaticamente si no lo hicieron antes
        new LogIn().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ButtonLogOutActionPerformed

    private void ButtonBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBuscarProductoActionPerformed
        new ViewCajeroBuscarProducto().setVisible(true);
    }//GEN-LAST:event_ButtonBuscarProductoActionPerformed

    private void ButtonFacturaNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonFacturaNuevaActionPerformed
        // Falta crear un if para que abra la caja automaticamente si no lo hicieron antes
        if(ToggleButtonCaja.getText().contains("Abierta")){
            new ViewFactura( LabelNumCedula.getText() ).setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Debe abrir la caja antes de hacer una factura", "Alerta", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_ButtonFacturaNuevaActionPerformed

    private void ButtonEstadoCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEstadoCajaActionPerformed
        EstadoActualCaja Estado = new EstadoActualCaja();
        Estado.setVisible(true);
    }//GEN-LAST:event_ButtonEstadoCajaActionPerformed

    private void ToggleButtonCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToggleButtonCajaActionPerformed
        Conexion manager = new Conexion();
        String cedula = LabelNumCedula.getText();
        if(ToggleButtonCaja.getText().equals("Cerrada")){
            ToggleButtonCaja.setText("Abierta");
          
            String saldo = JOptionPane.showInputDialog ( "Saldo actual" ); 
            String queryActual = "insert into caja values ('1', "+saldo+", CURRENT_DATE, CURRENT_TIME, CURRENT_TIMESTAMP);";
            manager.consulta(queryActual);
            String queryAbrir = "insert into Apertura_Caja values ('1', CURRENT_DATE, CURRENT_TIME, "+cedula+", "+saldo+", CURRENT_TIMESTAMP);";
            manager.consulta(queryAbrir);
            JOptionPane.showMessageDialog(null, "Se abre la caja con un saldo de "+saldo+" ", "Exito", JOptionPane.INFORMATION_MESSAGE);
        }else{
            ToggleButtonCaja.setText("Cerrada");
            //cierra con el saldo actual
            String queryActual = "select saldo_actual from Caja where tiempo in (select max(tiempo) from Caja);";
            manager.consulta(queryActual);
            String saldo = manager.getHileraResultado();
            String[] parts = saldo.split("-");
            saldo = parts[0]; // 004
            saldo = saldo.substring(1);
            

            
            String queryCerrar = "insert into Cierre_Caja values ('1', CURRENT_DATE, CURRENT_TIME, "+cedula+", "+saldo+", CURRENT_TIMESTAMP);";
            manager.consulta(queryCerrar);
            JOptionPane.showMessageDialog(null, "Se cerro la caja con un saldo de "+saldo+" ", "Exito", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_ToggleButtonCajaActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBuscarProducto;
    private javax.swing.JButton ButtonEstadoCaja;
    private javax.swing.JButton ButtonFacturaNueva;
    private javax.swing.JButton ButtonLogOut;
    private javax.swing.JLabel LabelCedula;
    private javax.swing.JLabel LabelNumCedula;
    private javax.swing.JToggleButton ToggleButtonCaja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
