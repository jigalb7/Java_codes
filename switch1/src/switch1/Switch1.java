/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switch1;

import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class Switch1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int dato;
      dato= Integer.parseInt(JOptionPane.showInputDialog("INGRESE UN NUMERO ENTRE 1 Y 5"));
    
    switch (dato){
        case 1: JOptionPane.showMessageDialog(null, "El numero es 1");
            break;
        case 2: JOptionPane.showMessageDialog(null, "El numero es 2");
            break;
        case 3: JOptionPane.showMessageDialog(null, "El numero es 3");
            break;
        case 4: JOptionPane.showMessageDialog(null, "El numero es 4");
            break;
        case 5: JOptionPane.showMessageDialog(null, "El numero es 5");
            break;
        default: JOptionPane.showMessageDialog(null, "El numero no esta en el rango de 1 y 5");
            break;
    
    }   
    
    
   
    }
    
}
