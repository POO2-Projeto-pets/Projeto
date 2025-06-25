/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LucasTheobaldo
 */
public class Pessoa extends Usuario{
    private String cpf;

    private Pessoa() {}
    
    public Pessoa(int id, String nome, String email, String senha, String estado, String cidade, String rua, int numero, String cep, String cpf) {
        super( id,  nome,  email,  senha,  estado,  cidade,  rua,  numero, cep);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
