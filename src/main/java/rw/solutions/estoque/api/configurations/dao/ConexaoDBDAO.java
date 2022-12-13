package rw.solutions.estoque.api.configurations.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConexaoDBDAO {
    public Connection conectaBD() {

        Connection conn = null;

        try {

            String url = "jdbc:mysql://localhost:8080/Estoque?user=root&password=";
            conn = DriverManager.getConnection(url);
            
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null,"ConexaoDBDAO" + error.getMessage());
        }


        return conn;

        
        
    }
}
