/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.metodos;

import Clases.Funcion;
import java.text.DecimalFormat;

/**
 *
 * @author house
 */
public class Newton {

    private DecimalFormat formato;
    private String iteraciones;

    public String raiz(Funcion f, double xi, double error, Funcion derivada) {
        formato = new DecimalFormat("0.000000");
        double raiz;
        double x1 = xi, aux = 0, calcu = 100;
        int k = 0;
        String texto = "No\tXi\tf(Xi)\tf'(Xi)\tXi+1\tError";
        iteraciones = texto;

        while (calcu > error) {

            x1 = xi - (f.evaluar(x1) / derivada.evaluar(xi));
            calcu = Math.abs((x1 - xi) / x1) * 100;
            aux = x1;

            texto = "\n" + (k + 1) + "\t" + formato.format(xi) + "\t" + formato.format(f.evaluar(xi)) + "\t" + formato.format(derivada.evaluar(xi))
                    + "\t" + formato.format(x1) + "\t" + formato.format(calcu);

            iteraciones += texto;

            xi = x1;
            k++;
        }
        raiz = x1;
        return formato.format(raiz);
    }

    public String getIteraciones() {
        return iteraciones;
    }
}
