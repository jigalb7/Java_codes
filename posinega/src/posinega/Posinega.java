/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posinega;

import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class Posinega {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para ver si es:\n positivo o negativo\n El programa finalizará al ingresar '0' "));
    
    while(numero!=0){
        if(numero>0){
        
        JOptionPane.showMessageDialog(null, "Numero Positivo");
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para ver si es:\n positivo o negativo\n El programa finalizará al ingresar '0' "));
    
        }else{
        JOptionPane.showMessageDialog(null, "Numero Negativo");
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para ver si es:\n positivo o negativo\n El programa finalizará al ingresar '0' "));
        }
    
    }
    
    
    
    
    }
    
}
