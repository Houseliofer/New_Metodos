package Interfaces;

import Clases.Derivadas;
import Clases.Funcion;
import Clases.metodos.NewtonMultivariable;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.nfunk.jep.ParseException;

class frmNewtonMultivariable extends javax.swing.JFrame {

    Derivadas derivada;
    Funcion funcion1, funcion2, funcion1DCRX, funcion1DCRY, funcion2DCRX, funcion2DCRY;
    NewtonMultivariable calculos;

    public frmNewtonMultivariable() {
        initComponents();
        derivada = new Derivadas();
        this.setLocationRelativeTo(null);
        txtAreaResultado.setEditable(false);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/estadisticas.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegresar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFuncion1 = new javax.swing.JTextField();
        txtFuncion2 = new javax.swing.JTextField();
        txtX0 = new javax.swing.JTextField();
        txtY0 = new javax.swing.JTextField();
        txtError = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaResultado = new javax.swing.JTextArea();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegresar.setBackground(new java.awt.Color(51, 51, 255));
        btnRegresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegresar.setForeground(java.awt.SystemColor.control);
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, -1, -1));

        btnSalir.setBackground(new java.awt.Color(153, 0, 0));
        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Error :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Función f1(x,y) : ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Función f2(x,y) : ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("X0 : ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Y0 : ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));
        getContentPane().add(txtFuncion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 240, -1));
        getContentPane().add(txtFuncion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 240, -1));

        txtX0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtX0KeyTyped(evt);
            }
        });
        getContentPane().add(txtX0, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 240, -1));

        txtY0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtY0KeyTyped(evt);
            }
        });
        getContentPane().add(txtY0, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 240, -1));

        txtError.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtErrorKeyTyped(evt);
            }
        });
        getContentPane().add(txtError, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 240, -1));

        btnCalcular.setBackground(new java.awt.Color(51, 51, 255));
        btnCalcular.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCalcular.setForeground(java.awt.SystemColor.control);
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

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
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, -1, -1));

        txtAreaResultado.setColumns(20);
        txtAreaResultado.setRows(5);
        jScrollPane1.setViewportView(txtAreaResultado);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 900, 240));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo Principal.jpg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        frmInicio objInicio = new frmInicio();
        objInicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        if (txtFuncion1.getText().isEmpty() || txtFuncion2.getText().isEmpty()
                || txtX0.getText().isEmpty() || txtY0.getText().isEmpty()
                || txtError.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Termine De llenar los datos", "ERROR", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                establecerFunciones();

                calculos = new NewtonMultivariable(funcion1, funcion2, funcion1DCRX,
                        funcion1DCRY, funcion2DCRX, funcion2DCRY, Float.parseFloat(txtX0.getText()),
                        Float.parseFloat(txtY0.getText()), Float.parseFloat(txtError.getText()));
                System.out.println("Hola");
                calculos.calcular();

                txtAreaResultado.setText(calculos.getIteraciones());

                txtFuncion1.setEditable(false);
                txtFuncion1.setEditable(false);
                txtX0.setEditable(false);
                txtY0.setEditable(false);
                txtError.setEditable(false);

                btnCalcular.setEnabled(false);
                btnLimpiar.setEnabled(true);
            } catch (NumberFormatException | ParseException e) {
                frmNewtonMultivariable objInicio = new frmNewtonMultivariable();
                objInicio.setVisible(true);
                this.dispose();
                JOptionPane.showMessageDialog(null, "Error en los calculos", "ERROR", JOptionPane.WARNING_MESSAGE);
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

    private void txtY0KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtY0KeyTyped
        // TODO add your handling code here:
        validar(txtY0,evt);
    }//GEN-LAST:event_txtY0KeyTyped

    private void txtErrorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtErrorKeyTyped
        // TODO add your handling code here:
        validar(txtError,evt);
    }//GEN-LAST:event_txtErrorKeyTyped
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
            java.util.logging.Logger.getLogger(frmNewtonMultivariable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmNewtonMultivariable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmNewtonMultivariable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmNewtonMultivariable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmNewtonMultivariable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JTextArea txtAreaResultado;
    private javax.swing.JTextField txtError;
    private javax.swing.JTextField txtFuncion1;
    private javax.swing.JTextField txtFuncion2;
    private javax.swing.JTextField txtX0;
    private javax.swing.JTextField txtY0;
    // End of variables declaration//GEN-END:variables

    private void limpiar() {
        txtFuncion1.setEditable(true);
        txtFuncion1.setEditable(true);
        txtX0.setEditable(true);
        txtY0.setEditable(true);
        txtError.setEditable(true);

        btnCalcular.setEnabled(true);
        btnLimpiar.setEnabled(false);

        txtFuncion1.setText("");
        txtFuncion2.setText("");
        txtX0.setText("");
        txtY0.setText("");
        txtError.setText("");

        txtAreaResultado.setText("");
    }

    private void establecerFunciones() throws ParseException {
        String funcionDerivada;
        funcion1 = new Funcion(txtFuncion1.getText());
        funcion2 = new Funcion(txtFuncion2.getText());

        funcionDerivada = txtFuncion1.getText();
        derivada.setFuncion(funcionDerivada);
        derivada.derivarX();
        funcion1DCRX = new Funcion(derivada.getFuncion());

        funcionDerivada = txtFuncion1.getText();
        derivada.setFuncion(funcionDerivada);
        derivada.derivarY();
        funcion1DCRY = new Funcion(derivada.getFuncion());

        funcionDerivada = txtFuncion2.getText();
        derivada.setFuncion(funcionDerivada);
        derivada.derivarX();
        funcion2DCRX = new Funcion(derivada.getFuncion());

        funcionDerivada = txtFuncion2.getText();
        derivada.setFuncion(funcionDerivada);
        derivada.derivarY();
        funcion2DCRY = new Funcion(derivada.getFuncion());
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
