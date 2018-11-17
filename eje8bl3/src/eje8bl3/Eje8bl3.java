/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje8bl3;

import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class Eje8bl3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        
        num= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entre 0 y 99999: "));
        
        if(num<10){
         JOptionPane.showMessageDialog(null, "Su numero tiene 1 digito");
        }else if ((num<100) &&(num>=10)) { JOptionPane.showMessageDialog(null, "Su numero tiene 2 digitos");
        }else if ((num<1000) && (num>=100)) { JOptionPane.showMessageDialog(null, "Su numero tiene 3 digitos");
        }else if ((num<10000) && (num>=1000)) { JOptionPane.showMessageDialog(null, "Su numero tiene 4 digitos");
        }else if ((num<100000) && (num>=10000)) { JOptionPane.showMessageDialog(null, "Su numero tiene 5 digitos");
        }else{
            JOptionPane.showMessageDialog(null, "su numero se sale de los limites :c");
            }
        
    }
    
}
