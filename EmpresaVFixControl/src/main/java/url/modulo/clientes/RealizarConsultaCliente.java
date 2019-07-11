/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package url.modulo.clientes;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import url.modulo.controladoresBD.Clientes;
import url.modulo.inventario.Consultas;
import url.modulo.inventario.FiltroBusqueda;
import url.modulo.inventario.RealizarConsulta;



/**
 *
 * @author carlo
 */
public class RealizarConsultaCliente implements RealizarConsulta{
    
    private FiltroBusqueda filtro;
    private List<Clientes> resultado;
    
    
    public RealizarConsultaCliente(FiltroBusqueda filtro){
        this.filtro=filtro;
    }
   
    @Override
    public void consultar(Consultas consulta, EntityManager em) {
        
        TypedQuery query = em.createNamedQuery(consulta.getConsulta(),Clientes.class);
        query.setParameter(consulta.getParametro(),filtro.getBuscar());
        List<Clientes> resultado1 = query.getResultList();
        this.resultado=resultado1;
    }
    
    public List<Clientes> obtenerClienteses(){
        return this.resultado;
    }
}
