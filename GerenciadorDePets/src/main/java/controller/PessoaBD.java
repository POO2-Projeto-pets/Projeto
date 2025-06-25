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
import model.Pessoa;

/**
 *
 * @author LucasTheobaldo
 */
public class PessoaBD {
    
    //Singleton
    private static PessoaBD gerPessoaBD;

    private PessoaBD(){
        
    }
    
    public static PessoaBD Gen(){
        if(gerPessoaBD == null){
            gerPessoaBD = new PessoaBD();
        }
        return gerPessoaBD;
    }
    //Singleton
    
    static Connection con = null;
    static String url = "jdbc:postgresql://localhost:5432/Principal_BD";
    static String driver = "org.postgresql.Driver";
    static String user = "postgres";
    static String senha = "utfpr";
    
    Statement st = null;
        
    public void criaTable() {
        String sql1 = "CREATE TABLE IF NOT EXISTS Pessoa ("
            + "cpf int"
            + ")INHERITS (Usuario)";
        try{
            Class.forName(driver);
            con = Conexao.getCon(); 
            st = con.createStatement();
            st.executeUpdate(sql1);
            st.close();
            con.close();
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Erro ao criar a tabela Pessoa...");
            System.out.println(e);
        }
        
        String sqlPkey = "DO $$ BEGIN "
            +"ALTER TABLE Pessoa ADD PRIMARY KEY (uid);"
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
            System.out.println("\nErro ao criar a PK de Pessoa...(PessoaBD)"); 
            System.out.println(e);
        }

    }
    
    PreparedStatement ps = null;
        
    public void inserir(Pessoa pessoa){
        String sql1 = "INSERT INTO Pessoa VALUES(?,?,?,?,?)";
        try{//inserção de dados
            Class.forName(driver);
            con = Conexao.getCon();
            System.out.println("Inserindo dados de Pessoa...");
            ps = con.prepareStatement(sql1);
            ps.setInt(1, pessoa.getId());
            ps.setString(2, pessoa.getNome());
            ps.setString(3, pessoa.getEmail());
            ps.setString(4, pessoa.getSenha());
            ps.setString(5, pessoa.getCpf());
            ps.execute();
            System.out.println("Dados inseridos com sucesso!");

            ps.close();
            con.close();
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
    }
    
    public Pessoa consultarPessoa(int id){
        return null;
    }
    
    public void atualizarPessoa(Pessoa pessoa){
        // Não pode mudar ID
        // Não pode mudar CPF
    }
   
}
