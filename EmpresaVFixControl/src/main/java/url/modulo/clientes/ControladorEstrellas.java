/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package url.modulo.clientes;

import javax.swing.JLabel;

/**
 *
 * @author carlo
 */
public class ControladorEstrellas {
    private int seleccion;
    JLabel lbl1;
    JLabel lbl2;
    JLabel lbl3;
    JLabel lbl4;
    JLabel lbl5;

    public ControladorEstrellas(int seleccion, JLabel lbl1, JLabel lbl2, JLabel lbl3, JLabel lbl4, JLabel lbl5) {
        this.seleccion = seleccion;
      
        this.lbl1 = lbl1;
        this.lbl2 = lbl2;
        this.lbl3 = lbl3;
        this.lbl4 = lbl4;
        this.lbl5 = lbl5;
    }
    
    public void controlarEstrellas() {

        switch (seleccion) {
            case 1:
                System.out.println(seleccion);
                //SE SELECCIONA 1 ESTRELLA
                lbl1.setVisible(true);
                lbl2.setVisible(false);
                lbl3.setVisible(false);
                lbl4.setVisible(false);
                lbl5.setVisible(false);
                break;
            case 2:
                //SE SELECCIONA 2 ESTRELLA
                lbl1.setVisible(true);
                lbl2.setVisible(true);
                lbl3.setVisible(false);
                lbl4.setVisible(false);
                lbl5.setVisible(false);
                break;
            case 3:
                //SE SELECCIONA 3 ESTRELLA
                lbl1.setVisible(true);
                lbl2.setVisible(true);
                lbl3.setVisible(true);
                lbl4.setVisible(false);
                lbl5.setVisible(false);
                break;
            case 4:
                //SE SELECCIONA 4 ESTRELLA
                lbl1.setVisible(true);
                lbl2.setVisible(true);
                lbl3.setVisible(true);
                lbl4.setVisible(true);
                lbl5.setVisible(false);
                break;
            case 5:
                //SE SELECCIONA 5 ESTRELLA
                lbl1.setVisible(true);
                lbl2.setVisible(true);
                lbl3.setVisible(true);
                lbl4.setVisible(true);
                lbl5.setVisible(true);
                break;
            default:
                break;
        }
    }
}
