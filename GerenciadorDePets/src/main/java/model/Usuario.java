/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LucasTheobaldo
 */
public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String senha;
    private Endereco ender;
    
//    public Usuario(int id, String nome, String email, String senha) {
//        this.id = id;
//        this.nome = nome;
//        this.email = email;
//        this.senha = senha;
//    }
    
    public Usuario(int id, String nome, String email, String senha, String estado, String cidade, String rua, int numero, String cep) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.ender = new Endereco(estado, cidade, rua, numero, cep);     
    }
    
    public Usuario() {
        this.id = 0;
        this.nome = "";
        this.email = "";
        this.senha = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Endereco getEnder() {
        return ender;
    }

    public void setEnder(Endereco ender) {
        this.ender = ender;
    }

   
}
