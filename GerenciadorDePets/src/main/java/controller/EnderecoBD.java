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
            con = DriverManager.getConnection(url,user,senha);
            System.out.println("Criando a tabela Endereco...");    
            st = con.createStatement();
            st.executeUpdate(sqlCreate);
            System.out.println("Tabela criada com sucesso");
            st.close();
            con.close();
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
        
        String sqlRel = "DO $$ BEGIN "
            +"ALTER TABLE Usiario ADD CONSTRAINT fk_usuario_endereco FOREIGN KEY (uid) REFERENCES Endereco (uid) DEFERRABLE INITIALLY DEFERRED;"
            +"EXCEPTION "
            +"WHEN duplicate_object THEN null;"
            +"END $$";
        
        try{
            Class.forName(driver);
            con = DriverManager.getConnection(url,user,senha);
            System.out.println("Criando a relacão usuario_endereco...");    
            st = con.createStatement();
            st.executeUpdate(sqlRel);
            System.out.println("Sucesso");
            st.close();
            con.close();
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
       
                 
       
    }
    
   
    
    
}
