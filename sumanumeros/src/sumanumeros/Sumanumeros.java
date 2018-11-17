/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumanumeros;

import javax.swing.JOptionPane;

/**
 *
 * @author TS nivel 2
 */
public class Sumanumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeros, total=0;
      
        do{
            numeros = Integer.parseInt(JOptionPane.showInputDialog("Digite Un numero: ")); 
            
            total+=numeros;
             
        }while(numeros!=0);
        System.out.println("La suma de los numeros ingresados es: "+total);
    }
    
}
