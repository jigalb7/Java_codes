/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje11bl3;

import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class Eje11bl3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Calculator
        int n1, n2, resultado;
        char S,s,R,r,P,p,M,m,D,d, letra;
       letra = JOptionPane.showInputDialog("Inserte una letra \n 'S' para suma\n 'R' para resta \n 'P o M' para multiplicacion \n 'D' para division").charAt(0);
       
        switch (letra) {
            case 's':
            case 'S':
                n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
                n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
                resultado= n1+n2;
                JOptionPane.showMessageDialog(null, "La suma es: "+resultado);
                break;
            case 'r':
            case 'R':
                n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
                n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
                resultado= n1-n2;
                JOptionPane.showMessageDialog(null, "La resta es: "+resultado);
                break;
            case 'p':
            case 'P':
            case 'm':
            case 'M':
                n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
                n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
                resultado= n1*n2;
                JOptionPane.showMessageDialog(null, "La Multiplicación es: "+resultado);
                break;
            case 'd':
            case 'D':
                n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
                n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
                resultado= n1/n2;
                JOptionPane.showMessageDialog(null, "La Division es: "+resultado);
                break;
            default:
                letra=JOptionPane.showInputDialog("Ingrese Una de las letras que acciona las operaciones:\n 'S' para suma\n 'R' para resta \n 'P o M' para multiplicacion \n 'D' para division").charAt(0);
        switch (letra) {
            case 's':
            case 'S':
                n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
                n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
                resultado= n1+n2;
                JOptionPane.showMessageDialog(null, "La suma es: "+resultado);
                break;
            case 'r':
            case 'R':
                n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
                n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
                resultado= n1-n2;
                JOptionPane.showMessageDialog(null, "La resta es: "+resultado);
                break;
            case 'p':
            case 'P':
            case 'm':
            case 'M':
                n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
                n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
                resultado= n1*n2;
                JOptionPane.showMessageDialog(null, "La Multiplicación es: "+resultado);
                break;
            case 'd':
            case 'D':
                n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
                n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
                resultado= n1/n2;
                JOptionPane.showMessageDialog(null, "La Division es: "+resultado);
                break;
            default:
                break;
        }
break;
        }
    }     
}
    

