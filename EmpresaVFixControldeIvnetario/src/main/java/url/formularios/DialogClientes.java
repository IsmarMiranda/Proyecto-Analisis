/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package url.Formularios;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import url.modulo.controladoresBD.Clientes;
import url.controladores.ClientesJpaController;
import url.conexionBD.Conexion;
import url.modulo.inventario.FiltroBusqueda;

/**
 *
 * @author IsmarMiranda
 */
public class DialogClientes extends javax.swing.JDialog {
    
    

    /**
     * Creates new form DialogClientes
     */
    public DialogClientes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        buttonGroup1.add(rbstar1);
        buttonGroup1.add(rbStar2);
        buttonGroup1.add(rbsStar3);
        buttonGroup1.add(rbStar4);
        buttonGroup1.add(rbStar5);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtCodig = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableClientes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtFechaNacimiento = new javax.swing.JTextField();
        txtBuscar = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jlabelEstrella5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        btnIngresar1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jlabelEstrella1 = new javax.swing.JLabel();
        jlabelEstrella2 = new javax.swing.JLabel();
        jlabelEstrella3 = new javax.swing.JLabel();
        jlabelEstrella4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rbStar5 = new javax.swing.JRadioButton();
        rbstar1 = new javax.swing.JRadioButton();
        rbStar2 = new javax.swing.JRadioButton();
        rbsStar3 = new javax.swing.JRadioButton();
        rbStar4 = new javax.swing.JRadioButton();
        btnActualizar = new javax.swing.JButton();
        lblTextura = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);
        jPanel1.add(txtCodig);
        txtCodig.setBounds(190, 90, 270, 30);

        tableClientes.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        tableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "TELEFONO", "FECHA NAC."
            }
        ));
        tableClientes.setRowHeight(35);
        jScrollPane1.setViewportView(tableClientes);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(60, 400, 930, 290);

        jLabel1.setText("Código:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 90, 70, 30);
        jPanel1.add(txtNombre);
        txtNombre.setBounds(190, 130, 270, 30);
        jPanel1.add(txtFechaNacimiento);
        txtFechaNacimiento.setBounds(190, 210, 270, 30);

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });
        jPanel1.add(txtBuscar);
        txtBuscar.setBounds(60, 340, 420, 40);
        jPanel1.add(txtTelefono);
        txtTelefono.setBounds(190, 170, 270, 30);

        jlabelEstrella5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/url/imagenes/estrella.jpg"))); // NOI18N
        jlabelEstrella5.setText("Fecha Nacimiento:");
        jPanel1.add(jlabelEstrella5);
        jlabelEstrella5.setBounds(890, 150, 100, 100);

        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 130, 80, 30);

        jLabel3.setText("Teléfono:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 170, 90, 30);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("INGRESAR NUEVO CLIENTE");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(150, 50, 370, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(500, 340, 40, 40);

        btnIngresar.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(0, 0, 255));
        btnIngresar.setText("INGRESAR");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresar);
        btnIngresar.setBounds(190, 260, 120, 50);

        btnIngresar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/url/imagenes/refresh.png"))); // NOI18N
        btnIngresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresar1);
        btnIngresar1.setBounds(930, 340, 60, 50);

        jLabel6.setText("Fecha Nacimiento:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(60, 210, 120, 30);

        jlabelEstrella1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/url/imagenes/estrella.jpg"))); // NOI18N
        jlabelEstrella1.setText("Fecha Nacimiento:");
        jPanel1.add(jlabelEstrella1);
        jlabelEstrella1.setBounds(490, 150, 100, 100);

        jlabelEstrella2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/url/imagenes/estrella.jpg"))); // NOI18N
        jlabelEstrella2.setText("Fecha Nacimiento:");
        jPanel1.add(jlabelEstrella2);
        jlabelEstrella2.setBounds(590, 150, 100, 100);

        jlabelEstrella3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/url/imagenes/estrella.jpg"))); // NOI18N
        jlabelEstrella3.setText("Fecha Nacimiento:");
        jPanel1.add(jlabelEstrella3);
        jlabelEstrella3.setBounds(690, 150, 100, 100);

        jlabelEstrella4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/url/imagenes/estrella.jpg"))); // NOI18N
        jlabelEstrella4.setText("Fecha Nacimiento:");
        jPanel1.add(jlabelEstrella4);
        jlabelEstrella4.setBounds(790, 150, 100, 100);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/url/imagenes/estrellaVacia.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(480, 170, 510, 70);

        rbStar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbStar5ActionPerformed(evt);
            }
        });
        jPanel1.add(rbStar5);
        rbStar5.setBounds(930, 120, 30, 21);

        rbstar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbstar1ActionPerformed(evt);
            }
        });
        jPanel1.add(rbstar1);
        rbstar1.setBounds(530, 110, 40, 30);

        rbStar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbStar2ActionPerformed(evt);
            }
        });
        jPanel1.add(rbStar2);
        rbStar2.setBounds(630, 110, 30, 30);

        rbsStar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsStar3ActionPerformed(evt);
            }
        });
        jPanel1.add(rbsStar3);
        rbsStar3.setBounds(730, 110, 30, 30);

        rbStar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbStar4ActionPerformed(evt);
            }
        });
        jPanel1.add(rbStar4);
        rbStar4.setBounds(830, 110, 30, 30);

        btnActualizar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar);
        btnActualizar.setBounds(340, 260, 120, 50);

        lblTextura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/url/imagenes/TEXTURA.jpg"))); // NOI18N
        lblTextura.setText("jLabel4");
        jPanel1.add(lblTextura);
        lblTextura.setBounds(0, 0, 1050, 730);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1054, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
       
        FiltroBusqueda filtro = new FiltroBusqueda(txtBuscar.getText());
        

    }//GEN-LAST:event_txtBuscarKeyTyped

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        //INGRESAMOS A LA TABLA EL CLIENTE NUEVO
        EntityManager em = Conexion.obtenerConexion();
        Clientes cliente = new Clientes();
        ClientesJpaController actualizarCliente = new ClientesJpaController(em);
        cliente.setCodigo(txtCodig.getText());
        cliente.setNombre(txtNombre.getText());
        cliente.setTelefono(txtTelefono.getText());
        cliente.setCumpleanios(txtFechaNacimiento.getText());
        cliente.setEstrellas(0);
        actualizarCliente.create(cliente);
        em.close();
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnIngresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresar1ActionPerformed
       
    }//GEN-LAST:event_btnIngresar1ActionPerformed

    private void rbStar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbStar5ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_rbStar5ActionPerformed

    private void rbstar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbstar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbstar1ActionPerformed

    private void rbStar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbStar2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_rbStar2ActionPerformed

    private void rbsStar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsStar3ActionPerformed
        // TODO add your handling code here
       
    }//GEN-LAST:event_rbsStar3ActionPerformed

    private void rbStar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbStar4ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_rbStar4ActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        
        try {
        EntityManager em =Conexion.obtenerConexion();
        Clientes cliente = new Clientes();
        ClientesJpaController actualizarCliente = new ClientesJpaController(em);
        cliente.setCodigo(txtCodig.getText());
        cliente.setNombre(txtNombre.getText());
        cliente.setTelefono(txtTelefono.getText());
        cliente.setCumpleanios(txtFechaNacimiento.getText());
        cliente.setEstrellas(0);
        actualizarCliente.edit(cliente);
        em.close();
        } catch (Exception ex) {
            Logger.getLogger(DialogClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            java.util.logging.Logger.getLogger(DialogClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogClientes dialog = new DialogClientes(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnIngresar1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlabelEstrella1;
    private javax.swing.JLabel jlabelEstrella2;
    private javax.swing.JLabel jlabelEstrella3;
    private javax.swing.JLabel jlabelEstrella4;
    private javax.swing.JLabel jlabelEstrella5;
    private javax.swing.JLabel lblTextura;
    private javax.swing.JRadioButton rbStar2;
    private javax.swing.JRadioButton rbStar4;
    private javax.swing.JRadioButton rbStar5;
    private javax.swing.JRadioButton rbsStar3;
    private javax.swing.JRadioButton rbstar1;
    private javax.swing.JTable tableClientes;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCodig;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
