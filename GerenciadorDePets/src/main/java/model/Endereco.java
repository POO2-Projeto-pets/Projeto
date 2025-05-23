/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author bone_dust
 */
public class Endereco {
    private String estado;
    private String cidade;
    private String cep;

    public Endereco(String estado, String cidade, String cep) {
        this.estado = estado;
        this.cidade = cidade;
        this.cep = cep;
    }

    public Endereco() {
        this.estado = "";
        this.cidade = "";
        this.cep = "";
    }
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
}
