/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.metodos;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import static javax.swing.SwingConstants.NEXT;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bebo_
 */
public class Regrescuadratica {
    static double matriz[][];
    private static double igualacion[];
    private static double solucion[];
    private static int NoIncog=3;
    static double ecua[] = new  double [3];
    private float  a0,a1,a2,promeY, sr, st, sumaxy = 0, sumaX = 0, sumaY = 0,
            sumaXX = 0, sumax2y, sumax3,sumax4, r, sumaSt = 0, sumaSr = 0;
    
    public void algoritmo(JTextField txtvalorX, JTextField txtvalorY, JTable tblDatos, JLabel lbla0,JLabel lbla1,JLabel lbla2, JTextField txtecua, JLabel lblco, JButton btncalcular) {
       String ecuacion="",val,valF;
        ArrayList<Float> valoresX = new ArrayList<>();
        ArrayList<Float> valoresy = new ArrayList<>();
        ArrayList<Float> valoresxy = new ArrayList<>();
        
        int numDatos, Ndatosx, Ndatosy;
        float xy, x, y, xx, x2y,x3,x4, valor, valorF;
        DefaultTableModel modelo = (DefaultTableModel) tblDatos.getModel();
        Object[] fila = new Object[9];
        
        txtvalorX.setEnabled(false);
        txtvalorY.setEnabled(false);
        btncalcular.setEnabled(false);
        
        try{
            
            for (String valorX : txtvalorX.getText().split(" ")) {
                valoresX.add(Float.parseFloat(valorX));
            }
            for (String valory : txtvalorY.getText().split(" ")) {
                valoresy.add(Float.parseFloat(valory));
            }
            Ndatosx = valoresX.size();
            Ndatosy = valoresy.size();
            numDatos = valoresX.size();
            if ((Ndatosx != Ndatosy) || (Ndatosy != Ndatosx)) {
                JOptionPane.showMessageDialog(null, "Ingrese el mismo numero\n de datos en x , y", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
            

                for (int p = 0; p < valoresX.size(); p++) {
                    x = valoresX.get(p);
                    y = valoresy.get(p);
                    xy = x * y;
                    valoresxy.add(xy);
                    
                    //x cuadrada
                    xx = (float) Math.pow(valoresX.get(p), 2);
                    x2y= xx*y;
                    x3= (float) Math.pow(valoresX.get(p), 3);
                    x4 = (float) Math.pow(valoresX.get(p), 4);
                    
                    sumaX += x;
                    sumaY += y;
                    sumaXX += xx;
                    sumaxy += valoresxy.get(p);
                    sumax2y+=x2y;
                    sumax3+=x3;
                    sumax4+=x4;
                    
                }
                promeY = sumaY / numDatos;
                ecuacion+=numDatos+" "+sumaX+" "+sumaXX+" "+sumaY+"\n";
                ecuacion+=sumaX+" "+sumaXX+" "+sumax3+" "+sumaxy+"\n";
                ecuacion+=sumaXX+" "+sumax3+" "+sumax4+" "+sumax2y+"\n";
                inicio(ecuacion);
                a0=(float) redondear(ecua[0]);
                a1=(float) redondear(ecua[1]);
                a2=(float) redondear(ecua[2]);
                
                
                lbla0.setText(String.valueOf(a0));
                lbla1.setText(String.valueOf(a1));
                lbla2.setText(String.valueOf(a2));
                
                
                
                for (int p = 0; p < valoresX.size(); p++) {
                    y = valoresy.get(p);
                    xx = (float) Math.pow(valoresX.get(p), 2);
                    x2y= xx*y;
                    x3= (float) Math.pow(valoresX.get(p), 3);
                    x4 = (float) Math.pow(valoresX.get(p), 4);
                    
                    fila[0] = valoresX.get(p);
                    fila[1] = valoresy.get(p);
                    fila[2] = redondear(xx);
                    fila[3] = redondear(valoresxy.get(p));
                    fila[4]= redondear(x2y);
                    fila[5]= redondear(x3);
                    fila[6]= redondear(x4);
                    
                    sr=(float) Math.pow(y-a0-a1*valoresX.get(p)-a2*xx,2);
                    if (!Double.isNaN(sr)) {
                        fila[7]=redondear(sr);
                        sumaSr += sr;
                    } else {
                        fila[7] = " ";
                    }
                    st=(float) Math.pow(valoresy.get(p)-promeY, 2);
                    if (!Double.isNaN(st)) {
                        fila[8] = redondear(st);
                        sumaSt += st;
                    } else {
                        fila[8] = "";
                    }
                    
                    modelo.addRow(fila);
                    tblDatos.setModel(modelo);
                }
                
                fila[0] = redondear(sumaX);
                fila[1] = redondear(sumaY);
                fila[2] = redondear(sumaXX);
                fila[3] = redondear(sumaxy);
                fila[4]= redondear(sumax2y);
                fila[5]= redondear(sumax3);
                fila[6]= redondear(sumax4);
                fila[7]= redondear(sumaSr);
                fila[8]= redondear(sumaSt);
                modelo.addRow(fila);
                tblDatos.setModel(modelo);
                
                for (int n = 0; n < numDatos; n++) {
            //se recorre la columna 0, es decir, la columna de x, y obtiene los valores de las filas
            val = String.valueOf(tblDatos.getValueAt(n, 0));
            //los valores se parsean a float para hacer comparaciones
            valor = Float.parseFloat(val);

            //se obtiene el ultimo valor de la columna 0
            valF = String.valueOf(tblDatos.getValueAt(numDatos, 0));
            valorF = Float.parseFloat(val);

            if (valor >= valorF) {
                tblDatos.setSelectionBackground(Color.MAGENTA);
                tblDatos.getSelectionModel().setSelectionInterval(numDatos, NEXT);
            }
        }
                r = (float) Math.sqrt((sumaSt - sumaSr) / sumaSt);
                if (!Double.isNaN(r) || !Double.isNaN(a0) || !Double.isNaN(a1) || !Double.isNaN(a2)) {
                    ecuacion=caden(a0,a1,a2);
                    txtecua.setText(ecuacion);
                    lblco.setText(String.valueOf(redondear(r)));
                }else {
                    lblco.setText("Sin datos");
                    txtecua.setText("Sin datos");
                }
            }                 
        }catch(Exception ex){
             JOptionPane.showMessageDialog(null, "Verifica la entrada de \n datos para continuar", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public static void inicio(String ecuacion){
         
        int i;
        double[] resultado;
        ArrayList numero = new ArrayList<String>();
        ArrayList aux = new ArrayList<String>();
        try{
        //NoIncog = Integer.parseInt(txtNo.getText());
        matriz = new double[NoIncog][NoIncog];
        igualacion= new double[NoIncog];
        solucion = new double[NoIncog];
        
        double sistema[][] = new double[NoIncog][NoIncog];

        String[] pa = ecuacion.split("\n");
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
        eliminacion();
        sustHaciaAtras();
        ecua=soluciones();
        
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Campos vacios", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public static void eliminacion() {
        int cont=1;
        for (int k = 0; k < NoIncog; k++) {
            Ajuste(k);
            for (int i = k + 1; i < NoIncog; i++) {
                double l = redondear(matriz[i][k] / matriz[k][k]);
                matriz[i][k] = 0.0;
                for (int j = k + 1; j < NoIncog; j++) {
                    matriz[i][j] = redondear(matriz[i][j] - l * matriz[k][j]);
                }
                igualacion[i] = redondear(igualacion[i] - l * igualacion[k]);
            }
            cont++;
        }
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

    public static void Ajuste(int k) {// Ajuste
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
        }
    }
    public static  double[] soluciones() {
        int cont=1;
        for (int i = 0; i < NoIncog; i++) {
            redondear(solucion[i]);
            cont++;
        }
        return solucion;
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
                && car != '6' && car != '7' && car != '8' && car != '9' && car != '.' && car != '-'&& car !=' ' )) 
            evt.consume();
    }
   public String caden (float a0,float a1,float a2){
       String ecuacion="";
       
       if(a0<0 && a1<0 && a2<0)
           ecuacion=a0+""+a1+"x"+""+a2+"x^2";
       else
           if(a0<0 && a1>0 && a2>0)
               ecuacion=a0+"+"+a1+"x"+"+"+a2+"x^2";
           else 
              if(a0<0 && a1<0 && a2>0)
                  ecuacion=a0+""+a1+"x"+"+"+a2+"x^2";
              else 
                  if(a0>0 && a1>0 && a2<0)
                      ecuacion=a0+"+"+a1+"x"+""+a2+"x^2";
                  else 
                      if(a0>0 && a1<0 && a2>0)
                          ecuacion=a0+""+a1+"x"+"+"+a2+"x^2";
                      else 
                          if(a0>0 && a1<0 && a2<0)
                              ecuacion=a0+"-"+a1+"x"+"-"+a2+"x^2";
                          else 
                              if(a0>0 && a1>0 && a2>0)
                                  ecuacion=a0+"+"+a1+"x"+"+"+a2+"x^2";
                              else 
                                  if(a0<0 && a1>0 && a2>0)
                                      ecuacion=a0+"+"+a1+"x"+"+"+a2+"x^2";
       
           return ecuacion;
       
   }
}
