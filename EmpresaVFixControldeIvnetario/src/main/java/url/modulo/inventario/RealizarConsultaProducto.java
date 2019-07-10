/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package url.modulo.inventario;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import url.modulo.controladoresBD.Producto;

/**
 *
 * @author carlo
 */
public class RealizarConsultaProducto implements RealizarConsulta{
    
    private List<Producto> producto;
    private FiltroBusqueda  filtro;
    
    public RealizarConsultaProducto(FiltroBusqueda filtro){
        this.filtro=filtro;
    }

    @Override
    public void consultar(Consultas consulta,EntityManager em) {
        
        TypedQuery query = em.createNamedQuery(consulta.getConsulta(),Producto.class);
        query.setParameter(consulta.getParametro(),filtro.getBuscar());
        this.producto=query.getResultList();
    }
    
    public List<Producto> obtenerProductos(){
        return this.producto;
    }
}
