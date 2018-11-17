/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgwhile;

import java.util.Scanner;

/**
 *
 * @author TS nivel 2
 */
public class While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x=1, contador;
        System.out.println("Cuantos numeros quieres en la pantalla");
        contador = entrada.nextInt();
         
          while(x<=contador){
         System.out.println(x);
         x++;
        }        
    }
    
}
