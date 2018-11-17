/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje9bl3;

import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class Eje9bl3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //dia mes y año
       int dia, mes, year;
       
        dia= Integer.parseInt(JOptionPane.showInputDialog("Digite el dia: "));
        mes= Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));
        year= Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));

        if ((dia>=1)&&(dia<=30)){
            if((mes>=1)&&(mes<=12)){
                if  (year !=0){
                    JOptionPane.showMessageDialog(null, "FECHA CORRECTA");
                        }else{
                        JOptionPane.showMessageDialog(null, "La fecha es incorrecta, Año Incorrecto ");
                        }
            }else{
                JOptionPane.showMessageDialog(null, "La fecha es incorrecta, MES incorrecto ");
                }
        }else{      
            JOptionPane.showMessageDialog(null, "La fecha es incorrecta, dia incorrecto ");
        }  
    }
    
}
