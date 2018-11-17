/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje2bl3;

import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class Eje2bl3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1, n2;
        
        n1= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        n2= Integer.parseInt(JOptionPane.showInputDialog("Ingrese OTRO numero"));
        
        if(n1 > n2){
        JOptionPane.showMessageDialog(null, "El numero mayor es: "+n1);
        }else
            if (n2 > n1){
        JOptionPane.showMessageDialog(null, "El numero mayor es: "+n2);
        }else{
        JOptionPane.showMessageDialog(null, n1+" y "+n2+" Son iguales");
        }
    
    }
    
}
