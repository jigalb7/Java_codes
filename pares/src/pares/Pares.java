/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pares;

import javax.swing.JOptionPane;

/**
 *
 * @author TS nivel 2
 */
public class Pares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1, n2;
        
        n1= Integer.parseInt(JOptionPane.showInputDialog("Digite un numeo"));
        n2= Integer.parseInt(JOptionPane.showInputDialog("Digite un numeo"));
        
        if ((n1%2==0) && (n2%2==0)){ 
        JOptionPane.showMessageDialog(null, "Ambos numeros son PARES!");
        }else{
        JOptionPane.showMessageDialog(null, "Alguno de los numeros es impar o ambos lo son!");
        }
        
    }
    
}
