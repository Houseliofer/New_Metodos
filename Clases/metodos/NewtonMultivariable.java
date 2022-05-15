
package Clases.metodos;

import Clases.Funcion;
import java.text.DecimalFormat;

public class NewtonMultivariable {
    private DecimalFormat formato;
    private float x0,y0,error;
    private Funcion funcion1,funcion2,funcion1DCRX,funcion1DCRY,funcion2DCRX,funcion2DCRY;
    private String iteraciones;
    
    public NewtonMultivariable(Funcion funcion1,Funcion funcion2,Funcion funcion1DCRX,
            Funcion funcion1DCRY,Funcion funcion2DCRX,Funcion funcion2DCRY,float x0,
            float y0,float error){
        
        formato = new DecimalFormat("0.000000");
        
        this.funcion1 = funcion1;
        this.funcion2 = funcion2;
        this.funcion1DCRX = funcion1DCRX;
        this.funcion1DCRY = funcion1DCRY;
        this.funcion2DCRX = funcion2DCRX;
        this.funcion2DCRY = funcion2DCRY;
        this.x0 = x0;
        this.y0 = y0;
        this.error = error;
    }
    
    public void calcular(){
        String texto = "";
        float x1 = x0,y1 = y0;int k = 0;
        float calcuX,deltaX,calcuY,deltaY;
        
        texto = "No\tX0\tY0\tf1\tf2\tfx(1)\tfy(1)\tfx(2)\tfy(2)\tDelta X\tDelta Y\tXi+1\tYi+1\tepx\tepy";
        iteraciones = texto;
        do{
            
            deltaX = calcularDeltaX(x1,y1);
            deltaY = calcularDeltaY(x1,y1);
            
            
            calcuX = calcularError(calcularXi(deltaX,x1),x1);
            calcuY = calcularError(calcularYi(deltaY,y1),y1);
            
            texto ="\n"+(k+1)+"\t"+formato.format(x1)+"\t"+formato.format(y1)+"\t"+
                    formato.format(funcion1.evaluarDoble(x1, y1))+"\t"+
                    formato.format(funcion2.evaluarDoble(x1, y1))+
                    "\t"+formato.format(funcion1DCRX.evaluarDoble(x1, y1))+"\t"+
                    formato.format(funcion1DCRY.evaluarDoble(x1, y1))+"\t"+
                    formato.format(funcion2DCRX.evaluarDoble(x1, y1))+"\t"+
                    formato.format(funcion2DCRY.evaluarDoble(x1, y1))+"\t"+
                    formato.format(deltaX)+"\t"+formato.format(deltaY)+"\t";
            
            x1 = calcularXi(deltaX,x1);
            y1 = calcularYi(deltaY,y1);
            
            texto += formato.format(x1)+"\t"+formato.format(y1)+"\t"+formato.format(calcuX)+
                    "\t"+formato.format(calcuY);
            iteraciones += texto;
            k++;
        }while(calcuX>error&&calcuY>error);
    }
    
    private float calcularDeltaX(float x, float y){
        float deltaX;
        deltaX = (-(funcion1.evaluarDoble(x, y)*(funcion2DCRY.evaluarDoble(x, y)))
                +(funcion2.evaluarDoble(x, y)*(funcion1DCRY.evaluarDoble(x, y))))
                / ((funcion1DCRX.evaluarDoble(x, y)*funcion2DCRY.evaluarDoble(x, y))-
                (funcion2DCRX.evaluarDoble(x, y)*funcion1DCRY.evaluarDoble(x, y)));
        return deltaX;
    }
    
    private float calcularDeltaY(float x, float y){
        float deltaY;
        deltaY = (-(funcion2.evaluarDoble(x, y)*funcion1DCRX.evaluarDoble(x, y))+
                (funcion1.evaluarDoble(x, y)*funcion2DCRX.evaluarDoble(x, y))) 
                / ((funcion1DCRX.evaluarDoble(x, y)*funcion2DCRY.evaluarDoble(x, y))
                -(funcion2DCRX.evaluarDoble(x, y)*funcion1DCRY.evaluarDoble(x, y)));
        return deltaY;
    }
    
    private float calcularXi(float deltaX,float xi){
        float nuevoXi;
        nuevoXi = deltaX + xi;
        return nuevoXi;
    }
    
    private float calcularYi(float deltaY,float yi){
        float nuevoYi;
        nuevoYi = deltaY + yi;
        return nuevoYi;
    }
    
    private float calcularError(float xrActual,float xrAnterior){
        float errorCalculado;
        errorCalculado = Math.abs((xrActual-xrAnterior)/xrActual)*100;
        return errorCalculado;
    }
    public String getIteraciones(){
        return iteraciones;
    }
}
