/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.metodos;

import Clases.Funcion;
import java.text.DecimalFormat;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SimpsonOctavo {

    DecimalFormat formato;

    public String calcular(Funcion funcion, int n, double a, double b, JTable tabla) {
        formato = new DecimalFormat("0.000000");
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();

        Object[] fila = new Object[3];

        double resultado = 0, aux = 0;
        double[] xi = new double[n + 1];

        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                xi[i] = a;
            } else {
                xi[i] = xi[i - 1] + ValorH(a, b, n);
            }      
            if (i == 0 || i == n) {
                resultado += funcion.evaluar(xi[i]);
            }
            fila[0] = i;
            fila[1] = formato.format(xi[i]);
            fila[2] = formato.format(funcion.evaluar(xi[i]));
            model.addRow(fila);
            tabla.setModel(model);
        }//fin del ciclo
        
        for (int j = 1; j <= (n / 3) - 1; j++) {
            aux += funcion.evaluar(xi[3 * j]);
        }
        aux *= 2;
        resultado += aux;
        aux = 0;
        
        
        for (int j = 1; j <= n - 1; j++) {
            if(j%3 != 0)
                aux += funcion.evaluar(xi[ j ]);
        }
        
        aux *= 3;
        resultado += aux;
        aux = 0;
        
        resultado *= ((3*ValorH(a, b, n)) / 8);
        System.out.println(resultado);
        return formato.format(resultado);
    }

    private double ValorH(double a, double b, int n) {
        return (b - a) / n;
    }
}
