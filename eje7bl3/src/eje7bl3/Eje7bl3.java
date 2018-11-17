/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje7bl3;

import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class Eje7bl3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int n1, n2, n3;
      n1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
      n2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un segundo numero: "));
      n3=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un tercer numero: "));
    
    if ((n1>n2)&&(n2>n3)&&(n1>n3)){
    JOptionPane.showMessageDialog(null, "Los numeros ordenados de mayor a menor son: "+n1+", "+n2+" y "+n3);
    }else if((n1>n2)&&(n3>n2)&&(n1>n3)){
    JOptionPane.showMessageDialog(null, "Los numeros ordenados de mayor a menor son: "+n1+", "+n3+" y "+n2);
    }else if((n2>n1)&&(n1>n3)&&(n2>n3)){
    JOptionPane.showMessageDialog(null, "Los numeros ordenados de mayor a menor son: "+n2+", "+n1+" y "+n3);
    }else if((n2>n1)&&(n3>n1)&&(n2>n3)){
    JOptionPane.showMessageDialog(null, "Los numeros ordenados de mayor a menor son: "+n2+", "+n3+" y "+n1);
    }else if((n3>n1)&&(n1>n2)&&(n3>n2)){
    JOptionPane.showMessageDialog(null, "Los numeros ordenados de mayor a menor son: "+n3+", "+n1+" y "+n2);
    }else if((n3>n1)&&(n2>n1)&&(n3>n2)){
    JOptionPane.showMessageDialog(null, "Los numeros ordenados de mayor a menor son: "+n3+", "+n2+" y "+n1);
    }else{
    JOptionPane.showMessageDialog(null, "TIENEN QUE SER 3 NUMEROS DIFERENTES :V");
    }
    
    }
}