package VIEW;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import com.sun.xml.internal.ws.streaming.XMLStreamReaderUtil;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class frmLoginVIEW extends javax.swing.JFrame {

    public frmLoginVIEW() {
        setTitle("Funcional Login");
        FrmUtils.centralizarFormulario(this);
        setVisible(true);

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNaoSouCadastrado = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNomeUsuario = new javax.swing.JTextField();
        txtSenhaUsuario = new javax.swing.JPasswordField();
        btnEntrarnoSistemae = new javax.swing.JButton();
        jlabelAdmin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnNaoSouCadastrado.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnNaoSouCadastrado.setText("Não sou Cadastrado");
        btnNaoSouCadastrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNaoSouCadastradoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Nome de Usuário");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Senha de Usuário");

        txtNomeUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        txtSenhaUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtSenhaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaUsuarioActionPerformed(evt);
            }
        });

        btnEntrarnoSistemae.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnEntrarnoSistemae.setText("Entrar");
        btnEntrarnoSistemae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarnoSistemaeActionPerformed(evt);
            }
        });

        jlabelAdmin.setText("Adminstrador");
        jlabelAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlabelAdminMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(txtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(txtSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEntrarnoSistemae)
                        .addGap(70, 70, 70)
                        .addComponent(btnNaoSouCadastrado))
                    .addComponent(jlabelAdmin))
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNaoSouCadastrado)
                    .addComponent(btnEntrarnoSistemae))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlabelAdmin)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNaoSouCadastradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNaoSouCadastradoActionPerformed

        frmPessoaVIEW objpessoa = new frmPessoaVIEW();
        objpessoa.setVisible(true);


    }//GEN-LAST:event_btnNaoSouCadastradoActionPerformed

    private void txtSenhaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaUsuarioActionPerformed

    }//GEN-LAST:event_txtSenhaUsuarioActionPerformed

    private void btnEntrarnoSistemaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarnoSistemaeActionPerformed
        logar();
    }//GEN-LAST:event_btnEntrarnoSistemaeActionPerformed

    private void jlabelAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabelAdminMouseClicked

        String usuario = txtNomeUsuario.getText();
        String senha = txtSenhaUsuario.getText();

        // Verificar se o usuário e a senha correspondem ao administrador
        if (usuario.equals("admin") && senha.equals("")) {
            // Redirecionar para a página específica do administrador
            frmPrincipalVIEW objprincipal = new frmPrincipalVIEW();
            objprincipal.setVisible(true);

            // Fechar o formulário de login
            dispose();
        } else {
            // Lógica de login para outros usuários
        }

        // frmExerciciosVIEW frmexerciciosview = new frmExerciciosVIEW();
        // frmexerciciosview.setVisible(true);

    }//GEN-LAST:event_jlabelAdminMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLoginVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrarnoSistemae;
    private javax.swing.JButton btnNaoSouCadastrado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jlabelAdmin;
    private javax.swing.JTextField txtNomeUsuario;
    private javax.swing.JPasswordField txtSenhaUsuario;
    // End of variables declaration//GEN-END:variables
    private void logar() {
        try {

            String nome, senha;

            nome = txtNomeUsuario.getText();
            senha = txtSenhaUsuario.getText();
            String valorDesejado = "Admim";
            if (nome.equals("Admin") ) {
                frmPrincipalVIEW objfrmprincipalview = new frmPrincipalVIEW();
                objfrmprincipalview.setVisible(true);
            }

            UsuarioDTO objusuariodto = new UsuarioDTO();
            objusuariodto.setNome(nome);
            objusuariodto.setSenha(senha);

            UsuarioDAO objusuariodao = new UsuarioDAO();
            ResultSet rsusuariodao = objusuariodao.autenticacaoUsuario(objusuariodto);
       if (nome.equals("Admin") ) {           
                frmPrincipalVIEW objfrmprincipalview = new frmPrincipalVIEW();
                objfrmprincipalview.setVisible(true);
                
                frmAulaVIEW objaula = new frmAulaVIEW();
                objaula.setVisible(false);
              
                
            }

            if (rsusuariodao.next()) {
                frmAulaVIEW objAulaview = new frmAulaVIEW();
                objAulaview.setVisible(true);

                dispose();

            } else {
                JOptionPane.showMessageDialog(null, "Usuário ou senha inválida");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FRMLoginView" + erro);
        }

    }
}
