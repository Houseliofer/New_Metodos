package Clases.metodos;

import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class GausSeidel {

    final static int MAXN = 10;
    static double a[][] = new double[MAXN][MAXN];
    static double error;//escribir el error
    static double x1[] = new double[MAXN];// Se usa para guardar el valor para la iteración
    static double errr[];
    static double err_anterior = 0;
    static int numIncog;

    public void inicio(JTable tbliteracion, JTable tbliteracion2, JTextField txtincog, JTextField txtError,
            JTextArea txtsistema, JTextArea txtaSolu, JButton btncalcular) {
        String texto = "";
        
        DefaultTableModel modelo = (DefaultTableModel) tbliteracion.getModel();
        DefaultTableModel modelo2 = (DefaultTableModel) tbliteracion2.getModel();
        try {
            numIncog = Integer.parseInt(txtincog.getText());
            errr = new double[numIncog];
            if (numIncog == 0) {
                JOptionPane.showConfirmDialog(null, "Ingresa un numero mayor a 0", "verificar datos", JOptionPane.WARNING_MESSAGE);
            } else {

                error = Double.parseDouble(txtError.getText());
                Object[] fila = new Object[numIncog * 3];
                String[] pa = txtsistema.getText().split("\n");
                for (int i = 0; i < numIncog; i++) {
                    String p1 = pa[i];
                    //System.out.println(pa[i]);

                    String[] pa2 = pa[i].split(" ");
                    for (int j = 0; j < numIncog + 1; j++) {
                        String p2 = pa2[j];
                        a[i][j] = Double.parseDouble(String.valueOf(pa2[j]));
                    }
                }

                modelo.addColumn("No.");

                for (int i = 0; (i < numIncog); i++) {
                    modelo.addColumn("x" + (i + 1));
                }
                for (int i = 0; (i < numIncog); i++) {
                    modelo2.addColumn("Xn" + (i + 1));
                }
                for (int i = 0; (i < numIncog); i++) {
                    modelo2.addColumn("Error" + (i + 1));
                }
                modelo.setRowCount(0);
                modelo2.setRowCount(0);
                for (int i = 0; i < numIncog; i++) {
                    //x1[i]=sc.nextDouble();
                    x1[i] = 0;
                    fila[0] = 1;
                    fila[(i + 1)] = x1[i];

                }

                modelo.addRow(fila);
                tbliteracion.setModel(modelo);

                for (int i = 0; i < numIncog; i++) {// Escribe el sistema de ecuaciones como un sistema equivalente de ecuaciones
                    for (int j = 0; j <= numIncog; j++) {
                        if (j < numIncog && j != i) {
                            a[i][j] = -(a[i][j] / a[i][i]);
                        } else if (j == numIncog) {
                            a[i][j] = (a[i][j] / a[i][i]);
                        }
                    }
                    a[i][i] = 0;
                }

                int i = 0;
                boolean bandera;
                do {
                    bandera = false;
                    diedai(tbliteracion, tbliteracion2);
                    i++;
                    for (int j = 0; j < errr.length; j++) 
                        if(errr[j]>error)
                            bandera = true;
                    
                } while (bandera);
                double inicial[] = new double[i];
                for (i = 1; i < inicial.length + 1; i++) {
                    modelo.setValueAt(i + 1, i, 0);
                }
                for (i = 0; i < numIncog; i++) {
                    texto += "x" + (i + 1) + "= " + redondear(x1[i]) + "\n";
                }

                txtaSolu.setText(texto);

                txtsistema.setEditable(false);
                txtincog.setEnabled(false);
                txtError.setEnabled(false);
                btncalcular.setEnabled(false);
            }
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "revisa la entrada de datos", "verificar datos", JOptionPane.WARNING_MESSAGE);
        }
    }

    static void diedai(JTable tbliteracion, JTable tbliteracion2) {
        DefaultTableModel modelo = (DefaultTableModel) tbliteracion.getModel();
        DefaultTableModel modelo2 = (DefaultTableModel) tbliteracion2.getModel();

        Object[] fila = new Object[numIncog * 3];
        Object[] fila2 = new Object[numIncog * 3];
        for (int i = 0; (i < numIncog); i++) {
            double temp = 0;
            for (int j = 0; j < numIncog; j++) {
                temp += x1[j] * a[i][j];
                
            }
            temp += a[i][numIncog];//valor anterior de las x
            fila[(i + 1)] = redondear(temp);
            errr[i] = (Math.abs((x1[i] - temp) / x1[i])) * 100;
            //System.out.println(errr[i]);

            x1[i] = temp;
            fila2[i] = redondear(x1[i]);

            //filas del error    
            if (Double.isInfinite(errr[i])) {
                fila2[i + numIncog] = 100;
                errr[i] = 100;
            } else {
                fila2[i + numIncog] = redondear(errr[i]);
            }
        }

        modelo.addRow(fila);
        modelo2.addRow(fila2);
        tbliteracion.setModel(modelo);
        tbliteracion2.setModel(modelo2);

    }

    public static double redondear(double valor) {
        BigDecimal bd = new BigDecimal(valor).setScale(6, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public void validar(JTextField txt, KeyEvent evt) {

        char car = evt.getKeyChar();
        char text[];
        int count = 0;
        text = txt.getText().toCharArray();
        if ((car != '0' && car != '1' && car != '2' && car != '3' && car != '4' && car != '5'
                && car != '6' && car != '7' && car != '8' && car != '9')) {
            evt.consume();
        }
    }

    public void validarError(JTextField txt, KeyEvent evt) {

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

        if ((car != '0' && car != '1' && car != '2' && car != '3' && car != '4' && car != '5'
                && car != '6' && car != '7' && car != '8' && car != '9' && car != '.')) {
            evt.consume();
        }
    }

    public void validarArea(JTextArea txt, KeyEvent evt) {

        char car = evt.getKeyChar();
        char text[];
        int count = 0;
        text = txt.getText().toCharArray();
        if ((car != '0' && car != '1' && car != '2' && car != '3' && car != '4' && car != '5'
                && car != '6' && car != '7' && car != '8' && car != '9' && car != ' ' && car != '-')) {
            evt.consume();
        }
    }

}
