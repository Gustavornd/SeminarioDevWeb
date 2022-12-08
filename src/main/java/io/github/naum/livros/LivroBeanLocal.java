/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package io.github.naum.livros;

import javax.ejb.Local;

/**
 *
 * @author fried
 */
@Local
public interface LivroBeanLocal {
    
    public Livro localizarPorId(Long id);
    public void salvar(Livro Livro);
    public Livro SelectLivro(Long id);
    public void Excluir(Livro livro);
    
}
