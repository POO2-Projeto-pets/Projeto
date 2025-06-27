/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import model.Canil;
/**
 *
 * @author LucasTheobaldo
 */
public class CanilBD {
    
    //Singleton
    private static CanilBD gerCanilBD;

    private CanilBD(){}
    
    public static CanilBD Gen(){
        if(gerCanilBD == null){
            gerCanilBD = new CanilBD();
        }
        return gerCanilBD;
    }
    //Singleton
    
    static Connection con = null;
    static String driver = "org.postgresql.Driver";
    
    Statement st = null;
        
    public void criaTable() {
        String sql1 = "CREATE TABLE IF NOT EXISTS Canil ("
            + "listaPets integer[]"
            + ")INHERITS (Servico)";
        try{
            Class.forName(driver);
            con = Conexao.getCon();
            st = con.createStatement();
            st.executeUpdate(sql1);
            st.close();
            con.close();
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("\nErro ao criar a tabela Canil...(CanilBD)"); 
            System.out.println(e);
        }
        
        String sqlPkey = "DO $$ BEGIN "
            +"ALTER TABLE Canil ADD PRIMARY KEY (uid);"
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
            System.out.println("\nErro ao criar a PK de Canil...(CanilBD)"); 
            System.out.println(e);
        }
    }
    
    PreparedStatement ps = null;
    
    public void inserirCanil(Canil canil){
        String sql1 = "INSERT INTO Canil VALUES(DEFAULT,?,?,?,?)";
        try{
            Class.forName(driver);
            con = Conexao.getCon();
            ps = con.prepareStatement(sql1);
            ps.setString(1, canil.getNome());
            ps.setString(2, canil.getEmail());
            ps.setString(3, canil.getSenha());
            ps.setString(4, canil.getCnpj());
            ps.execute();
            ps.close();
            con.close();
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Erro ao inserindo dados de Canil...(CanilBD)");
            System.out.println(e);
        }
    }
    
    public Canil consultarCanil(String cnpj){
        return null; // retorna o canil encontrado
    }
    
    public void atualizarCanil(Canil canil, int uid){
        String sql1 = "UPDATE Canil SET nome = ?, email = ?, senha = ? WHERE uid = ?";        
        try{
            Class.forName(driver);
            con = Conexao.getCon();         
            ps = con.prepareStatement(sql1);
            ps.setString(1, canil.getNome());
            ps.setString(2, canil.getEmail());
            ps.setString(3, canil.getSenha());
            ps.setInt(4, uid); 
            ps.executeUpdate();
            ps.close();
            con.close();            
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("\nErro ao atualizar Canil...(CanilBD)\n");                                                       
            System.out.println(e);
        }   
    }
    
    public void deletarCanil(int uid){     
        String sql1 = "DELETE FROM Canil WHERE  cpf = ?";
        try{
            Class.forName(driver);
            con = Conexao.getCon();         
            ps = con.prepareStatement(sql1);
            ps.setInt(1, uid); 
            ps.executeUpdate();
            ps.close();
            con.close();
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("\nErro ao deletar Canil...(CanilBD)\n");
            System.out.println(e);
        }
    }
}
