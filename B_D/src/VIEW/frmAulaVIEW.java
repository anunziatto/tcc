package VIEW;

import DAO.ExerciciosDAO;
import DTO.ExerciciosDTO;
//import java.awt.List;
//import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
//import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class frmAulaVIEW extends javax.swing.JFrame {

    public frmAulaVIEW() {

        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaExercicios = new javax.swing.JTable();
        btnPesquisar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelaExercicios.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tabelaExercicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Modalidade","Tipo", "Némero de Series","Número de Repetiçoes", "Duração Total", "Tempo de descanso", "Grau de Intensidade", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaExercicios.setMaximumSize(new java.awt.Dimension(3, 100));
        jScrollPane1.setViewportView(tabelaExercicios);
        tabelaExercicios.getAccessibleContext().setAccessibleName("");

        btnPesquisar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1376, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPesquisar)
                .addGap(385, 385, 385)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisar)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        listarAulaExercicios();
        tabelaExercicios.setRowHeight(35);

    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAulaVIEW().setVisible(true);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaExercicios;
    // End of variables declaration//GEN-END:variables
 private void listarAulaExercicios() {
/////Codigo Aluno: Marcos Olivio Anunziato
        try {
            ExerciciosDAO objexerciciosdao = new ExerciciosDAO();

            DefaultTableModel model = (DefaultTableModel) tabelaExercicios.getModel();
            model.setNumRows(0);

            ArrayList<ExerciciosDTO> lista = objexerciciosdao.PesquisarExercicios();

            ArrayList<String[]> registros = new ArrayList<>();
            for (ExerciciosDTO exercicio : lista) {
                registros.add(new String[]{
                    String.valueOf(exercicio.getId_exercicios()),
                    exercicio.getNome_exercicios(),
                    exercicio.getModalidade_exercicios(),
                    exercicio.getTipo_exercicios(),
                    String.valueOf(exercicio.getSeries_exercicios()),
                    String.valueOf(exercicio.getRepeticoes_exercicios()),
                    String.valueOf(exercicio.getDuracaototal_exercicios()),
                    String.valueOf(exercicio.getDescanso_exercicios()),
                    exercicio.getIntensidade_exercicios(),
                    exercicio.getDescricao_exerciccios()
                });
            }
            Collections.shuffle(registros);
                 int contador = 0;
             for (String[] registro : registros) {
              model.addRow(registro);
               contador++;
            if (contador == 20) {
                break; // Sai do loop após adicionar 20 linhas
            }
             }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar Aula de  Exercicios VIEW" + erro);
        }

    }

}
