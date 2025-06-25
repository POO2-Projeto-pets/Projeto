/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author leonc
 */
public class Conexao {
    private static final String driver = "org.postgresql.Driver";
    public static boolean testeConexao(String url, String user, String senha){
        try{
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url,user,senha);
            con.close();
            return true;
        }catch(ClassNotFoundException | SQLException e){
            return false;
        }
    }
}
