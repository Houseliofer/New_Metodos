package Interfaces;

import Clases.metodos.GaussJordan;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class frmGaussJordan extends javax.swing.JFrame {

    int numeroIncognitas;

    DecimalFormat formateador = new DecimalFormat("#.######");
    DefaultTableModel model = new DefaultTableModel();
    Boolean ban = false;
    GaussJordan gj;

    public final int max = 20;
    public double[][] m = new double[max][max];

    public frmGaussJordan() {
        initComponents();
        txtResultados.setEditable(false);
        this.setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/estadisticas.png")));
        btnLimpiar.setEnabled(true);
        btnCalcular.setEnabled(false);
    }

    public int getNumeroIncognitas() {
        return numeroIncognitas;
    }

    public void setNumeroIncognitas(int numeroIncognitas) {
        this.numeroIncognitas = numeroIncognitas;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegresar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfDimension = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnGenerarMatriz = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtResultados = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegresar.setBackground(new java.awt.Color(51, 51, 255));
        btnRegresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText(" Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, -1, -1));

        btnSalir.setBackground(new java.awt.Color(153, 0, 0));
        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Método de eliminación Gauss-Jordan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Digite el número de incognitas: ");

        tfDimension.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfDimensionKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Digite los valores de las ecuaciones:");

        btnCalcular.setBackground(new java.awt.Color(51, 51, 255));
        btnCalcular.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(51, 51, 255));
        btnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGenerarMatriz.setBackground(new java.awt.Color(51, 51, 255));
        btnGenerarMatriz.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGenerarMatriz.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerarMatriz.setText("Generar matriz");
        btnGenerarMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarMatrizActionPerformed(evt);
            }
        });

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "x"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDatos);

        txtResultados.setColumns(20);
        txtResultados.setRows(5);
        jScrollPane2.setViewportView(txtResultados);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfDimension, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnGenerarMatriz)
                                .addComponent(btnCalcular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnGenerarMatriz)
                    .addComponent(tfDimension, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCalcular)
                        .addGap(32, 32, 32)
                        .addComponent(btnLimpiar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 660, 370));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo Principal.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        frmGaussJordan ob = new frmGaussJordan();
        ob.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        frmInicio objInicio = new frmInicio();
        objInicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnGenerarMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarMatrizActionPerformed
        try {
            //numeroIncognitas = Integer.parseInt(jTextField1.getText());
            this.setNumeroIncognitas(Integer.parseInt(tfDimension.getText()));
            numeroIncognitas = getNumeroIncognitas();

            if (numeroIncognitas <= 1) {
                throw new Exception("Número de incógnitas inválido.");
            }

            Object columna[] = new Object[numeroIncognitas + 1];

            for (int i = 0; i < numeroIncognitas + 1; i++) {
                if (i < numeroIncognitas) {
                    columna[i] = "X" + (i + 1);
                } else {
                    columna[i] = "D";
                }
            }

            model = new DefaultTableModel(columna, numeroIncognitas);
            tblDatos.setModel(model);

            tfDimension.setEnabled(false);
            btnGenerarMatriz.setEnabled(false);
            btnCalcular.setEnabled(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnGenerarMatrizActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        try {
            tblDatos.setEnabled(false);
            
            int numeroIncognitas = getNumeroIncognitas();
            GaussJordan gj = new GaussJordan(numeroIncognitas);
            double[] r = new double[numeroIncognitas];

            for (int i = 0; i < numeroIncognitas; i++) {
                for (int j = 0; j <= numeroIncognitas; j++) {
                    m[i][j] = Double.parseDouble(String.valueOf(tblDatos.getValueAt(i, j).toString()));
                }
            }

            gj.matrizCalculo(m);

            for (int i = 0; i < numeroIncognitas; i++) {
                txtResultados.append("X" + i + " = " + formateador.format(gj.ecuacion[i][numeroIncognitas]) + "\n");
            }
            
            btnLimpiar.setEnabled(true);

            btnCalcular.setEnabled(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en los calculos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void tfDimensionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDimensionKeyTyped
        // TODO add your handling code here:
        validar(tfDimension,evt);
    }//GEN-LAST:event_tfDimensionKeyTyped

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
            java.util.logging.Logger.getLogger(frmGaussJordan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmGaussJordan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmGaussJordan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmGaussJordan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmGaussJordan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnGenerarMatriz;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField tfDimension;
    private javax.swing.JTextArea txtResultados;
    // End of variables declaration//GEN-END:variables
    
    public void validar(JTextField txt, KeyEvent evt) {
        char car = evt.getKeyChar();
        if (( car != '1' && car != '2' && car != '3' && car != '4' && car != '5'
                && car != '6' && car != '7' && car != '8' && car != '9')) 
            evt.consume();
        
    }
}
