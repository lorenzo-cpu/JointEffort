package com.mycompany.tepsit_je_g1;
/**
 * Classe per la gestione del risultato
 */
public class Result {
    public double number;
    public String error;

    public Result() {
        error = "null";
    }
    /**
     * restituisce il valore del risultato o l'errore in caso sia presente
     */
    @Override
    public String toString()
    {
         if(error.equals("null"))
            return "" + number;
        else
            return "" + error;
    }
}
