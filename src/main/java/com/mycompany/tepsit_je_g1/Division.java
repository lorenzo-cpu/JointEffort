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
public class Division extends Operation{

    /**
     * questo è un semplice java doc
     */
    public Division() {
    }
 
    @Override
    public Result execute(double n1, double n2) {
        
       try
       {
           result.number = n1 / n2;
       }
       catch(Exception e)
       {
           
           if(n2 == 0)
               result.error = "impossibile diveidere per 0";
           else 
               result.error = "è presnete un'errore";
       }
       
       return result;
       
    }
    
}
