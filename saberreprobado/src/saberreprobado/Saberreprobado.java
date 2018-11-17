/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saberreprobado;

import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class Saberreprobado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int reprobado=0;
        float calif;
       for(int i=1; i<=5; i++){
        do{calif=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota del alumno "+i+": "));
        }while(calif<0 || calif > 10);
        
        if(calif<=5){
        reprobado++;
        }
       }
       if(reprobado>0){
        System.out.println("Hay "+reprobado+" alumno/s reprobado/s");
    }else{
           System.out.println("NO Hay reprobados");}
    }
    
}
