package Clases.metodos;

import Clases.Funcion;
import java.text.DecimalFormat;

public class Trapecio {    
    private DecimalFormat formato;
    
    public String calcular(Funcion funcion,int n,float a, float b){
        formato = new DecimalFormat("0.000000");
        
        float resultado = 0;
        float[] xi = new float[n+1];
        
        for(int i = 0; i <= n; i++){
            if(i==0)
                xi[i] = a;
            else
                xi[i] = xi[i-1] + ValorH(a,b,n);
            if(i!=0 && i!=n)
                resultado += 2 * funcion.evaluar(xi[i]);
            else
                resultado += funcion.evaluar(xi[i]);
            
        }
        resultado *= (ValorH(a,b,n)/2);
        return formato.format(resultado);
    }
    
    private float ValorH(float a, float b, int n){
        return (b-a)/n;
    }
    
}
