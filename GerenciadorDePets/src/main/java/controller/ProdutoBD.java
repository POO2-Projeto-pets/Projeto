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
public class ProdutoBD {
    static Connection con = null;
    static String url = "jdbc:postgresql://localhost:5432/Principal_BD";
    static String driver = "org.postgresql.Driver";
    static String user = "postgres";
    static String senha = "utfpr";

    Statement st = null;

    public void criaTable() {
        String sql1 = "CREATE TABLE IF NOT EXISTS Produto ("
             + "id int primary key,"
            + "nome text,"
            + "preco float"
            + ")";
        try{
            Class.forName(driver);
            con = DriverManager.getConnection(url,user,senha);  
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
            con = DriverManager.getConnection(url,user,senha);  
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
            con = DriverManager.getConnection(url,user,senha);  
            st = con.createStatement();
            st.executeUpdate(sqlRel);
            st.close();
            con.close();
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("\nErro ao criar relacão petshop_produto...(ProdutoBD)");
            System.out.println(e);
        }
    }    
}
