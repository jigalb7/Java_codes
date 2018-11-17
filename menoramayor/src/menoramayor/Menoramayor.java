/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menoramayor;

import javax.swing.JOptionPane;

/**
 *
 * @author TS nivel 2
 */
public class Menoramayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //de mayor a menor
        int n1, n2, n3;
       
        n1=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Digite un segundo numero: "));
        n3=Integer.parseInt(JOptionPane.showInputDialog("Digite un tercer numero: "));
        
        if ((n1>n2)&&(n2>n3)){
        JOptionPane.showMessageDialog(null, "LOS NUMEROS ORDENADOS DE MAYOR A MENOR serian: "+n1+" , "+n2+" , "+n3);
        } else if ((n1>n2)&&(n3>n2)){
        JOptionPane.showMessageDialog(null, "LOS NUMEROS ORDENADOS DE MAYOR A MENOR serian: "+n1+" , "+n3+" , "+n2);
        }else if ((n2>n1)&&(n1>n3)){
        JOptionPane.showMessageDialog(null, "LOS NUMEROS ORDENADOS DE MAYOR A MENOR serian: "+n2+" , "+n1+" , "+n3);
        }else if ((n2>n1)&&(n3>n1)){
        JOptionPane.showMessageDialog(null, "LOS NUMEROS ORDENADOS DE MAYOR A MENOR serian: "+n2+" , "+n3+" , "+n1);
        }else if ((n3>n2)&&(n2>n1)){
        JOptionPane.showMessageDialog(null, "LOS NUMEROS ORDENADOS DE MAYOR A MENOR serian: "+n3+" , "+n2+" , "+n1);
        }else if ((n3>n1)&&(n1>n2)){
        JOptionPane.showMessageDialog(null, "LOS NUMEROS ORDENADOS DE MAYOR A MENOR serian: "+n3+" , "+n1+" , "+n2);
        }else{
        JOptionPane.showMessageDialog(null, "Esto no saldrá NUNCA");}
        
    }
    
}
