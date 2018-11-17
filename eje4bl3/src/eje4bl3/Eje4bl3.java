/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje4bl3;

import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class Eje4bl3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float compra,desc;
        compra= Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de la compra"));
                
        if (compra>=300.00){            
            desc=compra*0.2f;
            compra-=desc;
            JOptionPane.showMessageDialog(null, "El descuento total es:"+desc+"\n"+"El total a pagar es: "+compra);
   
   }else{
            JOptionPane.showMessageDialog(null, "El total a pagar es: "+compra);
   
        }
            
            
            
            }
    
}
