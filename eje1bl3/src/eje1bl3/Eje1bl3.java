/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje1bl3;

import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class Eje1bl3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int numero;
      numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
    
      if (numero%10==0){
       JOptionPane.showMessageDialog(null, "Numero "+numero+" es multiplo de 10");
    }else{
       JOptionPane.showMessageDialog(null, "Numero no es multiplo de 10");
      }
    }
    
}
