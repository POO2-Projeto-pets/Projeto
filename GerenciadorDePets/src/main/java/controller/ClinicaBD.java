/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import model.Clinica;

/**
 *
 * @author LucasTheobaldo
 */
public class ClinicaBD {
    static Connection con = null;
    static String url = "jdbc:postgresql://localhost:5432/Principal_BD";
    static String driver = "org.postgresql.Driver";
    static String user = "postgres";
    static String senha = "utfpr";
    
    Statement st = null;
        
    public void criaTable() {
        String sql1 = "CREATE TABLE IF NOT EXISTS Clinica ("
            + "listaVeterinarios integer[]"
            + ")INHERITS (Servico)";
        try{
            Class.forName(driver);
            con = DriverManager.getConnection(url,user,senha);
            st = con.createStatement();
            st.executeUpdate(sql1);
            st.close();
            con.close();
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Erro ao criar a tabela Clinica..."); 
            System.out.println(e);
        }
        
        String sqlPkey = "DO $$ BEGIN "
            +"ALTER TABLE Clinica ADD PRIMARY KEY (uid);"
            +"EXCEPTION "
            +"WHEN syntax_error_or_access_rule_violation THEN null;"
            +"END $$";
        try{
            Class.forName(driver);
            con = DriverManager.getConnection(url,user,senha); 
            st = con.createStatement();
            st.executeUpdate(sqlPkey);
            st.close();
            con.close();
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("\nErro ao criar a PK de Clinica...(ClinicaBD)"); 
            System.out.println(e);
        }
    }

    public Clinica consultarClinica(String cnpj){
       return null;
    }
}
