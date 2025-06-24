/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import model.Veterinario;

/**
 *
 * @author LucasTheobaldo
 */
public class VeterinarioBD {
    static Connection con = null;
    static String url = "jdbc:postgresql://localhost:5432/Principal_BD";
    static String driver = "org.postgresql.Driver";
    static String user = "postgres";
    static String senha = "utfpr";
    
    Statement st = null;
        
    public void criaTable() {
        String sql1 = "CREATE TABLE IF NOT EXISTS Veterinario ("
            + "crmv text primary key,"
            + "especialidade text"
            + ")INHERITS (Servico)";
        try{
            Class.forName(driver);
            con = DriverManager.getConnection(url,user,senha);   
            st = con.createStatement();
            st.executeUpdate(sql1);
            st.close();
            con.close();
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("\nErro ao criar a tabela Veterinario...(VeterinarioBD)");
            System.out.println(e);
        }
        
        String sqlRel = "CREATE TABLE IF NOT EXISTS clinica_veterinario ("
            + "veterinario_id text,"
            + "clinica_id int,"
            + " PRIMARY KEY (veterinario_id, clinica_id)"
            + ")";
        try{
            Class.forName(driver);
            con = DriverManager.getConnection(url,user,senha);  
            st = con.createStatement();
            st.executeUpdate(sqlRel);
            st.close();
            con.close();
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("\nErro ao criar a tabela clinica_veterinario...(VeterinarioDB)");  
            System.out.println(e);
        }
        
        sqlRel = "DO $$ BEGIN "
            +"ALTER TABLE clinica_veterinario ADD CONSTRAINT fk_clinica FOREIGN KEY(clinica_id) REFERENCES Clinica(uid) DEFERRABLE INITIALLY DEFERRED;"
            +"ALTER TABLE clinica_veterinario ADD CONSTRAINT fk_veterinario FOREIGN KEY(veterinario_id) REFERENCES Veterinario(crmv) DEFERRABLE INITIALLY DEFERRED;"
            +"EXCEPTION "
            +"WHEN duplicate_object THEN null;"
            +"END $$";
        try{
            Class.forName(driver);
            con = DriverManager.getConnection(url,user,senha);  
            st = con.createStatement();
            st.executeUpdate(sqlRel);
            st.close();
            con.close();
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("\nErro ao criar relacão clinica_veterinario...(VeterinarioDB)");
            System.out.println(e);
        }
    }
    
    public Veterinario consultarVeterinario(int id){
        return null;
    }
    
    public void atualizarVeterinario(Veterinario veterinario){
        // Não pode mudar ID
        // Não pode mudar CNPJ
    }
}
