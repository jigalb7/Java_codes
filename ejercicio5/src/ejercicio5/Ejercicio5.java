/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Jonathan
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
      float n1,n2,n3,n4, notafinal;
        System.out.println("Ingrese la primera nota");
        n1=entrada.nextFloat();
        System.out.println("Ingrese la segunda nota");
        n2=entrada.nextFloat();
        System.out.println("Ingrese la tercera nota");
        n3=entrada.nextFloat();
        System.out.println("Ingrese la cuarta nota");
        n4=entrada.nextFloat();
        
        n1 *= 0.10f;
        n2 *= 0.25f;
        n3 *= 0.25f;
        n4 *= 0.40f;
        notafinal=n1+n2+n3+n4;
        
        System.out.println("La nota final del alumno es: "+notafinal);
    }
    
}
