/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerospareseimpares;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author TS nivel 2
 */
public class Numerospareseimpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int numero;
        numero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para ser evaluado: "));
        while(numero!=0){
            if (numero%2==0){ System.out.println("Numero "+numero+", PAR");
        }else{
            System.out.println("Numero: "+numero+", IMPAR");
            }
        numero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para ser evaluado: "));
        }
    }
    
}
