package Clases.metodos;

import Clases.Funcion;
import java.text.DecimalFormat;

public class ReglaFalsa {

    private DecimalFormat formato;
    private String iteraciones;

    public String raiz(Funcion f, double a, double b, double error) {
        formato = new DecimalFormat("0.000000");
        double raiz = Double.NaN;
        double xr = a, aux = 0, calcu = 100;
        int k = 0;
        String texto = "No.\tA\tB\tf(A)\tf(B)\txr\tf(xr)\tError";
        iteraciones = texto;
        if (f.evaluar(a) * f.evaluar(xr) != 0) {
            while (calcu > error) {
                xr = b - ((f.evaluar(b) * (a - b)) / (f.evaluar(a) - f.evaluar(b)));

                calcu = Math.abs((xr - aux) / xr) * 100;
                aux = xr;

                texto = "\n" + (k + 1) + "\t" + formato.format(a) + "\t" + formato.format(b) + "\t" + formato.format(f.evaluar(a))
                        + "\t" + formato.format(f.evaluar(b)) + "\t" + formato.format(xr) + "\t" + formato.format(f.evaluar(xr)) + "\t" + formato.format(calcu);

                iteraciones += texto;
                if (f.evaluar(a) * f.evaluar(xr) < 0) {
                    b = xr;
                } else {
                    a = xr;
                }

                k++;
            }
        }
        raiz = xr;
        return formato.format(raiz);
    }

    public String getIteraciones() {
        return iteraciones;
    }
}
