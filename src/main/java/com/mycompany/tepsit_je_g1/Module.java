/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tepsit_je_g1;

/**
 *
 * @author utente
 */
public class Module extends Operation{

    public Module() {
    }

    @Override
    public Result execute(double n1, double n2) {
        try
        {
           result.number = n1 % n2;
        }
        catch(Exception e)
        {
            result.error = "errore(probabile grandezza non supportata)";
        }
       
       return result;
    }
    
}
