/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
            +"CREATE TYPE gen AS ENUM('Macho', 'Femea');"
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
            + "pet_id SERIAL primary key,"
            + "user_id int,"
            + "can_id int,"    
            + "foto bytea,"
            + "nome text," 
            + "raca text,"
            + "peso float,"  
            + "dataNascimento date,"
            + "genero gen,"
            + "habilidades text,"      
            + "especie text"
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
            +"ALTER TABLE Pet ADD CONSTRAINT fk_usuario FOREIGN KEY (user_id) REFERENCES Pessoa (uid) DEFERRABLE INITIALLY DEFERRED;"
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
            System.out.println("Erro ao criar relacão pet_pessoa...(PetBD)");
            System.out.println(e);
        }
        
        sqlRel = "DO $$ BEGIN "
            +"ALTER TABLE Pet ADD CONSTRAINT fk_canil FOREIGN KEY (can_id) REFERENCES Canil (uid) DEFERRABLE INITIALLY DEFERRED;"
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
    
    /*
            + "pet_id SERIAL primary key,"
            + "user_id int,"
            + "can_id int,"    
            + "foto bytea,"
            + "nome text," 
            + "raca text,"
            + "peso float,"  
            + "dataNascimento date,"
            + "genero gen,"
            + "habilidades text,"      
            + "especie text,"
            + "adotado boolean,"
    
    */
    
    PreparedStatement ps = null;
    
    public void inserirPet(Pet pet){
        String sql1 = "INSERT INTO Pet(pet_id, can_id, foto, nome, raca, peso, dataNascimento, genero, habilidades, especie)  "
                + "VALUES(DEFAULT,?,?,?,?,?,?,?,?,?)";
        try{
            Class.forName(driver);
            con = Conexao.getCon();
            ps = con.prepareStatement(sql1);
            ps.setInt(1, pet.getCid());
            ps.setBytes(2, pet.getFoto());
            ps.setString(3, pet.getNome());
            ps.setString(3, pet.getRaca());
            ps.setFloat(5, pet.getPeso());
            ps.setDate(6, pet.getIdade());
            ps.setString(7, pet.getGenero());
            ps.setString(8, pet.getHabilidades());
            ps.setString(9, pet.getEspecie());
            ps.executeUpdate();
            ps.close();
            con.close();
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("\nErro ao inserindo dados de Pet...(PetBD)\n");
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
