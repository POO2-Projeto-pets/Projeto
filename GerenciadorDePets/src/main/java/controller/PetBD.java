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

//https://stackoverflow.com/questions/72550576/save-image-files-as-bytea-in-postgresql-and-retrieving-them-to-display-on-html-t

public class PetBD {
    static Connection con = null;
    static String url = "jdbc:postgresql://localhost:5432/Principal_BD";
    static String driver = "org.postgresql.Driver";
    static String user = "postgres";
    static String senha = "utfpr";
    
    Statement st = null;
        
    public void criaTable() {
        
        //"CREATE TYPE IF NOT EXISTS gen AS ENUM ()";
        
        String sqlenum =  "DO $$ BEGIN "
            +"CREATE TYPE gen AS ENUM('macho', 'femea');"
            +"EXCEPTION "
            +"WHEN duplicate_object THEN null;"
            +"END $$";
                
        try{
            Class.forName(driver);
            con = DriverManager.getConnection(url,user,senha);
            System.out.println("Criando enum pet genero...");    
            st = con.createStatement();
            st.executeUpdate(sqlenum);
            System.out.println("Sucesso");
            st.close();
            con.close();
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }

        String sql1 = "CREATE TABLE IF NOT EXISTS Pet ("         
            + "pid int,"
            + "foto text,"
            + "dataNascimento date,"
            + "raca text,"
            + "especie text,"
            + "numero int,"
            + "corPreodominante text,"     
            + "genero gen,"
            + "habilidades text,"      
            + "nome text,"        
            + "dadosClinicos text"                 
            + ")";
        try{
            Class.forName(driver);
            con = DriverManager.getConnection(url,user,senha);
            System.out.println("Criando a tabela pet...");    
            st = con.createStatement();
            st.executeUpdate(sql1);
            System.out.println("Sucesso");
            st.close();
            con.close();
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
        
        String sqlRel = "ALTER TABLE Pet ADD FOREIGN KEY (pid) REFERENCES Usiario (uid) DEFERRABLE INITIALLY DEFERRED";               
                
        try{
            Class.forName(driver);
            con = DriverManager.getConnection(url,user,senha);
            System.out.println("Criando a relacão com Pet...");    
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
