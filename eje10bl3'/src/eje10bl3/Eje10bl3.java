/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje10bl3;

import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class Eje10bl3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia, mes, year;
        
        dia= Integer.parseInt(JOptionPane.showInputDialog("Digite el dia: "));
        mes= Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));
        year= Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));

        if (year ==0){
        JOptionPane.showMessageDialog(null, "Fecha Incorrecta");
        }
        else if((mes == 2)&&(dia>=1) && (dia<=28 )){
            JOptionPane.showMessageDialog(null, "Fecha correcta");
        }
        else if((mes== 4 || mes==6 || mes==9|| mes==11) && (dia>=1 && dia<=30))
        {
            JOptionPane.showMessageDialog(null, "FECHA CORRECTA");
        }else if((mes==1 || mes==3 || mes==5 || mes==7 || mes==8|| mes==10|| mes==12) &&(dia>=1 && dia<=31))
        {
            JOptionPane.showMessageDialog(null, "FECHA CORRECTA");
        }else{
            JOptionPane.showMessageDialog(null, "FECHA HORRIBLEMENTE INCORRECTA");
        }
    
    }
}
