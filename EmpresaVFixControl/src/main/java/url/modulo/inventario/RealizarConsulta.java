/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package url.modulo.inventario;

import javax.persistence.EntityManager;

/**
 *
 * @author carlo
 */
public interface RealizarConsulta {
    
    public void consultar(Consultas consulta,EntityManager em);
}
