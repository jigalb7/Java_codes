/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int codigoart, litros, litrosArt1=0, conteofact=0;
        float precioLitro, importefact, facturacionTotal=0;
        for(int i=1; i<=5; i++){
        codigoart=Integer.parseInt(JOptionPane.showInputDialog("Articulo N"+i+"\nDigite el codigo: "));
        litros=Integer.parseInt(JOptionPane.showInputDialog("Articulo N"+i+"\nDigite la cantidad vendida en litros: "));
        precioLitro=Float.parseFloat(JOptionPane.showInputDialog("Articulo N"+i+"\nDigite el precio por litro: "));
        
        importefact = (float)litros*precioLitro;
        facturacionTotal+=importefact;
            if(codigoart==1){
            litrosArt1+=litros;
                        }
            if(importefact > 600){
            conteofact++;
                        }
        }
        System.out.println("RESUMEN DE VENTAS");
        System.out.println("Facturacion Total: "+facturacionTotal);
        System.out.println("Cantidad vendida en litros: "+litrosArt1);
        System.out.println("Cantidad de Facturas mayores que $600.00: "+conteofact);
        
        
        
    }
    
}
