/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import model.Pet;
/**
 *
 * @author LucasTheobaldo
 */

public class PetBD {
    
    //Singleton
    private static PetBD gerPetBD;

    private PetBD(){
        
    }
    
    public static PetBD Gen(){
        if(gerPetBD == null){
            gerPetBD = new PetBD();
        }
        return gerPetBD;
    }
    //Singleton
    
    static Connection con = null;
    static String driver = "org.postgresql.Driver";

    Statement st = null;
        
    public void criaTable() {
        
        //https://stackoverflow.com/questions/12881782/java-db-connection
        //https://stackoverflow.com/questions/23979842/convert-base64-string-to-image
        
        String sqlenum =  "DO $$ BEGIN "
            +"CREATE TYPE gen AS ENUM('macho', 'femea');"
            +"EXCEPTION "
            +"WHEN duplicate_object THEN null;"
            +"END $$";
                
        try{
            Class.forName(driver);
            con = Conexao.getCon();
            st = con.createStatement();
            st.executeUpdate(sqlenum);
            st.close();
            con.close();
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Erro ao criar o enum gen...(PetBD)");
            System.out.println(e);
        }

        String sqlCreate = "CREATE TABLE IF NOT EXISTS Pet ("         
            + "user_id int,"
            + "pet_id int,"    
            + "foto text,"
            + "dataNascimento date,"
            + "raca text,"
            + "especie text,"
            + "numero int,"
            + "corPreodominante text,"     
            + "genero gen,"
            + "habilidades text,"      
            + "nome text,"        
            + "dadosClinicos text"                 
            + ")";
        try{
            Class.forName(driver);
            con = Conexao.getCon();
            st = con.createStatement();
            st.executeUpdate(sqlCreate);
            st.close();
            con.close();
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Erro ao criar a tabela Pet...(PetBD)");
            System.out.println(e);
        }
        
        String sqlRel = "DO $$ BEGIN "
            +"ALTER TABLE Pet ADD CONSTRAINT fk_usuario FOREIGN KEY (user_id) REFERENCES Usuario (uid) DEFERRABLE INITIALLY DEFERRED;"
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
            System.out.println("Erro ao criar relacão pet_user...(PetBD)");
            System.out.println(e);
        }
        
        sqlRel = "DO $$ BEGIN "
            +"ALTER TABLE Pet ADD CONSTRAINT fk_canil FOREIGN KEY (pet_id) REFERENCES Canil (uid) DEFERRABLE INITIALLY DEFERRED;"
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
            System.out.println("\nErro ao criar relacão pet_canil...(PetBD)"); 
            System.out.println(e);
        }
    }
    
    public Pet consultarPet(int id){
        return null;
    }
    
    public void atualizarPet(Pet pet){
        // Pode mudar: foto, corPredominante, nome, habilidades e dadosClinicos
    }
}
