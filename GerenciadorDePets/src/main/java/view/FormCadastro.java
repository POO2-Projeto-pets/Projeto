/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.CanilBD;
import controller.ClinicaBD;
import controller.EnderecoBD;
import controller.PessoaBD;
import controller.PetShopBD;
import controller.ServicoBD;
import controller.VeterinarioBD;
import java.awt.Color;
import model.Canil;
import model.Clinica;
import model.Endereco;
import model.Pessoa;
import model.PetShop;
import model.Veterinario;


/**
 *
 * @author leonc
 */
public class FormCadastro extends javax.swing.JFrame {
    
    //Singleton
    private static FormCadastro gerFormCadastro;

    private FormCadastro() {
        initComponents();
        lblIDWarning.setVisible(false);
        lblPasswordWarning.setVisible(false);
        lblPasswordAgainWarning.setVisible(false);
    }
    
    public static FormCadastro Gen(){
        if(gerFormCadastro == null){
            gerFormCadastro = new FormCadastro();
        }
        return gerFormCadastro;
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        lblEmail = new javax.swing.JLabel();
        txtfieldEmail = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        txtfieldSenha = new javax.swing.JPasswordField();
        btnCadastro = new javax.swing.JButton();
        tbutShowPassword = new javax.swing.JToggleButton();
        lblNome = new javax.swing.JLabel();
        txtfieldNome = new javax.swing.JTextField();
        lblSenha2 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        txtfieldID = new javax.swing.JTextField();
        btnCadastro1 = new javax.swing.JButton();
        txtfieldSenhaAgain = new javax.swing.JPasswordField();
        lblEndereco = new javax.swing.JLabel();
        txtfieldEndereco = new javax.swing.JTextField();
        lblEstado = new javax.swing.JLabel();
        combboxEstado = new javax.swing.JComboBox<>();
        txtfieldCidade = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        txtfieldEndNum = new javax.swing.JTextField();
        lblEndNum = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        warningsenha = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lblIDWarning = new javax.swing.JLabel();
        lblPasswordWarning = new javax.swing.JLabel();
        lblPasswordAgainWarning = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        lblEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEmail.setText("Digite seu E-Mail:");
        lblEmail.setToolTipText("");
        lblEmail.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtfieldEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfieldEmailActionPerformed(evt);
            }
        });

        lblSenha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSenha.setText("Digite uma Senha:");
        lblSenha.setToolTipText("");
        lblSenha.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtfieldSenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfieldSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfieldSenhaFocusLost(evt);
            }
        });
        txtfieldSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfieldSenhaActionPerformed(evt);
            }
        });

        btnCadastro.setBackground(new java.awt.Color(255, 51, 102));
        btnCadastro.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnCadastro.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastro.setText("Cancelar");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });

        tbutShowPassword.setBackground(new java.awt.Color(204, 204, 204));
        tbutShowPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbutShowPassword.setText("Mostrar Senha");
        tbutShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbutShowPasswordActionPerformed(evt);
            }
        });

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNome.setText("Digite seu Nome:");
        lblNome.setToolTipText("");
        lblNome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtfieldNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfieldNomeActionPerformed(evt);
            }
        });

        lblSenha2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSenha2.setText("Digite novamente a senha:");
        lblSenha2.setToolTipText("");
        lblSenha2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblID.setText("Digite seu CPF | CNPJ:");
        lblID.setToolTipText("");
        lblID.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtfieldID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfieldID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfieldIDFocusLost(evt);
            }
        });
        txtfieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfieldIDActionPerformed(evt);
            }
        });
        txtfieldID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtfieldIDKeyReleased(evt);
            }
        });

        btnCadastro1.setBackground(new java.awt.Color(30, 74, 145));
        btnCadastro1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnCadastro1.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastro1.setText("Cadastrar");
        btnCadastro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastro1ActionPerformed(evt);
            }
        });

        txtfieldSenhaAgain.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfieldSenhaAgain.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfieldSenhaAgainFocusLost(evt);
            }
        });
        txtfieldSenhaAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfieldSenhaAgainActionPerformed(evt);
            }
        });

        lblEndereco.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEndereco.setText("Endereço:");
        lblEndereco.setToolTipText("");
        lblEndereco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtfieldEndereco.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfieldEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfieldEnderecoActionPerformed(evt);
            }
        });

        lblEstado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEstado.setText("Estado:");
        lblEstado.setToolTipText("");
        lblEstado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        combboxEstado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        combboxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins", "Distrito Federal" }));

        txtfieldCidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfieldCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfieldCidadeActionPerformed(evt);
            }
        });

        lblCidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCidade.setText("Cidade:");
        lblCidade.setToolTipText("");
        lblCidade.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtfieldEndNum.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfieldEndNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfieldEndNumActionPerformed(evt);
            }
        });

        lblEndNum.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEndNum.setText("Número:");
        lblEndNum.setToolTipText("");
        lblEndNum.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(204, 0, 51));
        jTextArea1.setRows(5);
        jTextArea1.setText("A senha deve estar dentro do padrão:\n* Minimo de 8 caracteres;\n* Máximo de 16 caracteres;");
        jTextArea1.setToolTipText("");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setEnabled(false);
        warningsenha.setViewportView(jTextArea1);

        lblIDWarning.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblIDWarning.setForeground(new java.awt.Color(0, 153, 0));
        lblIDWarning.setText("warning");

        lblPasswordWarning.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPasswordWarning.setForeground(new java.awt.Color(0, 153, 0));
        lblPasswordWarning.setText("warning2");

        lblPasswordAgainWarning.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPasswordAgainWarning.setForeground(new java.awt.Color(0, 153, 0));
        lblPasswordAgainWarning.setText("warning3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtfieldNome)
                            .addComponent(txtfieldEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtfieldID)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCadastro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCadastro1, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE))
                            .addComponent(txtfieldCidade)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEstado)
                                    .addComponent(combboxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtfieldEndNum)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblEndNum)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(jSeparator1)
                            .addComponent(txtfieldEndereco)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNome)
                                    .addComponent(lblCidade)
                                    .addComponent(lblEndereco)
                                    .addComponent(lblEmail)
                                    .addComponent(warningsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblSenha2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblPasswordAgainWarning))
                                    .addComponent(txtfieldSenhaAgain, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblSenha)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblPasswordWarning))
                                    .addComponent(txtfieldSenha))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbutShowPassword)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblIDWarning)
                        .addGap(14, 14, 14))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(lblIDWarning))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenha)
                    .addComponent(lblPasswordWarning))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tbutShowPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtfieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenha2)
                    .addComponent(lblPasswordAgainWarning))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfieldSenhaAgain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(warningsenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEndereco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtfieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combboxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEndNum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfieldEndNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfieldEmailActionPerformed

    private void txtfieldSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfieldSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfieldSenhaActionPerformed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        cancelar();
    }//GEN-LAST:event_btnCadastroActionPerformed
        
    private void cancelar(){
        Gen().dispose();
        FormLogin.Gen().lock(false);
    }
    
    private void tbutShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbutShowPasswordActionPerformed
        ShowPassword();
    }//GEN-LAST:event_tbutShowPasswordActionPerformed

    private void ShowPassword(){
        if(tbutShowPassword.isSelected()){
            txtfieldSenha.setEchoChar((char) 0);
        }
        else{
            txtfieldSenha.setEchoChar('*');
        }
    }
    
    private void txtfieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfieldNomeActionPerformed
    
    private void txtfieldIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfieldIDKeyReleased
        //txtfieldID.setText(JMascara.GetJmascaraCpfCnpj((txtfieldID.getText())));
    }//GEN-LAST:event_txtfieldIDKeyReleased

    private void txtfieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfieldIDActionPerformed

    }//GEN-LAST:event_txtfieldIDActionPerformed

    private void btnCadastro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastro1ActionPerformed
        if(txtfieldID.getText().length() == 11){
            EfetuaCadastroPessoa();
        }else if(txtfieldID.getText().length() == 14){
            EfetuaCadastroServico();
        }    
    }//GEN-LAST:event_btnCadastro1ActionPerformed
    private void EfetuaCadastroPessoa(){
        if (PessoaBD.Gen().consultarPessoaCpfExiste(txtfieldID.getText()) == false){
            
            Pessoa.Gen().setNome(txtfieldNome.getText());    
            Pessoa.Gen().setEmail(txtfieldEmail.getText());
            Pessoa.Gen().setSenha(txtfieldSenha.getText());
            Pessoa.Gen().setCpf(txtfieldID.getText());
            
            PessoaBD.Gen().inserirPessoa(Pessoa.Gen());

            Endereco.Gen().setUid(PessoaBD.Gen().consultarPessoaUid(txtfieldID.getText()));
            Endereco.Gen().setEstado(combboxEstado.getSelectedItem().toString());
            Endereco.Gen().setCidade(txtfieldCidade.getText());
            Endereco.Gen().setRua(txtfieldEndereco.getText());
            Endereco.Gen().setNumero(Integer.parseInt(txtfieldEndNum.getText()));
            
            EnderecoBD.Gen().inserirEndereco(Endereco.Gen());
        }else{
            //Mensagem de cpf ja registrado
        }    
    } 
    
    private void EfetuaCadastroServico(){
        
        if (ServicoBD.Gen().consultarServicoCnpj(txtfieldID.getText()) == false){
            
            int temp = 0;
            
            switch(temp) {
                case 2:
                    PetShop.Gen().setNome(txtfieldNome.getText());    
                    PetShop.Gen().setEmail(txtfieldEmail.getText());
                    PetShop.Gen().setSenha(txtfieldSenha.getText());
                    PetShop.Gen().setCnpj(txtfieldID.getText());

                    PetShopBD.Gen().inserirPetShop(PetShop.Gen());
                  break;
                case 3:
                    Clinica.Gen().setNome(txtfieldNome.getText());    
                    Clinica.Gen().setEmail(txtfieldEmail.getText());
                    Clinica.Gen().setSenha(txtfieldSenha.getText());
                    Clinica.Gen().setCnpj(txtfieldID.getText());

                    ClinicaBD.Gen().inserirClinica(Clinica.Gen());
                  break;
                case 4:
                    Veterinario.Gen().setNome(txtfieldNome.getText());    
                    Veterinario.Gen().setEmail(txtfieldEmail.getText());
                    Veterinario.Gen().setSenha(txtfieldSenha.getText());
                    Veterinario.Gen().setCnpj(txtfieldID.getText());

                    VeterinarioBD.Gen().inserirVeterinario(Veterinario.Gen());
                  break;
                default:
                    Canil.Gen().setNome(txtfieldNome.getText());    
                    Canil.Gen().setEmail(txtfieldEmail.getText());
                    Canil.Gen().setSenha(txtfieldSenha.getText());
                    Canil.Gen().setCnpj(txtfieldID.getText());

                    CanilBD.Gen().inserirCanil(Canil.Gen());
            }

            Endereco.Gen().setUid(ServicoBD.Gen().consultarServicoUid(txtfieldID.getText()));
            Endereco.Gen().setEstado(combboxEstado.getSelectedItem().toString());
            Endereco.Gen().setCidade(txtfieldCidade.getText());
            Endereco.Gen().setRua(txtfieldEndereco.getText());
            Endereco.Gen().setNumero(Integer.parseInt(txtfieldEndNum.getText()));
            
            EnderecoBD.Gen().inserirEndereco(Endereco.Gen());
            
        }else{
            //Mensagem de cnpj ja registrado
        } 
        
    }
    private void txtfieldSenhaAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfieldSenhaAgainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfieldSenhaAgainActionPerformed

    private void warning(){
            lblIDWarning.setForeground(Color.getHSBColor(120, 1f, 0.3f));
            lblIDWarning.setVisible(false);
            if(validarCpf(txtfieldID.getText()) == true){
                lblIDWarning.setVisible(true);
                lblIDWarning.setText("CPF Valido");
            }
            else if(validarCnpj(txtfieldID.getText()) == true){
                lblIDWarning.setVisible(true);
                lblIDWarning.setText("CNPJ Valido");
            }
            else{
                lblIDWarning.setForeground(Color.red);
                if(txtfieldID.getText().isEmpty()){
                    lblIDWarning.setText("Necessário um CPF ou CNPJ");
                    lblIDWarning.setVisible(true);
                }
                else if(txtfieldID.getText().length() == 14){
                    lblIDWarning.setText("CNPJ inválido");
                    lblIDWarning.setVisible(true);
                }
                else if(txtfieldID.getText().length() == 11){
                    lblIDWarning.setText("CPF inválido");
                    lblIDWarning.setVisible(true);
                }
                else{
                    if(txtfieldID.getText().length()<14){
                        lblIDWarning.setText("CNPJ inválido");
                        lblIDWarning.setVisible(true);
                    }
                    if(txtfieldID.getText().length()<11){
                        lblIDWarning.setText("CPF inválido");
                        lblIDWarning.setVisible(true);
                    }
                }
            }
 
    }
    
    private void txtfieldEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfieldEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfieldEnderecoActionPerformed

    private void txtfieldCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfieldCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfieldCidadeActionPerformed

    private void txtfieldEndNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfieldEndNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfieldEndNumActionPerformed

    private void txtfieldIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfieldIDFocusLost
        warning();
    }//GEN-LAST:event_txtfieldIDFocusLost

    private void txtfieldSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfieldSenhaFocusLost
        verificaSenha();
    }//GEN-LAST:event_txtfieldSenhaFocusLost

    private void txtfieldSenhaAgainFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfieldSenhaAgainFocusLost
        verificaSemelhanca();
    }//GEN-LAST:event_txtfieldSenhaAgainFocusLost

    private void verificaSenha(){
        if(txtfieldSenha.getPassword().length >= 8 && txtfieldSenha.getPassword().length <= 16){
            lblPasswordWarning.setVisible(true);
            lblPasswordWarning.setForeground(Color.green);
            lblPasswordWarning.setText("Aceita");
        }
        else{
            lblPasswordWarning.setVisible(true);
            lblPasswordWarning.setForeground(Color.red);
            lblPasswordWarning.setText("Senha fora dos padrões");
        }
    }
    
    private void verificaSemelhanca(){
        System.out.println(String.copyValueOf(txtfieldSenha.getPassword())+"|"+String.copyValueOf(txtfieldSenhaAgain.getPassword()));
        if(String.copyValueOf(txtfieldSenha.getPassword()).equalsIgnoreCase(String.copyValueOf(txtfieldSenhaAgain.getPassword()))){
            lblPasswordAgainWarning.setVisible(true);
            lblPasswordAgainWarning.setForeground(Color.green);
            lblPasswordAgainWarning.setText("Senhas iguais");
        }
        else{
            lblPasswordAgainWarning.setVisible(true);
            lblPasswordAgainWarning.setForeground(Color.red);
            lblPasswordAgainWarning.setText("Senha não é igual");
        }
    }
    
    
    
    public boolean validarCpf(String cpf) {
        if (cpf.equals("00000000000") || cpf.equals("11111111111") ||
            cpf.equals("22222222222") || cpf.equals("33333333333") ||
            cpf.equals("44444444444") || cpf.equals("55555555555") ||
            cpf.equals("66666666666") || cpf.equals("77777777777") || 
            cpf.equals("88888888888") || cpf.equals("99999999999") || (cpf.length() != 11)){
            return(false);
        }
        char dig10, dig11;
        int sm, i, r, num, peso;
        sm = 0; peso = 10; for (i=0; i<9; i++) {
            num = (cpf.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
        }
        r = 11 - (sm % 11);
        if ((r == 10) || (r == 11)) {
            dig10 = '0';
        } else {
            dig10 = (char)(r + 48);
        }
        sm = 0;
        peso = 11;
        for(i=0; i<10; i++) {
            num = (cpf.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
        }
        r = 11 - (sm % 11);
        if ((r == 10) || (r == 11)) {
            dig11 = '0';
        } else {
            dig11 = (char)(r + 48);
        }
        if ((dig10 == cpf.charAt(9)) && (dig11 == cpf.charAt(10))) {
            return(true);
        } else {
            return(false);
        }
    }    
    
    public static boolean validarCnpj(String CNPJ) {
        if (CNPJ.equals("00000000000000") || CNPJ.equals("11111111111111") ||
            CNPJ.equals("22222222222222") || CNPJ.equals("33333333333333") ||
            CNPJ.equals("44444444444444") || CNPJ.equals("55555555555555") ||
            CNPJ.equals("66666666666666") || CNPJ.equals("77777777777777") ||
            CNPJ.equals("88888888888888") || CNPJ.equals("99999999999999") || (CNPJ.length() != 14)){
            return(false);
        }
        char dig13, dig14;
        int sm, i, r, num, peso;
        sm = 0;
        peso = 2;
        for (i=11; i>=0; i--) {
            num = (int)(CNPJ.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso + 1;
            if (peso == 10){
                peso = 2;
            }
        }

        r = sm % 11;
        if ((r == 0) || (r == 1))
            dig13 = '0';
        else dig13 = (char)((11-r) + 48);
        sm = 0;
        peso = 2;
        for (i=12; i>=0; i--) {
            num = (int)(CNPJ.charAt(i)- 48);
            sm = sm + (num * peso);
            peso = peso + 1;
            if (peso == 10){
                peso = 2;
            }
        }
        r = sm % 11;
        if ((r == 0) || (r == 1)){
            dig14 = '0';
        }
        else dig14 = (char)((11-r) + 48);
        if ((dig13 == CNPJ.charAt(12)) && (dig14 == CNPJ.charAt(13))){
            return(true);
        }
        else return(false);
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
            java.util.logging.Logger.getLogger(FormCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnCadastro1;
    private javax.swing.JComboBox<String> combboxEstado;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndNum;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblIDWarning;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPasswordAgainWarning;
    private javax.swing.JLabel lblPasswordWarning;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblSenha2;
    private javax.swing.JToggleButton tbutShowPassword;
    private javax.swing.JTextField txtfieldCidade;
    private javax.swing.JTextField txtfieldEmail;
    private javax.swing.JTextField txtfieldEndNum;
    private javax.swing.JTextField txtfieldEndereco;
    private javax.swing.JTextField txtfieldID;
    private javax.swing.JTextField txtfieldNome;
    private javax.swing.JPasswordField txtfieldSenha;
    private javax.swing.JPasswordField txtfieldSenhaAgain;
    private javax.swing.JScrollPane warningsenha;
    // End of variables declaration//GEN-END:variables
}
