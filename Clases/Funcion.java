
package Clases;

import org.nfunk.jep.JEP;

public class Funcion {
    
    private String expresion = "";
    
    
    public Funcion(String expresion){
        this.expresion = expresion;
    }

    
    public double evaluar(double x){ 
        JEP j = new JEP(); 
        j.addStandardFunctions();
        j.addStandardConstants();
        j.addVariable("x", x);
        j.addComplex();
       
        j.setImplicitMul(true);
        j.parseExpression(this.expresion);
       
        if (!j.hasError()) 
           return j.getValue();
        else 
           return Double.NaN;
            
         
    }
    
    public float evaluarDoble(float x, float y){
        JEP j = new JEP();
        j.addStandardFunctions();
        j.addStandardConstants();
        j.addVariable("x", x);
        j.addVariable("y", y);
        j.addComplex();
        
        j.setImplicitMul(true);
        j.parseExpression(this.expresion);
        
        if (!j.hasError())
            return (float)j.getValue();
        else
            return Float.NaN;
    }
     
}

