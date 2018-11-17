/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje15bucles;

import javax.swing.JOptionPane;

/**
 *
 * @author TS nivel 2
 */
public class Eje15bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad, sumaedad=0, conteomayor18=0, contmayor175=0;
        float estatura, sumaestatura=0, mediaedad=0, mediaestatura=0;
        
        for(int i=1; i<=5; i++){
        edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del alumno "+i+": "));
        estatura=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la estatura del alumno "+i+": "));
       
        sumaedad+=edad;
        sumaestatura+=estatura;
        
        if(edad>18){
        conteomayor18++;
        }
        
        if(estatura>1.75){
        contmayor175++;
        }
        
        mediaedad= (float)sumaedad/5;
        mediaestatura= (float)sumaestatura/5;
        }
        
        System.out.println("La media de  edad es: "+mediaedad);
         System.out.println("La media de estatura es: "+mediaestatura);
          System.out.println("Cantidad de alumnos mayores de edad: "+conteomayor18);
           System.out.println("Cantidad de alumnos que miden mas de 1.75: "+contmayor175);
        }
         
       
        
    }
    

