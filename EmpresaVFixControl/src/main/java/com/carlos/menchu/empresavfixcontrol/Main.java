/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.menchu.empresavfixcontrol;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import url.formularios.DialogVentas;
import url.modulo.controladoresBD.Categoria;

/**
 *
 * @author carlo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("empresavfix");
//        EntityManager em = emf.createEntityManager();
//        TypedQuery query = em.createNamedQuery("Categoria.findByIdCategoria",Categoria.class);
//        query.setParameter("idCategoria",1);
//        List<Categoria> listaProductos = query.getResultList();
//        
//        for (Categoria producto: listaProductos) {
//            System.out.println(producto);
//        }

        DialogVentas veta = new DialogVentas(null);
        veta.setVisible(true);
    }
    
}
