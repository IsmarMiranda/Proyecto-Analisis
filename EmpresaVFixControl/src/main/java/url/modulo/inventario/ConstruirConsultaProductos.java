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
public class ConstruirConsultaProductos implements CrearConsulta{
 
    private Consultas consulta;
    private String tipoConsulta;
    
    public ConstruirConsultaProductos(String tipoConsulta){
        this.consulta= new Consultas();
        this.tipoConsulta=tipoConsulta;
    }
    
    @Override
    public void construirConsulta() {
        
        switch (tipoConsulta) {
            case "nombre":
                consulta.setConsulta("Producto.findByNombre");
                consulta.setParametro("nombre");
                break;
            case "codigo":
                consulta.setConsulta("Producto.findByCodigo");
                consulta.setParametro("codigo");
                break;
            case "color":
                consulta.setConsulta("Producto.findByColor");
                consulta.setParametro("color");
                break;
            default:
                break;
        }
    }

    @Override
    public Consultas obtenerConsulta() {
        return this.consulta;
    }

    
    
    
}
