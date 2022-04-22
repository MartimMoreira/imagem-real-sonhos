/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;
import Fabrica.ConnectionFabrica;
import  Modelo.Usuario;
import java.sql.*;
import java.sql.PreparedStatement;
/**
 *
 * @author cavaleronegro
 */
public class UsuarioDAO {
    private Connection connection;
    Long id;
    String nome;
    String cpf;
    String email;
    String telefone;
    
    public UsuarioDAO(){
        this.connection = new ConnectionFabrica().getConnection();
    }
    public void adciona(Usuario usuario){
        String sql = "insert into Usuario(nome,cpf,email,telefone)values (?,?,?,?);";
            try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getCpf());
            stmt.setString(3, usuario.getEmail());
            stmt.setString(4, usuario.getTelefone());
            stmt.execute();
            stmt.close();
           
        } catch (Exception u) {
            throw new RuntimeException(u);
        }
    }
}
