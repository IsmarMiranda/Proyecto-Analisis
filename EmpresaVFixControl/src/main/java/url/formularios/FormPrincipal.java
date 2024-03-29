/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package url.formularios;

import javax.persistence.EntityManager;
import url.Formularios.DialogClientes;
import url.modulo.ventas.MostrarUsuarios;
import url.conexionBD.Conexion;
import url.modulo.clientes.AdaptarClientes;

/**
 *
 * @author IsmarMiranda
 */
public class FormPrincipal extends javax.swing.JFrame {
  
        EntityManager em = Conexion.obtenerConexion();
    /**
     * Creates new form FormPrincipal
     */
    public FormPrincipal() {
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

        btnClientes = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnReparaciones = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1013, 680));
        setMinimumSize(new java.awt.Dimension(1013, 680));
        setPreferredSize(new java.awt.Dimension(1013, 680));
        getContentPane().setLayout(null);

        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/trato.png"))); // NOI18N
        btnClientes.setMaximumSize(new java.awt.Dimension(130, 116));
        btnClientes.setMinimumSize(new java.awt.Dimension(130, 116));
        btnClientes.setPreferredSize(new java.awt.Dimension(130, 116));
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        getContentPane().add(btnClientes);
        btnClientes.setBounds(210, 130, 110, 110);

        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/datafono.png"))); // NOI18N
        btnVentas.setMaximumSize(new java.awt.Dimension(130, 116));
        btnVentas.setMinimumSize(new java.awt.Dimension(130, 116));
        btnVentas.setPreferredSize(new java.awt.Dimension(130, 116));
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });
        getContentPane().add(btnVentas);
        btnVentas.setBounds(210, 410, 110, 110);

        btnReparaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/adiccion.png"))); // NOI18N
        btnReparaciones.setMaximumSize(new java.awt.Dimension(130, 116));
        btnReparaciones.setMinimumSize(new java.awt.Dimension(130, 116));
        btnReparaciones.setPreferredSize(new java.awt.Dimension(130, 116));
        getContentPane().add(btnReparaciones);
        btnReparaciones.setBounds(690, 130, 110, 110);

        btnInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/portapapeles.png"))); // NOI18N
        btnInventario.setMaximumSize(new java.awt.Dimension(130, 116));
        btnInventario.setMinimumSize(new java.awt.Dimension(130, 116));
        btnInventario.setPreferredSize(new java.awt.Dimension(130, 116));
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInventario);
        btnInventario.setBounds(700, 400, 110, 110);

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FONDO PRINCIPAL.png"))); // NOI18N
        lblFondo.setText("jLabel1");
        getContentPane().add(lblFondo);
        lblFondo.setBounds(0, 0, 1010, 680);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        // TODO add your handling code here:
        MostrarUsuarios usuarios = new MostrarUsuarios();
        AdaptarClientes adaptar = new AdaptarClientes();
        adaptar.obtenerLista(usuarios.obtenerUsuarios(em));
        DialogVentas dialogVentas = new DialogVentas(adaptar.getModelo());
        dialogVentas.setVisible(true);
        
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        // TODO add your handling code here:
        
        DialogClientes dialogClientes = new DialogClientes(this, rootPaneCheckingEnabled);
        dialogClientes.setVisible(true);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
        // TODO add your handling code here:
        DialogInventario dialogInventario = new DialogInventario(this, rootPaneCheckingEnabled);
        dialogInventario.setVisible(true);
    }//GEN-LAST:event_btnInventarioActionPerformed

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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnReparaciones;
    private javax.swing.JButton btnVentas;
    private javax.swing.JLabel lblFondo;
    // End of variables declaration//GEN-END:variables
}
