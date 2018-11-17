/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma10;

import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class Suma10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, suma=0;
        for(int a=1; a<=10; a++){
        numero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese Un numero: "));
        suma+=numero;
        }
        System.out.println("La suma de los 10 numeros son: "+suma);
        
    }
    
}
