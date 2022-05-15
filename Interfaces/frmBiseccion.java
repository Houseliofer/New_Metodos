/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Clases.frame_panel;
import Clases.metodos.Biseccion;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author house
 */
public class frmBiseccion extends javax.swing.JFrame {

    frame_panel panel;
    /**
     * Creates new form frmBiseccion
     */
    public frmBiseccion() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/estadisticas.png")));
        btnCalcular.setEnabled(false);
        
        txtValorA.setEnabled(false);
        txtValorB.setEnabled(false);
        txtError.setEnabled(false);
        btnLimpiar.setEnabled(true);
        
        panel = new frame_panel(pnlGrafica,btnGraficar,txtFuncion,txtValorA,txtValorB);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        pnlGrafica = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResultados = new javax.swing.JTable();
        txtFuncion = new javax.swing.JTextField();
        txtValorB = new javax.swing.JTextField();
        txtError = new javax.swing.JTextField();
        txtValorA = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnGraficar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, -1, -1));

        btnRegresar.setBackground(new java.awt.Color(51, 51, 255));
        btnRegresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegresar.setForeground(java.awt.SystemColor.control);
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Método De Bisección", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout pnlGraficaLayout = new javax.swing.GroupLayout(pnlGrafica);
        pnlGrafica.setLayout(pnlGraficaLayout);
        pnlGraficaLayout.setHorizontalGroup(
            pnlGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );
        pnlGraficaLayout.setVerticalGroup(
            pnlGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        jPanel1.add(pnlGrafica, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 310, 420));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(java.awt.SystemColor.control);
        jLabel6.setText("Error : ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, -1, -1));

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

        tblResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "a", "b", "f(a)", "f(b)", "Xr", "f(Xr)", "Error"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblResultados);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 600, 250));
        jPanel1.add(txtFuncion, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 160, -1));

        txtValorB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorBKeyTyped(evt);
            }
        });
        jPanel1.add(txtValorB, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 160, -1));

        txtError.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtErrorKeyTyped(evt);
            }
        });
        jPanel1.add(txtError, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 160, -1));

        txtValorA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorAKeyTyped(evt);
            }
        });
        jPanel1.add(txtValorA, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 160, -1));

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 960, 460));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo Principal.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        frmInicio objInicio = new frmInicio();
        objInicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
          if(txtFuncion.getText().isEmpty() || txtValorA.getText().isEmpty() ||
                  txtValorB.getText().isEmpty() || txtError.getText().isEmpty())
              JOptionPane.showMessageDialog(null, "Porfavor Ingrese todos los datos", "Advertencia", JOptionPane.WARNING_MESSAGE);
          else{
              try{
                  double raiz;
                  Biseccion calculos = new Biseccion();
                  
                  calculos.setFuncion(txtFuncion.getText());
                  
                  raiz= calculos.biseccion(Double.parseDouble(txtValorA.getText()), 
                          Double.parseDouble(txtValorB.getText()),Double.parseDouble(txtError.getText()), tblResultados);
                  
                  btnCalcular.setEnabled(false);
                  
                  txtValorA.setEditable(false);
                  txtValorB.setEditable(false);
                  txtError.setEditable(false);
                  
                  JOptionPane.showMessageDialog(null,"Valor de la raiz : "+raiz,"Raiz",JOptionPane.INFORMATION_MESSAGE);
              }catch(Exception e){
                  JOptionPane.showMessageDialog(null,"Error en los calculos","Error",JOptionPane.ERROR_MESSAGE);
                  frmBiseccion frm = new frmBiseccion();
                  frm.setVisible(true);
                  this.dispose();
              }
          }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        frmBiseccion obj = new frmBiseccion();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficarActionPerformed
        // TODO add your handling code here:
        habilitarCampos();
    }//GEN-LAST:event_btnGraficarActionPerformed

    private void txtValorAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorAKeyTyped
        // TODO add your handling code here:
        Biseccion validar = new Biseccion();
        validar.validar(txtValorA, evt);
    }//GEN-LAST:event_txtValorAKeyTyped

    private void txtValorBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorBKeyTyped
        // TODO add your handling code here:
        Biseccion validar = new Biseccion();
        validar.validar(txtValorB, evt);
    }//GEN-LAST:event_txtValorBKeyTyped

    private void txtErrorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtErrorKeyTyped
        // TODO add your handling code here:
        Biseccion validar = new Biseccion();
        validar.validar(txtError, evt);
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
            java.util.logging.Logger.getLogger(frmBiseccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmBiseccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmBiseccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmBiseccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmBiseccion().setVisible(true);
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlGrafica;
    private javax.swing.JTable tblResultados;
    private javax.swing.JTextField txtError;
    private javax.swing.JTextField txtFuncion;
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
            txtError.setEnabled(true);
        }
    }
}
