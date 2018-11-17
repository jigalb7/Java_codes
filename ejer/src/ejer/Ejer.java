/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer;

import javax.swing.JOptionPane;

/**
 *
 * @author TS nivel 2
 */
public class Ejer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int caracter;
        caracter =Integer.parseInt(JOptionPane.showInputDialog("Digite un Numero"));
        JOptionPane.showMessageDialog(null, (caracter=='x') ? "Es par" : "Es impar");
        
    }
    
}
