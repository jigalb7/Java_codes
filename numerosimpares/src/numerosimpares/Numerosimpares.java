/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosimpares;

/**
 *
 * @author Jonathan
 */
public class Numerosimpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long producto=1;
        
        for(int i=1; i<=20; i+=2){
        producto *= i;
        
        }
        System.out.println("el producto es "+producto);
        
    }
    
}
