/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13ciclos;

import javax.swing.JOptionPane;

/**
 *
 * @author TS nivel 2
 */
public class Ejercicio13ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, sumapos=0, conteoposi=0, sumaneg=0, conteoneg=0, conteoceros=0;
        float mediaposi, medianega;
        
        for(int i=1; i<=10; i++){
        numero=Integer.parseInt(JOptionPane.showInputDialog("Digite Un Numero: "));
        
            if(numero==0){
                conteoceros++;
            }
            else if(numero>0){
                sumapos+=numero;
                conteoposi++;
            }else{
            sumaneg+=numero;
            conteoneg++;
            }
        }
        
        if(conteoposi==0){
            System.out.println("NO SE PUEDE SACAR LA MEDIA PARA LOS POSITIVOS");
        }else{
        mediaposi= (float)sumapos/conteoposi;
            System.out.println("La media de los positivos es: "+mediaposi);
        }
        
         if(conteoneg==0){
            System.out.println("NO SE PUEDE SACAR LA MEDIA PARA LOS NEGATIVOS");
        }else{
        medianega= (float)sumaneg/conteoneg;
            System.out.println("La media de los positivos es: "+medianega);
        }
        
        System.out.println("La cantidad de ceros es: "+conteoceros); 
    }
    
}
