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
public class ViewAgregarProveedor extends javax.swing.JFrame {

    /**
     * Creates new form ViewAgregarProducto
     */
    public ViewAgregarProveedor() {
        initComponents();
        ButtonModificar.setVisible(false);
        String [] tipoCedula = new String[4];
        tipoCedula[0] = "Fisica";
        tipoCedula[1] = "Juridica";
        tipoCedula[2] = "Residente";
        tipoCedula[3] = "Pasaporte";
        ComboBoxTipoCedula.setModel(new javax.swing.DefaultComboBoxModel(tipoCedula));
        
        String queryProvincia = "select distinct provincia from lugar order by provincia ASC;";
        
        ComboBoxProvincia.removeAllItems();
        ComboBoxCanton.removeAllItems();
        ComboBoxDistrito.removeAllItems();
        
        Conexion manager = new Conexion();
        manager.llenarCombobox(queryProvincia, ComboBoxProvincia);
        
        String queryCanton = "select distinct canton from lugar where provincia='"+ComboBoxProvincia.getSelectedItem().toString()+"' order by canton ASC;";
        manager.llenarCombobox(queryCanton, ComboBoxCanton);
        
        String queryDistrito = "select distinct distrito from lugar where canton='"+ComboBoxCanton.getSelectedItem().toString()+"' order by distrito ASC;";
        manager.llenarCombobox(queryDistrito, ComboBoxDistrito);
        
  
    }
    
