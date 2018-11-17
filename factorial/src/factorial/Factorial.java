/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class Factorial {

    /**
     * @param args the c3ommand line arguments
     */
    public static void main(String[] args) {
        long numero,producto=1;
        numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));

        for(int i=1; i<=numero; i++){
        producto *= i;}
    
    System.out.println("EL FACTORIAL DE SU NUMERO ES: "+producto);
    }
}
