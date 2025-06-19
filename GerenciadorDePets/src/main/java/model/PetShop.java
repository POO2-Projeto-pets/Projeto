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

    public PetShop(){
        
    }

    public ArrayList<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(Produto object) {
        this.listaProdutos.add(object);
    }
}
