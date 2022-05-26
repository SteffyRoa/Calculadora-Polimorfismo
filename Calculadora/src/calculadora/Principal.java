/*
 *POLIMORFISMO
 */
package calculadora;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sroa
 */
public class Principal {

    public static void main(String[] args) {
       Operacion op1 = new Suma(8,4);
       Operacion op2 = new Resta(8,4);
       Operacion op3 = new Multiplicacion(8,4);
       Operacion op4 = new Suma(9,5);
       
       //Creacion de Arraylist
       
       List<Operacion> operaciones = new ArrayList<>();
       
       operaciones.add(op1);
       operaciones.add(op2);
       operaciones.add(op3);
       operaciones.add(op4);
       
       
       for(Operacion op: operaciones){
            System.out.println(op);
           int resultado = op.ejecuta();
           System.out.println(""+resultado);
       }
       
        
        
        
        
        
    }
    
}
