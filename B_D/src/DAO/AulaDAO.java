package DAO;

import DTO.ExerciciosDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AulaDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<ExerciciosDTO> lista = new ArrayList<>();

    public ArrayList<ExerciciosDTO> CriarAula() {
        String sql = "SELECT * FROM exercicios" +
                 "ORDER BY"+
                 "  CASE"+
                 "    WHEN RAND() <= 0.3 THEN tipo = 'mobilidade'"+
                 "    WHEN RAND() <= 0.3 THEN tipo = 'core'"+
                 "    WHEN RAND() <= 0.6 THEN tipo = 'joelho, quadril empurrar ou puxar'"+
                 "    WHEN RAND() <= 0.3 THEN tipo = 'PL'"+
                 "    END"+
                 "LIMIT 20;";
                        
        try {

            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString("nome"));
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
            JOptionPane.showMessageDialog(null, "AulaDAO Criar" + erro);
        }

        return lista;
    }

}
