/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package url.modulo.inventario;

/**
 *
 * @author carlo
 */
public class ObtenerConsulta {
    
    private CrearConsulta crearConsulta;
    
    public ObtenerConsulta(CrearConsulta crearConsulta){
        this.crearConsulta=crearConsulta;
    }
    
    public void crearConsulta(){
        this.crearConsulta.construirConsulta();
    }
    
    public Consultas obtenerConsulta(){
        return  this.crearConsulta.obtenerConsulta();
    }
    
}
