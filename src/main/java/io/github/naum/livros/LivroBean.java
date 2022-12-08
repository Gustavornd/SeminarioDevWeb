/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package io.github.naum.livros;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.faces.application.ResourceDependency;

/**
 *
 * @author fried
 */
@ResourceDependency(name="jsf.js")
@Stateless
public class LivroBean implements LivroBeanLocal {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Livro localizarPorId(Long id) {
        return em.find(Livro.class, id);  
    }

    @Override
    public void salvar(Livro livro) {
        em.merge(livro);
    }
    
    @Override
    public Livro SelectLivro(Long id){
            Livro l = em.find(Livro.class, id);
            em.close();
            return l;
    }
    
    @Override
    public void Excluir(Livro livro){
        em.remove(livro); 
    }

}
