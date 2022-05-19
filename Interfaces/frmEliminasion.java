/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author bebo_
 */
public class frmEliminasion extends javax.swing.JFrame {static double matriz[][];
    private static double igualacion[];
    private static double solucion[];
    private static int NoIncog;
    private static String text=" ";
    private static int saltos; // Registra el número de saltos de línea

    /**
     * Creates new form elimiGauss
     */
    public frmEliminasion() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btncalcular = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txta = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtsoluciones = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jxt = new javax.swing.JScrollPane();
        txtsolu = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        btnSalir1 = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Eliminación Gaussiana", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setOpaque(false);

        jPanel1.setOpaque(false);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("numero de incognitas");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingresa matriz");

        btncalcular.setText("calcular");
        btncalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalcularActionPerformed(evt);
            }
        });

        txta.setColumns(20);
        txta.setRows(5);
        jScrollPane1.setViewportView(txta);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btncalcular, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncalcular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        txtsoluciones.setEditable(false);
        txtsoluciones.setColumns(20);
        txtsoluciones.setRows(5);
        jScrollPane2.setViewportView(txtsoluciones);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Procedimientos");

        jPanel3.setOpaque(false);

        txtsolu.setEditable(false);
        txtsolu.setColumns(20);
        txtsolu.setRows(5);
        jxt.setViewportView(txtsolu);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Soluciones");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jxt, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(419, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(213, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(279, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 790, 530));

        btnSalir1.setBackground(new java.awt.Color(153, 0, 0));
        btnSalir1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalir1.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir1.setText("Salir");
        btnSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, -1, -1));

        btnRegresar.setBackground(new java.awt.Color(51, 51, 255));
        btnRegresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegresar.setForeground(java.awt.SystemColor.control);
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo Principal.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalcularActionPerformed
        // TODO add your handling code here:
        
        int i;
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
                    sistema[j][h] = Integer.parseInt(String.valueOf(pa1[h]));
                
            }
            for (String tex : pa[i].split("\\s")) {
                numero.add(tex);
            }
            aux.add(numero.remove(numero.size() - 1));
        }
        matriz = sistema;
        resultado = new double[aux.size()];
        for (i = 0; i < resultado.length; i++) {
            resultado[i] = Integer.parseInt(String.valueOf(aux.get(i)));
        }
        
        
        igualacion= resultado;

        eliminacion();
        sustHaciaAtras();
        soluciones();
        
        txta.setEditable(false);
        txtNo.setEnabled(false);
        btncalcular.setEnabled(false);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Campos vacios", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btncalcularActionPerformed

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalir1ActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        frmInicio objInicio = new frmInicio();
        objInicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmEliminasion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEliminasion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEliminasion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEliminasion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEliminasion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JButton btncalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jxt;
    private javax.swing.JTextField txtNo;
    private javax.swing.JTextArea txta;
    private javax.swing.JTextArea txtsolu;
    private static javax.swing.JTextArea txtsoluciones;
    // End of variables declaration//GEN-END:variables
 public static void eliminacion() {
        imprMatriz();
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
            
            text+="No. " + cont + " \n ";
            txtsoluciones.setText(text);
            cont++;
            imprMatriz();
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
            imprMatriz();
        }
        
        text+="\n ";
        txtsoluciones.setText(text);
        
    }


    public  static void imprMatriz() {// Matriz de aumento de salida
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
        
    public  void soluciones() {// La raíz de la ecuación de salida
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
    
}
