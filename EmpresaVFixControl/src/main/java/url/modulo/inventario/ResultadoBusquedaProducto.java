/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package url.modulo.inventario;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.swing.table.DefaultTableModel;
import url.modulo.controladoresBD.Producto;


/**
 *
 * @author carlo
 */
public class ResultadoBusquedaProducto implements Busqueda{

    private DefaultTableModel modelo;
    private EntityManager em;
    
    public  ResultadoBusquedaProducto(EntityManager em){
        this.em=em;
    }
    
    @Override
    public DefaultTableModel ResultadoBusqueda(FiltroBusqueda filtro) {
      
        String[] titulo= {"Codigo","Categoria","Nombre","Existencia","Color","Modelo","Marca","Tipo","Precio","Precio May","Precio Clint","Descripcion"}; 
        this.modelo = new DefaultTableModel(titulo,0);
        TypedQuery query = em.createNamedQuery("Producto.findByNombre",Producto.class);
        query.setParameter("nombre",filtro.getBuscar());
        List<Producto> resultado = query.getResultList();
        em.close();
        
        
        
        
        return this.modelo;
    }
    
}
