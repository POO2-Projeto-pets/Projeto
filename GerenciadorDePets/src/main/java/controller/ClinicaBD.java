/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import model.Clinica;

/**
 *
 * @author LucasTheobaldo
 */
public class ClinicaBD {
    
    //Singleton
    private static ClinicaBD gerClinicaBD;

    private ClinicaBD(){}
    
    public static ClinicaBD Gen(){
        if(gerClinicaBD == null){
            gerClinicaBD = new ClinicaBD();
        }
        return gerClinicaBD;
    }
    //Singleton
    
    static Connection con = null;
    static String driver = "org.postgresql.Driver";
    
    Statement st = null;
        
    public void criaTable() {
        String sql1 = "CREATE TABLE IF NOT EXISTS Clinica ("
            + "listaVeterinarios integer[]"
            + ")INHERITS (Servico)";
        try{
            Class.forName(driver);
            con = Conexao.getCon();
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
            con = Conexao.getCon();
            st = con.createStatement();
            st.executeUpdate(sqlPkey);
            st.close();
            con.close();
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("\nErro ao criar a PK de Clinica...(ClinicaBD)"); 
            System.out.println(e);
        }
    }
    
    PreparedStatement ps = null;
    
    public void inserirClinica(Clinica clinica){
        String sql1 = "INSERT INTO Clinica VALUES(DEFAULT,?,?,?,?)";
        try{
            Class.forName(driver);
            con = Conexao.getCon();
            ps = con.prepareStatement(sql1);
            ps.setString(1, clinica.getNome());
            ps.setString(2, clinica.getEmail());
            ps.setString(3, clinica.getSenha());
            ps.setString(4, clinica.getCnpj());
            ps.execute();
            ps.close();
            con.close();
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Erro ao inserindo dados de Clinica...(ClinicaBD)");
            System.out.println(e);
        }
    }

    public Clinica consultarClinica(String cnpj){
       return null;
    }
    
    public void atualizarClinica(Clinica clinica){
        // Não pode mudar ID
        // Não pode mudar CNPJ
    }
}
