package com.mycompany.tepsit_je_g1;

public class Substraction extends Operation{
    public Substraction() {}

    @Override
    public Result execute(double n1, double n2) {
        try
        {
            result.number = n1 - n2;
            if(result.number == Double.POSITIVE_INFINITY)
               throw new Exception();
        }
        catch(Exception e)
        {
            result.error = "errore(probabile grandezza non supportata)";
        }

        return result;
    }
}
