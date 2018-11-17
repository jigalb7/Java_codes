/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrosusados;

import java.util.Scanner;

/**
 *
 * @author Jonathan
 */
public class Carrosusados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        String empleado; 
        Integer carro;
        final int salario=1000;
        int carrosv,comi=150;
        float costecarro, salariofin;
        
        
        System.out.println("Ingrese el nombre del empleado: ");
        empleado= entrada.nextLine();
        System.out.println("Ingrese el total de carros vendidos: ");
        carrosv= entrada.nextInt();
        System.out.println("Digite el coste del carro: ");
        costecarro= entrada.nextFloat();
        salariofin=salario+ (comi*carrosv) + (0.05f*costecarro*carrosv);
        System.out.println("El salario del empleado es: "+salariofin);
        
        
        
    }
    
}
