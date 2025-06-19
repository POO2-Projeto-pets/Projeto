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

    public Servico(String cnpj) {
        this.cnpj = cnpj;
    }

    public Servico() {
        this.cnpj = "";
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
