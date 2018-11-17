/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forf;

import java.util.Scanner;

/**
 *
 * @author Jonathan
 */
public class Forf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int contador;
        System.out.println("Ingrese los numeros");
        contador = entrada.nextInt();
        
        for(int i=1; i<=contador; i++){
            System.out.println(i);
        }
        
    }
    
}
