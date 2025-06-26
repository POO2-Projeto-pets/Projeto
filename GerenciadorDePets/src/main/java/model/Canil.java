/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author bone_dust
 */
public class Canil extends Servico{
    private ArrayList<Pet> listaPets = new ArrayList<>();
    
    //Singleton
    private static Canil gerCanil;

    private Canil(){}
    
    public static Canil Gen(){
        if(gerCanil == null){
            gerCanil = new Canil();
        }
        return gerCanil;
    }
    //Singleton
    
    public Canil(int id, String nome, String email, String senha, int uid, String estado, String cidade, String rua, int numero, String cnpj, ArrayList<Pet> listaPets)      {
        super(id, nome, email, senha, uid, estado, cidade, rua, numero, cnpj);
        this.listaPets = listaPets;
    }

    // Caso o Canil ainda não tenha nenhum pet
    public Canil(int id, String nome, String email, String senha, int uid, String estado, String cidade, String rua, int numero, String cnpj) {
        super( id,  nome,  email,  senha,  uid, estado,  cidade,  rua,  numero, cnpj);
    }

    public ArrayList<Pet> getListaPets() {
        return listaPets;
    }

    public void setListaPets(Pet object) {
        this.listaPets.add(object);
    }
}
