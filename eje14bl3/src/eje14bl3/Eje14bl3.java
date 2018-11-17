/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje14bl3;

import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class Eje14bl3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float peso;
        int opcion;
        peso= Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad en Kg"));
   
        opcion = Integer.parseInt(JOptionPane.showInputDialog("MENU \n"
                + "1 - Hectogramos\n"
                + "2 - Decagramos\n"
                + "3 - Gramos\n"
                + "4 - Decigramos\n"
                + "5 - Centigramos\n"
                + "6 - Miligramos\n"));
    
    switch (opcion){
        case 1:
            peso *=10;
            JOptionPane.showMessageDialog(null, "La medida en Hectogramos es: "+peso);
            break;
        case 2:
            peso *=100;
            JOptionPane.showMessageDialog(null, "La medida en Decagramos es: "+peso);
            break;
        case 3:
            peso *=1000;
            JOptionPane.showMessageDialog(null, "La medida en Gramos es: "+peso);
            break;
        case 4:
            peso *=10000;
            JOptionPane.showMessageDialog(null, "La medida en Decigramos es: "+peso);
            break;
        case 5:
            peso *=100000;
            JOptionPane.showMessageDialog(null, "La medida en Centigramos es: "+peso);
            break;
        case 6:
            peso *=1000000;
            JOptionPane.showMessageDialog(null, "La medida en Miligramos es: "+peso);
            break;
        default:
            JOptionPane.showMessageDialog(null, "ErRoR 42"); 
            break;
    }
    
    
    }
    
}
