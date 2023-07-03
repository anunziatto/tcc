/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.PessoaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author marco
 */
public class PessoaDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<PessoaDTO> lista = new ArrayList<>();

    public void cadastrarPessoa(PessoaDTO objpessoadto) {
        String sql = "insert into Pessoa (cpf, nome, telefone, email, senha, idPessoa) values (?,?,?,?,?,?)";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objpessoadto.getCpf_pessoa());
            pstm.setString(2, objpessoadto.getNome_pessoa());
            pstm.setString(3, objpessoadto.getTelefone_pessoa());
            pstm.setString(4, objpessoadto.getEmail_pessoa());
            pstm.setString(5, objpessoadto.getSenha_pessoa());
            pstm.setInt(6, objpessoadto.getId_pessoa());

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "PessoaDAO" + erro);
        }

    }

    public ArrayList<PessoaDTO> PesquisarPessoa() {
        String sql = "Select * from Pessoa";
        
        conn = new ConexaoDAO().conectaBD(); 

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                PessoaDTO objpessoaDTO = new PessoaDTO();
           //As variaveis tem  que ter entre aspas o nome exatamente igual ao do Banco de dados
                objpessoaDTO.setId_pessoa(rs.getInt("idpessoa"));
                objpessoaDTO.setNome_pessoa(rs.getString("nome"));
                objpessoaDTO.setCpf_pessoa(rs.getString("cpf"));
                objpessoaDTO.setTelefone_pessoa(rs.getString("telefone"));
                objpessoaDTO.setEmail_pessoa(rs.getString("email"));

                lista.add(objpessoaDTO);

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "PessoaDAO Pesquisar" + erro);
        }
        return lista;
    }
    
    public void excluirPessoa(PessoaDTO objpessoadto){
        
        String sql = "delete from pessoa  where idPessoa = ?";
        
        conn = new ConexaoDAO().conectaBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objpessoadto.getId_pessoa());
            
            pstm.execute();
            pstm.close();
            
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "PessoaDAO Excluir" + erro);
        }
        
    
        
    
    }
}
