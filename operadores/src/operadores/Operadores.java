
package operadores;

import java.util.Scanner;

public class Operadores {

    public static void main(String[] args) {
        Scanner calif = new Scanner(System.in);
        float nota1,nota2,nota3,suma;
        
        System.out.println("Bienvenido Usuario te solicito que ingreses 3 calificaciones: ");
        nota1 = calif.nextFloat();
        nota2 = calif.nextFloat();
        nota3 = calif.nextFloat();
        
        suma = nota1+nota2+nota3;
        /*sumamos las tres notas*/
        System.out.println("La suma de las 3 notas son: "+suma);
    }
    
}
