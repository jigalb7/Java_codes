package horas;

import java.util.Scanner;

 /* @author Jonathan*/
public class Horas {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int horastot, sem, dias, horas;
        System.out.println("Digite el numero de Horas: ");
        horastot=entrada.nextInt();
        
        sem=horastot/168;
        dias= horastot%168/24;
        horas= horastot%24;
        System.out.println("El equivalente es:");
        System.out.println("semanas: "+sem);
        System.out.println("Dias: "+dias);
        System.out.println("Horas: "+horas);
        
    }    
}
