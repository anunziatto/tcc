package VIEW;

public class Apresentacao extends javax.swing.JFrame {

    public Apresentacao() {
        initComponents();
        setTitle("Sistema Exercícios Funcional");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpApresentacao = new javax.swing.JDesktopPane();
        jmbLogin = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jdpApresentacao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jdpApresentacao);

        jmbLogin.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jmbLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmbLoginMouseClicked(evt);
            }
        });

        jMenu1.setText("Abrir");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jMenuItem1.setText("Login");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jmbLogin.add(jMenu1);

        setJMenuBar(jmbLogin);

        setBounds(0, 0, 1650, 1057);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed


    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jmbLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmbLoginMouseClicked

    }//GEN-LAST:event_jmbLoginMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        frmLoginVIEW objloginview = new frmLoginVIEW();
        jdpApresentacao.add(objloginview);
        objloginview.setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Apresentacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JDesktopPane jdpApresentacao;
    private javax.swing.JMenuBar jmbLogin;
    // End of variables declaration//GEN-END:variables
}
