package VIEW;

import DAO.ExerciciosDAO;
import DTO.ExerciciosDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmExerciciosVIEW extends javax.swing.JFrame {

    public frmExerciciosVIEW() {

        setTitle("Funcional Cadastro de Exercicios");
        setVisible(true);
        initComponents();
        listarValoresExercicios();
        setLocationRelativeTo(null);
        tabelaExercicios.getTableHeader().setFont(new java.awt.Font("Tahomal", 0, 20));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtModalidade = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        txtSeries = new javax.swing.JTextField();
        txtRepeticoes = new javax.swing.JTextField();
        txtDuracaototal = new javax.swing.JTextField();
        txtDescanso = new javax.swing.JTextField();
        txtIntesidade = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnCarregarCampos = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnLimparCampos = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaExercicios = new javax.swing.JTable();
        btnAlterar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(500, 650));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Código");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Modalidade");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Tipo");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Número de Séries");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Número de Repetiçoes");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Duração total do exercício");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Tempo de Descanso");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Grau de Intensidade ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Descrição");

        txtCodigo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtCodigo.setEnabled(false);
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtModalidade.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        txtTipo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        txtSeries.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        txtRepeticoes.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        txtDuracaototal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        txtDescanso.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        txtIntesidade.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        txtDescricao.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        btnCadastrar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnCadastrar.setText("Novo");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnCarregarCampos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnCarregarCampos.setText("Editar");
        btnCarregarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarCamposActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnLimparCampos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnLimparCampos.setText("Limpar");
        btnLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCamposActionPerformed(evt);
            }
        });

        tabelaExercicios.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        tabelaExercicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Modalidade","Tipo", "Némero de Series","Número de Repetiçoes", "Duração Total", "Tempo de descanso", "Grau de Intensidade", "Descrição"
            }
        ));
        tabelaExercicios.setRowHeight(30);
        jScrollPane3.setViewportView(tabelaExercicios);

        btnAlterar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAlterar.setText("Gravar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1734, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtDuracaototal, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9)
                            .addComponent(txtIntesidade, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtModalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtSeries, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(135, 135, 135)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel6)
                            .addComponent(txtRepeticoes, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescanso, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
                            .addComponent(txtTipo)
                            .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCarregarCampos)
                        .addGap(12, 12, 12)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimparCampos)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSeries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRepeticoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDuracaototal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescanso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIntesidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnExcluir)
                    .addComponent(btnLimparCampos)
                    .addComponent(btnCarregarCampos)
                    .addComponent(btnAlterar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed

    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        cadastrarExercicios();
        listarValoresExercicios();
        LimparCampos();

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCamposActionPerformed
        LimparCampos();
    }//GEN-LAST:event_btnLimparCamposActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        excluirExercicios();
        listarValoresExercicios();
        LimparCampos();

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCarregarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarCamposActionPerformed
        CarregarCampos();

    }//GEN-LAST:event_btnCarregarCamposActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        AlterarExercicios();
        listarValoresExercicios();
        LimparCampos();

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed

    }//GEN-LAST:event_txtCodigoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmExerciciosVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCarregarCampos;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimparCampos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabelaExercicios;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescanso;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtDuracaototal;
    private javax.swing.JTextField txtIntesidade;
    private javax.swing.JTextField txtModalidade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRepeticoes;
    private javax.swing.JTextField txtSeries;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables

    private void cadastrarExercicios() {
        String nome, modalidade, tipo, intensidade, descricao;
        int series, repeticoes, duracaototal, descanso;

        nome = txtNome.getText();
        modalidade = txtModalidade.getText();
        tipo = txtTipo.getText();
        series = Integer.parseInt(txtSeries.getText());
        repeticoes = Integer.parseInt(txtRepeticoes.getText());
        intensidade = txtIntesidade.getText();
        descricao = txtDescricao.getText();
        duracaototal = Integer.parseInt(txtDuracaototal.getText());
        descanso = Integer.parseInt(txtDescanso.getText());

        ExerciciosDTO objexerciciosdto = new ExerciciosDTO();

        objexerciciosdto.setNome_exercicios(nome);
        objexerciciosdto.setModalidade_exercicios(modalidade);
        objexerciciosdto.setTipo_exercicios(tipo);
        objexerciciosdto.setSeries_exercicios(series);
        objexerciciosdto.setRepeticoes_exercicios(repeticoes);
        objexerciciosdto.setIntensidade_exercicios(intensidade);
        objexerciciosdto.setDuracaototal_exercicios(duracaototal);
        objexerciciosdto.setDescanso_exercicios(descanso);
        objexerciciosdto.setDescricao_exerciccios(descricao);

        ExerciciosDAO objexerciciosdao = new ExerciciosDAO();
        objexerciciosdao.cadastrarExercicios(objexerciciosdto);

    }

    private void LimparCampos() {

        txtCodigo.setText("");
        txtNome.setText("");
        txtModalidade.setText("");
        txtTipo.setText("");
        txtDescanso.setText("");
        txtSeries.setText("");
        txtRepeticoes.setText("");
        txtDuracaototal.setText("");
        txtIntesidade.setText("");
        txtDescricao.setText("");
        txtNome.requestFocus();

    }

    private void excluirExercicios() {
        int id_exercicios;

        id_exercicios = Integer.parseInt(txtCodigo.getText());

        ExerciciosDTO objexerciciosdto = new ExerciciosDTO();
        objexerciciosdto.setId_exercicios(id_exercicios);

        ExerciciosDAO objexerciciosdao = new ExerciciosDAO();
        objexerciciosdao.excluirExercicios(objexerciciosdto);
    }

    private void listarValoresExercicios() {
        try {
            ExerciciosDAO objexerciciosdao = new ExerciciosDAO();

            DefaultTableModel model = (DefaultTableModel) tabelaExercicios.getModel();
            model.setNumRows(0);

            ArrayList<ExerciciosDTO> lista = objexerciciosdao.PesquisarExercicios();
// private String nome_exercicios, modalidade_exercicios, tipo_exercicios, intensidade_exercicios, descricao_exerciccios;
//    private int id_exercicios, series_exercicios,repeticoes_exercicios, duracaototal_exercicios, descanso_exercicios;
//
            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getId_exercicios(),
                    lista.get(num).getNome_exercicios(),
                    lista.get(num).getModalidade_exercicios(),
                    lista.get(num).getTipo_exercicios(),
                    lista.get(num).getSeries_exercicios(),
                    lista.get(num).getRepeticoes_exercicios(),
                    lista.get(num).getDuracaototal_exercicios(),
                    lista.get(num).getDescanso_exercicios(),
                    lista.get(num).getIntensidade_exercicios(),
                    lista.get(num).getDescricao_exerciccios()
                });
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar Valores Exercicios VIEW" + erro);
        }

    }

    private void CarregarCampos() {

        int setar = tabelaExercicios.getSelectedRow();

        txtCodigo.setText(tabelaExercicios.getModel().getValueAt(setar, 0).toString());
        txtNome.setText(tabelaExercicios.getModel().getValueAt(setar, 1).toString());
        txtTipo.setText(tabelaExercicios.getModel().getValueAt(setar, 2).toString());
        txtModalidade.setText(tabelaExercicios.getModel().getValueAt(setar, 3).toString());
        txtSeries.setText(tabelaExercicios.getModel().getValueAt(setar, 4).toString());
        txtRepeticoes.setText(tabelaExercicios.getModel().getValueAt(setar, 5).toString());
        txtDuracaototal.setText(tabelaExercicios.getModel().getValueAt(setar, 6).toString());
        txtDescanso.setText(tabelaExercicios.getModel().getValueAt(setar, 7).toString());
        txtIntesidade.setText(tabelaExercicios.getModel().getValueAt(setar, 8).toString());
        txtDescricao.setText(tabelaExercicios.getModel().getValueAt(setar, 9).toString());

    }

    private void AlterarExercicios() {

        String nome_exercicios, modalidade_exercicios, tipo_exercicios, intensidade_exercicios, descricao_exerciccios;
        int id_exercicios, series_exercicios, repeticoes_exercicios, duracaototal_exercicios, descanso_exercicios;

        id_exercicios = Integer.parseInt(txtCodigo.getText());
        nome_exercicios = txtNome.getText();
        modalidade_exercicios = txtModalidade.getText();
        tipo_exercicios = txtTipo.getText();
        series_exercicios = Integer.parseInt(txtSeries.getText());
        repeticoes_exercicios = Integer.parseInt(txtRepeticoes.getText());
        duracaototal_exercicios = Integer.parseInt(txtDuracaototal.getText());
        descanso_exercicios = Integer.parseInt(txtDescanso.getText());
        intensidade_exercicios = txtIntesidade.getText();
        descricao_exerciccios = txtDescricao.getText();

        ExerciciosDTO objExerciciosDTO = new ExerciciosDTO();
        objExerciciosDTO.setId_exercicios(id_exercicios);
        objExerciciosDTO.setNome_exercicios(nome_exercicios);
        objExerciciosDTO.setModalidade_exercicios(modalidade_exercicios);
        objExerciciosDTO.setTipo_exercicios(tipo_exercicios);
        objExerciciosDTO.setSeries_exercicios(series_exercicios);
        objExerciciosDTO.setRepeticoes_exercicios(repeticoes_exercicios);
        objExerciciosDTO.setDuracaototal_exercicios(duracaototal_exercicios);
        objExerciciosDTO.setDescanso_exercicios(descanso_exercicios);
        objExerciciosDTO.setIntensidade_exercicios(intensidade_exercicios);
        objExerciciosDTO.setDescricao_exerciccios(descricao_exerciccios);

        ExerciciosDAO objExerciciosDAO = new ExerciciosDAO();
        objExerciciosDAO.alterarExercicios(objExerciciosDTO);

    }

}
