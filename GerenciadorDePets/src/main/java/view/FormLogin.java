/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import sources.*;
import controller.*;
import javax.swing.JOptionPane;
import model.Canil;
import model.Pessoa;

/**
 *
 * @author leonc
 */
public class FormLogin extends javax.swing.JFrame {

    //Singleton
    private static FormLogin gerFormLogin;
    
    public FormLogin() {
        initComponents();
        menuAdmin.setVisible(false);
    }

    public static FormLogin Gen(){
        if(gerFormLogin == null){
            gerFormLogin = new FormLogin();
        }
        return gerFormLogin;
    }
    //Singleton
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtfieldID = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        txtfieldSenha = new javax.swing.JPasswordField();
        tbutShowPassword = new javax.swing.JToggleButton();
        btnCadastro = new javax.swing.JButton();
        btnEntrar = new javax.swing.JButton();
        admCheckbox = new javax.swing.JCheckBox();
        menuAdmin = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblbduser = new javax.swing.JLabel();
        lblbdsenha = new javax.swing.JLabel();
        txtfieldBdSenha = new javax.swing.JTextField();
        txtfieldBdUser = new javax.swing.JTextField();
        btbTesteConexao = new javax.swing.JButton();
        txtfieldBdUrl = new javax.swing.JTextField();
        lblbdurl = new javax.swing.JLabel();
        btbResetInfo = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(520, 590));
        setUndecorated(true);
        setSize(new java.awt.Dimension(520, 590));

        txtfieldID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfieldIDActionPerformed(evt);
            }
        });

        lblSenha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSenha.setText("Senha");
        lblSenha.setToolTipText("");
        lblSenha.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblID.setText("CPF/CNPJ");
        lblID.setToolTipText("");
        lblID.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtfieldSenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfieldSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfieldSenhaActionPerformed(evt);
            }
        });

        tbutShowPassword.setBackground(new java.awt.Color(204, 204, 204));
        tbutShowPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbutShowPassword.setText("Mostrar");
        tbutShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbutShowPasswordActionPerformed(evt);
            }
        });

        btnCadastro.setBackground(new java.awt.Color(30, 74, 145));
        btnCadastro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCadastro.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastro.setText("Cadastrar");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });

        btnEntrar.setBackground(new java.awt.Color(30, 74, 145));
        btnEntrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        admCheckbox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        admCheckbox.setText("Habilitar Menu Conexão");
        admCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admCheckboxActionPerformed(evt);
            }
        });

        menuAdmin.setBackground(new java.awt.Color(204, 204, 204));
        menuAdmin.setBorder(javax.swing.BorderFactory.createTitledBorder("Menu Avançado"));
        menuAdmin.setAutoscrolls(true);
        menuAdmin.setInheritsPopupMenu(true);
        menuAdmin.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Postgree:");

        lblbduser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblbduser.setText("Usuário:");

        lblbdsenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblbdsenha.setText("Senha:");

        txtfieldBdSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtfieldBdSenha.setText("utfpr");
        txtfieldBdSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfieldBdSenhaActionPerformed(evt);
            }
        });

        txtfieldBdUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtfieldBdUser.setText("postgres");
        txtfieldBdUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfieldBdUserActionPerformed(evt);
            }
        });

        btbTesteConexao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btbTesteConexao.setText("Teste de Conexão");
        btbTesteConexao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbTesteConexaoActionPerformed(evt);
            }
        });

        txtfieldBdUrl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtfieldBdUrl.setText("jdbc:postgresql://localhost:5432/Principal_BD");
        txtfieldBdUrl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfieldBdUrlActionPerformed(evt);
            }
        });

        lblbdurl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblbdurl.setText("URL:");

        btbResetInfo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btbResetInfo.setText("Reset Default");
        btbResetInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbResetInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuAdminLayout = new javax.swing.GroupLayout(menuAdmin);
        menuAdmin.setLayout(menuAdminLayout);
        menuAdminLayout.setHorizontalGroup(
            menuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuAdminLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(menuAdminLayout.createSequentialGroup()
                        .addGroup(menuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblbdsenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblbduser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblbdurl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(menuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtfieldBdUser)
                            .addComponent(txtfieldBdSenha)
                            .addComponent(txtfieldBdUrl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(menuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btbTesteConexao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btbResetInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        menuAdminLayout.setVerticalGroup(
            menuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(menuAdminLayout.createSequentialGroup()
                        .addGroup(menuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblbduser)
                            .addComponent(txtfieldBdUser, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(menuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblbdurl)
                            .addComponent(txtfieldBdUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(menuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblbdsenha)
                            .addComponent(txtfieldBdSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(menuAdminLayout.createSequentialGroup()
                        .addComponent(btbResetInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btbTesteConexao, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sources/logo.png"))); // NOI18N

        btnExit.setBackground(new java.awt.Color(255, 153, 153));
        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(51, 51, 51));
        btnExit.setText("Sair");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtfieldID, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtfieldSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbutShowPassword))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExit))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(admCheckbox)
                            .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblID))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tbutShowPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtfieldSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(admCheckbox)
                .addGap(18, 18, 18)
                .addComponent(menuAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfieldIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfieldIDActionPerformed

    
    
    private void txtfieldSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfieldSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfieldSenhaActionPerformed

    private void tbutShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbutShowPasswordActionPerformed
        ShowPassword();
    }//GEN-LAST:event_tbutShowPasswordActionPerformed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        cadastrar();
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        entrar();
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void cadastrar(){
        if(Conexao.testeConexao(txtfieldBdUrl.getText(), txtfieldBdUser.getText(), txtfieldBdSenha.getText())){
            if(true){
                FormCadastro.Gen().setVisible(true);
                lock(true);
            }
        }
        else{
            if(admCheckbox.isSelected()){
                JOptionPane.showMessageDialog(null, "Problema ao conectar com Banco de Dados", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "Problema ao conectar com Banco de Dados, verifique os parametros em Habilitar Menu de Conexão", "Erro", JOptionPane.ERROR_MESSAGE);
                admCheckbox.setSelected(true);
                CheckboxAdmVisibily();
                
            }
        }
    }
    
    
    private void entrar(){
        if(Conexao.testeConexao(txtfieldBdUrl.getText(), txtfieldBdUser.getText(), txtfieldBdSenha.getText())){          
            if(txtfieldID.getText().length() == 11){
                FormPagnaUser.Gen().selec();
                Pessoa.Gen().setCpf(txtfieldID.getText());
                FormPagnaUser.Gen().setVisible(true);
            }else if(txtfieldID.getText().length() == 14){
                FormPagnaUser.Gen().setVisible(true);
            }    
        }
        else{
            JOptionPane.showMessageDialog(null, "Problema ao conectar com Banco de Dados", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void lock(boolean state){
        state = !state;
        txtfieldBdUser.setEnabled(state);
        txtfieldBdUrl.setEnabled(state);
        txtfieldBdSenha.setEnabled(state);
        txtfieldID.setEnabled(state);
        txtfieldSenha.setEnabled(state);
    }
    
    
    private void admCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admCheckboxActionPerformed
        CheckboxAdmVisibily();
    }//GEN-LAST:event_admCheckboxActionPerformed

    private void CheckboxAdmVisibily(){
        if(admCheckbox.getSelectedObjects() == null){
            menuAdmin.setVisible(false);
        }
        else{
            menuAdmin.setVisible(true);
        }
    }
    
    
    
    
    private void btbTesteConexaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbTesteConexaoActionPerformed
        testeConexao();
    }//GEN-LAST:event_btbTesteConexaoActionPerformed

    private void testeConexao(){
        if(Conexao.testeConexao(txtfieldBdUrl.getText(), txtfieldBdUser.getText(), txtfieldBdSenha.getText())){
            JOptionPane.showMessageDialog(null, "Conectado com Sucesso", "Sucesso", JOptionPane.PLAIN_MESSAGE);
            CreateBD.Gen();
        }
        else{
            JOptionPane.showMessageDialog(null, "Problema ao conectar com Banco de Dados", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void resetbdinfo(){
        txtfieldBdUser.setText("postgres");
        txtfieldBdUrl.setText("jdbc:postgresql://localhost:5432/Principal_BD");
        txtfieldBdSenha.setText("utfpr");
    }
    
    public String getBdUrl(){
        return txtfieldBdUrl.getText();
    }
    public String getBdUser(){
        return txtfieldBdUser.getText();
    }
    public String getBdSenha(){
        return txtfieldBdSenha.getText();
    }
    
    public String getUserID(){
        return txtfieldID.getText();
    }
            
            
    
    
    
    private void txtfieldBdUrlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfieldBdUrlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfieldBdUrlActionPerformed

    private void txtfieldBdSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfieldBdSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfieldBdSenhaActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        sair();
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtfieldBdUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfieldBdUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfieldBdUserActionPerformed

    private void btbResetInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbResetInfoActionPerformed
        resetbdinfo();
    }//GEN-LAST:event_btbResetInfoActionPerformed

    public void sair(){
        if(JOptionPane.showConfirmDialog(null,"Deseja realmente sair?","Confirmação de Saída",JOptionPane.YES_NO_OPTION) == 0){
            System.exit(0);
        }
    }
    
    private void ShowPassword(){
        if(tbutShowPassword.isSelected()){
            txtfieldSenha.setEchoChar((char) 0);
        }
        else{
            txtfieldSenha.setEchoChar('*');
        }
    }
    
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
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox admCheckbox;
    private javax.swing.JButton btbResetInfo;
    private javax.swing.JButton btbTesteConexao;
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblbdsenha;
    private javax.swing.JLabel lblbdurl;
    private javax.swing.JLabel lblbduser;
    private javax.swing.JPanel menuAdmin;
    private javax.swing.JToggleButton tbutShowPassword;
    private javax.swing.JTextField txtfieldBdSenha;
    private javax.swing.JTextField txtfieldBdUrl;
    private javax.swing.JTextField txtfieldBdUser;
    private javax.swing.JTextField txtfieldID;
    private javax.swing.JPasswordField txtfieldSenha;
    // End of variables declaration//GEN-END:variables
}
