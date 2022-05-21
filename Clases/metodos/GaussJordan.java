package Clases.metodos;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class GaussJordan {

    public final int max = 20;
    public double[][] ecuacion = new double[max][max];
    public int num;

    public GaussJordan(int num) {
        this.num = num;
    }//cierra el constructor

    public void matrizCalculo(double[][] m) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= num; j++) {
                ecuacion[i][j] = m[i][j];
            }
        }

        for (int j = 0; j < num - 1; j++) { //  Se pasan los valores para su resolución
            valorInicial(j);
            matrizEscalonada(j);
            eliminacionValores(j + 1);
        }

        valorInicial(num - 1); 
    }//cierra el metodo

    public void matrizEscalonada(int jj) {   // Convierte la matriz original en un triángulo
        for (int i = jj + 1; i < num; i++) {
            double k = ecuacion[i][jj] / ecuacion[jj][jj];
            for (int j = jj; j <= num; j++) {
                ecuacion[i][j] = ecuacion[i][j] - ecuacion[jj][j] * k;
            }
        }
    }//cierra el metodo

    public void valorInicial(int jj) { // Haz que akk se convierta en 1
        for (int i = num; i >= 0; i--) {
            ecuacion[jj][i] = ecuacion[jj][i] / ecuacion[jj][jj];
        }
    }//cierra el metodo

    public void eliminacionValores(int jj) {   // Hacer otros valores 0
        for (int i = 0; i < jj; i++) {
            double k = (-ecuacion[i][jj]) / ecuacion[jj][jj];
            for (int j = jj; j <= num; j++) {
                ecuacion[i][j] += ecuacion[jj][j] * k;
            }
        }
    }//cierra el metodo
}//cirra la clase
