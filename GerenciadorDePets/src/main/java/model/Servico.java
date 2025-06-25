/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author leonc
 */
public class Servico extends Usuario{
    private String cnpj;

    public Servico(int id, String nome, String email, String senha, String estado, String cidade, String rua, int numero, String cep, String cnpj) {
        super(id, nome, email, senha, estado, cidade, rua, numero, cep);
        this.cnpj = cnpj;
    }

    public Servico() {}

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
