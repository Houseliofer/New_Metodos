package Clases.metodos;

import Clases.Funcion;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Agustin Estrada_
 */

public class Biseccion {

    private Funcion funcion;
    double xr, error = 1;
    int contador;

    public double getError() {
        return error;
    }

    public Biseccion() {
    }

    public Biseccion(String expresion) {
        funcion = new Funcion(expresion);
    }

    public void setFuncion(String expresion) {
        funcion = new Funcion(expresion);
    }

    public double biseccion(double a, double b, double Error, JTable datos) {
        this.xr = Double.NaN;
        this.contador = 1;
        double xr_anterior = 0;
        double evaluarA, evaluarB;

        evaluarA = this.funcion.evaluar(a);

        if (!Double.isNaN(evaluarA)) {
            evaluarB = this.funcion.evaluar(b);

            if (evaluarA * evaluarB < 0) {

                do {
                    DefaultTableModel modelo = (DefaultTableModel) datos.getModel();
                    Object[] fila = new Object[8];
                    fila[0] = contador;
                    fila[1] = redondear(a);
                    fila[2] = redondear(b);

                    this.xr = (a + b) / 2;
                    this.error = Math.abs((this.xr - xr_anterior) / this.xr) * 100;
                    xr_anterior = this.xr;

                    evaluarA = this.funcion.evaluar(a);
                    evaluarB = this.funcion.evaluar(b);

                    if (evaluarA * this.funcion.evaluar(xr) < 0) {
                        b = this.xr;
                    } else {
                        a = this.xr;
                    }
                    //si f(a)*f(xr) es igual a 0
                    if (evaluarA * this.funcion.evaluar(xr) == 0) {
                        fila[0] = contador;
                        fila[1] = a;
                        fila[2] = b;
                        fila[3] = redondear(evaluarA);
                        fila[4] = redondear(evaluarB);
                        fila[5] = this.xr;
                        fila[6] = this.funcion.evaluar(xr);
                        fila[7] = "--";
                        modelo.addRow(fila);
                        datos.setModel(modelo);
                        return redondear(this.xr);
                    }// aqui termina la condicion de f(a)*f(xr)=0

                    fila[3] = redondear(evaluarA);
                    fila[4] = redondear(evaluarB);
                    fila[5] = redondear(this.xr);
                    fila[6] = redondear(this.funcion.evaluar(xr));
                    if (this.error == 100) {
                        fila[7] = "--";
                    } else {
                        fila[7] = redondear(error);
                    }
                    modelo.addRow(fila);
                    datos.setModel(modelo);
                    this.contador++;

                } while ((Error < error) || (this.funcion.evaluar(xr) <= 0));
            }
            if (!Double.isNaN(this.xr)) {
                return redondear(this.xr);
            }
        }
        return Double.NaN;
    }

    // validar entrada de numeros decimales
    public void validar(JTextField txt, KeyEvent evt) {

        char car = evt.getKeyChar();
        char text[];
        int count = 0;
        text = txt.getText().toCharArray();
        for (int i = 0; i < text.length; i++) {
            if (text[i] == '.') {
                count++;
            }
        }
        if (count >= 1 && evt.getKeyChar() == '.') {
            evt.consume();
        }

        for (int i = 0; i < text.length; i++) {
            if (text[i] == '-') {
                count++;
            }
        }
        if (count >= 1 && evt.getKeyChar() == '-') {
            evt.consume();
        }
        
        if ((car != '0' && car != '1' && car != '2' && car != '3' && car != '4' && car != '5'
                && car != '6' && car != '7' && car != '8' && car != '9' && car != '-' && car != '.')) {
            evt.consume();
        }
    }

    //metodo para redondear a 6 deciamles 
    public double redondear(double valor) {
        BigDecimal bd = new BigDecimal(valor).setScale(6, RoundingMode.HALF_UP);
        return bd.doubleValue();

    }

}
