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
public class ServicoBD {
    static Connection con = null;
    static String url = "jdbc:postgresql://localhost:5432/Principal_BD";
    static String driver = "org.postgresql.Driver";
    static String user = "postgres";
    static String senha = "utfpr";
    
    Statement st = null;
        
    public void criaTable() {
        String sqlCreate = "CREATE TABLE IF NOT EXISTS Servico ("
            + "cnpj int"
            + ")INHERITS (Usuario)";
        try{
            Class.forName(driver);
            con = DriverManager.getConnection(url,user,senha);  
            st = con.createStatement();
            st.executeUpdate(sqlCreate);
            st.close();
            con.close();
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Erro ao criar a tabela Servico...");  
            System.out.println(e);
        }

    }
}
