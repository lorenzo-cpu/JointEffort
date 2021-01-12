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
public class Result {
    public double number;
    public String error;

    public Result() {
        error = "null";
    }
    
    @Override
    public String toString()
    {
         if(error.equals("null"))
            return "" + number;
        else
            return "" + error;
    }
}
