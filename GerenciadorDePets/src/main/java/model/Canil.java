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
public class Canil {
    private ArrayList<Pet> listaPets = new ArrayList<>();

    public Canil(Pet listaPets) {
        
    }

    public ArrayList<Pet> getListaPets() {
        return listaPets;
    }

    public void setListaPets(Pet object) {
        this.listaPets.add(object);
    }
}
