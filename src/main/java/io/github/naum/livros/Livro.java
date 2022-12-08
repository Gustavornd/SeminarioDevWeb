/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.naum.livros;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Livro implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private Integer codigo;
        
        @Column(length = 150)
	private String titulo;
        @Column(length = 125)
	private String autor;
	private Integer ano;

     //<editor-fold defaultstate="collapsed" desc="Constructors">
        public Livro() {
    }

        
    public Livro(Integer codigo, String titulo, String autor, Integer ano) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }
//</editor-fold>
    
     //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
        public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }
//</editor-fold>
    
        
        
}