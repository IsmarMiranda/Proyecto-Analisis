/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.Formularios;

/**
 *
 * @author IsmarMiranda
 */
public class DialogInventario extends javax.swing.JDialog {

    /**
     * Creates new form DialogInventario
     */
    public DialogInventario(java.awt.Frame parent, boolean modal) {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        panelInventario = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableInventario = new javax.swing.JTable();
        txtBuscarNombre1 = new javax.swing.JTextField();
        txtBuscarCodigo1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        panelIngresarProducto = new javax.swing.JPanel();
        categoria = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMayorista = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        txtClienteFrec = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtExistencia = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtprecio = new javax.swing.JTextField();
        labelIcon = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtColor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1631, 773));
        setMinimumSize(new java.awt.Dimension(1631, 773));

        panelInventario.setBackground(new java.awt.Color(255, 255, 255));
        panelInventario.setLayout(null);

        jTableInventario.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jTableInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NO.", "CODIGO", "CATEGORIA", "PRODUCTO", "EXISTENCIA", "COLOR", "MODELO", "MARCA", "TIPO", "PRECIO", "MAYORISTA", "CLIENTE FREC."
            }
        ));
        jTableInventario.setRowHeight(35);
        jScrollPane1.setViewportView(jTableInventario);

        panelInventario.add(jScrollPane1);
        jScrollPane1.setBounds(20, 280, 1590, 340);

        txtBuscarNombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarNombre1KeyTyped(evt);
            }
        });
        panelInventario.add(txtBuscarNombre1);
        txtBuscarNombre1.setBounds(20, 190, 570, 40);

        txtBuscarCodigo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarCodigo1KeyTyped(evt);
            }
        });
        panelInventario.add(txtBuscarCodigo1);
        txtBuscarCodigo1.setBounds(20, 130, 570, 40);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        panelInventario.add(jLabel12);
        jLabel12.setBounds(610, 130, 36, 40);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        panelInventario.add(jLabel17);
        jLabel17.setBounds(610, 190, 40, 40);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1628, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 1628, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 754, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("INVENTARIO", jPanel1);

        panelIngresarProducto.setBackground(new java.awt.Color(255, 255, 255));
        panelIngresarProducto.setLayout(null);

        categoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CABLES", "VIDRIOS TEMPLADOS", "AUDIFONOS", "PROTECTORES", "CARGADORES", "REPUESTOS", "ACCESORIOS", "OTROS", "TELEFONOS MOVILES" }));
        panelIngresarProducto.add(categoria);
        categoria.setBounds(220, 80, 490, 40);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel1.setText("MODELO:");
        panelIngresarProducto.add(jLabel1);
        jLabel1.setBounds(110, 240, 90, 20);
        panelIngresarProducto.add(txtModelo);
        txtModelo.setBounds(220, 230, 490, 40);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel2.setText("CATEGORÍA:");
        panelIngresarProducto.add(jLabel2);
        jLabel2.setBounds(110, 90, 90, 20);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel3.setText("MARCA:");
        panelIngresarProducto.add(jLabel3);
        jLabel3.setBounds(110, 340, 90, 20);
        panelIngresarProducto.add(txtMarca);
        txtMarca.setBounds(220, 330, 490, 40);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel4.setText("MAYORISTA:");
        panelIngresarProducto.add(jLabel4);
        jLabel4.setBounds(110, 590, 90, 20);
        panelIngresarProducto.add(txtMayorista);
        txtMayorista.setBounds(220, 580, 490, 40);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel5.setText("CÓDIGO");
        panelIngresarProducto.add(jLabel5);
        jLabel5.setBounds(110, 140, 90, 20);
        panelIngresarProducto.add(txtCodigo);
        txtCodigo.setBounds(220, 130, 490, 40);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel6.setText("NOMBRE:");
        panelIngresarProducto.add(jLabel6);
        jLabel6.setBounds(110, 190, 90, 20);
        panelIngresarProducto.add(txtNombre);
        txtNombre.setBounds(220, 180, 490, 40);

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel7.setText("TIPO:");
        panelIngresarProducto.add(jLabel7);
        jLabel7.setBounds(110, 390, 90, 20);
        panelIngresarProducto.add(txtTipo);
        txtTipo.setBounds(220, 380, 490, 40);

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel8.setText("DESCRIPCIÓN:");
        panelIngresarProducto.add(jLabel8);
        jLabel8.setBounds(110, 440, 110, 20);
        panelIngresarProducto.add(txtDescripcion);
        txtDescripcion.setBounds(220, 430, 490, 40);
        panelIngresarProducto.add(txtClienteFrec);
        txtClienteFrec.setBounds(220, 630, 490, 40);

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel10.setText("EXISTENCIA:");
        panelIngresarProducto.add(jLabel10);
        jLabel10.setBounds(110, 490, 90, 20);
        panelIngresarProducto.add(txtExistencia);
        txtExistencia.setBounds(220, 480, 490, 40);

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel11.setText("PRECIO:");
        panelIngresarProducto.add(jLabel11);
        jLabel11.setBounds(110, 540, 90, 20);
        panelIngresarProducto.add(txtprecio);
        txtprecio.setBounds(220, 530, 490, 40);

        labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/foto.jpg"))); // NOI18N
        labelIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelIconMouseClicked(evt);
            }
        });
        panelIngresarProducto.add(labelIcon);
        labelIcon.setBounds(980, 80, 510, 430);

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel13.setText("CLIENTE FREC:");
        panelIngresarProducto.add(jLabel13);
        jLabel13.setBounds(110, 640, 110, 20);

        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setText("INGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelIngresarProducto.add(jButton1);
        jButton1.setBounds(980, 520, 230, 50);
        panelIngresarProducto.add(txtColor);
        txtColor.setBounds(220, 280, 490, 40);

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel9.setText("COLOR:");
        panelIngresarProducto.add(jLabel9);
        jLabel9.setBounds(110, 290, 90, 20);

        btnActualizar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        panelIngresarProducto.add(btnActualizar);
        btnActualizar.setBounds(1230, 520, 230, 50);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1628, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelIngresarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 1628, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 754, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelIngresarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("INGRESAR PRODUCTO", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarNombre1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarNombre1KeyTyped
        // TODO add your handling code here:
       

    }//GEN-LAST:event_txtBuscarNombre1KeyTyped

    private void txtBuscarCodigo1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarCodigo1KeyTyped
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtBuscarCodigo1KeyTyped

    private void labelIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelIconMouseClicked

       
    }//GEN-LAST:event_labelIconMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
   
   

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        //--------------------------------------------------------------------------------------------------------------------------------------------------------
       
       
    }//GEN-LAST:event_btnActualizarActionPerformed

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
            java.util.logging.Logger.getLogger(DialogInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogInventario dialog = new DialogInventario(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnActualizar;
    private javax.swing.JComboBox categoria;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableInventario;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JPanel panelIngresarProducto;
    private javax.swing.JPanel panelInventario;
    private javax.swing.JTextField txtBuscarCodigo1;
    private javax.swing.JTextField txtBuscarNombre1;
    private javax.swing.JTextField txtClienteFrec;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtExistencia;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtMayorista;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables
}
