/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje3bl3;

import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class Eje3bl3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       char letra;
       letra= JOptionPane.showInputDialog("Digite una letra: ").charAt(0);
       
       if (Character.isUpperCase(letra)){
       JOptionPane.showMessageDialog(null, "Es una letra MAYUSCULA");
       }else{
       JOptionPane.showMessageDialog(null, "Es una letra minuscula");  
               }
       
       
    }
    
}
