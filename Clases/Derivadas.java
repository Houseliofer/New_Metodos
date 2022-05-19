/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import org.lsmp.djep.djep.DJep;
import org.lsmp.djep.djep.PartialDerivative;
import org.nfunk.jep.Node;

/**
 *
 * @author house
 */
public class Derivadas {
    
    private String funcion = "";
    
    PartialDerivative parcial;
    DJep djep;
    Node nodoFuncion;
    Node nodoDerivada;
    
    public Derivadas(){
        //...
    }

    public void derivarX() throws org.nfunk.jep.ParseException{
        try{
            djep = new DJep();
            djep.addStandardFunctions();
            djep.addStandardConstants();
            djep.addComplex();
            djep.setAllowAssignment(true);
            djep.setAllowUndeclared(true);
            djep.setImplicitMul(true);
            djep.addStandardDiffRules();
            
            this.nodoFuncion = this.djep.parse(this.funcion);
            
            Node diff = this.djep.differentiate(nodoFuncion, "x");
            
            this.nodoDerivada = this.djep.simplify(diff);
            
            this.funcion = this.djep.toString(diff);
            
        }catch(Exception e){
            System.out.println("Error");
        }
    }
    
    public void derivarY() throws org.nfunk.jep.ParseException{
        try{
            djep = new DJep();
            djep.addStandardFunctions();
            djep.addStandardConstants();
            djep.addComplex();
            djep.setAllowAssignment(true);
            djep.setAllowUndeclared(true);
            djep.setImplicitMul(true);
            djep.addStandardDiffRules();
            
            this.nodoFuncion = this.djep.parse(this.funcion);
            
            Node diff = this.djep.differentiate(nodoFuncion, "y");
            
            this.nodoDerivada = this.djep.simplify(diff);
            
            this.funcion = this.djep.toString(diff);
            
        }catch(Exception e){
            System.out.println("Error");
        }
    }
    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }
    
}
