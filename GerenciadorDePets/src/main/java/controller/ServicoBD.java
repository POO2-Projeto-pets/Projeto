/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author LucasTheobaldo
 */
public class ServicoBD {
    
    //Singleton
    private static ServicoBD gerServicoBD;

    private ServicoBD(){
        
    }
    
    public static ServicoBD Gen(){
        if(gerServicoBD == null){
            gerServicoBD = new ServicoBD();
        }
        return gerServicoBD;
    }
    //Singleton
    
    static Connection con = null;
    static String driver = "org.postgresql.Driver";
    
    Statement st = null;
        
    public void criaTable() {
        String sqlCreate = "CREATE TABLE IF NOT EXISTS Servico ("
            + "cnpj text unique"
            + ")INHERITS (Usuario)";
        try{
            Class.forName(driver);
            con = Conexao.getCon();
            st = con.createStatement();
            st.executeUpdate(sqlCreate);
            st.close();
            con.close();
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Erro ao criar a tabela Servico...");  
            System.out.println(e);
        }

        
        String sqlPkey = "DO $$ BEGIN "
            +"ALTER TABLE Servico ADD PRIMARY KEY (uid);"
            +"EXCEPTION "
            +"WHEN syntax_error_or_access_rule_violation THEN null;"
            +"END $$";
        try{
            Class.forName(driver);
            con = Conexao.getCon();
            st = con.createStatement();
            st.executeUpdate(sqlPkey);
            st.close();
            con.close();
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("\nErro ao criar a PK de Servico...(ServicoBD)"); 
            System.out.println(e);
        }

    }
}
