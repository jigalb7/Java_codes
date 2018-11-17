
package cuadratica8;

import java.util.Scanner;

/**
 *
 * @author Jonathan
 */
public class Cuadratica8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        double x, x2, a, b, c;
        
        System.out.println("Ecuacion Cuadratica: ");
        System.out.println("Digite el valor para A");
        a = entrada.nextDouble();
        System.out.println("Digite el valor para B");
        b = entrada.nextDouble();
        System.out.println("Digite el valor para C");
        c = entrada.nextDouble();
        
        x= -b + Math.sqrt(Math.pow(b,2) - (4*a*c)) / (2*a);
        x2= -b - Math.sqrt(Math.pow(b,2) - (4*a*c)) / (2*a);
        System.out.println("Resultado1: "+x);
        System.out.println("Resultado2: "+x2);
        
    }
    
}
