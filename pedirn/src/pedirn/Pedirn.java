/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedirn;

import javax.swing.JOptionPane;

/**
 *
 * @author TS nivel 2
 */
public class Pedirn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        n= Integer.parseInt(JOptionPane.showInputDialog("Ingrese en numero para contar desde 1 hasta su numero: "));
       for(int i=1; i<=n; i++){
           System.out.println(i);
       }
       /*en while 
        int n, i=1;
       n= Integer.parseInt(JOptionPane.showInputDialog("Ingrese en numero para contar desde 1 hasta su numero: "));
       while(i<=numero){
           System.out.println(i);
       i++; 
       }
       */
    }
    
}
