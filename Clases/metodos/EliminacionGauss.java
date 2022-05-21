/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.metodos;


import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author bebo_
 */
public class EliminacionGauss {
    static double matriz[][];
    private static double igualacion[];
    private static double solucion[];
    private static int NoIncog;
    private static String text=" ";
    private static int saltos;
    
    public static void inicio(JTextArea txta, JTextField txtNo, JButton btncalcular, JTextArea txtasoluciones,JTextArea txtasolu){
         
        int i,vectorC;
        double[] resultado;
        ArrayList numero = new ArrayList<String>();
        ArrayList aux = new ArrayList<String>();
        try{
        NoIncog = Integer.parseInt(txtNo.getText());
        matriz = new double[NoIncog][NoIncog];
        igualacion= new double[NoIncog];
        solucion = new double[NoIncog];
        
        double sistema[][] = new double[NoIncog][NoIncog];

        String[] pa = txta.getText().split("\n");
        for (i = 0; i < NoIncog; i++) {
            String p1 = pa[i];

            for (int j = 0; j < NoIncog; j++) {
                String[] pa1 = pa[j].split(" ");
                String p2 = pa1[j];
                
            for (int h = 0; h < NoIncog; h++) 
                    sistema[j][h] = Double.parseDouble(String.valueOf(pa1[h]));
                
            }
            for (String tex : pa[i].split("\\s")) {
                numero.add(tex);
            }
            aux.add(numero.remove(numero.size() - 1));
        }
        matriz = sistema;
        resultado = new double[aux.size()];
        for (i = 0; i < resultado.length; i++) {
            resultado[i] = Double.parseDouble(String.valueOf(aux.get(i)));
        }
        igualacion= resultado;
        eliminacion(txtasoluciones);
        sustHaciaAtras();
        soluciones(txtasolu);
        
        txta.setEditable(false);
        txtNo.setEnabled(false);
        btncalcular.setEnabled(false);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Campos vacios", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public static void eliminacion(JTextArea txtsoluciones) {
        imprMatriz(txtsoluciones);
        int cont=1;
        for (int k = 0; k < NoIncog; k++) {
            Ajuste(k, txtsoluciones);
            for (int i = k + 1; i < NoIncog; i++) {
                double l = redondear(matriz[i][k] / matriz[k][k]);
                matriz[i][k] = 0.0;
                for (int j = k + 1; j < NoIncog; j++) {
                    matriz[i][j] = redondear(matriz[i][j] - l * matriz[k][j]);
                }
                igualacion[i] = redondear(igualacion[i] - l * igualacion[k]);
            }
            
            text+="No. " + cont + " \n ";
            txtsoluciones.setText(text);
            cont++;
            imprMatriz(txtsoluciones);
        }
        text+="\n ";
        txtsoluciones.setText(text);

    }

   public static void sustHaciaAtras() // Back generation
    {
        solucion[NoIncog - 1] = igualacion[NoIncog - 1] / matriz[NoIncog - 1][NoIncog - 1];
        for (int i = NoIncog - 2; i >= 0; i--) {
            solucion[i] = (igualacion[i] - calcular(i)) / matriz[i][i];
        }
    }

    public static double calcular(int i) {
        double he = 0.0;
        for (int j = i; j <= NoIncog- 1; j++) {
            he = he + solucion[j] * matriz[i][j];
        }
        return he;
    }

    public static void Ajuste(int k, JTextArea txtsoluciones) {// Ajuste
        double max = Math.abs(matriz[k][k]);
        
        int n1 = k; // Recuerda la línea a intercambiar
        for (int i = k + 1; i < NoIncog; i++) // encuentra la línea a intercambiar
        {
            if (Math.abs(matriz[i][k]) > max) {
                n1 = i;
                max = Math.abs(matriz[i][k]);
            }
        }
        if (n1 != k) {
            saltos++;
            txtsoluciones.setText(text);
            text+="\n ";
            txtsoluciones.setText(text);
            for (int j = k; j < NoIncog; j++) // intercambia la línea de un
            {
                double x1;
                x1 = matriz[k][j];
                matriz[k][j] = matriz[n1][j];
                matriz[n1][j] = redondear(x1);
            }
            double b1; // intercambia la línea de b
            b1 = igualacion[k];
            igualacion[k] = igualacion[n1];
            igualacion[n1] = redondear(b1);
           // text+="Después del intercambio: \n";
            txtsoluciones.setText(text);
            imprMatriz(txtsoluciones);
        }
        
        text+="\n ";
        txtsoluciones.setText(text);
        
    }


    public  static void imprMatriz(JTextArea txtsoluciones) {// Matriz de aumento de salida
         text+="La matriz de aumento  : \n";
        txtsoluciones.setText(text);
        //print(matriz);
        for (int i = 0; i < NoIncog; i++) {
            for (int j = 0; j < NoIncog; j++) {
                text+=" | "+matriz[i][j] + "   ";
                txtsoluciones.setText(text);
            }
            text+="     |     "+igualacion[i]+"\n";
            txtsoluciones.setText(text);
        }
        text+="\n";
        txtsoluciones.setText(text);
    }
        
    public static  void soluciones(JTextArea txtsolu) {// La raíz de la ecuación de salida
        String solucionx=" ";
        int cont=1;
        for (int i = 0; i < NoIncog; i++) {
            solucionx+="x" + cont + " = " + redondear(solucion[i])+"\n ";
            cont++;
            txtsolu.setText(solucionx+ " ");
        }
    }
   public static double redondear(double valor){
        BigDecimal bd = new BigDecimal(valor).setScale(6,RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
   public void validar(JTextField txt, KeyEvent evt) {

        char car = evt.getKeyChar();
        char text[];
        text = txt.getText().toCharArray();
        if ((car != '0' && car != '1' && car != '2' && car != '3' && car != '4' && car != '5'
                && car != '6' && car != '7' && car != '8' && car != '9')) {
            evt.consume();
        }
    }
   public void validarArea(JTextArea txt, KeyEvent evt) {

        char car = evt.getKeyChar();
        char text[];
        text = txt.getText().toCharArray();
        if ((car != '0' && car != '1' && car != '2' && car != '3' && car != '4' && car != '5'
                && car != '6' && car != '7' && car != '8' && car != '9' && car!=' ' && car!='-' && car!='.')) {
            evt.consume();
        }
    }
}
