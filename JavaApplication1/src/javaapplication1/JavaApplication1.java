/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author TS nivel 2
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String cadena;
      int entero;
      char letra;
      double decimal;
      
      cadena = JOptionPane.showInputDialog("Digite una cadena: ");
      entero= Integer.parseInt(JOptionPane.showInputDialog("Digite un entero: "));
      letra = JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);
      decimal= Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal: ")) ;
    
    JOptionPane.showMessageDialog(null, "la cadena es: "+cadena);
    JOptionPane.showMessageDialog(null, "el numero entero es: "+entero);
    JOptionPane.showMessageDialog(null, "El caracter es: "+letra);
    JOptionPane.showMessageDialog(null, "El decimal es: "+decimal);
    
    }
    
}
