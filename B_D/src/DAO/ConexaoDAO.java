package DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;



/**
 *
 * @author Marcos Olivio Anunziato
 */
public class ConexaoDAO {
    
    public Connection conectaBD(){
         Connection conn = null;
         // bancoteste é o nome do banco de dados que vou criar 
         try {
             String url = "jdbc:mysql://localhost:3306/db_sistema?user=root&password=D@vigta58";
             conn = DriverManager.getConnection(url);
             
            
        } catch (SQLException erro) {
             JOptionPane.showMessageDialog(null,"ConexaoDAO" + erro.getMessage());
        }
         return conn;
    }
    
}
