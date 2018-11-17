/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje14bucles;

import javax.swing.JOptionPane;

/**
 *
 * @author TS nivel 2
 */
public class Eje14bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float x, sumasueldos=0;
       int xcounter=0;
       for(int i=1; i<=10; i++){
       x= Float.parseFloat(JOptionPane.showInputDialog("Ingrese el "+i+" dato: "));
      
       if(x>1000){
       xcounter++;
       }
       sumasueldos+= (float)x;
       }
       
        System.out.println("La suma de los sueldos es: "+sumasueldos);
        System.out.println("Y hay "+xcounter+" sueldos mayores que $1000");
    }
    
}
