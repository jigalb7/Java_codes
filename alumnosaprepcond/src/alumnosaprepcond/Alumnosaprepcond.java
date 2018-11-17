/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnosaprepcond;

import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class Alumnosaprepcond {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota, contadorapp=0, contadorrep=0,contadorcondi=0;
        for(int a=1; a<=6; a++){
            do{
            nota=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota del alumno "+a+": "));
            }while(nota<0 || nota>10);
                if(nota>=5){
                    contadorapp++;
                }
                if(nota==4){
                    contadorcondi++;
                }
                if(nota<=3){
                    contadorrep++;
                }
        }
        System.out.println("REPORTE DE ALUMNOS APROBADOS, CONDICIONADOS O REPROBADOS");
        System.out.println("Los alumnos Aprobados son: "+contadorapp);
        System.out.println("Los alumnos Condicionados son: "+contadorcondi);
        System.out.println("Los alumnos Reprobados son: "+contadorrep);
        
        
    }
    
}
