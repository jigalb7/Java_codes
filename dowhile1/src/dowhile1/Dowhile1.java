/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhile1;

/**
 *
 * @author Jonathan
 */
import java.util.Scanner;
public class Dowhile1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i=1, contador;
        System.out.println("Digite la cantidad de numeros que desea: ");
        contador=entrada.nextInt();
        
        do{
            System.out.println(i);
            i++;
        }while(i<=contador);
        
    }
    
}
