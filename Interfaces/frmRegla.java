package Interfaces;

import Clases.Funcion;
import Clases.metodos.ReglaFalsa;
import Clases.frame_panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class frmRegla extends javax.swing.JFrame {

    org.nfunk.jep.JEP funcion;
    frame_panel panel;
 
    public frmRegla() {
        initComponents();
        panel = new frame_panel(pnlGrafica,btnGraficar,txtFuncion,txtA,txtB);
        this.setLocationRelativeTo(null);
        txtAreaResultado.setEditable(false);
        funcion = new org.nfunk.jep.JEP();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/estadisticas.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtFuncion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtB = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtA = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtError = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnGraficar = new javax.swing.JButton();
        pnlGrafica = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaResultado = new javax.swing.JTextArea();
        lblPrincipal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(java.awt.SystemColor.control);
        jLabel1.setText("Función : ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        txtFuncion.setToolTipText("Ingrese La Función");
        getContentPane().add(txtFuncion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 220, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(java.awt.SystemColor.control);
        jLabel2.setText("Valor de B :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, -1, -1));

        txtB.setToolTipText("Ingrese El Valor de A");
        txtB.setEnabled(false);
        txtB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBKeyTyped(evt);
            }
        });
        getContentPane().add(txtB, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 210, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(java.awt.SystemColor.control);
        jLabel3.setText("Valor de A :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, -1));

        txtA.setToolTipText("Ingrese El Valor de B");
        txtA.setEnabled(false);
        txtA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAKeyTyped(evt);
            }
        });
        getContentPane().add(txtA, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 210, -1));

        btnSalir.setBackground(new java.awt.Color(153, 0, 0));
        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, -1, -1));

        btnRegresar.setBackground(new java.awt.Color(51, 51, 255));
        btnRegresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegresar.setForeground(java.awt.SystemColor.control);
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(java.awt.SystemColor.control);
        jLabel4.setText("Error : ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, -1, -1));

        txtError.setToolTipText("Ingrese El Porcentaje de Error");
        txtError.setEnabled(false);
        txtError.setName(""); // NOI18N
        txtError.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtErrorKeyTyped(evt);
            }
        });
        getContentPane().add(txtError, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 240, -1));

        btnCalcular.setBackground(new java.awt.Color(51, 51, 255));
        btnCalcular.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setText("Calcular");
        btnCalcular.setEnabled(false);
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, -1, -1));

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
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, -1, -1));

        btnGraficar.setBackground(new java.awt.Color(51, 51, 255));
        btnGraficar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnGraficar.setForeground(java.awt.SystemColor.control);
        btnGraficar.setText("Graficar");
        btnGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGraficar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, -1, -1));
        getContentPane().add(pnlGrafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 300, 410));

        txtAreaResultado.setColumns(20);
        txtAreaResultado.setRows(5);
        jScrollPane1.setViewportView(txtAreaResultado);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 690, 180));

        lblPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo Principal.jpg"))); // NOI18N
        getContentPane().add(lblPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 450));

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
        // TODO add your handling code here:
        try{
            Funcion f = new Funcion(txtFuncion.getText());
            ReglaFalsa rf = new ReglaFalsa();
            String raiz = rf.raiz(f, Double.parseDouble(txtA.getText()),Double.parseDouble(txtB.getText()),Double.parseDouble(txtError.getText()));
            txtAreaResultado.setText(rf.getIteraciones());

            
            btnLimpiar.setEnabled(true);
            btnCalcular.setEnabled(false);
            txtFuncion.setEditable(false);
            txtA.setEditable(false);
            txtB.setEditable(false);
            txtError.setEditable(false);
            
            JOptionPane.showMessageDialog(null,"Valor de La Raiz : "+raiz,"Valor",JOptionPane.INFORMATION_MESSAGE);
            }catch(Exception e){
                frmRegla objInicio = new frmRegla();
                objInicio.setVisible(true);
                this.dispose();
                JOptionPane.showMessageDialog(null,"Error en los calculos","ERROR",JOptionPane.WARNING_MESSAGE);
            
            }
        
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficarActionPerformed
        habilitarCampos(evt);
    }//GEN-LAST:event_btnGraficarActionPerformed

    private void txtAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAKeyTyped
        // TODO add your handling code here:
        validar(txtA, evt);
    }//GEN-LAST:event_txtAKeyTyped

    private void txtBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBKeyTyped
        // TODO add your handling code here:
        validar(txtB,evt);
    }//GEN-LAST:event_txtBKeyTyped

    private void txtErrorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtErrorKeyTyped
        // TODO add your handling code here:
        validar(txtError,evt);
    }//GEN-LAST:event_txtErrorKeyTyped

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
            java.util.logging.Logger.getLogger(frmRegla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnGraficar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPrincipal;
    private javax.swing.JPanel pnlGrafica;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextArea txtAreaResultado;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtError;
    private javax.swing.JTextField txtFuncion;
    // End of variables declaration//GEN-END:variables

    private void limpiar() {
        btnLimpiar.setEnabled(false);
        btnCalcular.setEnabled(false);
        btnGraficar.setEnabled(true);
        
        txtFuncion.setEditable(true);
        txtA.setEditable(true);
        txtB.setEditable(true);
        txtError.setEditable(true);
        
        txtFuncion.setText("");
        txtA.setText("");
        txtB.setText("");
        txtError.setText("");
        txtAreaResultado.setText("");
    }
    
    private void habilitarCampos(ActionEvent evt) {
        String s = "";
        if(txtFuncion.getText().isEmpty())
            JOptionPane.showMessageDialog(null,"Ingrese un valor en la funcion","ERROR",JOptionPane.WARNING_MESSAGE);
        else{
            btnCalcular.setEnabled(true);
            btnLimpiar.setEnabled(true);
            btnGraficar.setEnabled(false);
            
            txtError.setEnabled(true);
            txtA.setEnabled(true);
            txtB.setEnabled(true);
            txtFuncion.setEditable(false);
        }
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
