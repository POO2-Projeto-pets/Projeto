/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.FileInputStream;
import java.sql.Date;

/**
 *
 * @author LucasTheobaldo
 */
public class Pet {
    private int pid;
    private int cid;
    private int uid;
    private FileInputStream foto;
    private String nome;
    private String raca;
    private Float peso;
    private Date dataNascimento;
    private String genero;
    private String habilidades;
    private String especie;
    
    //Singleton
    private static Pet gerPet;

    private Pet(){}
    
    public static Pet Gen(){
        if(gerPet == null){
            gerPet = new Pet();
        }
        return gerPet;
    }
    //Singleton

    public Pet(int pid, int cid, int uid, FileInputStream foto, String nome, String raca, Float peso, Date idade, String genero, String habilidades, String especie) {
        this.pid = pid;
        this.cid = cid;
        this.uid = uid;
        this.foto = foto;
        this.nome = nome;
        this.raca = raca;
        this.peso = peso;
        this.dataNascimento = idade;
        this.genero = genero;
        this.habilidades = habilidades;
        this.especie = especie;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public FileInputStream getFoto() {
        return foto;
    }

    public void setFoto(FileInputStream foto) {
        this.foto = foto;
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

    public Date getdataNascimento() {
        return dataNascimento;
    }

    public void setdataNascimento(Date idade) {
        this.dataNascimento = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    } 
    
}
