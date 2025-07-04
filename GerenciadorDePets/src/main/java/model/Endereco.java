/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LucasTheobaldo
 */
public class Endereco{
    private int uid;
    private String estado;
    private String cidade;
    private String rua;
    private int numero;
    
    //Singleton
    private static Endereco gerEndereco;

    private Endereco(){
        
    }
    
    public static Endereco Gen(){
        if(gerEndereco == null){
            gerEndereco = new Endereco();
        }
        return gerEndereco;
    }
    //Singleton
    
    public Endereco(int uid, String estado, String cidade, String rua, int numero){
        this.uid = uid;
        this.estado = estado;
        this.cidade = cidade;
        this.rua = rua;
        this.numero = numero;  
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
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
    
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
