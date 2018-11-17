/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivina;

import javax.swing.JOptionPane;

/**
 *
 * @author TS nivel 2
 */
public class Adivina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int numero, aleatorio,contador=0;
         aleatorio=(int)(Math.random()*100);
 
    do{
    numero=Integer.parseInt(JOptionPane.showInputDialog("Digite Un Número: "));
    
        if (aleatorio>numero){
            System.out.println("DIGITE UN NUMERO MAYOR");    
        }else{
            System.out.println("DIGITE UN NUMERO MENOR");
        }
        contador++;
    }while(numero!=aleatorio);
        System.out.println("\nEXCELENTE adivinaste el numero en: "+contador+" intentos");
    }
    
}
