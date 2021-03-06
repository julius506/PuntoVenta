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
public class LogIn extends javax.swing.JFrame {

    /**
     * Creates new form LogIn
     */
    public LogIn() {
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

        PanelContainer = new javax.swing.JPanel();
        LabelUsername = new javax.swing.JLabel();
        LabelPassword = new javax.swing.JLabel();
        TextFieldUsername = new javax.swing.JTextField();
        ButtonLogIn = new javax.swing.JButton();
        PasswordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        LabelUsername.setText("Username");

        LabelPassword.setText("Password");

        TextFieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldUsernameActionPerformed(evt);
            }
        });

        ButtonLogIn.setText("Log In");
        ButtonLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLogInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelContainerLayout = new javax.swing.GroupLayout(PanelContainer);
        PanelContainer.setLayout(PanelContainerLayout);
        PanelContainerLayout.setHorizontalGroup(
            PanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelContainerLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(PanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelPassword)
                    .addComponent(LabelUsername))
                .addGap(39, 39, 39)
                .addGroup(PanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(PasswordField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                        .addComponent(TextFieldUsername, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(156, 156, 156))
        );
        PanelContainerLayout.setVerticalGroup(
            PanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelContainerLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(PanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelUsername)
                    .addComponent(TextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPassword)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ButtonLogIn)
                .addContainerGap(164, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelContainer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelContainer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldUsernameActionPerformed

    private void ButtonLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLogInActionPerformed
        
        //hay que modificar esto para que lo revise con la base de datos
        String usr = TextFieldUsername.getText();
        String password;
        password = String.valueOf(PasswordField.getPassword());
        //esta fallando pasar de password a string para hacer consulta
        String checkUsernamePassword = "select puesto from login where username='"+usr+"' and contrasena = '"+password+"';";
        //System.out.println(checkUsernamePassword);
// 
        Conexion manager = new Conexion();
        boolean exito = manager.consulta(checkUsernamePassword);
        //System.out.println("El valor de exito en logIn es");
        //System.out.println(exito);
        if(exito) {
            usr = manager.getHileraResultado();
            //System.out.println("El resultado de la consulta es");
            //System.out.println(usr);
            usr = usr.replaceAll("\\W","");
            //System.out.println(usr);
            //System.out.println(usr);
            if(usr.contains("Cajero")){
                new ViewCajeroMenuPrincipal( TextFieldUsername.getText() ).setVisible(true);
                this.dispose();
            }else{
                if(usr.contains("Sucursal")){
                    new ViewAdminSucursalMenuPrincipal( TextFieldUsername.getText() ).setVisible(true);
                    this.dispose();
                }else{
                    if(usr.contains("Almacen")){
                       new ViewAdminAlmacenMenuPrincipal( TextFieldUsername.getText() ).setVisible(true);
                       this.dispose();
                    }else{
                        JOptionPane.showMessageDialog(null, "Usuario o contraseña no validos", "Alerta", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        } else {
            System.out.println("Consulta fallo");
        }
                         
        
        
    }//GEN-LAST:event_ButtonLogInActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonLogIn;
    private javax.swing.JLabel LabelPassword;
    private javax.swing.JLabel LabelUsername;
    private javax.swing.JPanel PanelContainer;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JTextField TextFieldUsername;
    // End of variables declaration//GEN-END:variables
}
