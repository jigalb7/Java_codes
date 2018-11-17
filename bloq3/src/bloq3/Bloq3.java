/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloq3;

import javax.swing.JOptionPane;

/**
 *
 * @author TS nivel 2
 */
public class Bloq3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        String mensaje;
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "DIGITE UN NÚMERO"));
  
        mensaje = (numero%2==0) ? "El numero es par" : "El numero es IMPAR";
        
        JOptionPane.showMessageDialog(null, mensaje);
        
    }
    
}
