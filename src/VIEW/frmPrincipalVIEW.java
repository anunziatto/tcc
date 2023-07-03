package VIEW;

public class frmPrincipalVIEW extends javax.swing.JFrame {

    public frmPrincipalVIEW() {
        setTitle("Funcional Administrativo");
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnCadastrodeExercicios = new javax.swing.JButton();
        btnAula = new javax.swing.JButton();
        btnPessoas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Tela Principal");

        btnCadastrodeExercicios.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnCadastrodeExercicios.setText("Cadastro de Exercicios");
        btnCadastrodeExercicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrodeExerciciosActionPerformed(evt);
            }
        });

        btnAula.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAula.setText("Aula");
        btnAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAulaActionPerformed(evt);
            }
        });

        btnPessoas.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnPessoas.setText("Cadastro de Usuarios");
        btnPessoas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPessoasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnAula, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCadastrodeExercicios)
                            .addComponent(btnPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel1)))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(btnAula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(46, 46, 46)
                .addComponent(btnCadastrodeExercicios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(49, 49, 49)
                .addComponent(btnPessoas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAulaActionPerformed
        frmAulaVIEW objaula = new frmAulaVIEW();
        objaula.setVisible(true);
    }//GEN-LAST:event_btnAulaActionPerformed

    private void btnCadastrodeExerciciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrodeExerciciosActionPerformed
        frmExerciciosVIEW objexercicios = new frmExerciciosVIEW();
        objexercicios.setVisible(true);

    }//GEN-LAST:event_btnCadastrodeExerciciosActionPerformed

    private void btnPessoasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPessoasActionPerformed
        frmPessoaVIEW objpessoas = new frmPessoaVIEW();
        objpessoas.setVisible(true);
    }//GEN-LAST:event_btnPessoasActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipalVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAula;
    private javax.swing.JButton btnCadastrodeExercicios;
    private javax.swing.JButton btnPessoas;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
