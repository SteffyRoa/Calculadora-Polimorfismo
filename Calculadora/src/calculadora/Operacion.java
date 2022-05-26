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
public class Operacion {
    
    int x;
    int y;
    
    public Operacion (int x, int y){
        super();
        this.x=x;
        this.y=y;
    }
    
    
    int ejecuta(){
        return 0;
        
    }
    
    @Override
    public String toString(){
        return "Operacion [x="+x + ",y="+y+ "]";
        
    }
}
