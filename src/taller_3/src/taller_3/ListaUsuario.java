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
public class ListaUsuario {
    
    private NodoSimple head;
    private int cantUsuarios;
    
    public ListaUsuario(){
        this.head = null;
        this.cantUsuarios = 0;
    }
    
    public int getCantUsuario(){
        return this.cantUsuarios;
    }
    
    public boolean agregarUsuario(Usuario usuario){
        NodoSimple nuevoNodo = new NodoSimple(usuario);
        NodoSimple aux = this.head;
        if(this.head == null){
            this.head = nuevoNodo;
            this.cantUsuarios++;
            return true;
        }else{
           while(aux.getNext()!= null){
               if(aux.getUsuario().getCorreo().equals(usuario.getCorreo())){
                   return false;
               }else{
                  aux = aux.getNext();  
               }
           }
        }
        
        aux.setNext(nuevoNodo);
        this.cantUsuarios++;
        return true;      
    }
    
    public boolean eliminarUsuario(String correo){
        if(this.head == null){
            return false;
        }
        if(this.head.getUsuario().getCorreo().equals(correo)){
            this.head = this.head.getNext();
            this.cantUsuarios--;
            return true;
        }
        NodoSimple aux = this.head;
        NodoSimple anterior = this.head;
        
        while(aux.getNext() != null){
            if(aux.getUsuario().getCorreo().equals(correo)){
                anterior.setNext(aux.getNext());
                this.cantUsuarios--;
                return true;
            }else{
                anterior = aux;
                aux = aux.getNext();
            }
        }
        return false;
    }
    
}
