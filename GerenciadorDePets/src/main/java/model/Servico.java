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
    
    //Singleton
    protected static Servico gerServico;

    protected Servico() {}
    
    public static Servico Gen(){
        if(gerServico == null){
            gerServico = new Servico();
        }
        return gerServico;
    }
    //Singleton

    public Servico(int id, String nome, String email, String senha, int uid,String estado, String cidade, String rua, int numero, String cnpj) {
        super(id, nome, email, senha, uid, estado, cidade, rua, numero);
        this.cnpj = cnpj;
    }
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
