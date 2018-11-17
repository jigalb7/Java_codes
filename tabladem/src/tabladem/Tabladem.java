/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabladem;

import javax.swing.JOptionPane;

/**
 *
 * @author TS nivel 2
 */
public class Tabladem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, multip=1;

        numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entre 0 y 10: "));
        
        for(int i=1; i<=10; i++)
        {
         if((numero>=0)|| (numero<=10)){
         multip=numero*i;
            System.out.println(numero+" * "+i+" = "+multip);
        multip++;
         }else{
             System.out.println("ER%0R Numero menor que CERO o mayor que 10");
         }   
        }
        /*
        CON DO WHILE
        int numero;
        do{
        numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entre 0 y 10: "));
        
        }while(numero<0 || numero>10);
        System.out.println("La tabla de multiplicar del numero es: ");
         for(int i=1; i<=12; i++){
        System.out.println(numero+" * "+i+" = "+numero*i);
        
        }
        */
        
        
        
    }
    
}
