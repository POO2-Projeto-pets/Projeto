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

    private Canil(){}
    
    public Canil(int id, String nome, String email, String senha, String estado, String cidade, String rua, int numero, String cep, String cnpj, ArrayList<Pet> listaPets) {
        super( id,  nome,  email,  senha,  estado,  cidade,  rua,  numero, cep, cnpj);
        this.listaPets = listaPets;
    }

    // Caso o Canil ainda não tenha nenhum pet
    public Canil(int id, String nome, String email, String senha, String estado, String cidade, String rua, int numero, String cep, String cnpj) {
        super( id,  nome,  email,  senha,  estado,  cidade,  rua,  numero, cep, cnpj);
    }

    public ArrayList<Pet> getListaPets() {
        return listaPets;
    }

    public void setListaPets(Pet object) {
        this.listaPets.add(object);
    }
}
