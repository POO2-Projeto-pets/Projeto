/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author bone_dust
 */
public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private Endereco ender = new Endereco();
    
    public Usuario(String nome, String email, String senha, Endereco ender) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.ender = ender;
    }
    
    public Usuario(String nome, String email, String senha, String estado, String cidade, String rua, int numero, String cep) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.ender.setEstado(estado);
        this.ender.setCidade(cidade);
        this.ender.setRua(rua);
        this.ender.setNumero(numero);
        this.ender.setCep(cep);        
    }
    
    public Usuario() {
        this.nome = "";
        this.email = "";
        this.senha = "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
