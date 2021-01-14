package com.mycompany.tepsit_je_g1;

public class Addition extends Operation{

    public Addition()
    {
       
    }
    
    @Override
    public Result execute(double n1, double n2) {
       try
       {
           result.number = n1 + n2;
       }
       catch(Exception e)
       {
               result.error = "errore(probabile grandezza non supportata)";
       }
       
       return result;
    }
}
