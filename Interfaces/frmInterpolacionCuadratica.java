/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases.metodos.InterpolacionCuadratica;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author house
 */
public class frmInterpolacionCuadratica extends javax.swing.JFrame {

    public frmInterpolacionCuadratica() {
        initComponents();
        btnLimpiar.setEnabled(false);
        txtAreaResultado.setEditable(false);
        this.setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/estadisticas.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFx0 = new javax.swing.JTextField();
        txtX1 = new javax.swing.JTextField();
        txtX2 = new javax.swing.JTextField();
        txtFx1 = new javax.swing.JTextField();
        txtFx2 = new javax.swing.JTextField();
        txtX0 = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtValorX = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaResultado = new javax.swing.JTextArea();
        lblPrincipal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setBackground(new java.awt.Color(153, 0, 0));
        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, -1, -1));

        btnRegresar.setBackground(new java.awt.Color(51, 51, 255));
        btnRegresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegresar.setForeground(java.awt.SystemColor.control);
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(java.awt.SystemColor.control);
        jLabel3.setText("Valor de X:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(java.awt.SystemColor.control);
        jLabel4.setText("Numero : ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        txtFx0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFx0KeyTyped(evt);
            }
        });
        getContentPane().add(txtFx0, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 140, -1));

        txtX1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtX1KeyTyped(evt);
            }
        });
        getContentPane().add(txtX1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 140, -1));

        txtX2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtX2KeyTyped(evt);
            }
        });
        getContentPane().add(txtX2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 140, -1));

        txtFx1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFx1KeyTyped(evt);
            }
        });
        getContentPane().add(txtFx1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 140, -1));

        txtFx2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFx2KeyTyped(evt);
            }
        });
        getContentPane().add(txtFx2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 140, -1));

        txtX0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtX0KeyTyped(evt);
            }
        });
        getContentPane().add(txtX0, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 140, -1));

        btnCalcular.setBackground(new java.awt.Color(51, 51, 255));
        btnCalcular.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCalcular.setForeground(java.awt.SystemColor.control);
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 140, -1));

        btnLimpiar.setBackground(new java.awt.Color(51, 51, 255));
        btnLimpiar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setEnabled(false);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 140, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(java.awt.SystemColor.control);
        jLabel5.setText("Funcion :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));

        txtValorX.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorXKeyTyped(evt);
            }
        });
        getContentPane().add(txtValorX, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 140, -1));

        txtAreaResultado.setColumns(20);
        txtAreaResultado.setRows(5);
        jScrollPane1.setViewportView(txtAreaResultado);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 670, 240));

        lblPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo Principal.jpg"))); // NOI18N
        getContentPane().add(lblPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 527));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        frmInicio objInicio = new frmInicio();
        objInicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        if(txtX0.getText().isEmpty()||txtX1.getText().isEmpty()||
            txtX2.getText().isEmpty()||txtFx0.getText().isEmpty()||
            txtFx1.getText().isEmpty()||txtFx2.getText().isEmpty()||
            txtValorX.getText().isEmpty())
            
        JOptionPane.showMessageDialog(null,"Termine De llenar los datos","ERROR",JOptionPane.WARNING_MESSAGE);
        
        else{
            try{
                InterpolacionCuadratica calculos;
                calculos = new InterpolacionCuadratica(Float.parseFloat(txtValorX.getText()),
                Float.parseFloat(txtX0.getText()),Float.parseFloat(txtX1.getText()),Float.parseFloat(txtX2.getText()),
                Float.parseFloat(txtFx0.getText()),Float.parseFloat(txtFx1.getText()),Float.parseFloat(txtFx2.getText()));
                
                txtAreaResultado.setText(calculos.calcular());
                
                txtX0.setEnabled(false);
                txtX1.setEnabled(false);
                txtX2.setEnabled(false);
                
                txtFx0.setEnabled(false);
                txtFx1.setEnabled(false);
                txtFx2.setEnabled(false);
                
                txtValorX.setEnabled(false);
                
                btnCalcular.setEnabled(false);
                btnLimpiar.setEnabled(true);
                JOptionPane.showMessageDialog(null,"Valor de f(X) : "+calculos.getResultado(),"Valor",JOptionPane.INFORMATION_MESSAGE);
            }catch(Exception e){
                frmInterpolacionCuadratica objInicio = new frmInterpolacionCuadratica();
                objInicio.setVisible(true);
                this.dispose();
                JOptionPane.showMessageDialog(null,"Error en los calculos","ERROR",JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtX0KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtX0KeyTyped
        // TODO add your handling code here:
        validar(txtX0,evt);
    }//GEN-LAST:event_txtX0KeyTyped

    private void txtX1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtX1KeyTyped
        // TODO add your handling code here:
        validar(txtX1,evt);
    }//GEN-LAST:event_txtX1KeyTyped

    private void txtX2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtX2KeyTyped
        // TODO add your handling code here:
        validar(txtX2,evt);
    }//GEN-LAST:event_txtX2KeyTyped

    private void txtFx0KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFx0KeyTyped
        // TODO add your handling code here:
        validar(txtFx0,evt);
    }//GEN-LAST:event_txtFx0KeyTyped

    private void txtFx1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFx1KeyTyped
        // TODO add your handling code here:
        validar(txtFx1,evt);
    }//GEN-LAST:event_txtFx1KeyTyped

    private void txtFx2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFx2KeyTyped
        // TODO add your handling code here:
        validar(txtFx2,evt);
    }//GEN-LAST:event_txtFx2KeyTyped

    private void txtValorXKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorXKeyTyped
        // TODO add your handling code here:
        validar(txtValorX,evt);
    }//GEN-LAST:event_txtValorXKeyTyped

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
            java.util.logging.Logger.getLogger(frmInterpolacionCuadratica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmInterpolacionCuadratica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmInterpolacionCuadratica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmInterpolacionCuadratica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmInterpolacionCuadratica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPrincipal;
    private javax.swing.JTextArea txtAreaResultado;
    private javax.swing.JTextField txtFx0;
    private javax.swing.JTextField txtFx1;
    private javax.swing.JTextField txtFx2;
    private javax.swing.JTextField txtValorX;
    private javax.swing.JTextField txtX0;
    private javax.swing.JTextField txtX1;
    private javax.swing.JTextField txtX2;
    // End of variables declaration//GEN-END:variables

    private void limpiar() {
        txtX0.setEnabled(true);
        txtX1.setEnabled(true);
        txtX2.setEnabled(true);
                
        txtFx0.setEnabled(true);
        txtFx1.setEnabled(true);
        txtFx2.setEnabled(true);
                
        txtValorX.setEnabled(true);
                
        btnCalcular.setEnabled(true);
        btnLimpiar.setEnabled(false);
        
        txtX0.setText("");
        txtX1.setText("");
        txtX2.setText("");
        
        txtFx0.setText("");
        txtFx1.setText("");
        txtFx2.setText("");
        
        txtValorX.setText("");
        
        txtAreaResultado.setText("");
    }
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

        if ((car != '0' && car != '1' && car != '2' && car != '3' && car != '4' && car != '5'
                && car != '6' && car != '7' && car != '8' && car != '9' && car != '-' && car != '.')) {
            evt.consume();
        }
    }
}
