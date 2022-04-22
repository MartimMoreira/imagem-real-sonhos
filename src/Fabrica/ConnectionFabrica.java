/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabrica;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author cavaleronegro
 */
public class ConnectionFabrica {
    private Statement stmt = null;
    private Connection conn = null;
    private String driverName = "org.gjt.mm.mysql.Driver";
    private String conString = "jdbc:mysql://localhost:3306/Dragon";
    private String usuario = "root";
    private String senha = "supera";
    
        public void show(String mensagem){
            JOptionPane.showMessageDialog(null, mensagem,
            "Erro", JOptionPane.INFORMATION_MESSAGE);
        }
    
        public Connection getConnection(){
       String url = "jdbc:mysql://localhost:3306/Dragon";
        String driver = "com.mysql.jdbc.Driver";
        String user = "root";
        String password = "supera";

        try {
            Class.forName(driver);// Registra o Driver
            Connection conn = null;// Faz conexão com o banco
            try {// testa parâmetro sim e não
                conn = (Connection) DriverManager.getConnection(url, user, password);
            } 
            catch(SQLException ex) {
                Logger.getLogger(ConnectionFabrica.class.getName()).log(Level.SEVERE, null, ex);
            }
             show("Conectado ao banco de dados com sucesso: ");           
            return conn;
        } catch(HeadlessException | ClassNotFoundException e) {
            show("Erro SQL: "+e.getMessage());
        }
        return null;
    }
}
        


