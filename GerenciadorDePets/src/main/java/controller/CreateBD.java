/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author leonc
 */
public class CreateBD {
    //Singleton
    private static CreateBD gerCreateBD;

    private CreateBD(){
        
    }
    
    public CreateBD Gen(){
        if(gerCreateBD == null){
            gerCreateBD = new CreateBD();
            restauraBD();
        }
        return gerCreateBD;
    }
    
    public void restauraBD(){
        UsuarioBD.Gen().criaTable();
        EnderecoBD.Gen().criaTable();
        PessoaBD.Gen().criaTable();
        ServicoBD.Gen().criaTable();
        CanilBD.Gen().criaTable();
        PetBD.Gen().criaTable();
        PetShopBD.Gen().criaTable();
        ProdutoBD.Gen().criaTable();
        ClinicaBD.Gen().criaTable();
        VeterinarioBD.Gen().criaTable();
    }
    
    //Singleton
}
