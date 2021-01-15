package com.mycompany.tepsit_je_g1;
/**
 * Classe per la gestione delle operazioni
 */
public abstract class Operation { 
    protected Result result = new Result();
    /**
     * esegue l'operazione della classe tra i due parametri restituendo un istanza Result
     */
    public abstract Result execute(double n1, double n2);
    /**
     * restituisce l'operazione in base al segno passato per parametro
     */
    public static Operation autoDefine(char operation)
    {
        if(operation == '+')
            return new Addition();
        else if(operation == '-')
            return new Subtraction();
        else if(operation == '/')
            return new Division();
        else if(operation == '*')
            return new Moltiplication();
        else if(operation == '%')
            return new Module();
        else return new Addition();
    }
}
