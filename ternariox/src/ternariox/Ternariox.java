/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ternariox;

import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class Ternariox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int numero;
      
      numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
      
        
      JOptionPane.showMessageDialog(null, (numero%2==0) ? "Es par" : "Es impar");
     
    }
    
}
