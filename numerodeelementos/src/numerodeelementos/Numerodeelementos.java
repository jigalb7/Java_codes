/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerodeelementos;

import javax.swing.JOptionPane;

/**
 *
 * @author TS nivel 2
 */
public class Numerodeelementos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x, nelementos=0, suma=0;
    float media;
    
    x= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
    while (x>=0){
    suma+=x;//suma iterativa
    nelementos++;//aumentamos en 1 a elementos
    x= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
    }
    if(nelementos==0){
        System.out.println("La division entre 0 no existe");    
    }else{
        media= (float) suma/nelementos;
        JOptionPane.showMessageDialog(null, "La media de los "+nelementos+" Ingresados es: "+media);
    }
    
    }
    
}
