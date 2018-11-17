package salarioempleado;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class Salarioempleado {

    public static void main(String[] args) {
        //salario semanal a partir de salario/h
        Scanner horas = new Scanner(System.in);
       int hl,hm,hw,hj,hv,hs, hsemana;
       double phora= 4.5, plun, pmar, pmie, pjue, pvie, psab, salsem;
        System.out.println("Horas de Lunes");
        hl =horas.nextInt();
        System.out.println("Horas de Martes");
        hm =horas.nextInt();
        System.out.println("Horas de Miercoles");
        hw = horas.nextInt();
        System.out.println("Horas de Jueves");
        hj= horas.nextInt();
        System.out.println("Horas de Viernes");
        hv= horas.nextInt();
        System.out.println("Horas de Sabado");
        hs = horas.nextInt();

        //ASIGNACIÓN
        plun= hl*phora;
        pmar= hm*phora;
        pmie= hw*phora;
        pjue= hj*phora;
        pvie= hv*phora;
        psab= hs*phora;
        hsemana= hl+hm+hw+hj+hv+hs;
        salsem=plun+pmar+pmie+pjue+pvie+psab;
        System.out.println("La cantidad de Horas trabajadas en la semana es de: "+hsemana);
        System.out.println("\n El salario semanal es: "+salsem);
      JOptionPane.showMessageDialog(null, "Gracias");
        
        
        
    }   
    
}
