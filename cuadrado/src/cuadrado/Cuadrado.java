/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadrado;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class Cuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, cuadrado;
        n= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para encontrar su cuadrado: "));
       
        while(n>=0){
        cuadrado= (int)Math.pow(n, 2);
       JOptionPane.showMessageDialog(null, "El cuadrado de su numero: "+n+" es: "+cuadrado);     
        n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para enontrar su cuadrado"));
        }
        
        
        
        
        
    }
    
}
