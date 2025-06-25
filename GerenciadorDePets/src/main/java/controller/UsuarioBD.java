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
public class UsuarioBD {
    
    //Singleton
    private static UsuarioBD gerUsuarioBD;

    private UsuarioBD(){
        
    }
    
    public static UsuarioBD Gen(){
        if(gerUsuarioBD == null){
            gerUsuarioBD = new UsuarioBD();
        }
        return gerUsuarioBD;
    }
    //Singleton
    
    static Connection con = null;
    static String driver = "org.postgresql.Driver";
    
    Statement st = null;
        
    public void criaTable() {
        String sql1 = "CREATE TABLE IF NOT EXISTS Usuario ("
            + "uid SERIAL primary key,"
            + "nome text,"
            + "email text,"
            + "senha text"
            + ")";
        try{
            Class.forName(driver);
            con = Conexao.getCon();  
            st = con.createStatement();
            st.executeUpdate(sql1);
            st.close();
            con.close();
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Erro ao criar a tabela Usuario...");
            System.out.println(e);
        }
        
    }
    
    
    public void cadastrarUser() {
        // Cadastra um usúario no BD
    }
    
    public int logarUser() {
        // Verifica se um usúario existe no BD
        return 0;
    }
    
}
