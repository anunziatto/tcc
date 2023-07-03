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
        setVisible(true);
        initComponents();
        setLocationRelativeTo(null);
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
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnNaoSouCadastrado.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnNaoSouCadastrado.setText("Primeiro Acesso");
        btnNaoSouCadastrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNaoSouCadastradoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Nome");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Senha");

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

        jLabel3.setFont(new java.awt.Font("Segoe Script", 3, 24)); // NOI18N
        jLabel3.setText("Bem-Vindo a Funcional");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSenhaUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNaoSouCadastrado)
                                .addGap(32, 32, 32)
                                .addComponent(btnEntrarnoSistemae))))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNaoSouCadastrado)
                    .addComponent(btnEntrarnoSistemae))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNaoSouCadastradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNaoSouCadastradoActionPerformed

        frmPessoaRegistrarVIEW objpessoa = new frmPessoaRegistrarVIEW();
        objpessoa.setVisible(true);


    }//GEN-LAST:event_btnNaoSouCadastradoActionPerformed

    private void txtSenhaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaUsuarioActionPerformed

    }//GEN-LAST:event_txtSenhaUsuarioActionPerformed

    private void btnEntrarnoSistemaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarnoSistemaeActionPerformed

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
            logar();
        }
    }//GEN-LAST:event_btnEntrarnoSistemaeActionPerformed

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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtNomeUsuario;
    private javax.swing.JPasswordField txtSenhaUsuario;
    // End of variables declaration//GEN-END:variables
    private void logar() {
        try {

            String nome, senha;

            nome = txtNomeUsuario.getText();
            senha = txtSenhaUsuario.getText();
            String valorDesejado = "Admim";
            if (nome.equals("Admin")) {
                frmPrincipalVIEW objfrmprincipalview = new frmPrincipalVIEW();
                objfrmprincipalview.setVisible(true);
            }

            UsuarioDTO objusuariodto = new UsuarioDTO();
            objusuariodto.setNome(nome);
            objusuariodto.setSenha(senha);

            UsuarioDAO objusuariodao = new UsuarioDAO();
            ResultSet rsusuariodao = objusuariodao.autenticacaoUsuario(objusuariodto);
            if (nome.equals("Admin")) {
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
