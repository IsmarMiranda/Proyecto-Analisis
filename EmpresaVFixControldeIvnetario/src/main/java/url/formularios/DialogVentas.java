/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package url.formularios;

/**
 *
 * @author IsmarMiranda
 */
public class DialogVentas extends javax.swing.JDialog {

    /**
     * Creates new form DialogVentas
     */
    public DialogVentas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
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
        jLabel16 = new javax.swing.JLabel();
        txtNombre = new java.awt.TextField();
        jLabel12 = new javax.swing.JLabel();
        txtDireccion = new java.awt.TextField();
        txtNit = new java.awt.TextField();
        txtBuscarNombre = new java.awt.TextField();
        txtDia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtMes = new javax.swing.JTextField();
        txtAnio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboBoxPrecio = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        comboBoxVendedores1 = new javax.swing.JComboBox();
        txtpassword = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableInventario = new javax.swing.JTable();
        garantia = new javax.swing.JRadioButton();
        venta = new javax.swing.JRadioButton();
        efectivo = new javax.swing.JRadioButton();
        tarjeta = new javax.swing.JRadioButton();
        labelTotal = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtBuscarCodigo = new java.awt.TextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableFactura = new javax.swing.JTable();
        labelTotal1 = new javax.swing.JLabel();
        btnFacturar = new javax.swing.JButton();
        btnDescuento = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1335, 750));
        jPanel1.setMinimumSize(new java.awt.Dimension(1335, 750));
        jPanel1.setLayout(null);

        jLabel16.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel16.setText("Nombre:");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(60, 60, 70, 30);

        txtNombre.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jPanel1.add(txtNombre);
        txtNombre.setBounds(140, 60, 520, 30);

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel12.setText("Dirección:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(60, 100, 70, 30);

        txtDireccion.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jPanel1.add(txtDireccion);
        txtDireccion.setBounds(140, 100, 400, 30);

        txtNit.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jPanel1.add(txtNit);
        txtNit.setBounds(590, 100, 300, 30);

        txtBuscarNombre.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txtBuscarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarNombreActionPerformed(evt);
            }
        });
        txtBuscarNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarNombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtBuscarNombre);
        txtBuscarNombre.setBounds(50, 170, 210, 30);
        jPanel1.add(txtDia);
        txtDia.setBounds(670, 60, 70, 30);

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel8.setText("NIT:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(550, 100, 40, 30);
        jPanel1.add(txtMes);
        txtMes.setBounds(750, 60, 70, 30);
        jPanel1.add(txtAnio);
        txtAnio.setBounds(830, 60, 70, 30);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setText("Vendedor:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(920, 60, 90, 23);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setText("MES");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(760, 30, 40, 23);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setText("DÍA ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(680, 30, 40, 23);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setText("AÑO");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(840, 30, 40, 23);

        comboBoxPrecio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PRECIO NORMAL", "PRECIO MAYORISTA", "PRECIO CLIENTE", "TODOS" }));
        comboBoxPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxPrecioActionPerformed(evt);
            }
        });
        jPanel1.add(comboBoxPrecio);
        comboBoxPrecio.setBounds(690, 170, 160, 40);

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel7.setText("Contraseña:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(920, 100, 110, 23);

        jPanel1.add(comboBoxVendedores1);
        comboBoxVendedores1.setBounds(1040, 60, 180, 26);

        txtpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpasswordKeyPressed(evt);
            }
        });
        jPanel1.add(txtpassword);
        txtpassword.setBounds(1040, 100, 180, 22);

        jScrollPane1.setEnabled(false);

        jTableInventario.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jTableInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CANT", "CODIGO", "CONCEPTO", "TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableInventario.setRowHeight(35);
        jScrollPane1.setViewportView(jTableInventario);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 220, 1210, 160);

        garantia.setText("GARANTIA");
        jPanel1.add(garantia);
        garantia.setBounds(870, 170, 100, 40);

        venta.setText("VENTA");
        jPanel1.add(venta);
        venta.setBounds(980, 170, 80, 40);

        efectivo.setText("EFECTIVO");
        jPanel1.add(efectivo);
        efectivo.setBounds(1170, 170, 100, 40);

        tarjeta.setText("TARJETA");
        jPanel1.add(tarjeta);
        tarjeta.setBounds(1070, 170, 90, 40);

        labelTotal.setFont(new java.awt.Font("Calibri", 1, 29)); // NOI18N
        labelTotal.setText("0.00");
        jPanel1.add(labelTotal);
        labelTotal.setBounds(940, 660, 240, 40);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("TOTAL:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(820, 660, 80, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        jLabel10.setText("Nombre");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(270, 170, 90, 40);

        jLabel11.setBackground(new java.awt.Color(255, 0, 51));
        jLabel11.setFont(new java.awt.Font("Calibri", 1, 32)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 51));
        jLabel11.setText("FACTURA");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(550, 390, 140, 30);

        txtBuscarCodigo.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txtBuscarCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarCodigoKeyTyped(evt);
            }
        });
        jPanel1.add(txtBuscarCodigo);
        txtBuscarCodigo.setBounds(370, 170, 210, 30);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        jLabel15.setText("Codigo");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(590, 170, 90, 40);

        jTableFactura.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jTableFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CANT", "CODIGO", "CONCEPTO", "TOTAL"
            }
        ));
        jTableFactura.setRowHeight(35);
        jScrollPane2.setViewportView(jTableFactura);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(50, 420, 1210, 210);

        labelTotal1.setFont(new java.awt.Font("Calibri", 1, 29)); // NOI18N
        labelTotal1.setText("Q.");
        jPanel1.add(labelTotal1);
        labelTotal1.setBounds(900, 660, 40, 40);

        btnFacturar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnFacturar.setForeground(new java.awt.Color(51, 51, 255));
        btnFacturar.setText("FACTURAR");
        btnFacturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturarActionPerformed(evt);
            }
        });
        jPanel1.add(btnFacturar);
        btnFacturar.setBounds(450, 650, 140, 40);

        btnDescuento.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnDescuento.setForeground(new java.awt.Color(255, 51, 51));
        btnDescuento.setText("DESCUENTO");
        btnDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescuentoActionPerformed(evt);
            }
        });
        jPanel1.add(btnDescuento);
        btnDescuento.setBounds(610, 650, 160, 40);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TEXTURA.jpg"))); // NOI18N
        jLabel13.setMaximumSize(new java.awt.Dimension(1335, 750));
        jLabel13.setMinimumSize(new java.awt.Dimension(1335, 750));
        jLabel13.setPreferredSize(new java.awt.Dimension(1335, 750));
        jPanel1.add(jLabel13);
        jLabel13.setBounds(0, 0, 1320, 730);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1320, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarNombreActionPerformed

    private void txtBuscarNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarNombreKeyPressed

    }//GEN-LAST:event_txtBuscarNombreKeyPressed

    private void txtBuscarNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarNombreKeyTyped
        

    }//GEN-LAST:event_txtBuscarNombreKeyTyped

    private void comboBoxPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxPrecioActionPerformed
        //LLAMAMOS A CADA METODO SEGUN EL COMBOBOX QUE SELECCIONE Y ASI IRAN APARENCIENDO LAS TABLAS

        
    }//GEN-LAST:event_comboBoxPrecioActionPerformed

    private void txtpasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtpasswordKeyPressed

    private void txtBuscarCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarCodigoKeyTyped
        
        
    }//GEN-LAST:event_txtBuscarCodigoKeyTyped

    private void btnFacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnFacturarActionPerformed

    private void btnDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescuentoActionPerformed
        
    }//GEN-LAST:event_btnDescuentoActionPerformed

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
            java.util.logging.Logger.getLogger(DialogVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogVentas dialog = new DialogVentas(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDescuento;
    private javax.swing.JButton btnFacturar;
    private javax.swing.JComboBox comboBoxPrecio;
    private javax.swing.JComboBox comboBoxVendedores1;
    private javax.swing.JRadioButton efectivo;
    private javax.swing.JRadioButton garantia;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableFactura;
    private javax.swing.JTable jTableInventario;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JLabel labelTotal1;
    private javax.swing.JRadioButton tarjeta;
    private javax.swing.JTextField txtAnio;
    private java.awt.TextField txtBuscarCodigo;
    private java.awt.TextField txtBuscarNombre;
    private javax.swing.JTextField txtDia;
    private java.awt.TextField txtDireccion;
    private javax.swing.JTextField txtMes;
    private java.awt.TextField txtNit;
    private java.awt.TextField txtNombre;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JRadioButton venta;
    // End of variables declaration//GEN-END:variables
}
