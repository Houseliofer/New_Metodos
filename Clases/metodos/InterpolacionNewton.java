package Clases.metodos;

import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class InterpolacionNewton {

    public InterpolacionNewton() {

    }

    public void calcular(JTextField txtTabla,JTextField txtX,JTable tabla,JLabel txtResultado,JLabel txtEcuacion) {
        DecimalFormat formato = new DecimalFormat("0.000000");
        //tabba.append("DIFERENCIAS DIVIDIDAS\n");
        int g = Integer.parseInt(txtTabla.getText());
        g += 1;
        int g1 = g+1;
        double v[] = new double[g];
        double v1[] = new double[g];
        
        double m[][] = new double[g][g1];
        
        for(int i = 0; i < g ; i++)
            for(int j = 0 ; j < 2 ; j++)
                if(j==0)
                    v[i] = Double.parseDouble(tabla.getValueAt(i,j).toString());
                else
                    v1[i] = Double.parseDouble(tabla.getValueAt(i,j).toString());
        
        for (int i = 0; i < g; i++) {
            for (int j = 0; j < 2; j++) {
                if (j==0) {
                    m[i][j] = v[i];
                }else{
                    m[i][j] = v1[i];
                }
            }
        }
        
        //tabba.append("x\tf[x]\n");
        for (int i = 0; i < g; i++) {
            //tabba.append(v[i]+"\t"+v1[i]+"\n");
        }
        
        int i2 = 2;int k = 1;
        int g2 = g;
        double var = v1[0];
        
        for (int i = 0; i < g1; i++) {
            for (int j = 0; j < g2-1; j++) {
                double p = ((v1[j+1]-v1[j])/(v[j+k]-v[j]));
                v1[j] = p;
                m[j][i2] = p;
            }i2++;
            k++;
            g2--;
        }
        
        //tabba.append("\n\nImprimiendo la tabla\n");
        
        for (int i = 0; i < g; i++) {
            for (int j = 0; j < g1; j++) {
                //tabba.append(formato.format(m[i][j])+"\t");
            }
            //tabba.append("\n");
        }
        
        //DefaultTableModel modelo = (DefaultTableModel) tabla2.getModel();
        //modelo.setNumRows(g);
        //modelo.setColumnCount(g1);
        
        for (int i = 0; i < g; i++) {
            for (int j = 0; j < g1; j++) {
                //tabla2.setValueAt(formato.format(m[i][j]), i, j);
            }
        }
        double su = 0;
        su += var; int k1 = 1;
        //tabba.append("p(x) = "+var+" ");
        double x1 = Double.parseDouble(txtX.getText());
        String str = "f(x) = ";
        for (int i = 2; i < g1; i++) {
            str += "+ "+formato.format(m[0][i])+" *";
            //tabba.append("+ "+formato.format(m[0][i])+" *");
            double sul = 1;
            for (int j = 0; j < k1; j++) {
                sul = sul * (x1-v[j]);
                if(j==k1-1){
                    str += "("+x1+"-"+v[j]+")";
                    //tabba.append("("+x1+"-"+v[j]+")");
                }else{
                    str += "("+x1+"-"+v[j]+") *";
                    //tabba.append("("+x1+"-"+v[j]+") *");
                }
            }
            txtEcuacion.setText(str);
            sul = sul * m[0][i];
            su = su + sul;
            k1++;
        }
        txtResultado.setText(formato.format(su));
    }
    
    
}
