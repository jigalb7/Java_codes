/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje13bl3;

import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class Eje13bl3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Cajero
        int opcion, total,ini=1000;
        
      opcion = Integer.parseInt(JOptionPane.showInputDialog("Tiene $1000 \n ¿QUE DESEA HACER? Ingrese el numero de la operacion que desea ejecutar\n 1.Ingresar dinero a la cuenta \n 2.Retirar dinero a la cuenta \n 3.Salir"));
      
      switch (opcion){
          case 1:
      total = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto dinero quiere Ingresar?"));
      total +=1000;
      JOptionPane.showMessageDialog(null, "SU SALDO ES: "+total);
              break;
          case 2:
      total = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto dinero quiere Retirar?"));
      ini-= total;
      if (ini>0){
      JOptionPane.showMessageDialog(null, "SU SALDO ES: "+ini);}
      else { 
        JOptionPane.showMessageDialog(null, "NO PUEDE SACAR MAS DEL DINERO QUE TIENE EN SU CUENTA");}
              break;
          case 3:
              JOptionPane.showMessageDialog(null, "FELIZ DIA! ");
              break;
          default:
              JOptionPane.showMessageDialog(null, "Por favor revise los valores de entrada!");
              break;
              
      }
        
    }
    
}
