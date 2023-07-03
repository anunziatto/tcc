package DAO;

import DTO.ExerciciosDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class ExerciciosDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<ExerciciosDTO> lista = new ArrayList<>();
            

    public void cadastrarExercicios(ExerciciosDTO objexerciciosdto) {
        String sql;
        sql = "insert into exercicios (nome, modalidade, tipo, numseries, numrepeticoes, duracaototal, tempodedescanso, graudeintensidade, descricao) values (?,?,?,?,?,?,?,?,?)";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objexerciciosdto.getNome_exercicios());
            pstm.setString(2, objexerciciosdto.getModalidade_exercicios());
            pstm.setString(3, objexerciciosdto.getTipo_exercicios());
            pstm.setInt(4, objexerciciosdto.getSeries_exercicios());
            pstm.setInt(5, objexerciciosdto.getRepeticoes_exercicios());
            pstm.setInt(6, objexerciciosdto.getDuracaototal_exercicios());
            pstm.setInt(7, objexerciciosdto.getDescanso_exercicios());
            pstm.setString(8, objexerciciosdto.getIntensidade_exercicios());
            pstm.setString(9, objexerciciosdto.getDescricao_exerciccios());

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ExercicioDAO" + erro);
        }

    }

    public void excluirExercicios(ExerciciosDTO objexerciciosdto) {
        String sql = "delete from exercicios where id = ?";

        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objexerciciosdto.getId_exercicios());

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "ExerciciosDAO excluir" + erro);
        }

    }
    //ResultSet pega a informação do banco de dados
    public ArrayList<ExerciciosDTO> PesquisarExercicios(){
        String sql = "select * from exercicios ";
        conn = new ConexaoDAO().conectaBD();
        
        
        
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            //Enquanto tive linha ele busca na lista por isso o rs        
            while(rs.next()){
                // Int  id numseries numrepeticoes  duracaotoal tempodedescanso 
                // String nome modalidade tipo graudeintensidade descricao
                ExerciciosDTO objExerciciosDTO = new ExerciciosDTO();
                objExerciciosDTO.setId_exercicios(rs.getInt("id"));
                objExerciciosDTO.setSeries_exercicios(rs.getInt("numseries"));
                objExerciciosDTO.setRepeticoes_exercicios(rs.getInt("numrepeticoes"));
                objExerciciosDTO.setDuracaototal_exercicios(rs.getInt("duracaototal"));
                objExerciciosDTO.setDescanso_exercicios(rs.getInt("tempodedescanso"));
                objExerciciosDTO.setNome_exercicios(rs.getString("nome"));
                objExerciciosDTO.setModalidade_exercicios(rs.getString("modalidade"));
                objExerciciosDTO.setTipo_exercicios(rs.getString("tipo"));
                objExerciciosDTO.setIntensidade_exercicios(rs.getString("graudeintensidade"));
                objExerciciosDTO.setDescricao_exerciccios(rs.getString("descricao")); 
                
                lista.add(objExerciciosDTO);
            }        
            
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ExerciciosDao Pesquisar"+ erro);
        }
    return lista;
    
    }
    
    public void alterarExercicios(ExerciciosDTO objExerciciosDTO){
        String sql;    
        sql = "update exercicios set nome = ?, modalidade = ?, tipo = ?, numseries = ?, numrepeticoes = ?, duracaototal = ?, tempodedescanso = ?, graudeintensidade = ?, descricao = ?  where id = ? ";
       
        conn = new ConexaoDAO().conectaBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objExerciciosDTO.getNome_exercicios());
            pstm.setString(2, objExerciciosDTO.getModalidade_exercicios());
            pstm.setString(3, objExerciciosDTO.getTipo_exercicios());
            pstm.setInt(4, objExerciciosDTO.getSeries_exercicios());
            pstm.setInt(5, objExerciciosDTO.getRepeticoes_exercicios());
            pstm.setInt(6, objExerciciosDTO.getDuracaototal_exercicios());
            pstm.setInt(7, objExerciciosDTO.getDescanso_exercicios());
            pstm.setString(8, objExerciciosDTO.getIntensidade_exercicios());
            pstm.setString(9, objExerciciosDTO.getDescricao_exerciccios());
            pstm.setInt(10, objExerciciosDTO.getId_exercicios());
           

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ExercicioDAO  Alterar" + erro);
        }
        
    }
}
