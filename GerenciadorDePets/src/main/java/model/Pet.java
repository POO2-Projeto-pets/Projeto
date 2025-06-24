/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LucasTheobaldo
 */
public class Pet {
    private String nome;
    private String raca;
    private Float peso;
    private int idade;
    private int genero;
    private Boolean adocao;
    private int id;
    private String habilidades;
    private String cor;
    private String especie;
    
    public Pet(String nome, String raca, Float peso, int idade, int genero, Boolean adocao, int id, String habilidades, String cor, String especie) {
        this.nome = nome;
        this.raca = raca;
        this.peso = peso;
        this.idade = idade;
        this.genero = genero;
        this.adocao = adocao;
        this.id = id;
        this.habilidades = habilidades;
        this.cor = cor;
        this.especie = especie;
    }
    public Pet() {
        this.nome = "";
        this.raca = "";
        this.peso = 0f;
        this.idade = 0;
        this.genero = 0;
        this.adocao = false;
        this.id = 0;
        this.habilidades = "";
        this.cor = "";
        this.especie = "";
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    public Boolean getAdocao() {
        return adocao;
    }

    public void setAdocao(Boolean adocao) {
        this.adocao = adocao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    } 
    
}
