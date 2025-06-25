/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

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
    static String url = "jdbc:postgresql://localhost:5432/Principal_BD";
    static String driver = "org.postgresql.Driver";
    static String user = "postgres";
    static String senha = "utfpr";
    
    Statement st = null;
        
    public void criaTable() {
        String sqlCreate = "CREATE TABLE IF NOT EXISTS Endereco ("
            + "uid int not null primary key,"
            + "estado text,"
            + "cidade text,"
            + "nomeRua text,"
            + "cep text UNIQUE NOT NULL,"
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
}
