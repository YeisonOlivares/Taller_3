/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_3;

/**
 *
 * @author Therockwsnake
 */
public class NodoDoble {
    
    private PaginaGrupo paginaGrupo;
    private NodoDoble next;
    private NodoDoble previous;
    
    public NodoDoble(PaginaGrupo paginaGrupo){
        this.paginaGrupo = paginaGrupo;
        this.next = null;
        this.previous = null;
    }
    
    public PaginaGrupo getPaginaGrupo(){
        return this.paginaGrupo;
    }
    
    public NodoDoble getNext(){
        return this.next;
    }
    
    public NodoDoble getPrevious(){
        return this.previous;
    }
    
    public void setNext(NodoDoble next){
        this.next = next;
    }
    
    public void setPrevious(NodoDoble previous){
        this.previous = previous;
    }
    
}
