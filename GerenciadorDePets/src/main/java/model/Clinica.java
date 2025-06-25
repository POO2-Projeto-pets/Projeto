/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author leonc
 */
public class Clinica extends Servico {
    private ArrayList<Veterinario> listaVeterinarios = new ArrayList<>();

    public Clinica(int id, String nome, String email, String senha, String estado, String cidade, String rua, int numero, String cep, String cnpj, ArrayList<Veterinario> listaVeterinarios) {
        super( id,  nome,  email,  senha,  estado,  cidade,  rua,  numero, cep, cnpj);
        this.listaVeterinarios = listaVeterinarios;
    }

    // Caso a Clinica ainda não tenha nenhum veterinario
    public Clinica(int id, String nome, String email, String senha, String estado, String cidade, String rua, int numero, String cep, String cnpj) {
        super( id,  nome,  email,  senha,  estado,  cidade,  rua,  numero, cep, cnpj);
    }
    
    private Clinica(){}

    public ArrayList<Veterinario> getListaVeterinarios() {
        return listaVeterinarios;
    }

    public void setListaVeterinarios(ArrayList<Veterinario> listaVeterinarios) {
        this.listaVeterinarios = listaVeterinarios;
    }
    
    
}