    public ViewAgregarProveedor(String cedula) {
        //esto es para el boton modificar, todavia no funciona
        
        
        initComponents();
        ButtonAgregar1.setVisible(false);
        String [] tipoCedula = new String[4];
        tipoCedula[0] = "Fisica";
        tipoCedula[1] = "Juridica";
        tipoCedula[2] = "Residente";
        tipoCedula[3] = "Pasaporte";
        ComboBoxTipoCedula.setModel(new javax.swing.DefaultComboBoxModel(tipoCedula));
        
        String queryProvincia = "select distinct provincia from lugar order by provincia ASC;";
        
        ComboBoxProvincia.removeAllItems();
        ComboBoxCanton.removeAllItems();
        ComboBoxDistrito.removeAllItems();
        
        Conexion manager = new Conexion();
        manager.llenarCombobox(queryProvincia, ComboBoxProvincia);
        
        String queryCanton = "select distinct canton from lugar where provincia='"+ComboBoxProvincia.getSelectedItem().toString()+"' order by canton ASC;";
        manager.llenarCombobox(queryCanton, ComboBoxCanton);
        
        String queryDistrito = "select distinct distrito from lugar where canton='"+ComboBoxCanton.getSelectedItem().toString()+"' order by distrito ASC;";
        manager.llenarCombobox(queryDistrito, ComboBoxDistrito);
        
        
        
        
        String queryNombre = "select nombre from proveedor where cedula = '"+cedula+"';";
        manager.consultaInsert(queryNombre);
        TextFieldNombre.setText( manager.getHileraResultado() );
        
        String queryApellido1 = "select apellido1 from proveedor where cedula = '"+cedula+"';";
        manager.consultaInsert(queryApellido1);
        TextFieldApellido1.setText( manager.getHileraResultado() );
        
        String queryApellido2 = "select apellido2 from proveedor where cedula = '"+cedula+"';";
        manager.consultaInsert(queryApellido2);
        TextFieldApellido2.setText( manager.getHileraResultado() );
        
//        String selectqueryProvincia = "select provincia from direccion where cedula = '"+cedula+"';";
//        manager.consultaInsert(selectqueryProvincia);
//        TextFieldApellido2.setText( manager.getHileraResultado() );
//        ComboBoxProvincia.setModel( manager.getHileraResultado() )
//        
//        String selectqueryCanton = "select canton from direccion where cedula = '"+cedula+"';";
//        manager.consultaInsert(selectqueryCanton);
//        TextFieldApellido2.setText( manager.getHileraResultado() );
//        
//        String selectqueryDistrito = "select distrito from direccion where cedula = '"+cedula+"';";
//        manager.consultaInsert(selectqueryDistrito);
//        TextFieldApellido2.setText( manager.getHileraResultado() );
        
        String queryDireccion = "select nombre from direccion where cedula = '"+cedula+"';";
        manager.consultaInsert(queryDireccion);
        TextFieldDireccion.setText( manager.getHileraResultado() );
        
        String queryDescuento = "select nombre from proveedor where cedula = '"+cedula+"';";
        manager.consultaInsert(queryDescuento);
        TextFieldDescuento.setText( manager.getHileraResultado() );
        
        String queryTelefono = "select telefono from telefono where cedula = '"+cedula+"';";
        manager.consultaInsert(queryTelefono);
        TextFieldTelefono.setText( manager.getHileraResultado() );
        
        String queryEmail = "select email from proveedor where cedula = '"+cedula+"';";
        manager.consultaInsert(queryDescuento);
        TextFieldEmail.setText( manager.getHileraResultado() );
        
        String queryContacto = "select contacto from telefono where cedula = '"+cedula+"';";
        manager.consultaInsert(queryTelefono);
        TextFieldContacto.setText( manager.getHileraResultado() );
  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        ButtonAgregar1 = new javax.swing.JButton();
        ButtonCancelar1 = new javax.swing.JButton();
        LabelCedula = new javax.swing.JLabel();
        TextFieldCedula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ComboBoxTipoCedula = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        PanelNoJuridico = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TextFieldNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TextFieldApellido1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TextFieldApellido2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextFieldDireccion = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ComboBoxDistrito = new javax.swing.JComboBox();
        ComboBoxCanton = new javax.swing.JComboBox();
        ComboBoxProvincia = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        TextFieldDescuento = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TextFieldTelefono = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        TextFieldEmail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        TextFieldContacto = new javax.swing.JTextField();
        ButtonModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ButtonAgregar1.setText("Agregar");
        ButtonAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgregar1ActionPerformed(evt);
            }
        });

        ButtonCancelar1.setText("Cancelar");
        ButtonCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelar1ActionPerformed(evt);
            }
        });

        LabelCedula.setText("Cedula");

        jLabel1.setText("Tipo Cedula");

        ComboBoxTipoCedula.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido 1");

        TextFieldApellido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldApellido1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Apellido 2");

        TextFieldApellido2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldApellido2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Direccion");

        TextFieldDireccion.setColumns(20);
        TextFieldDireccion.setRows(5);
        jScrollPane2.setViewportView(TextFieldDireccion);

        jLabel6.setText("Provincia");

        jLabel7.setText("Canton");

        jLabel8.setText("Distrito");

        ComboBoxDistrito.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboBoxDistrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxDistritoActionPerformed(evt);
            }
        });

        ComboBoxCanton.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboBoxCanton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxCantonActionPerformed(evt);
            }
        });

        ComboBoxProvincia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboBoxProvincia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBoxProvinciaItemStateChanged(evt);
            }
        });
        ComboBoxProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxProvinciaActionPerformed(evt);
            }
        });

        jLabel9.setText("Descuento");

        TextFieldDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldDescuentoActionPerformed(evt);
            }
        });

        jLabel10.setText("Telefono");

        TextFieldTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldTelefonoActionPerformed(evt);
            }
        });

        jLabel11.setText("Email");

        jLabel12.setText("Contacto");

        javax.swing.GroupLayout PanelNoJuridicoLayout = new javax.swing.GroupLayout(PanelNoJuridico);
        PanelNoJuridico.setLayout(PanelNoJuridicoLayout);
        PanelNoJuridicoLayout.setHorizontalGroup(
            PanelNoJuridicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNoJuridicoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(PanelNoJuridicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelNoJuridicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelNoJuridicoLayout.createSequentialGroup()
                        .addGroup(PanelNoJuridicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelNoJuridicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TextFieldTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                .addComponent(TextFieldEmail))
                            .addComponent(TextFieldContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 347, Short.MAX_VALUE))
                    .addGroup(PanelNoJuridicoLayout.createSequentialGroup()
                        .addComponent(TextFieldDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(452, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelNoJuridicoLayout.createSequentialGroup()
                        .addGroup(PanelNoJuridicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelNoJuridicoLayout.createSequentialGroup()
                                .addGroup(PanelNoJuridicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ComboBoxProvincia, 0, 111, Short.MAX_VALUE)
                                    .addComponent(TextFieldNombre))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PanelNoJuridicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelNoJuridicoLayout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 19, Short.MAX_VALUE))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelNoJuridicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(TextFieldApellido1)
                                    .addComponent(ComboBoxCanton, 0, 130, Short.MAX_VALUE))))
                        .addGap(13, 13, 13)
                        .addGroup(PanelNoJuridicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(PanelNoJuridicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextFieldApellido2)
                            .addComponent(ComboBoxDistrito, 0, 136, Short.MAX_VALUE)))))
        );
        PanelNoJuridicoLayout.setVerticalGroup(
            PanelNoJuridicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNoJuridicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelNoJuridicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(TextFieldApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(TextFieldApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelNoJuridicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(ComboBoxDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxCanton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(PanelNoJuridicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(8, 8, 8)
                .addGroup(PanelNoJuridicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TextFieldDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelNoJuridicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelNoJuridicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelNoJuridicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(TextFieldContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ButtonModificar.setText("Modificar");
        ButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(ButtonAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ComboBoxTipoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(LabelCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TextFieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ButtonCancelar1))))
                            .addComponent(PanelNoJuridico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelCedula)
                            .addComponent(TextFieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ButtonCancelar1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ComboBoxTipoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(PanelNoJuridico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonAgregar1)
                    .addComponent(ButtonModificar))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgregar1ActionPerformed
        String cedula = TextFieldCedula.getText();
        String TipoCedula = ComboBoxTipoCedula.getSelectedItem().toString();
        String nombre = TextFieldNombre.getText();
        String apellido1 = TextFieldApellido1.getText();
        String apellido2 = TextFieldApellido2.getText();
        String provincia = ComboBoxProvincia.getSelectedItem().toString();
        String canton = ComboBoxCanton.getSelectedItem().toString();
        String distrito = ComboBoxDistrito.getSelectedItem().toString();
        String direccion = TextFieldDireccion.getText();
        String descuento = TextFieldDescuento.getText();
        String telefono = TextFieldTelefono.getText();
        String email = TextFieldEmail.getText();
        String contacto = TextFieldContacto.getText();
        
        Conexion manager = new Conexion();
        String insertPersona = "insert into persona values('"+cedula+"', '"+TipoCedula+"');";
        boolean exito0 = manager.consultaInsert(insertPersona);
        
        String insertProovedor = "insert into proveedor values('"+cedula+"', '"+nombre+"', '"+apellido1+"', '"+apellido2+"', "+descuento+", '"+email+"', '"+contacto+"', CURRENT_TIMESTAMP);";
        String insertDireccion = "insert into direccion values('"+cedula+"', '"+provincia+"', '"+canton+"', '"+distrito+"', '"+direccion+"');";
        String insertTelefono = "insert into telefono values('"+cedula+"', '"+telefono+"', '"+provincia+"', '"+canton+"', '"+distrito+"', '"+direccion+"');";
        String sqlQuery = insertProovedor+insertDireccion+insertTelefono;
        
        boolean exito = manager.consultaInsert(sqlQuery);
        String resultado = manager.getHileraResultado();
        
        
        //System.out.println(resultado);
        if(resultado.equals("exito")){
            JOptionPane.showMessageDialog(null, "Proveedor agregado", "Exito", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "No se pudo agregar proveedor nuevo, el proveedor ya existe en la base de datos o hay algun dato no valido", "Alerta", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ButtonAgregar1ActionPerformed

    private void ButtonCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelar1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_ButtonCancelar1ActionPerformed

    private void TextFieldTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldTelefonoActionPerformed

    private void TextFieldDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldDescuentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldDescuentoActionPerformed

    private void TextFieldApellido2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldApellido2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldApellido2ActionPerformed

    private void TextFieldApellido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldApellido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldApellido1ActionPerformed

    private void ComboBoxProvinciaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboBoxProvinciaItemStateChanged
//        ComboBoxCanton.removeAllItems();
//        Conexion manager = new Conexion();
//        String queryCanton = "select distinct canton from lugar where provincia='"+ComboBoxProvincia.getSelectedItem().toString()+"';";
//        manager.llenarCombobox(queryCanton, ComboBoxCanton);
    }//GEN-LAST:event_ComboBoxProvinciaItemStateChanged

    private void ComboBoxProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxProvinciaActionPerformed
        ComboBoxCanton.removeAllItems();
        Conexion manager = new Conexion();
        if(ComboBoxProvincia.getSelectedItem()!=null){
            String queryCanton = "select distinct canton from lugar where provincia='"+ComboBoxProvincia.getSelectedItem().toString()+"' order by canton ASC;";
            manager.llenarCombobox(queryCanton, ComboBoxCanton);
        }   
    }//GEN-LAST:event_ComboBoxProvinciaActionPerformed

    private void ComboBoxDistritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxDistritoActionPerformed

    }//GEN-LAST:event_ComboBoxDistritoActionPerformed

    private void ComboBoxCantonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxCantonActionPerformed
        ComboBoxDistrito.removeAllItems();
        Conexion manager = new Conexion();
        if(ComboBoxCanton.getSelectedItem()!=null){
            String queryCanton = "select distinct distrito from lugar where canton='"+ComboBoxCanton.getSelectedItem().toString()+"' order by distrito ASC;";
            manager.llenarCombobox(queryCanton, ComboBoxDistrito);
        }
    }//GEN-LAST:event_ComboBoxCantonActionPerformed

    private void ButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonModificarActionPerformed
        
        
//        String nombre = TableProveedores.getValueAt(row, 2).toString();
//        String apellido1 = TableProveedores.getValueAt(row, 3).toString();
//        String apellido2 = TableProveedores.getValueAt(row, 4).toString();
//        int descuento = (int) TableProveedores.getValueAt(row, 5);
//        String contacto = TableProveedores.getValueAt(row, 6).toString();
//        String email = TableProveedores.getValueAt(row, 7).toString();
//        
//        Conexion manager = new Conexion();
//        String queryModProveedores = "update proveedor set nombre ='"+nombre+"', apellido1 = '"+apellido1+"', apellido2 = '"+apellido2+"', descuento = '"+descuento+"', contacto = '"+contacto+"', email = '"+email+"' where cedula='"+cedula+"';";
//        
//        boolean exito = manager.consulta(queryModProveedores);
//        if(exito) {
//            String queryProveedores = "select cedula, tipo, nombre, apellido1, apellido2, descuento, contacto, email from persona natural join proveedor;";
//            manager.llenarTabla(queryProveedores, TableProveedores);
//        }else{
//            JOptionPane.showMessageDialog(null, "No se pudo modificar proveedor", "Alerta", JOptionPane.ERROR_MESSAGE);
//        }
    }//GEN-LAST:event_ButtonModificarActionPerformed
    
    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAgregar1;
    private javax.swing.JButton ButtonCancelar1;
    private javax.swing.JButton ButtonModificar;
    private javax.swing.JComboBox ComboBoxCanton;
    private javax.swing.JComboBox ComboBoxDistrito;
    private javax.swing.JComboBox ComboBoxProvincia;
    private javax.swing.JComboBox ComboBoxTipoCedula;
    private javax.swing.JLabel LabelCedula;
    private javax.swing.JPanel PanelNoJuridico;
    private javax.swing.JTextField TextFieldApellido1;
    private javax.swing.JTextField TextFieldApellido2;
    private javax.swing.JTextField TextFieldCedula;
    private javax.swing.JTextField TextFieldContacto;
    private javax.swing.JTextField TextFieldDescuento;
    private javax.swing.JTextArea TextFieldDireccion;
    private javax.swing.JTextField TextFieldEmail;
    private javax.swing.JTextField TextFieldNombre;
    private javax.swing.JTextField TextFieldTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
