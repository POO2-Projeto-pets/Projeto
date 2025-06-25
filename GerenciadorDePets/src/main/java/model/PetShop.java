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
public class PetShop extends Servico{
    private ArrayList<Produto> listaProdutos = new ArrayList<>();

    private PetShop(){}
    
    public PetShop(int id, String nome, String email, String senha, String estado, String cidade, String rua, int numero, String cep, String cnpj, ArrayList<Produto> listaProdutos) {
        super( id,  nome,  email,  senha,  estado,  cidade,  rua,  numero, cep, cnpj);
        this.listaProdutos = listaProdutos;
    }

    // Caso o PetShop ainda não tenha nenhum produto
    public PetShop(int id, String nome, String email, String senha, String estado, String cidade, String rua, int numero, String cep, String cnpj) {
        super( id,  nome,  email,  senha,  estado,  cidade,  rua,  numero, cep, cnpj);
    }
    
    public ArrayList<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(Produto object) {
        this.listaProdutos.add(object);
    }
}
