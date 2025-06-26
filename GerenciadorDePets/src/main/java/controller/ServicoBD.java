/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    
    PreparedStatement ps = null;
    
    public int consultarServicoUid(String cpf){     
        String sql1 = "SELECT uid FROM Servico WHERE cpf = ?";
        try{
            Class.forName(driver);
            con = Conexao.getCon();         
            ps = con.prepareStatement(sql1);
            ps.setString(1, cpf);   
            ResultSet res = ps.executeQuery();
            int uid = 0;
            while(res.next()){
                uid = res.getInt("uid");              
            }
            ps.close();
            con.close();
            return uid; 
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Erro ao pesquisar uid de Servico...(ServicoBD)");
            System.out.println(e);
        }
        return 0;
    }
        
    public boolean consultarServicoCnpj(String cnpj){     
        String sql1 = "SELECT cnpj FROM Servico WHERE cnpj = ?";
        try{
            Class.forName(driver);
            con = Conexao.getCon();         
            ps = con.prepareStatement(sql1);
            ps.setString(1, cnpj);   
            ResultSet res = ps.executeQuery();
            boolean temp = res.next(); 
            ps.close();
            con.close();
            return temp; 
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Erro ao pesquisar uid de Servico...(ServicoBD)");
            System.out.println(e);
        }
        return false;
    }
}
