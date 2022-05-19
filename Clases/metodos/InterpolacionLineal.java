package Clases.metodos;

import java.text.DecimalFormat;

public class InterpolacionLineal {

    private float x0, x1;
    private float fx0, fx1, x;
    private DecimalFormat formato;

    public InterpolacionLineal(float x0, float x1, float fx0, float fx1, float x) {
        this.x0 = x0;
        this.x1 = x1;
        this.fx0 = fx0;
        this.fx1 = fx1;
        this.x = x;

        formato = new DecimalFormat("0.000000");
    }

    public String calcularfx() {
        float resultado;

        resultado = fx0 + (((fx1 - fx0) / (x1 - x0)) * (x - x0));
        System.out.println(resultado);
        return formato.format(resultado);
    }

}
