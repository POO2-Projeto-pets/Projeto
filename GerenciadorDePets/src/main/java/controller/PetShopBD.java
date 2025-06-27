/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import model.PetShop;
/**
 *
 * @author LucasTheobaldo
 */
public class PetShopBD {
    
    //Singleton
    private static PetShopBD gerPetShopBD;

    private PetShopBD(){}
    
    public static PetShopBD Gen(){
        if(gerPetShopBD == null){
            gerPetShopBD = new PetShopBD();
        }
        return gerPetShopBD;
    }
    //Singleton
    
    static Connection con = null;
    static String url = "jdbc:postgresql://localhost:5432/Principal_BD";
    static String driver = "org.postgresql.Driver";
    static String user = "postgres";
    static String senha = "utfpr";
    
    Statement st = null;
        
    public void criaTable() {
        String sql1 = "CREATE TABLE IF NOT EXISTS PetShop ("
            + "listaProdutos integer[]"
            + ")INHERITS (Servico)";
        try{
            Class.forName(driver);
            con = Conexao.getCon();
            st = con.createStatement();
            st.executeUpdate(sql1);
            st.close();
            con.close();
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("\nErro ao criar a tabela PetShop...(PetShopBD)");
            System.out.println(e);
        }
        
        String sqlPkey = "DO $$ BEGIN "
            +"ALTER TABLE PetShop ADD PRIMARY KEY (uid);"
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
            System.out.println("\nErro ao criar a PK de PetShop...(PetShopBD)"); 
            System.out.println(e);
        }
    }    
    
    PreparedStatement ps = null;
    
    public void inserirPetShop(PetShop petshop){
        String sql1 = "INSERT INTO PetShop VALUES(DEFAULT,?,?,?,?)";
        try{
            Class.forName(driver);
            con = Conexao.getCon();
            ps = con.prepareStatement(sql1);
            ps.setString(1, petshop.getNome());
            ps.setString(2, petshop.getEmail());
            ps.setString(3, petshop.getSenha());
            ps.setString(4, petshop.getCnpj());
            ps.execute();
            ps.close();
            con.close();
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Erro ao inserindo dados de PetShop...(PetShopBD)");
            System.out.println(e);
        }
    }
    
    public PetShop consultarPetShop(int id){
        return null;
    }

    public void atualizarPetShop(PetShop petShop, int uid){
        String sql1 = "UPDATE PetShop SET nome = ?, email = ?, senha = ? WHERE uid = ?";        
        try{
            Class.forName(driver);
            con = Conexao.getCon();         
            ps = con.prepareStatement(sql1);
            ps.setString(1, petShop.getNome());
            ps.setString(2, petShop.getEmail());
            ps.setString(3, petShop.getSenha());
            ps.setInt(4, uid); 
            ps.executeUpdate();
            ps.close();
            con.close();            
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("\nErro ao atualizar PetShop...(PetShopBD)\n");                                                       
            System.out.println(e);
        }   
    }
    
    public void deletarPetShop(int uid){     
        String sql1 = "DELETE FROM PetShop WHERE  cpf = ?";
        try{
            Class.forName(driver);
            con = Conexao.getCon();
            ps = con.prepareStatement(sql1);
            ps.setInt(1, uid);
            ps.executeUpdate();
            ps.close();
            con.close();
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("\nErro ao deletar PetShop...(PetShopBD)\n");
            System.out.println(e);
        }
    }
}
