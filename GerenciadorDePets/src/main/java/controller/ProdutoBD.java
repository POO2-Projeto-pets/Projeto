/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import model.Produto;
/**
 *
 * @author LucasTheobaldo
 */
public class ProdutoBD {
    
    //Singleton
    private static ProdutoBD gerProdutoBD;

    private ProdutoBD(){
        
    }
    
    public static ProdutoBD Gen(){
        if(gerProdutoBD == null){
            gerProdutoBD = new ProdutoBD();
        }
        return gerProdutoBD;
    }
    //Singleton
    
    static Connection con = null;
    static String driver = "org.postgresql.Driver";

    Statement st = null;

    public void criaTable() {
        String sql1 = "CREATE TABLE IF NOT EXISTS Produto ("
            + "id SERIAL primary key,"
            + "nome text,"
            + "preco float"
            + ")";
        try{
            Class.forName(driver);
            con = Conexao.getCon(); 
            st = con.createStatement();
            st.executeUpdate(sql1);
            st.close();
            con.close();
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("\nErro ao criar a tabela Produto...(ProdutoBD)");
            System.out.println(e);
        }
        
        String sqlRel = "CREATE TABLE IF NOT EXISTS petshop_produto ("
            + "produto_id int,"
            + "petShop_id int,"
            + " PRIMARY KEY (produto_id, petShop_id)"
            + ")";
        try{
            Class.forName(driver);
            con = Conexao.getCon();  
            st = con.createStatement();
            st.executeUpdate(sqlRel);
            st.close();
            con.close();
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("\nErro ao criar a tabela petshop_produto...(ProdutoBD)");  
            System.out.println(e);
        }
        
        sqlRel = "DO $$ BEGIN "
            +"ALTER TABLE petshop_produto ADD CONSTRAINT fk_petShop FOREIGN KEY(petShop_id) REFERENCES PetShop(uid) DEFERRABLE INITIALLY DEFERRED;"
            +"ALTER TABLE petshop_produto ADD CONSTRAINT fk_produto FOREIGN KEY(produto_id) REFERENCES Produto(id) DEFERRABLE INITIALLY DEFERRED;"
            +"EXCEPTION "
            +"WHEN duplicate_object THEN null;"
            +"END $$";
        try{
            Class.forName(driver);
            con = Conexao.getCon(); 
            st = con.createStatement();
            st.executeUpdate(sqlRel);
            st.close();
            con.close();
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("\nErro ao criar relacão petshop_produto...(ProdutoBD)");
            System.out.println(e);
        }
    }   
    
    PreparedStatement ps = null;
    
    public void inserirProduto(Produto produto){
        String sql1 = "INSERT INTO Produto VALUES(DEFAULT,?,?)";
        try{
            Class.forName(driver);
            con = Conexao.getCon();
            ps = con.prepareStatement(sql1);
            ps.setString(1, produto.getNome());
            ps.setFloat(2, produto.getPreco());
            ps.execute();
            ps.close();
            con.close();
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Erro ao inserindo dados de Produto...(ProdutoBD)");
            System.out.println(e);
        }
    }
    
    public Produto consultarProduto(int id){
        return null;
    }
    
    public void atualizarProduto(Produto produto, int id){
        String sql1 = "UPDATE Produto SET nome = ?, preco = ? WHERE uid = ?";        
        try{
            Class.forName(driver);
            con = Conexao.getCon();         
            ps = con.prepareStatement(sql1);
            ps.setString(1, produto.getNome());
            ps.setFloat(2, produto.getPreco());
            ps.setInt(3, id); 
            ps.executeUpdate();
            ps.close();
            con.close();            
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("\nErro ao atualizar Produto...(ProdutoBD)\n");                                                       
            System.out.println(e);
        }   
    }
    
     public void deletarProduto(int id){     
        String sql1 = "DELETE FROM Produto WHERE  id = ?";
        try{
            Class.forName(driver);
            con = Conexao.getCon();         
            ps = con.prepareStatement(sql1);
            ps.setInt(1, id); 
            ps.executeUpdate();
            ps.close();
            con.close();
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("\nErro ao deletar Produto...(ProdutoBD)\n");
            System.out.println(e);
        }
    }
}
