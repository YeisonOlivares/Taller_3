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
public class NodoSimple {
    
    private Usuario usuario;
    private NodoSimple next;
    
    public NodoSimple(Usuario usuario){
        this.usuario = usuario;
        this.next = null;
    }
    
    public Usuario getUsuario(){
        return this.usuario;
    }
    
    public NodoSimple getNext(){
        return this.next;
    }
    
    public void setNext(NodoSimple usuario){
        this.next = usuario;
    }
    
}
