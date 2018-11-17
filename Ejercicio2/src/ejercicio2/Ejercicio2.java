
package ejercicio2;

import java.util.Scanner;



public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner dol = new Scanner(System.in);
        double gui,luis,slg,juan,todos;
        System.out.println("¿Cuantos dolaraes tiene Guillermo?");
        gui = dol.nextDouble();
        luis= gui/2;
        juan= (luis+gui)/2;
        todos=gui+luis+juan;
        System.out.println("La cantidad de dinero de guillermo es: "+gui);
        System.out.println("La de luis es: "+luis);
        System.out.println("la de juan es: " +juan);
        System.out.println("El dinero de todos es = "+todos);
    }
    
}
