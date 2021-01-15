package com.mycompany.tepsit_je_g1;
/**
 * Classe per eseguire la divisione
 */
public class Division extends Operation{

    public Division() {}
    /**
     * esegue l'operazione della classe tra i due parametri restituendo un istanza Result
     */
    @Override
    public Result execute(double n1, double n2) {
       try
       {
            result.number = n1 / n2;
       }
       catch(Exception e)
       {
            result.error = "errore(probabile grandezza non supportata)";
       }
       return result;
    }
    
}
