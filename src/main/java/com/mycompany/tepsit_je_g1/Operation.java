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
public abstract class Operation { 
    protected Result result = new Result();
    public abstract Result execute(double n1, double n2);
    
    public static Operation autoDefine(char operation)
    {
        if(operation == '+')
            return new Addition();
        else if(operation == '-')
            return new Addition();
        else if(operation == '/')
            return new Division();
        else if(operation == '*')
            return new Addition();
        else
            return new Module();
    }
}
