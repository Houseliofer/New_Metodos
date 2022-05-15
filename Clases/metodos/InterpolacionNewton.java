package Clases.metodos;

import java.text.DecimalFormat;

public class InterpolacionNewton {

    private float x0, x1, x2, x3;
    private float fx0, fx1, fx2, fx3, x;
    private float b0, b1, b2, b3, resultado;
    private DecimalFormat formato;

    public InterpolacionNewton(float x, float x0, float x1, float x2, float x3, float fx0,
            float fx1, float fx2, float fx3) {

        formato = new DecimalFormat("0.000000");
        this.x = x;

        this.x0 = x0;
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;

        this.fx0 = fx0;
        this.fx1 = fx1;
        this.fx2 = fx2;
        this.fx3 = fx3;

        this.b0 = fx0;
    }

    public String calcular() {
        calcularB1();
        calcularB2();
        calcularB3();

        resultado = b0 + (b1 * (x - x0)) + (b2 * (x - x0) * (x - x1)) + (b3 * (x - x0) * (x - x1) * (x - x2));

        return imprimir(resultado);
    }

    private float calcularB1() {
        b1 = (fx1 - fx0) / (x1 - x0);
        return b1;
    }

    private float calcularB2() {
        b2 = (((fx2 - fx1) / (x2 - x1)) - calcularB1()) / (x2 - x0);
        return b2;
    }

    private float calcularB3() {
        b3 = (((((fx3 - fx2) / (x3 - x2)) - ((fx2 - fx1) / (x2 - x1))) / (x3 - x1)) - calcularB2()) / (x3 - x0);
        return b3;
    }

    private String imprimir(float funcion) {
        String texto = "X\tX0\tX1\tX2\tX3\tf(X0)\tf(X1)\tf(X2)\tf(X3)\tb0\tb1\tb2\tb3\tf(X)";

        texto += "\n" + formato.format(x) + "\t" + formato.format(x0) + "\t" + formato.format(x1)
                + "\t" + formato.format(x2) + "\t" + formato.format(x3) + "\t" + formato.format(fx0) + "\t"
                + formato.format(fx1) + "\t" + formato.format(fx2) + "\t" + formato.format(fx3) + "\t" + formato.format(b0)
                + "\t" + formato.format(b1) + "\t" + formato.format(b2) + "\t" + formato.format(b3) + "\t" + formato.format(funcion);
        return texto;
    }

    public String getResultado() {
        return formato.format(resultado);
    }
}
