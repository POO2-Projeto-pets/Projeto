/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author leonc
 */
public class Veterinario extends Servico{
    private String crmv;
    private String especialidade;

     //Singleton
    private static Veterinario gerVeterinario;

    private Veterinario(){
        
    }
    
    public static Veterinario Gen(){
        if(gerVeterinario == null){
            gerVeterinario = new Veterinario();
        }
        return gerVeterinario;
    }
    //Singleton

    public Veterinario(String crmv, String especialidade) {
        this.crmv = crmv;
        this.especialidade = especialidade;
    }

    public String getCrmv() {
        return crmv;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    
    
}
