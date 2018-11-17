/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje12bl3;

import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class Eje12bl3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        
        numero= Integer.parseInt(JOptionPane.showInputDialog(" Ingrese la nota del estudiante: "));            
        switch (numero){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                JOptionPane.showMessageDialog(null, "Calificacion Insuficiente");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Calificacion suficiente");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Calificacion Bien");
                break;
            case 7:    
            case 8:   
                JOptionPane.showMessageDialog(null, "Calificacion Notable");
                break;
            case 9:    
            case 10: 
                JOptionPane.showMessageDialog(null, "Calificacion Sobresaliente");
                break;
            default:
                     JOptionPane.showMessageDialog(null, "ERROR");
                break;
        }
        
        
    }
    
}
