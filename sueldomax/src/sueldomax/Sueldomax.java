/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sueldomax;

import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class Sueldomax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nsueldos;
        float sueldo, sueldomax=0;
    
    nsueldos=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de sueldos: "));
    
    for(int i=1; i<=nsueldos ;i++){
    sueldo=Float.parseFloat(JOptionPane.showInputDialog("Digite el sueldo "+i+": "));
    
    if(sueldo>sueldomax){
        sueldomax=sueldo;
    }
    }
        System.out.println("El sueldo maximo es: "+sueldomax);
    }
    
}
