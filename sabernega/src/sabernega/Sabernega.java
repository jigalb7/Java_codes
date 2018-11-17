/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sabernega;

import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class Sabernega {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, negacounter=0;
        for(int i=1;i<=10;i++){
        numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el "+i+" numero"));
        if(numero<0){
        negacounter++;}
        }
        if(negacounter>0){
            System.out.println("SI HAY NEGATIVOS y son: "+negacounter);
        }else{
            System.out.println("NO HAY NUMEROS NEGATIVOS");
        }
        
    }
    
}
