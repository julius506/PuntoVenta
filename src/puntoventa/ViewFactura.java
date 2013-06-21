/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package puntoventa;

/**
 *
 * @author Julian
 */
public class ViewFactura extends javax.swing.JFrame {
     Impresora imp;
    /**
     * Creates new form ViewCajeroFactura
     */
    public ViewFactura(String cedula) {
        initComponents();
        LabelDivisa.setVisible(false);
        ComboBoxDivisa.setVisible(false);
        ButtonEliminar.setVisible(false);
        LabelNumCedula.setVisible(false);
        LabelNumCedula.setText(cedula);
        ButtonModificar.setVisible(false);
        LabelProductosFacturados.setVisible(false);
        LabelProductosFacturados.setText("");
        TextFieldCodigoDescuento.setVisible(false);
        
        LabelProductosEliminados.setVisible(false);
        LabelProductosEliminados.setText("");
        /*LabelSubtotal.setText("0");
        LabelValueTotal.setText("0");
        LabelValueImpuesto.setText("0");
        LabelValueDescuento.setText("0");
        LabelValueTotalDivisa.setText("0");*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMain = new javax.swing.JPanel();
        PanelTable = new javax.swing.JPanel();
        PanelCalculosFactura = new javax.swing.JPanel();
        LabelCodigoDescuento = new javax.swing.JLabel();
        LabelSubtotal = new javax.swing.JLabel();
        LabelImpuestos = new javax.swing.JLabel();
        LabelTotal = new javax.swing.JLabel();
        TextFieldCodigoDescuento = new javax.swing.JTextField();
        LabelValueDescuento = new javax.swing.JLabel();
        LabelValueSubtotal = new javax.swing.JLabel();
        LabelValueImpuesto = new javax.swing.JLabel();
        LabelValueTotal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableProductos = new javax.swing.JTable();
        ComboBoxDivisa = new javax.swing.JComboBox();
        LabelDivisa = new javax.swing.JLabel();
        LabelValueTotalDivisa = new javax.swing.JLabel();
        ButtonModificar = new javax.swing.JButton();
        ButtonEliminar = new javax.swing.JButton();
        LabelCodBarras = new javax.swing.JLabel();
        LabelNomCliente = new javax.swing.JLabel();
        LabelCedulaCliente = new javax.swing.JLabel();
        FieldCodBarras = new javax.swing.JTextField();
        ButtonAgregar = new javax.swing.JButton();
        ButtonCancelar = new javax.swing.JButton();
        ButtonProcesar = new javax.swing.JButton();
        TextFieldNombre = new javax.swing.JTextField();
        TextFieldCedulaCliente = new javax.swing.JTextField();
        ButtonBuscar = new javax.swing.JButton();
        ComboBoxTipoCedula = new javax.swing.JComboBox();
        LabelNumCedula = new javax.swing.JLabel();
        LabelProductosFacturados = new javax.swing.JLabel();
        LabelProductosEliminados = new javax.swing.JLabel();
        ButtonRefrescar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        javax.swing.GroupLayout PanelCalculosFacturaLayout = new javax.swing.GroupLayout(PanelCalculosFactura);
        PanelCalculosFactura.setLayout(PanelCalculosFacturaLayout);
        PanelCalculosFacturaLayout.setHorizontalGroup(
            PanelCalculosFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelCalculosFacturaLayout.setVerticalGroup(
            PanelCalculosFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 89, Short.MAX_VALUE)
        );

        LabelCodigoDescuento.setText("Descuento");

        LabelSubtotal.setText("Subtotal");

        LabelImpuestos.setText("Impuestos");

        LabelTotal.setText("TOTAL");

        TextFieldCodigoDescuento.setText(" ");
        TextFieldCodigoDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldCodigoDescuentoActionPerformed(evt);
            }
        });

        LabelValueDescuento.setText("0");

        LabelValueSubtotal.setText("0");

        LabelValueImpuesto.setText("13");

        LabelValueTotal.setText("0");

        TableProductos.setAutoCreateRowSorter(true);
        TableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Descripcion", "Cantidad", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.Integer.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableProductos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TableProductos);
        TableProductos.getColumnModel().getColumn(0).setResizable(false);
        TableProductos.getColumnModel().getColumn(1).setResizable(false);
        TableProductos.getColumnModel().getColumn(2).setResizable(false);
        TableProductos.getColumnModel().getColumn(3).setResizable(false);

        ComboBoxDivisa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dolares", "Euros", "Cordobas" }));
        ComboBoxDivisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxDivisaActionPerformed(evt);
            }
        });

        LabelDivisa.setText("Total en otra divisa");

        LabelValueTotalDivisa.setText("0");

        ButtonModificar.setText("Modificar");
        ButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonModificarActionPerformed(evt);
            }
        });

        ButtonEliminar.setText("Eliminar");
        ButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelTableLayout = new javax.swing.GroupLayout(PanelTable);
        PanelTable.setLayout(PanelTableLayout);
        PanelTableLayout.setHorizontalGroup(
            PanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTableLayout.createSequentialGroup()
                .addGroup(PanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelTableLayout.createSequentialGroup()
                        .addGroup(PanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelCodigoDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelSubtotal)
                            .addComponent(LabelImpuestos)
                            .addComponent(LabelTotal))
                        .addGap(4, 4, 4)
                        .addComponent(TextFieldCodigoDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(153, 153, 153))
                    .addGroup(PanelTableLayout.createSequentialGroup()
                        .addComponent(LabelDivisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ComboBoxDivisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)))
                .addComponent(PanelCalculosFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(93, 93, 93)
                .addGroup(PanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabelValueDescuento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelValueSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelValueImpuesto, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(LabelValueTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelValueTotalDivisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
            .addGroup(PanelTableLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ButtonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelTableLayout.setVerticalGroup(
            PanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTableLayout.createSequentialGroup()
                .addGroup(PanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelTableLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(ButtonModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonEliminar)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(PanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTableLayout.createSequentialGroup()
                        .addGroup(PanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelTableLayout.createSequentialGroup()
                                .addGroup(PanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LabelCodigoDescuento)
                                    .addComponent(TextFieldCodigoDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelSubtotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelImpuestos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelTotal))
                            .addGroup(PanelTableLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(LabelValueDescuento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelValueSubtotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelValueImpuesto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelValueTotal)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ComboBoxDivisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LabelValueTotalDivisa))
                            .addComponent(LabelDivisa)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTableLayout.createSequentialGroup()
                        .addComponent(PanelCalculosFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        LabelCodBarras.setText("Codigo Barras");

        LabelNomCliente.setText("Nombre Cliente");

        LabelCedulaCliente.setText("Cedula");

        FieldCodBarras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldCodBarrasActionPerformed(evt);
            }
        });

        ButtonAgregar.setText("Agregar");
        ButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgregarActionPerformed(evt);
            }
        });

        ButtonCancelar.setText("Cancelar");
        ButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelarActionPerformed(evt);
            }
        });

        ButtonProcesar.setText("Procesar");
        ButtonProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonProcesarActionPerformed(evt);
            }
        });

        TextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldNombreActionPerformed(evt);
            }
        });

        TextFieldCedulaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldCedulaClienteActionPerformed(evt);
            }
        });

        ButtonBuscar.setText("Buscar");
        ButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBuscarActionPerformed(evt);
            }
        });

        ComboBoxTipoCedula.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fisico", "Juridico", "Residente", "Extranjero" }));

        ButtonRefrescar.setText("Refrescar");
        ButtonRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRefrescarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelMainLayout = new javax.swing.GroupLayout(PanelMain);
        PanelMain.setLayout(PanelMainLayout);
        PanelMainLayout.setHorizontalGroup(
            PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelTable, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelMainLayout.createSequentialGroup()
                        .addGroup(PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(LabelCodBarras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LabelCedulaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LabelNomCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelMainLayout.createSequentialGroup()
                                .addGroup(PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(TextFieldNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(FieldCodBarras))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ButtonAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ComboBoxTipoCedula, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelMainLayout.createSequentialGroup()
                                        .addComponent(ButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ButtonCancelar))
                                    .addGroup(PanelMainLayout.createSequentialGroup()
                                        .addGroup(PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(PanelMainLayout.createSequentialGroup()
                                                .addComponent(LabelNumCedula)
                                                .addGap(123, 123, 123)
                                                .addComponent(LabelProductosEliminados))
                                            .addComponent(LabelProductosFacturados))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(PanelMainLayout.createSequentialGroup()
                                .addGroup(PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ButtonProcesar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(TextFieldCedulaCliente, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ButtonRefrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85))))))
        );
        PanelMainLayout.setVerticalGroup(
            PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMainLayout.createSequentialGroup()
                .addGroup(PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonCancelar)
                    .addGroup(PanelMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelCodBarras)
                            .addComponent(FieldCodBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonAgregar)
                            .addComponent(ButtonBuscar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelNomCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TextFieldCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ComboBoxTipoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LabelNumCedula)
                                .addComponent(LabelProductosFacturados)
                                .addComponent(LabelProductosEliminados))
                            .addComponent(LabelCedulaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonProcesar)
                    .addComponent(ButtonRefrescar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldNombreActionPerformed

    private void FieldCodBarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldCodBarrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldCodBarrasActionPerformed

    private void TextFieldCedulaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldCedulaClienteActionPerformed
        Conexion manager = new Conexion();
        String cedulaCliente = LabelCedulaCliente.getText();
        String queryDescuento = "select descuento from cliente where cedula='"+cedulaCliente+"'";
        manager.consulta(queryDescuento);
        LabelValueDescuento.setText( manager.getHileraResultado() );
    }//GEN-LAST:event_TextFieldCedulaClienteActionPerformed

    private void ButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBuscarActionPerformed
        new ViewCajeroBuscarProducto().setVisible(true);
    }//GEN-LAST:event_ButtonBuscarActionPerformed

    private void ButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_ButtonCancelarActionPerformed

    private void ButtonProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonProcesarActionPerformed
        // acá se procesará e imprimirá la factura
        String nombre = TextFieldNombre.getText();
        String cedulaCliente = TextFieldCedulaCliente.getText();
        String cedulaCajero = LabelNumCedula.getText();
        String descuento = LabelValueDescuento.getText();
        String impuestos = LabelValueImpuesto.getText();
        String subtotal = LabelSubtotal.getText();
        String total = LabelValueTotal.getText();
        String num_caja = "1";
        int num_rows = (int) TableProductos.getRowCount();
        
        Conexion manager = new Conexion();
        String insertFactura = "insert into facturas values(default, CURRENT_TIMESTAMP, "+total+", '"+num_caja+"', '"+cedulaCliente+"', '"+cedulaCajero+"') returning Num_Factura;";
        manager.consulta(insertFactura);
        String facturaID = manager.getHileraResultado();
        facturaID = facturaID.replaceAll("\\W","");
        
        
        for(int i=0;i<num_rows;i++){
            //inserto cada producto en facturados
            Conexion manager2 = new Conexion();
            String codigo = TableProductos.getValueAt(i,0).toString();
            int cantidad = Integer.parseInt( TableProductos.getValueAt(i,2).toString() );
            double precio = Double.parseDouble( TableProductos.getValueAt(i,3).toString() );
            subtotal = subtotal + cantidad* (int) precio;
            String insertFacturado = "insert into facturados values("+facturaID+", '"+codigo+"', '"+cantidad+"', '"+precio+"');";
            manager2.consulta(insertFacturado);
            
            //obtengo existencia actual en inventario
            Conexion manager3 = new Conexion();
            String actualProducto = "select existencia from producto where cod='"+codigo+"';";
            manager3.consulta(actualProducto);
            String existencia = manager3.getHileraResultado();
            existencia = existencia.replaceAll("\\W","");

            
            int existenciaInt = Integer.parseInt(existencia);

            //actualizo nuevo valor de existencia actual
            int nuevaExistenciaInt = existenciaInt-cantidad;
            String sellProducto = "update producto set existencia = '"+nuevaExistenciaInt+"' where cod='"+codigo+"';";
            manager3.consulta(sellProducto);
        }
              
        
        
        
//        String cadena;
//        cadena = "acá se procesará e imprimirá la factura del Cajero";
//        if (!cadena.equals(""))
//				{
//					imp = new Impresora();
//					imp.imprimir(cadena);
//				}
//				else System.out.println("NO SE IMPRIME NADA EN BLANCO...");
	
    }//GEN-LAST:event_ButtonProcesarActionPerformed

    private void ComboBoxDivisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxDivisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxDivisaActionPerformed

    private void TextFieldCodigoDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldCodigoDescuentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldCodigoDescuentoActionPerformed

    private void ButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonModificarActionPerformed
        
    }//GEN-LAST:event_ButtonModificarActionPerformed

    private void ButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEliminarActionPerformed
        
    }//GEN-LAST:event_ButtonEliminarActionPerformed

    private void ButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgregarActionPerformed
        Conexion manager = new Conexion();
        
        String ProductosFacturados = LabelProductosFacturados.getText();
        String codigo = FieldCodBarras.getText();
   
        if( ProductosFacturados.contains("select") ){ //si ya hay productos facturados agrega un union
            ProductosFacturados = ProductosFacturados+" UNION ";
        }
        String queryProducto = "select cod as Codigo, descripcion as Descripcion, '1' as Cantidad, precio1 as Precio from producto where cod='"+codigo+"'"; //query de nuevo producto
        ProductosFacturados = ProductosFacturados+queryProducto; //agregar query de nuevo producto
        LabelProductosFacturados.setText(ProductosFacturados); //almacena nuevo query
        String query = "select * from ("+ProductosFacturados+") as A;"; //ejecuta el nuevo query
        
        manager.llenarTabla(query, TableProductos);

        
        Conexion manager2 = new Conexion();
        String cedulaCliente = LabelCedulaCliente.getText();
        String queryDescuento = "select descuento from cliente where cedula='"+cedulaCliente+"'";
        manager2.consulta(queryDescuento);
        LabelValueDescuento.setText( manager2.getHileraResultado() );
        
        LabelValueSubtotal.setText("");
        this.Refresh();
    }//GEN-LAST:event_ButtonAgregarActionPerformed
    private void Refresh(){
        //actualizo tabla de productos 
        Conexion manager = new Conexion();
        String ProductosFacturados = LabelProductosFacturados.getText();
        String query = "select * from ("+ProductosFacturados+") as A;";
        manager.llenarTabla(query, TableProductos);
        
        //actualizo descuento para el cliente
        Conexion manager2 = new Conexion();
        String cedulaCliente = TextFieldCedulaCliente.getText();
        String queryDescuento = "select descuento from cliente where cedula='"+cedulaCliente+"'";
        manager2.consulta(queryDescuento);
        String desc = manager2.getHileraResultado();
        desc =desc.replaceAll("\\W","");
        double descuento = 0.0;
        if(desc.equals("")){
            LabelValueDescuento.setText( "0" );
        }else{
            LabelValueDescuento.setText( desc );
            descuento = Double.parseDouble(desc);
        }
        
        //recalculo subtotal
        int num_rows = (int) TableProductos.getRowCount();
        double subtotal = 0.0;
        for(int i=0;i<num_rows;i++){
            int cantidad= Integer.parseInt( TableProductos.getValueAt(i,2).toString() );
            double valor = Double.parseDouble( TableProductos.getValueAt(i,3).toString() );
            subtotal = subtotal + cantidad* (int) valor;
        }
        LabelValueSubtotal.setText( Double.toString(subtotal));
        
        //calculo impuestos
        Double impuesto = Double.parseDouble( LabelValueImpuesto.getText() );
        Conexion manager3 = new Conexion();
        String queryExonerado = "select exonerado from cliente where cedula='"+cedulaCliente+"'";
        manager2.consulta(queryDescuento);
        String exo = manager3.getHileraResultado();
        desc =exo.replaceAll("\\W","");
        
        if(desc.contains("t")){
            LabelValueImpuesto.setText( "0 (exonerado)" );
            impuesto = 0.0;
        }else{
           
        }
        
        //calculo total
        double total = subtotal*(1+impuesto/100)*(1- descuento/100 );
        LabelValueTotal.setText( Double.toString(total));
    
    
    }
    private void ButtonRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRefrescarActionPerformed
         this.Refresh();
//        //actualizo tabla de productos 
//        Conexion manager = new Conexion();
//        String ProductosFacturados = LabelProductosFacturados.getText();
//        String query = "select * from ("+ProductosFacturados+") as A;";
//        manager.llenarTabla(query, TableProductos);
//        
//        //actualizo descuento para el cliente
//        Conexion manager2 = new Conexion();
//        String cedulaCliente = TextFieldCedulaCliente.getText();
//        String queryDescuento = "select descuento from cliente where cedula='"+cedulaCliente+"'";
//        manager2.consulta(queryDescuento);
//        String desc = manager2.getHileraResultado();
//        desc =desc.replaceAll("\\W","");
//        double descuento = 0.0;
//        if(desc.equals("")){
//            LabelValueDescuento.setText( "0" );
//        }else{
//            LabelValueDescuento.setText( desc );
//            descuento = Double.parseDouble(desc);
//        }
//        
//        //recalculo subtotal
//        int num_rows = (int) TableProductos.getRowCount();
//        double subtotal = 0.0;
//        for(int i=0;i<num_rows;i++){
//            int cantidad= Integer.parseInt( TableProductos.getValueAt(i,2).toString() );
//            double valor = Double.parseDouble( TableProductos.getValueAt(i,3).toString() );
//            subtotal = subtotal + cantidad* (int) valor;
//        }
//        LabelValueSubtotal.setText( Double.toString(subtotal));
//        
//        //calculo impuestos
//        Double impuesto = Double.parseDouble( LabelValueImpuesto.getText() );
//        Conexion manager3 = new Conexion();
//        String queryExonerado = "select exonerado from cliente where cedula='"+cedulaCliente+"'";
//        manager2.consulta(queryDescuento);
//        String exo = manager3.getHileraResultado();
//        desc =exo.replaceAll("\\W","");
//        
//        if(desc.contains("t")){
//            LabelValueImpuesto.setText( "0 (exonerado)" );
//            impuesto = 0.0;
//        }else{
//           
//        }
//        
//        //calculo total
//        double total = subtotal*(1+impuesto/100)*(1- descuento/100 );
//        LabelValueTotal.setText( Double.toString(total));
        
    }//GEN-LAST:event_ButtonRefrescarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAgregar;
    private javax.swing.JButton ButtonBuscar;
    private javax.swing.JButton ButtonCancelar;
    private javax.swing.JButton ButtonEliminar;
    private javax.swing.JButton ButtonModificar;
    private javax.swing.JButton ButtonProcesar;
    private javax.swing.JButton ButtonRefrescar;
    private javax.swing.JComboBox ComboBoxDivisa;
    private javax.swing.JComboBox ComboBoxTipoCedula;
    private javax.swing.JTextField FieldCodBarras;
    private javax.swing.JLabel LabelCedulaCliente;
    private javax.swing.JLabel LabelCodBarras;
    private javax.swing.JLabel LabelCodigoDescuento;
    private javax.swing.JLabel LabelDivisa;
    private javax.swing.JLabel LabelImpuestos;
    private javax.swing.JLabel LabelNomCliente;
    private javax.swing.JLabel LabelNumCedula;
    private javax.swing.JLabel LabelProductosEliminados;
    private javax.swing.JLabel LabelProductosFacturados;
    private javax.swing.JLabel LabelSubtotal;
    private javax.swing.JLabel LabelTotal;
    private javax.swing.JLabel LabelValueDescuento;
    private javax.swing.JLabel LabelValueImpuesto;
    private javax.swing.JLabel LabelValueSubtotal;
    private javax.swing.JLabel LabelValueTotal;
    private javax.swing.JLabel LabelValueTotalDivisa;
    private javax.swing.JPanel PanelCalculosFactura;
    private javax.swing.JPanel PanelMain;
    private javax.swing.JPanel PanelTable;
    private javax.swing.JTable TableProductos;
    private javax.swing.JTextField TextFieldCedulaCliente;
    private javax.swing.JTextField TextFieldCodigoDescuento;
    private javax.swing.JTextField TextFieldNombre;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
