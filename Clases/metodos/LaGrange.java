package Clases.metodos;

import java.text.DecimalFormat;

public class LaGrange {

    private String[] grados;
    private DecimalFormat formato;

    public LaGrange() {
        formato = new DecimalFormat("0.000000");
    }

    private float calcularLi(float x[], float y[], int i, int grado, float valorX) {
        float resultado = 1;
        for (int j = 0; j <= grado; j++) {
            if (j != i) {
                resultado *= (valorX - x[j])
                        / (x[i] - x[j]);
                /*System.out.println("--------------------------------------------");
               System.out.println(valorX);
               System.out.println(x[j]);
               System.out.println(x[i]);
               System.out.println(x[j]);
               System.out.println(resultado);
               System.out.println("--------------------------------------------");]*/
            }
        }
        /*System.out.println("Valor Li["+i+"] : "+resultado);*/
        return resultado;

    }

    public void calcular(float x[], float y[], float valorX, int cantElementos) {
        float resultado = 0;
        grados = new String[cantElementos];
        // calcularLi(x,y,0,1,valorX);
        for (int i = 1; i < cantElementos; i++) { //Ciclo que determina de que grado será el polinomio
            for (int j = 0; j <= i; j++) { //ciclo que determina el valor del polinomio
                resultado += calcularLi(x, y, j, i, valorX) * y[j];

            }
            grados[i] = formato.format(resultado);
            //System.out.println("Resultado del Grado"+(i)+" : "+resultado);
            resultado = 0;
        }

    }

    public String[] imprimir() {
        return grados;
    }
}
