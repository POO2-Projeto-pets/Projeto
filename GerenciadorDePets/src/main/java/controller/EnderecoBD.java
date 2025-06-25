/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import model.Endereco;

/**
 *
 * @author LucasTheobaldo
 */

public class EnderecoBD {
    
    //Singleton
    private static EnderecoBD gerEnderecoBD;

    private EnderecoBD(){
        
    }
    
    public static EnderecoBD Gen(){
        if(gerEnderecoBD == null){
            gerEnderecoBD = new EnderecoBD();
        }
        return gerEnderecoBD;
    }
    //Singleton
    
    
    static Connection con = null;
    static String driver = "org.postgresql.Driver";
    
    Statement st = null;
        
    public void criaTable() {
        String sqlCreate = "CREATE TABLE IF NOT EXISTS Endereco ("
            + "uid SERIAL primary key,"
            + "estado text,"
            + "cidade text,"
            + "rua text,"   
            + "numero int"                
            + ")";
        try{
            Class.forName(driver);
            con = Conexao.getCon();
            st = con.createStatement();
            st.executeUpdate(sqlCreate);
            st.close();
            con.close();
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Erro ao criar a tabela Endereco..."); 
            System.out.println(e);
        }
        
        String sqlRel = "DO $$ BEGIN "
            +"ALTER TABLE Usuario ADD CONSTRAINT fk_usuario_endereco FOREIGN KEY (uid) REFERENCES Endereco (uid) DEFERRABLE INITIALLY DEFERRED;"
            +"EXCEPTION "
            +"WHEN duplicate_object THEN null;"
            +"END $$";
        
        try{
            Class.forName(driver);
            con = Conexao.getCon();
            st = con.createStatement();
            st.executeUpdate(sqlRel);
            st.close();
            con.close();
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Erro ao criar relacão usuario_endereco..."); 
            System.out.println(e);
        }
    }
    
    PreparedStatement ps = null;
    
    public void inserir(Endereco endereco){
        String sql1 = " INSERT INTO Endereco VALUES(?,?,?,?,?)";
        /*String sql1 = "UPDATE Endereco SET estado = (?), cidade = (?), rua = (?), numero  = (?)"
                + "WHERE uid = '1'";  */
        try{
            Class.forName(driver);
            con = Conexao.getCon();
            System.out.println("Inserindo dados de Endereço...");         
            ps = con.prepareStatement(sql1);
            System.out.println(ps);
            ps.setInt(1, endereco.getUid());
            ps.setString(2, endereco.getEstado());
            ps.setString(3, endereco.getCidade());
            ps.setString(4, endereco.getRua());
            ps.setInt(5, endereco.getNumero());  
            ps.execute();
            System.out.println("Dados inseridos com sucesso!");
            ps.close();
            con.close();
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
    }
}
