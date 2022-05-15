package Clases.metodos;

import java.text.DecimalFormat;

public class InterpolacionCuadratica {
    private float x,x0,x1,x2,fx0,fx1,fx2;
    private float b0,b1,b2,resultado;
    private DecimalFormat formato;
    
    public InterpolacionCuadratica(float x,float x0,float x1, float x2,float fx0,float fx1,
            float fx2){
        
        formato = new DecimalFormat("0.000000");
        this.x = x;
        this.x0 = x0;
        this.x1 = x1;
        this.x2 = x2;
        this.fx0 = fx0;
        this.fx1 = fx1;
        this.fx2 = fx2;
        this.b0 = fx0;
        
    }
    
    private void calcularB1(){
        b1 = (fx1-fx0)/(x1-x0);
    }
    
    private void calcularB2(){
        b2 = (((fx2-fx1)/(x2-x1))-b1)/(x2-x0);
    }
    
    public String calcular(){
        calcularB1();
        calcularB2();
        
        
        resultado = b0+(b1*(x-x0))+(b2*(x-x0)*(x-x1));
        
        return imprimir(resultado);
    }
    

    private String imprimir(float funcion){
        String texto = "X\tX0\tX1\tX2\tf(X0)\tf(X1)\tf(X2)\tb0\tb1\tb2\tf(X)";
        
        texto += "\n"+formato.format(x)+"\t"+formato.format(x0)+"\t"+formato.format(x1)
                        +"\t"+formato.format(x2)+"\t"+formato.format(fx0)+"\t"+
                formato.format(fx1)+"\t"+formato.format(fx2)+"\t"+formato.format(b0)+
                "\t"+formato.format(b1)+"\t"+formato.format(b2)+"\t"+formato.format(funcion);
        return texto;
    }
    
    public float getResultado(){
        return this.resultado;
    }
}
