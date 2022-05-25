package Interfaces;

import java.awt.Toolkit;

public class frmInicio extends javax.swing.JFrame {
    public frmInicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/estadisticas.png")));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        btnRegla = new javax.swing.JButton();
        btnNewton = new javax.swing.JButton();
        btnBiseccion = new javax.swing.JButton();
        btnSecante = new javax.swing.JButton();
        btnNewtonMultivariable = new javax.swing.JButton();
        btnRegresionLineal = new javax.swing.JButton();
        btnInterpolacionCuadratica = new javax.swing.JButton();
        btnGaussSeidel = new javax.swing.JButton();
        btnRegresionhCuadratica = new javax.swing.JButton();
        btnTrapecio = new javax.swing.JButton();
        btnSimpsonTercio = new javax.swing.JButton();
        btnInterpolacionLineal = new javax.swing.JButton();
        btnLagrange = new javax.swing.JButton();
        btnInterpolacionNewton = new javax.swing.JButton();
        btnGaussJordan = new javax.swing.JButton();
        btnGaussiana = new javax.swing.JButton();
        btnInstrucciones = new javax.swing.JButton();
        btnSimpsonOctavo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTec = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setIconImages(null);
        setUndecorated(true);
        setResizable(false);
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
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, -1, -1));

        btnRegla.setBackground(new java.awt.Color(0, 0, 0));
        btnRegla.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegla.setForeground(new java.awt.Color(255, 255, 255));
        btnRegla.setText("Método de Regla Falsa");
        btnRegla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReglaActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 300, -1));

        btnNewton.setBackground(new java.awt.Color(0, 0, 0));
        btnNewton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNewton.setForeground(new java.awt.Color(255, 255, 255));
        btnNewton.setText("Método de Newton-Rhapson");
        btnNewton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewtonActionPerformed(evt);
            }
        });
        getContentPane().add(btnNewton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 300, -1));

        btnBiseccion.setBackground(new java.awt.Color(0, 0, 0));
        btnBiseccion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBiseccion.setForeground(new java.awt.Color(255, 255, 255));
        btnBiseccion.setText("Método de Bisección");
        btnBiseccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBiseccionActionPerformed(evt);
            }
        });
        getContentPane().add(btnBiseccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 300, -1));

        btnSecante.setBackground(new java.awt.Color(0, 0, 0));
        btnSecante.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSecante.setForeground(new java.awt.Color(255, 255, 255));
        btnSecante.setText("Método de la Secante");
        btnSecante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSecanteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSecante, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 300, -1));

        btnNewtonMultivariable.setBackground(new java.awt.Color(0, 0, 0));
        btnNewtonMultivariable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNewtonMultivariable.setForeground(new java.awt.Color(255, 255, 255));
        btnNewtonMultivariable.setText("Método Newton-Rhapson Multivariable");
        btnNewtonMultivariable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewtonMultivariableActionPerformed(evt);
            }
        });
        getContentPane().add(btnNewtonMultivariable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 300, -1));

        btnRegresionLineal.setBackground(new java.awt.Color(0, 0, 0));
        btnRegresionLineal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegresionLineal.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresionLineal.setText("Regresión Lineal");
        btnRegresionLineal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresionLinealActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresionLineal, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, 300, -1));

        btnInterpolacionCuadratica.setBackground(new java.awt.Color(0, 0, 0));
        btnInterpolacionCuadratica.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnInterpolacionCuadratica.setForeground(new java.awt.Color(255, 255, 255));
        btnInterpolacionCuadratica.setText("Interpolación Cuadrática");
        btnInterpolacionCuadratica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInterpolacionCuadraticaActionPerformed(evt);
            }
        });
        getContentPane().add(btnInterpolacionCuadratica, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 300, -1));

        btnGaussSeidel.setBackground(new java.awt.Color(0, 0, 0));
        btnGaussSeidel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGaussSeidel.setForeground(new java.awt.Color(255, 255, 255));
        btnGaussSeidel.setText("Método Gauss - Seidel");
        btnGaussSeidel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGaussSeidelActionPerformed(evt);
            }
        });
        getContentPane().add(btnGaussSeidel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 300, -1));

        btnRegresionhCuadratica.setBackground(new java.awt.Color(0, 0, 0));
        btnRegresionhCuadratica.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegresionhCuadratica.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresionhCuadratica.setText("Regresión Cuadrática");
        btnRegresionhCuadratica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresionhCuadraticaActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresionhCuadratica, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 320, 300, -1));

        btnTrapecio.setBackground(new java.awt.Color(0, 0, 0));
        btnTrapecio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnTrapecio.setForeground(new java.awt.Color(255, 255, 255));
        btnTrapecio.setText("Metodo del Trapecio");
        btnTrapecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrapecioActionPerformed(evt);
            }
        });
        getContentPane().add(btnTrapecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 300, -1));

        btnSimpsonTercio.setBackground(new java.awt.Color(0, 0, 0));
        btnSimpsonTercio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSimpsonTercio.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpsonTercio.setText("Metodo de Simpson 1/3");
        btnSimpsonTercio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpsonTercioActionPerformed(evt);
            }
        });
        getContentPane().add(btnSimpsonTercio, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 300, -1));

        btnInterpolacionLineal.setBackground(new java.awt.Color(0, 0, 0));
        btnInterpolacionLineal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnInterpolacionLineal.setForeground(new java.awt.Color(255, 255, 255));
        btnInterpolacionLineal.setText("Interpolación Lineal");
        btnInterpolacionLineal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInterpolacionLinealActionPerformed(evt);
            }
        });
        getContentPane().add(btnInterpolacionLineal, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, 300, -1));

        btnLagrange.setBackground(new java.awt.Color(0, 0, 0));
        btnLagrange.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLagrange.setForeground(new java.awt.Color(255, 255, 255));
        btnLagrange.setText("Interpolación LaGrange");
        btnLagrange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLagrangeActionPerformed(evt);
            }
        });
        getContentPane().add(btnLagrange, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, 300, -1));

        btnInterpolacionNewton.setBackground(new java.awt.Color(0, 0, 0));
        btnInterpolacionNewton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnInterpolacionNewton.setForeground(new java.awt.Color(255, 255, 255));
        btnInterpolacionNewton.setText("Interpolación Newton");
        btnInterpolacionNewton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInterpolacionNewtonActionPerformed(evt);
            }
        });
        getContentPane().add(btnInterpolacionNewton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, 300, -1));

        btnGaussJordan.setBackground(new java.awt.Color(0, 0, 0));
        btnGaussJordan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGaussJordan.setForeground(new java.awt.Color(255, 255, 255));
        btnGaussJordan.setText("Gauss - Jordan");
        btnGaussJordan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGaussJordanActionPerformed(evt);
            }
        });
        getContentPane().add(btnGaussJordan, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 300, -1));

        btnGaussiana.setBackground(new java.awt.Color(0, 0, 0));
        btnGaussiana.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGaussiana.setForeground(new java.awt.Color(255, 255, 255));
        btnGaussiana.setText("Eliminación Gaussiana");
        btnGaussiana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGaussianaActionPerformed(evt);
            }
        });
        getContentPane().add(btnGaussiana, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 300, -1));

        btnInstrucciones.setBackground(new java.awt.Color(0, 255, 51));
        btnInstrucciones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnInstrucciones.setText("Instrucciones");
        btnInstrucciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstruccionesActionPerformed(evt);
            }
        });
        getContentPane().add(btnInstrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 300, -1));

        btnSimpsonOctavo.setBackground(new java.awt.Color(0, 0, 0));
        btnSimpsonOctavo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSimpsonOctavo.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpsonOctavo.setText("Metodo Simpson 3/8");
        btnSimpsonOctavo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpsonOctavoActionPerformed(evt);
            }
        });
        getContentPane().add(btnSimpsonOctavo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 300, -1));

        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(102, 102, 102), null));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 320, 360));

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(102, 102, 102), null));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 320, 360));

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(102, 102, 102), null));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 320, 360));

        lblTec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2.png"))); // NOI18N
        getContentPane().add(lblTec, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo Principal.jpg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnReglaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReglaActionPerformed
        frmRegla objRegla = new frmRegla();
        objRegla.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReglaActionPerformed

    private void btnNewtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewtonActionPerformed
        frmNewton objNewton = new frmNewton();
        objNewton.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNewtonActionPerformed

    private void btnBiseccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBiseccionActionPerformed
        frmBiseccion obj = new  frmBiseccion();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBiseccionActionPerformed

    private void btnSecanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSecanteActionPerformed
        frmSecante obj = new frmSecante();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSecanteActionPerformed

    private void btnNewtonMultivariableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewtonMultivariableActionPerformed
        frmNewtonMultivariable objNewton = new frmNewtonMultivariable();
        objNewton.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNewtonMultivariableActionPerformed

    private void btnRegresionLinealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresionLinealActionPerformed
        frmRegresionLineal obj = new frmRegresionLineal();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresionLinealActionPerformed

    private void btnInterpolacionCuadraticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInterpolacionCuadraticaActionPerformed
        frmInterpolacionCuadratica objInter = new frmInterpolacionCuadratica();
        objInter.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInterpolacionCuadraticaActionPerformed

    private void btnGaussSeidelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGaussSeidelActionPerformed
        frmSeidel obj = new frmSeidel();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGaussSeidelActionPerformed

    private void btnRegresionhCuadraticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresionhCuadraticaActionPerformed
        frmRegresionCuadratica obj = new frmRegresionCuadratica();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresionhCuadraticaActionPerformed

    private void btnInterpolacionLinealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInterpolacionLinealActionPerformed
        frmInterpolacionLineal frm;
        frm = new frmInterpolacionLineal();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInterpolacionLinealActionPerformed

    private void btnLagrangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLagrangeActionPerformed
        frmInterpolacionLaGrange objInter = new frmInterpolacionLaGrange();
        objInter.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLagrangeActionPerformed

    private void btnInterpolacionNewtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInterpolacionNewtonActionPerformed
        frmInterpolacionNewton objInter = new frmInterpolacionNewton();
        objInter.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInterpolacionNewtonActionPerformed

    private void btnGaussJordanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGaussJordanActionPerformed
        frmGaussJordan obj= new frmGaussJordan();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGaussJordanActionPerformed

    private void btnGaussianaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGaussianaActionPerformed
        frmEliminasion obj = new frmEliminasion();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGaussianaActionPerformed

    private void btnInstruccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstruccionesActionPerformed
        frmInstrucciones objIns = new frmInstrucciones();
        objIns.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInstruccionesActionPerformed

    private void btnTrapecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrapecioActionPerformed
        // TODO add your handling code here:
        frmTrapecio obj = new frmTrapecio();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTrapecioActionPerformed

    private void btnSimpsonTercioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpsonTercioActionPerformed
        frmSimpsonTercio obj = new frmSimpsonTercio();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSimpsonTercioActionPerformed

    private void btnSimpsonOctavoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpsonOctavoActionPerformed
        // TODO add your handling code here:
        frmSimpsonOctavo obj = new frmSimpsonOctavo();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSimpsonOctavoActionPerformed
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
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBiseccion;
    private javax.swing.JButton btnGaussJordan;
    private javax.swing.JButton btnGaussSeidel;
    private javax.swing.JButton btnGaussiana;
    private javax.swing.JButton btnInstrucciones;
    private javax.swing.JButton btnInterpolacionCuadratica;
    private javax.swing.JButton btnInterpolacionLineal;
    private javax.swing.JButton btnInterpolacionNewton;
    private javax.swing.JButton btnLagrange;
    private javax.swing.JButton btnNewton;
    private javax.swing.JButton btnNewtonMultivariable;
    private javax.swing.JButton btnRegla;
    private javax.swing.JButton btnRegresionLineal;
    private javax.swing.JButton btnRegresionhCuadratica;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSecante;
    private javax.swing.JButton btnSimpsonOctavo;
    private javax.swing.JButton btnSimpsonTercio;
    private javax.swing.JButton btnTrapecio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblTec;
    // End of variables declaration//GEN-END:variables
}
