/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author sroa
 */
public class Suma extends Operacion {
    
    public Suma(int x, int y) {
        super(x, y);
    }
    @Override
    int ejecuta(){
        
        return x+y;
        
    }
    
     @Override
    public String toString(){
        return "Suma [x="+x + ",y="+y+ "]";
        
    }
    
}
