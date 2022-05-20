
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

public class RegresionLineal {
     private float a1, a0, promeY, promeX, sr, st, sumaxy = 0, sumaX = 0, sumaY = 0,
            sumaXX = 0, sumaXa2, r, sumaSt = 0, sumaSr = 0;
     
     public void algoritmo(JTextField txtvalorX, JTextField txtvalorY, JTable tblDatos, JLabel lblPromeX,JLabel lblPromeY, JTextField txtecua, JLabel lblco, JButton btnCal) {
         
         
        ArrayList<Float> valoresX = new ArrayList<>();
        ArrayList<Float> valoresy = new ArrayList<>();
        ArrayList<Float> valoresxy = new ArrayList<>();
        String ecuacion, val, valF;
        int numDatos, Ndatosx, Ndatosy;
        float xy, x, y, xx = 0, valor, valorF;
        DefaultTableModel modelo = (DefaultTableModel) tblDatos.getModel();
        Object[] fila = new Object[6];

        txtvalorX.setEnabled(false);
        txtvalorY.setEnabled(false);
        btnCal.setEnabled(false);
        
        try {
            for (String valorX : txtvalorX.getText().split(" ")) {
                valoresX.add(Float.parseFloat(valorX));
            }
            for (String valory : txtvalorY.getText().split(" ")) {
                valoresy.add(Float.parseFloat(valory));
            }
            Ndatosx = valoresX.size();
            Ndatosy = valoresy.size();

            if ((Ndatosx != Ndatosy) || (Ndatosy != Ndatosx)) {
                JOptionPane.showMessageDialog(null, "Ingrese el mismo numero\n de datos en x , y", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                numDatos = valoresX.size();
                System.out.println(numDatos);

                for (int p = 0; p < valoresX.size(); p++) {

                    x = valoresX.get(p);
                    y = valoresy.get(p);
                    xy = x * y;
                    valoresxy.add(xy);

                    xx = (float) Math.pow(valoresX.get(p), 2);

                    sumaxy += valoresxy.get(p);
                    sumaX += x;
                    sumaY += y;
                    sumaXX += xx;
                    sumaXa2 = (float) Math.pow(sumaX, 2);

                }

                a1 = ((numDatos * sumaxy) - (sumaX * sumaY)) / ((numDatos * sumaXX) - (sumaXa2));
                //System.out.println(a1);

                //promedios x, y
                promeX = sumaX / numDatos;
                promeY = sumaY / numDatos;

                //calcular a0
                a0 = promeY - a1 * promeX;
                //System.out.println(a0);
                for (int p = 0; p < valoresX.size(); p++) {
                    xx = (float) Math.pow(valoresX.get(p), 2);
                    fila[0] = valoresX.get(p);
                    fila[1] = valoresy.get(p);
                    fila[2] = redondear(valoresxy.get(p));
                    fila[3] = redondear(xx);

                    sr = (float) Math.pow(valoresy.get(p) - a0 - (a1 * valoresX.get(p)), 2);
                    if (!Double.isNaN(sr)) {
                        fila[4] = redondear(sr);
                        sumaSr += sr;
                    } else {
                        fila[4] = " ";
                    }
                    st = (float) Math.pow(valoresy.get(p) - promeY, 2);
                    if (!Double.isNaN(st)) {
                        fila[5] = redondear(st);
                        sumaSt += st;
                    } else {
                        fila[5] = "";
                    }
                    modelo.addRow(fila);
                    tblDatos.setModel(modelo);
                }
                fila[0] = redondear(sumaX);
                fila[1] = redondear(sumaY);
                fila[2] = redondear(sumaxy);
                fila[3] = redondear(sumaXX);
                
                    fila[4] = redondear(sumaSr);
                
                if (!Double.isNaN(sumaSt)) {
                    fila[5] = redondear(sumaSt);
                } else {
                    fila[5] = " ";
                }
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
        }//fin del for que recorre la columna de x
                r = (float) Math.sqrt((sumaSt - sumaSr) / sumaSt);

                if (!Double.isNaN(r) || !Double.isNaN(a0) || !Double.isNaN(a1)) {
                    ecuacion = String.valueOf(redondear(a0)) + "+" + String.valueOf(redondear(a1)) + "x";
                    lblPromeX.setText(String.valueOf(redondear(promeX)));
                    lblPromeY.setText(String.valueOf(redondear(promeY)));
                    txtecua.setText(ecuacion);
                    lblco.setText(String.valueOf(redondear(r)));
                } else {
                    lblco.setText("Sin datos");
                    txtecua.setText("Sin datos");
                }

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Verifica la entrada de \n datos para continuar", "Error", JOptionPane.ERROR_MESSAGE);
            txtvalorX.setText(null);
        txtvalorY.setText(null);
        lblPromeX.setText(null);
        lblPromeY.setText(null);
        txtecua.setText(null);
        lblco.setText(null);
        btnCal.setEnabled(true);
        txtvalorX.setEnabled(true);
        txtvalorY.setEnabled(true);
        }
     }
    public void validar(JTextField txt, KeyEvent evt) {

        char car = evt.getKeyChar();
        char text[];
        text = txt.getText().toCharArray();
        
        if ((car != '0' && car != '1' && car != '2' && car != '3' && car != '4' && car != '5'
                && car != '6' && car != '7' && car != '8' && car != '9' && car != '.' && car != '-'&& car !=' ' )) 
            evt.consume();
    }
    public double redondear(float valor){
        BigDecimal bd = new BigDecimal(valor).setScale(6,RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
