/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p1_danielelvir;

/**
 *
 * @author HP
 */
public class Librero {
    private String titulo;
    private String autor;
    private String genero;
    private int edad;
    
    public Librero(String titulo, String autor, String genero, int edad){
        this.titulo=titulo;
        this.autor=autor;
        this.genero=genero;
        this.edad=edad;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public String getAutor(){
        return this.autor;
    }
    
    public String getGenero(){
        return this.genero;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public void setTitulo(String nuevoTitulo){
        this.titulo=nuevoTitulo;
    }
    
    public void setAutor(String nuevoAutor){
        this.autor=nuevoAutor;
    }
    
    public void setGenero(String nuevoGenero){
        this.genero=nuevoGenero;
    }
    
    public void setEdad(int nuevoEdad){
        this.edad=nuevoEdad;
    }
        
}
