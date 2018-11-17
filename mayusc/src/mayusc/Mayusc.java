/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayusc;

import javax.swing.JOptionPane;

/**
 *
 * @author TS nivel 2
 */
public class Mayusc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char letra;
        letra= JOptionPane.showInputDialog("Escriba una letra: ").charAt(0);
        
        if(Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null, "Es Mayucula");
        
        
        }else{
        JOptionPane.showMessageDialog(null, "Es Minuscula");
        
        }
        
        
    }
    
}
