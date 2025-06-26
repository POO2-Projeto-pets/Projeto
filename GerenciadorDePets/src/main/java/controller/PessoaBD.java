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
    static String driver = "org.postgresql.Driver";
    
    Statement st = null;
        
    public void criaTable() {
        String sql1 = "CREATE TABLE IF NOT EXISTS Pessoa ("
            + "cpf text unique"
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
        
    public void inserirPessoa(Pessoa pessoa){
        String sql1 = "INSERT INTO Pessoa VALUES(DEFAULT,?,?,?,?)";
        try{
            Class.forName(driver);
            con = Conexao.getCon();

            ps = con.prepareStatement(sql1);
            ps.setString(1, pessoa.getNome());
            ps.setString(2, pessoa.getEmail());
            ps.setString(3, pessoa.getSenha());
            ps.setString(4, pessoa.getCpf());
            ps.execute();
            ps.close();
            con.close();
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Erro ao inserindo dados de Pessoa...(PessoaBD)");
            System.out.println(e);
        }
    }
    
    public int consultarPessoaUid(String cpf){     
        String sql1 = "SELECT uid FROM Pessoa WHERE cpf = ?";
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
            System.out.println("Erro ao pesquisar uid de Pessoa...(PessoaBD)");
            System.out.println(e);
        }
        return 0;
    }
    
    public boolean consultarPessoaCpf(String cpf){     
        String sql1 = "SELECT cpf FROM Pessoa WHERE cpf = ?";
        try{
            Class.forName(driver);
            con = Conexao.getCon();         
            ps = con.prepareStatement(sql1);
            ps.setString(1, cpf);   
            ResultSet res = ps.executeQuery();
            boolean temp = res.next(); 
            ps.close();
            con.close();
            return temp; 
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Erro ao pesquisar uid de Pessoa...(PessoaBD)");
            System.out.println(e);
        }
        return false;
    }
    
    public void atualizarPessoa(Pessoa pessoa){
        // Não pode mudar ID
        // Não pode mudar CPF
    }
   
}
