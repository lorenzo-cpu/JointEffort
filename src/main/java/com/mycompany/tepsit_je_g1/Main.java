package com.mycompany.tepsit_je_g1;
import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        double n1 = 0,n2 = 0;
        Scanner scn = new Scanner(System.in);
        char operator = ' ';
        Operation operation;
        boolean error = false;
        
        do
        {
            System.out.println("Scrivere numero 1");
            try
            {
                n1 = scn.nextDouble();
                error = false;
            }
            catch(Exception e)
            {
                System.out.println("errore");
                error = true;
                scn.next();
            }
                    
        }while(error);
        
        do
        {
            System.out.println("Scrivere numero 2");
            try
            {
                n2 = scn.nextDouble();
                error = false;
            }
            catch(Exception e)
            {
                System.out.println("errore");
                error = true;
                scn.next();
            }
                    
        }while(error);
        do
        {
            System.out.println("Scrivere operazione (+ - / * %)");
            try
            {
                operator = scn.next().charAt(0);
                error = false;
                if(operator != '+' && operator != '-' && operator != '/' && operator != '*' && operator != '%')
                    throw new Exception(); 
            }
            catch(Exception e)
            {
                System.out.println("errore");
                error = true;
                scn.next();
            }
                    
        }while(error);
        
        operation = Operation.autoDefine(operator);
        System.out.println("result ( " + Double.toString(n1) + " " + operator + " " + Double.toString(n2) + " = " + operation.execute(n1, n2).toString() + " )");
    }
}
