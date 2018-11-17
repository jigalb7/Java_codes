/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje5bl3;

import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class Eje5bl3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int horas,pago,extra;
       horas= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el  numero de Horas trabajadas esta semana: "));
       
       if (horas <= 40){
           pago = horas*16;
       
           JOptionPane.showMessageDialog(null, "El salario de esta semana equivale a : $"+pago);
       }else{
           horas -= 40; /*se restan las 40 horas a las horas que registrre el usuario, debido a que asi tendremos las horas extras, las cuales podremos multiplicar por 20 para obtener cierta cantidad de horas a 20 y cierta cantidad a 16 dolares*/
           extra = horas*20;
           pago = extra+(40*16);
           
           JOptionPane.showMessageDialog(null, "El salario total es: $"+pago+"\n"+"El total de dinero en horas extras es: $"+extra);
       }
        
        
        
        
    }
    
}
