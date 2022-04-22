/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabrica;
import Gui.UsuarioGUI;
    import java.sql.Connection;
    import java.sql.SQLException;
/**
 *
 * @author cavaleronegro
 */
public class TestaConxexao {
    
    public static void main(String[]args)throws SQLException{
        Connection connection = new ConnectionFabrica().getConnection();
        System.out.println("Conexão aberta!");
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuarioGUI().setVisible(true);
            }
        });
        connection.close();
        
        
        
    }
    
}
