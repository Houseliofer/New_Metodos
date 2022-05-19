/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases.Funcion;
import Clases.frame_panel;
import Clases.metodos.SimpsonTercio;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author house
 */
public class frmSimpsonTercio extends javax.swing.JFrame {

    frame_panel panel;
    /**
     * Creates new form frmSimpsonTercio
     */
    public frmSimpsonTercio() {
        initComponents();
        panel = new frame_panel(pnlGrafica, btnGraficar, txtFuncion, txtValorA, txtValorB);
        this.setLocationRelativeTo(null);
        btnCalcular.setEnabled(false);
        btnLimpiar.setEnabled(true);

        txtFuncion.setEnabled(true);
        txtValorA.setEnabled(false);
        txtValorB.setEnabled(false);
        txtN.setEnabled(false);
        txtResultado.setEnabled(false);
        tblTabla.setEnabled(false);
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/estadisticas.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlGrafica = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnGraficar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtFuncion = new javax.swing.JTextField();
        txtValorA = new javax.swing.JTextField();
        txtValorB = new javax.swing.JTextField();
        txtN = new javax.swing.JTextField();
        txtResultado = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Metodo de Simpson 1/3", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout pnlGraficaLayout = new javax.swing.GroupLayout(pnlGrafica);
        pnlGrafica.setLayout(pnlGraficaLayout);
        pnlGraficaLayout.setHorizontalGroup(
            pnlGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        pnlGraficaLayout.setVerticalGroup(
            pnlGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        jPanel1.add(pnlGrafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 320, 350));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(java.awt.SystemColor.control);
        jLabel7.setText("Funcion : ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(java.awt.SystemColor.control);
        jLabel8.setText("Valor de A : ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(java.awt.SystemColor.control);
        jLabel9.setText("Valor de B : ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(java.awt.SystemColor.control);
        jLabel6.setText("Resultado : ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, -1, -1));

        btnGraficar.setBackground(new java.awt.Color(51, 51, 255));
        btnGraficar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnGraficar.setForeground(java.awt.SystemColor.control);
        btnGraficar.setText("Graficar");
        btnGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGraficar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, 140, -1));

        btnCalcular.setBackground(new java.awt.Color(51, 51, 255));
        btnCalcular.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCalcular.setForeground(java.awt.SystemColor.control);
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, 140, -1));

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
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, 140, -1));
        jPanel1.add(txtFuncion, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 160, -1));

        txtValorA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorAKeyTyped(evt);
            }
        });
        jPanel1.add(txtValorA, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 160, -1));

        txtValorB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorBKeyTyped(evt);
            }
        });
        jPanel1.add(txtValorB, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 160, -1));

        txtN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNKeyTyped(evt);
            }
        });
        jPanel1.add(txtN, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 160, -1));

        txtResultado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtResultadoKeyTyped(evt);
            }
        });
        jPanel1.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 160, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(java.awt.SystemColor.control);
        jLabel10.setText("Valor de N : ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, -1, -1));

        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "i", "xi", "f(xi)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblTabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 440, 150));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 810, 390));

        btnSalir.setBackground(new java.awt.Color(153, 0, 0));
        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, -1, -1));

        btnRegresar.setBackground(new java.awt.Color(51, 51, 255));
        btnRegresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegresar.setForeground(java.awt.SystemColor.control);
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo Principal.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficarActionPerformed
        habilitarCampos();
    }//GEN-LAST:event_btnGraficarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        if (txtValorA.getText().isEmpty() || txtValorB.getText().isEmpty()
            || txtN.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese todos los datos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            float residuo;
            residuo = Float.parseFloat(txtN.getText())%2;
            if(residuo!=0)
                JOptionPane.showMessageDialog(null,"Ingrese N par","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
            else{
            try {
                Funcion f = new Funcion(txtFuncion.getText());
                SimpsonTercio calculos = new SimpsonTercio();

                txtResultado.setText(
                    calculos.calcular(
                        f,
                        Integer.parseInt(txtN.getText()),
                        Float.parseFloat(txtValorA.getText()),
                        Float.parseFloat(txtValorB.getText()),
                        tblTabla
                    )
                );

                btnCalcular.setEnabled(false);
                btnLimpiar.setEnabled(true);

                txtValorA.setEnabled(false);
                txtValorB.setEnabled(false);
                txtN.setEnabled(false);

            } catch (Exception e) {
                frmSimpsonTercio obj = new frmSimpsonTercio();
                obj.setVisible(true);
                this.dispose();
                JOptionPane.showMessageDialog(null, "Error en los calculos", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            }
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        frmSimpsonTercio obj = new frmSimpsonTercio();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtValorAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorAKeyTyped
        // TODO add your handling code here:
        validar(txtValorA, evt);
    }//GEN-LAST:event_txtValorAKeyTyped

    private void txtValorBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorBKeyTyped
        // TODO add your handling code here:
        validar(txtValorB, evt);
    }//GEN-LAST:event_txtValorBKeyTyped

    private void txtNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNKeyTyped
        // TODO add your handling code here:
        validarPar(txtN, evt);
        
        
        
    }//GEN-LAST:event_txtNKeyTyped

    private void txtResultadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtResultadoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultadoKeyTyped

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
            java.util.logging.Logger.getLogger(frmSimpsonTercio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSimpsonTercio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSimpsonTercio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSimpsonTercio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSimpsonTercio().setVisible(true);
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlGrafica;
    private javax.swing.JTable tblTabla;
    private javax.swing.JTextField txtFuncion;
    private javax.swing.JTextField txtN;
    private javax.swing.JTextField txtResultado;
    private javax.swing.JTextField txtValorA;
    private javax.swing.JTextField txtValorB;
    // End of variables declaration//GEN-END:variables

    private void habilitarCampos() {
        if (txtFuncion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un valor en la funcion", "ERROR", JOptionPane.WARNING_MESSAGE);
        } else {
            btnCalcular.setEnabled(true);
            btnLimpiar.setEnabled(true);
            btnGraficar.setEnabled(false);

            txtFuncion.setEnabled(false);
            txtValorA.setEnabled(true);
            txtValorB.setEnabled(true);
            txtN.setEnabled(true);
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
    public void validarPar(JTextField txt,KeyEvent evt){
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

        if ((car != '0' && car != '1' && car != '2' && car != '4'
                && car != '6' && car != '8' && car != '9')) {
            evt.consume();
        }
    }
}
