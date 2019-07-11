/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package url.modulo.clientes;

import url.modulo.inventario.Consultas;
import url.modulo.inventario.CrearConsulta;

/**
 *
 * @author carlo
 */
public class ConstruirConsultaClientes implements CrearConsulta{
    
    private Consultas consulta;
    private String tipoConsulta;
    
    public ConstruirConsultaClientes(String tipoConsulta){
        this.consulta=new Consultas();
        this.tipoConsulta=tipoConsulta;
    }

    @Override
    public void construirConsulta() {
        if(tipoConsulta.equals("nombre")){
            this.consulta.setConsulta("Clientes.findByNombre");
            this.consulta.setParametro("nombre");
        }
    }

    @Override
    public Consultas obtenerConsulta() {
        return this.consulta;
    }
    
    
    
}
