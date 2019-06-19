/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.modulo.reparacion;

/**
 *
 * @author carlo
 */
public class ImpresionComprobante {
    
    private Comprobante datosComprobante;
    private Componente componente;

    public ImpresionComprobante(Comprobante datosComprobante, Componente componente) {
        this.datosComprobante = datosComprobante;
        this.componente = componente;
    }
    
    public void imprimirComprobante(){
        
    }
    
}
