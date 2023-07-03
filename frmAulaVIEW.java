package VIEW;

import DAO.ExerciciosDAO;
import DTO.ExerciciosDTO;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class frmAulaVIEW extends javax.swing.JFrame {

    public frmAulaVIEW() {

        initComponents();
        setLocationRelativeTo(null);
        listarAulaExercicios();
        // Ordenar a tabela 
        DefaultTableModel modelo = (DefaultTableModel) tabelaExercicios.getModel();
        tabelaExercicios.setRowSorter(new TableRowSorter(modelo));
        tabelaExercicios.getTableHeader().setFont(new java.awt.Font("Tahomal", 0, 20));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaExercicios = new javax.swing.JTable();
        btnPesquisar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabelaExercicios.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
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
        tabelaExercicios.setRowHeight(30);
        jScrollPane1.setViewportView(tabelaExercicios);
        tabelaExercicios.getAccessibleContext().setAccessibleName("");

        btnPesquisar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnPesquisar.setText("Novo");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Exportar para Arquivo txt");
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
                .addGap(35, 35, 35)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
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
        exportar();
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

    private void exportar() {
        String filePath = "D:\\Expor_Impor\\txtfile.txt";
        File file = new File(filePath);

        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < tabelaExercicios.getRowCount(); i++) {
                for (int j = 0; j < tabelaExercicios.getColumnCount(); j++) {
                    bw.write(tabelaExercicios.getValueAt(i, j).toString() + " - ");
                }
                bw.newLine();
            }

            bw.close();
            fw.close();
        } catch (IOException ex) {
            //Logger.getLogger(frmAulaVIEW1.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Exportar" + ex);
            ex.printStackTrace();
        }
    }
}
