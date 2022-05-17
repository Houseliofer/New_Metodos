/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
 * @author bebo_
 */
public class Secante {
    
     private Funcion funcion;
    double  xi1,error = 1;
    int contador;
    

    public Secante() {
    }

    public Secante(String expresion) {
        funcion = new Funcion(expresion);
    }

    public void setFuncion(String expresion) {
        funcion = new Funcion(expresion);
    }

    public double secante(double XiMe1, double Xi, double Error, JTable datos) {
        double evaluarximenos1, evaluarxi;
        this.xi1=Double.NaN;
        this.contador=1;
        
        evaluarximenos1=this.funcion.evaluar(XiMe1);
        if(!Double.isNaN(evaluarximenos1)){
            evaluarxi=this.funcion.evaluar(Xi);
            if (evaluarximenos1 * evaluarxi < 0) {
            do{
                 DefaultTableModel modelo = (DefaultTableModel) datos.getModel();
                    Object[] fila = new Object[7];
                    fila[0] = contador;
                    fila[1] = redondear(XiMe1);
                    fila[2] = redondear(Xi);
                    
                    evaluarximenos1=this.funcion.evaluar(XiMe1);
                    evaluarxi=this.funcion.evaluar(Xi);
                    
                     this.xi1=Xi-((evaluarxi*(XiMe1-Xi))/(evaluarximenos1-evaluarxi));
                     this.error = Math.abs((this.xi1 - Xi) / this.xi1) * 100;
                     
                     fila[3]=redondear(evaluarximenos1);
                     fila[4]=redondear(evaluarxi);
                     fila[5]=redondear(this.xi1);
                     fila[6]=redondear(this.error);
                      modelo.addRow(fila);
                    datos.setModel(modelo);
                    this.contador++;
                     XiMe1=Xi;
                     Xi=this.xi1;
                     
            }while(Error<this.error);
            
            }
            if (!Double.isNaN(this.xi1)) 
                return redondear(this.xi1);
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
        if (count >= 1 && evt.getKeyChar() == '.') 
            evt.consume();
        
        if ((car != '0' && car != '1' && car != '2' && car != '3' && car != '4' && car != '5'
                && car != '6' && car != '7' && car != '8' && car != '9' && car!='-'&&car != '.')) 

            evt.consume();
    }
    //metodo para redondear a 6 deciamles 
    public double redondear(double valor){
        BigDecimal bd = new BigDecimal(valor).setScale(6, RoundingMode.HALF_UP);
                   return  bd.doubleValue();
        
    }
}
