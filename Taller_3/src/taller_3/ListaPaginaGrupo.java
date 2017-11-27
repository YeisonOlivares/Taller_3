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
public class ListaPaginaGrupo {
    
    private NodoDoble head;
    private NodoDoble tail;
    private int cantPaginaGrupos;
    
    public ListaPaginaGrupo(){
        this.head = null;
        this.tail = null;
        this.cantPaginaGrupos = 0;
    }
    
    public boolean agregarPaginaGrupo(PaginaGrupo paginaGrupo){
        NodoDoble nuevoNodo = new NodoDoble(paginaGrupo);
        NodoDoble aux = this.head;
        
        //Se comprueba que la página o grupo no se encuentra en la lista.
        while(aux!=null){
            if(aux.getPaginaGrupo().getIdentificador()== nuevoNodo.getPaginaGrupo().getIdentificador()){
                return false;
            }else{
                aux = aux.getNext();
            }
        }
        
        //Si la pagina o grupo no se encuentra en la lista, se procede agregarla al final de esta.
        if(this.head==null){
            this.head = nuevoNodo;
        }else{
            this.tail.setNext(nuevoNodo);
            nuevoNodo.setPrevious(this.tail);
        }
        
        this.tail = nuevoNodo;
        this.cantPaginaGrupos++;
        return true;
    }
    
    public boolean abandonarPaginaGrupo(int identificador){
        
    }
    
}
