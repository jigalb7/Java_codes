/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma2;

import java.util.Scanner;

/**
 *
 * @author Jonathan
 */
public class Suma2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner ent = new Scanner(System.in);
       double a,b,total;
       
        System.out.println("Vamos a realizar la suma de (a+b)²: ");
        System.out.println("Ingrese A: ");
        a= ent.nextDouble();
        System.out.println("Ingrese B: ");
        b= ent.nextDouble();
        
        total=Math.pow(a,2) + Math.pow(b, 2) +(2*a*b);
        
        System.out.println("El total es: "+total);
        
       
        
        
    }
    
}
