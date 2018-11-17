/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package difneg;

import javax.swing.JOptionPane;

/**
 *
 * @author TS nivel 2
 */
public class Difneg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, l=0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Un numero: "));
    while (numero>=0){
    l+=1;
    numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Un numero: "));
    }
        JOptionPane.showMessageDialog(null,"La cantidad de numeros ingresados fueron "+l);
    }
    
}
