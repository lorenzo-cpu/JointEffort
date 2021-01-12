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
public class Function{
    
    private double n1, n2;
    private Result result = new Result();
    private Operation operation;
    
    public Function(char operation)
    {
        if(operation == '/')
            this.operation = new Division();
        /*
        else if(operation == '*')
            //inserire operazione
        else if(operation == '-')
           //inserire operazione
        else if(operation == '+')
            //inserire operazione
        else
           //inserire operazione;
        */
    }

    public void calculate()
    {
        result = operation.execute(n1, n2);
    }
    
    public String getResult()
    {
       return "result: " + result.toString();
    }
    
}
